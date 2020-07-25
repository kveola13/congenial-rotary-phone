package com.kveola13.springmasterclass;

import com.kveola13.springmasterclass.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(XMLApplication.class);

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("Beans -> {} ", (Object) applicationContext.getBeanDefinitionNames());

            XMLPersonDAO personDAO = applicationContext.getBean(XMLPersonDAO.class);
            LOGGER.info("{} {}", personDAO, personDAO.getXmlJdbcConnection());
        }
    }
}
