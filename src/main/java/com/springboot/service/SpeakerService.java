package com.springboot.service;

import com.springboot.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
