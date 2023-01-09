package com.ruoyi.common.utils.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.*;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 通用http发送方法
 *
 * @author ruoyi
 */
public class HttpUtils {
    private static final Logger log = LoggerFactory.getLogger(HttpUtils.class);

    /**
     * 向指定 URL 发送GET方法的请求
     *
     * @param url 发送请求的 URL
     * @return 所代表远程资源的响应结果
     */
    public static String sendGet(String url, AtomicInteger count) {
        return sendGet(url, StandardCharsets.UTF_8.name(), count);
    }

    /**
     * 向指定 URL 发送GET方法的请求
     *
     * @param url         发送请求的 URL
     * @param contentType 编码类型
     * @return 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String contentType, AtomicInteger count) {
        StringBuilder result = new StringBuilder();
        BufferedReader in = null;
        try {
            //log.info("sendGet - {}", urlNameString);
            URL realUrl = new URL(url);
            URLConnection conn = realUrl.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setConnectTimeout(60000);
            conn.setReadTimeout(60000);
            conn.connect();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), contentType));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
                result.append(System.getProperty("line.separator"));//换行
            }
            //log.info("recv - {}", result);
        } catch (ConnectException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, contentType, count);
            } else {
                log.error("调用HttpUtils.sendGet ConnectException, url=" + url, e);
            }
        } catch (SocketTimeoutException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, contentType, count);
            } else {
                log.error("调用HttpUtils.sendGet SocketTimeoutException, url=" + url, e);
            }
        } catch (IOException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, contentType, count);
            } else {
                log.error("调用HttpUtils.sendGet IOException, url=" + url, e);
            }
        } catch (Exception e) {
            log.error("调用HttpsUtil.sendGet Exception, url=" + url, e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception ex) {
            }
        }
        return result.toString();
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param, AtomicInteger count) {
        PrintWriter out = null;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try {
            log.info("sendPost - {}", url);
            URL realUrl = new URL(url);
            URLConnection conn = realUrl.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Accept-Charset", "utf-8");
            conn.setRequestProperty("contentType", "utf-8");
            conn.setConnectTimeout(60000);
            conn.setReadTimeout(60000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            out = new PrintWriter(conn.getOutputStream());
            out.print(param);
            out.flush();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
                result.append(System.getProperty("line.separator"));//换行
            }
            log.info("recv - {}", result);
        } catch (ConnectException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpUtils.sendPost ConnectException, url=" + url, e);
            }
        } catch (SocketTimeoutException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpUtils.sendPost SocketTimeoutException, url=" + url, e);
            }
        } catch (IOException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpUtils.sendPost IOException, url=" + url, e);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpsUtil.sendPost Exception, url=" + url, e);
            }
        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
        return result.toString();
    }

    public static String sendSSLPost(String url, String param, AtomicInteger count) {
        StringBuilder result = new StringBuilder();
        String urlNameString = url + "?" + param;
        HttpsURLConnection conn = null;
        BufferedReader br = null;
        try {
            log.info("sendSSLPost - {}", urlNameString);
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, new TrustManager[]{new TrustAnyTrustManager()}, new java.security.SecureRandom());
            URL console = new URL(urlNameString);
            conn = (HttpsURLConnection) console.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Accept-Charset", "utf-8");
            conn.setRequestProperty("contentType", "utf-8");
            conn.setDoOutput(true);
            conn.setDoInput(true);

            conn.setSSLSocketFactory(sc.getSocketFactory());
            conn.setHostnameVerifier(new TrustAnyHostnameVerifier());
            conn.connect();
            InputStream is = conn.getInputStream();

            br = new BufferedReader(new InputStreamReader(is));
            String ret = "";
            while ((ret = br.readLine()) != null) {
                if (ret != null && !ret.trim().equals("")) {
                    result.append(new String(ret.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
                }
            }
            log.info("recv - {}", result);
            conn.disconnect();
            br.close();
        } catch (ConnectException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpUtils.sendSSLPost ConnectException, url=" + url, e);
            }
        } catch (SocketTimeoutException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpUtils.sendSSLPost SocketTimeoutException, url=" + url, e);
            }
        } catch (IOException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpUtils.sendSSLPost IOException, url=" + url, e);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpsUtil.sendSSLPost Exception, url=" + url, e);
            }
        } finally {
            conn.disconnect();
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
        return result.toString();
    }


    /**
     * 向指定 URL 发送GET方法的请求
     *
     * @param url      发送请求的 URL
     * @param filePath 文件路径
     * @return 所代表远程资源的响应结果
     */
    public static void downloadFile(String url, String filePath, AtomicInteger count) {
        InputStream in = null;
        FileOutputStream out = null;
        try {
            URL realUrl = new URL(url);
            URLConnection conn = realUrl.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setConnectTimeout(60000);
            conn.setReadTimeout(60000);
            conn.connect();
            in = conn.getInputStream();

            out = new FileOutputStream(filePath);
            int length = 0;
            while ((length = in.read()) != -1) {
                out.write(length);
            }
        } catch (ConnectException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                downloadFile(url, filePath, count);
            } else {
                log.error("调用HttpUtils.downloadFile ConnectException, url=" + url, e);
            }
        } catch (SocketTimeoutException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                downloadFile(url, filePath, count);
            } else {
                log.error("调用HttpUtils.downloadFile SocketTimeoutException, url=" + url, e);
            }
        } catch (IOException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                downloadFile(url, filePath, count);
            } else {
                log.error("调用HttpUtils.downloadFile IOException, url=" + url, e);
            }
        } catch (Exception e) {
            log.error("调用HttpsUtil.downloadFile Exception, url=" + url, e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
            }
        }
    }

    private static class TrustAnyTrustManager implements X509TrustManager {
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) {
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[]{};
        }
    }

    private static class TrustAnyHostnameVerifier implements HostnameVerifier {
        @Override
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    }
}