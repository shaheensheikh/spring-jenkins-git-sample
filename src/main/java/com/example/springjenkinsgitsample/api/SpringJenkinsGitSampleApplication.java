package com.example.springjenkinsgitsample.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class SpringJenkinsGitSampleApplication {
    public static Logger Log = LoggerFactory.getLogger(SpringJenkinsGitSampleApplication.class);

    @PostConstruct
    public void init(){
        Log.info("inside SpringJenkinsGitSampleApplication application");
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsGitSampleApplication.class, args);
        Log.info("SpringJenkinsGitSampleApplication executing............");

    }

}
