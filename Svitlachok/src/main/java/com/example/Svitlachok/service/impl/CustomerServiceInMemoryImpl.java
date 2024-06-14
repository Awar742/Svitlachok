package com.example.Svitlachok.service.impl;

import com.example.Svitlachok.model.CustomerDTO;
import com.example.Svitlachok.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceInMemoryImpl implements CustomerService {
    private Map<Integer, CustomerDTO> persist = new HashMap<>();


    @Override
    public void addCustomer(int id, int[] todaySchedule) {
        persist.put(id, new CustomerDTO(id, todaySchedule));
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        return persist.get(id);
    }
}
