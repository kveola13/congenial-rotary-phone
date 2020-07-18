package com.kveola13.springmasterclass;

import com.kveola13.springmasterclass.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class ComponentScanApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(ComponentScanApplication.class, args);

        ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDao);
    }
}
