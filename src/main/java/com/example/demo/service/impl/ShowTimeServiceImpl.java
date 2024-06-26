package com.example.demo.service.impl;

import com.example.demo.model.Threat;
import com.example.demo.repository.ShowTimeRepository;
import com.example.demo.service.ShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowTimeServiceImpl implements ShowTimeService {
    @Autowired
    private ShowTimeRepository showTimeRepository;
    @Override
    public List<Threat> listAll() {
        return showTimeRepository.findAll();
    }
}
