package com.etoak.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration
public class RestFilterConfig {
    /**
     * 注册HiddentHttpMethodFilter
     * 作用： 将post转成put、delete请求等
     * 要求：
     *      表单提交方式必须是post
     *      表单必须有一个隐藏域，name属性值是_method,value属性值是要转成的请求方式
     * @return
     */
    @Bean
    public FilterRegistrationBean<HiddenHttpMethodFilter> restFilter(){
        FilterRegistrationBean<HiddenHttpMethodFilter> restFilter =
                new FilterRegistrationBean<>(new HiddenHttpMethodFilter());
        restFilter.addUrlPatterns("/*");
        return restFilter;
    }
}
