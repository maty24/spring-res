package com.springexample.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialApplication {

    //log para mostrar en consola de la api
    private static Logger logger = LoggerFactory.getLogger(TutorialApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TutorialApplication.class, args);

        //los log de debug estan ocultos
        logger.debug("debug");
        logger.info("ola");
        logger.warn("mi warn");
        logger.error("mi error xD");
    }

}
