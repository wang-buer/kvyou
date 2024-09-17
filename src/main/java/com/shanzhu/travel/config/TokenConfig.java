package com.shanzhu.travel.config;

import com.shanzhu.travel.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * token拦截配置
 *
 * @author: ShanZhu
 * @date: 2024-01-26
 */
@Configuration
public class TokenConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TokenInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new TokenInterceptor());
        //所有路径都被拦截
        registration.addPathPatterns("/**");
    }

}
