package com.etoak.config;

import com.etoak.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Value("${upload.mapping}")
    private String imgMapping;
    @Value("${upload.dir}")
    private String imgLocation;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(imgMapping)
                .addResourceLocations("file:" + imgLocation);
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/user/**")
                .excludePathPatterns("/code")
                .excludePathPatterns("/lib/**","/imgs/**");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 当访问contextPath时，直接跳转到index页面
        registry.addViewController("/")
                .setViewName("index");
    }
}
