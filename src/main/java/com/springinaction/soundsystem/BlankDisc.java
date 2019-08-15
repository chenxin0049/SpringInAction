package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDisc {
    private String title;
    private String artist;

    public BlankDisc(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
}