package com.example.Svitlachok.controller;

import com.example.Svitlachok.chromeDriver.ColorCounter;
import com.example.Svitlachok.model.CustomerDTO;
import com.example.Svitlachok.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @PostMapping("/note")
    public void addCustomer() {
        customerService.addCustomer(ColorCounter.queueCounter(), ColorCounter.colorCounter());
    }

    @GetMapping("/note")
    public CustomerDTO getCustomer(@RequestParam int id) {
        return customerService.getCustomer(id);
    }
}
