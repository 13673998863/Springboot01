package com.java.config;



import com.java.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class Config implements WebMvcConfigurer {
    @Bean
    public LoginInterceptor getLoginInterceptor(){
        //产生拦截对象
        return new LoginInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(getLoginInterceptor()).addPathPatterns("/**");
    }

}
