package com.springinaction.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PropertyConfig.class)
public class EnvironmentTest {
    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void play(){
        System.out.println(blankDisc.getTitle());
        System.out.println(blankDisc.getArtist());
    }
}
