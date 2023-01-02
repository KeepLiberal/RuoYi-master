package com.ruoyi.common.utils.http;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.utils.StringUtils;
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
        return sendGet(url, StringUtils.EMPTY, count);
    }

    /**
     * 向指定 URL 发送GET方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param, AtomicInteger count) {
        return sendGet(url, param, Constants.UTF8, count);
    }

    /**
     * 向指定 URL 发送GET方法的请求
     *
     * @param url         发送请求的 URL
     * @param param       请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @param contentType 编码类型
     * @return 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param, String contentType, AtomicInteger count) {
        StringBuilder result = new StringBuilder();
        BufferedReader in = null;
        try {
            String urlNameString = StringUtils.isNotBlank(param) ? url + "?" + param : url;
            //log.info("sendGet - {}", urlNameString);
            URL realUrl = new URL(urlNameString);
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
                sendGet(url, param, contentType, count);
            } else {
                log.error("调用HttpUtils.sendGet ConnectException, url=" + url + ",param=" + param, e);
            }
        } catch (SocketTimeoutException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, contentType, count);
            } else {
                log.error("调用HttpUtils.sendGet SocketTimeoutException, url=" + url + ",param=" + param, e);
            }
        } catch (IOException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, contentType, count);
            } else {
                log.error("调用HttpUtils.sendGet IOException, url=" + url + ",param=" + param, e);
            }
        } catch (Exception e) {
            log.error("调用HttpsUtil.sendGet Exception, url=" + url + ",param=" + param, e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception ex) {
                log.error("调用in.close Exception, url=" + url + ",param=" + param, ex);
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
                log.error("调用HttpUtils.sendPost ConnectException, url=" + url + ",param=" + param, e);
            }
        } catch (SocketTimeoutException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpUtils.sendPost SocketTimeoutException, url=" + url + ",param=" + param, e);
            }
        } catch (IOException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpUtils.sendPost IOException, url=" + url + ",param=" + param, e);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpsUtil.sendPost Exception, url=" + url + ",param=" + param, e);
            }
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                log.error("调用in.close Exception, url=" + url + ",param=" + param, ex);
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
                log.error("调用HttpUtils.sendSSLPost ConnectException, url=" + url + ",param=" + param, e);
            }
        } catch (SocketTimeoutException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpUtils.sendSSLPost SocketTimeoutException, url=" + url + ",param=" + param, e);
            }
        } catch (IOException e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpUtils.sendSSLPost IOException, url=" + url + ",param=" + param, e);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                sendGet(url, param, count);
            } else {
                log.error("调用HttpsUtil.sendSSLPost Exception, url=" + url + ",param=" + param, e);
            }
        } finally {
            conn.disconnect();
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    log.error("br.close Exception, url=" + url, e);
                }
            }
        }
        return result.toString();
    }


    //*************************************文件下载*********************************************
    public static void downLoadFile(String url, HttpServletResponse response) {

        InputStream is = null;
        OutputStream os = null;
        HttpURLConnection conn = null;
        try {
            log.info("下载url为：" + url);
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
            conn.setRequestProperty("Content-Type", "application/x-download;charset=utf-8");
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(60000);
            conn.setReadTimeout(60000);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            HttpURLConnection.setFollowRedirects(false);
            conn.connect();


            int resCode = conn.getResponseCode();
            if (resCode == 200) {
                is = conn.getInputStream();
                String fileName = URLEncoder.encode("1000.xls", "UTF-8");
                //设置HTTP响应头
                response.addHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\"");//下载文件的名称
                response.setContentType("application/x-download");//告知浏览器下载文件，而不是直接打开，浏览器默认为打开
                byte[] b = new byte[1024];
                int len;
                while ((len = is.read(b)) > 0) {
                    response.getOutputStream().write(b, 0, len);
                }
                response.getOutputStream().close();
            }
        } catch (Exception e) {
            log.error("调用HttpsUtil.downLoadFile Exception, url=" + url, e);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    log.error("调用in.close Exception, url=" + url, e);
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    log.error("os.close Exception, url=" + url, e);
                }
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