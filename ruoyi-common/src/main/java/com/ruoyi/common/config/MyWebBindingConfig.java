package com.ruoyi.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

@Configuration
public class MyWebBindingConfig {
    @Autowired
    public MyWebBindingConfig(RequestMappingHandlerAdapter requestMappingHandlerAdapter) {
        requestMappingHandlerAdapter.setWebBindingInitializer(new MyWebBindingInitializer());
    }

    /**
     * 配置请求集合上限数量
     * @author 
     * @version 2022-10-11
     */
    public static class MyWebBindingInitializer extends ConfigurableWebBindingInitializer {

        @Override
        public void initBinder(WebDataBinder binder) {
            super.initBinder(binder);
            binder.setAutoGrowNestedPaths(true);
            //配置集合上限数量
            binder.setAutoGrowCollectionLimit(10000);
        }
    }
}
