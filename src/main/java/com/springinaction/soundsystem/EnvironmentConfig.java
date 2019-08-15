package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("app.properties")
public class EnvironmentConfig {
    @Autowired
    private Environment env;

    @Bean
    public BlankDisc blankDisc(){
        return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"));
    }
}