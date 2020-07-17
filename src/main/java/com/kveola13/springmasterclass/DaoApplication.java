package com.kveola13.springmasterclass;

import com.kveola13.springmasterclass.dao.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DaoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DaoApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(DaoApplication.class, args);

        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAOTwo = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());
        LOGGER.info("{}", personDAOTwo);
        LOGGER.info("{}", personDAOTwo.getJdbcConnection());
    }
}
