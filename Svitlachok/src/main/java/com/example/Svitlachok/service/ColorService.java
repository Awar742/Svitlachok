package com.example.Svitlachok.service;

import com.example.Svitlachok.model.CustomerDTO;

public interface ColorService {
    void addColor(int id , int [] todaySchedule);
    CustomerDTO getColor(int id);
}
