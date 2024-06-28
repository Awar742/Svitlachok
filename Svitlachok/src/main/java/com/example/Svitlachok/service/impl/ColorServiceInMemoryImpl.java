package com.example.Svitlachok.service.impl;

import com.example.Svitlachok.model.CustomerDTO;
import com.example.Svitlachok.service.ColorService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ColorServiceInMemoryImpl implements ColorService {
    private Map<Integer, CustomerDTO> persist = new HashMap<>();


    @Override
    public void addColor(int id, int[] todaySchedule) {
        persist.put(id, new CustomerDTO(id, todaySchedule));
    }

    @Override
    public CustomerDTO getColor(int id) {
        return persist.get(id);
    }

}
