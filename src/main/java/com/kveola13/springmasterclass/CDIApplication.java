package com.kveola13.springmasterclass;

import com.kveola13.springmasterclass.cdi.CDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class CDIApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CDIApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(CDIApplication.class, args);

        CDIBusiness cdiBusiness = applicationContext.getBean(CDIBusiness.class);

        LOGGER.info("{} DAO-{}", cdiBusiness, cdiBusiness.getCdidao());
    }
}
