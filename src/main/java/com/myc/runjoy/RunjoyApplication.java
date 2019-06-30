package com.myc.runjoy;

import com.myc.runjoy.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class RunjoyApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(RunjoyApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(RunjoyApplication.class, args);
        LOGGER.trace("trace 消息");
        LOGGER.debug("debug 消息");
        LOGGER.info("info 消息");
        LOGGER.warn("warn 消息");
        LOGGER.error("error 消息");
    }
}
