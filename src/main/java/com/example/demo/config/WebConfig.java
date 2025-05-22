package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    private static final Logger logger = LoggerFactory.getLogger(WebConfig.class);

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        logger.info("Configuring view controllers");
        registry.addViewController("/").setViewName("forward:/index.xhtml");
        registry.addViewController("/index").setViewName("forward:/index.xhtml");
        registry.addViewController("/index.xhtml").setViewName("forward:/index.xhtml");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        logger.info("Configuring resource handlers");
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/META-INF/resources/");
    }
} 
