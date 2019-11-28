package com.code.gazer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler ("classpath:/resources/**")
                .addResourceLocations ("/resources/");
        registry.addResourceHandler ("/images/**")
                .addResourceLocations ("file:resources/", "file:images/", "file:");
        registry.addResourceHandler ("/static/**")
                .addResourceLocations ("classpath:/static/");
    }

    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addViewController ("/").setViewName ("index.html");
        registry.addViewController ("/contact").setViewName ("contact.html");
    }

    @Bean
    public ClassLoaderTemplateResolver classLoaderTemplateResolver() {
        final ClassLoaderTemplateResolver classLoaderTemplateResolver = new ClassLoaderTemplateResolver ( );
        classLoaderTemplateResolver.setPrefix ("/resources/**");
        classLoaderTemplateResolver.setSuffix (".html");
        classLoaderTemplateResolver.setTemplateMode (TemplateMode.HTML);
        classLoaderTemplateResolver.setCharacterEncoding ("UTF-8");
        classLoaderTemplateResolver.setOrder (1);
        classLoaderTemplateResolver.setCheckExistence (true);
        return classLoaderTemplateResolver;
    }

}
