package com.example.Svitlachok.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDTO {
    private int id;
    private int [] todaySchedule;
}
