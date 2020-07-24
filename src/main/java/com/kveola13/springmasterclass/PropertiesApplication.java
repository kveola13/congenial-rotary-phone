package com.kveola13.springmasterclass;

import com.kveola13.springmasterclass.properties.ExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(PropertiesApplication.class)) {
            ExternalService externalService = applicationContext.getBean(ExternalService.class);
            System.out.println(externalService.serviceURL());
        }
    }
}
