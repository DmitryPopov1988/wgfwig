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
    registry.addResourceHandler("classpath:/resources/**")
        .addResourceLocations("/resources/");
    registry.addResourceHandler("/images/**")
        .addResourceLocations("file:resources/", "file:images/", "file:");
    registry.addResourceHandler("/static/**")
        .addResourceLocations("classpath:/static/");
  }

  @Override
  public void addViewControllers(final ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("/main");
  }

  @Bean
  public ClassLoaderTemplateResolver classLoaderTemplateResolver() {
    ClassLoaderTemplateResolver templateResolver =
        new ClassLoaderTemplateResolver();
    templateResolver.setPrefix("/resources/**");
    templateResolver.setSuffix(".html");
    templateResolver.setTemplateMode(TemplateMode.HTML);
    templateResolver.setCharacterEncoding("UTF-8");
    templateResolver.setOrder(1);
    templateResolver.setCheckExistence(true);
    return templateResolver;
  }

}
