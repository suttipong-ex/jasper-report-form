package com.blogspot.exodusdelaghetto.jasper.report.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by exodus on 5/12/17.
 */
@ComponentScan(basePackages = "com.blogspot.exodusdelaghetto.jasper.report.form")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
