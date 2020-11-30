package com.xiaohu.elkkafkalogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ElkKafkaLogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElkKafkaLogsApplication.class, args);
    }

}
