package com.springinaction.soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {
    private List<String> tracks;

    public void setTracks(List<String> tracks){
        this.tracks = tracks;
    }

    @Override
    public void playTrack(int trackNumber) {
        if(tracks != null && trackNumber < tracks.size()){
            String track = tracks.get(trackNumber);
            System.out.println(track);
        }
    }
}
