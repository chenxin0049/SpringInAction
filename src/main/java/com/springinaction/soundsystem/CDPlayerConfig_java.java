package com.springinaction.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig_java {
    @Bean
    public MediaPlayer mediaPlayer(){
        return new CDPlayer(compactDisc());
    }

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}