package com.springboot.service;

import com.springboot.model.Speaker;
import com.springboot.repository.HibernateSpeakerRepositoryImpl;
import com.springboot.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository ;

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
