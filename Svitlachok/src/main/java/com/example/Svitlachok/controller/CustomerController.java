package com.example.Svitlachok.controller;

import com.example.Svitlachok.chromeDriver.ColorCounter;
import com.example.Svitlachok.model.CustomerDTO;
import com.example.Svitlachok.service.ColorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class CustomerController {

    private final ColorService colorService;


    @PostMapping("/note")
    public void addColor() {
        colorService.addColor(ColorCounter.queueCounter("25039489"), ColorCounter.colorCounter("25039489")); //1.2

        colorService.addColor(ColorCounter.queueCounter("24045000"), ColorCounter.colorCounter("24045000")); //2.2

        colorService.addColor(ColorCounter.queueCounter("25045709"), ColorCounter.colorCounter("25045709")); //4.1

        colorService.addColor(ColorCounter.queueCounter("25029000"), ColorCounter.colorCounter("25029000")); //5.1
        colorService.addColor(ColorCounter.queueCounter("24045709"), ColorCounter.colorCounter("24045709")); //5.2

        colorService.addColor(ColorCounter.queueCounter("24045609"), ColorCounter.colorCounter("24045609")); //6.1
        colorService.addColor(ColorCounter.queueCounter("25000450"), ColorCounter.colorCounter("25000450")); //6.3

    }

    @GetMapping("/note")
    public CustomerDTO getColor(@RequestParam int id) {
        return colorService.getColor(id);
    }
}
