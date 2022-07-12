package com.springboot.repository;

import com.springboot.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("David");
        speaker.setLastName("Miclea");

        speakers.add(speaker);

        return speakers;
    }


}
