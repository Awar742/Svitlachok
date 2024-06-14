package com.example.Svitlachok.service;

import com.example.Svitlachok.model.CustomerDTO;

public interface CustomerService {
    void addCustomer(int id , int [] todaySchedule);
    CustomerDTO getCustomer(int id);
}
