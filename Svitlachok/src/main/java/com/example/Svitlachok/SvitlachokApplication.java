package com.example.Svitlachok;

import com.example.Svitlachok.Requests.PostRequest;
import com.example.Svitlachok.chromeDriver.ColorCounter;
import com.example.Svitlachok.controller.CustomerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SvitlachokApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvitlachokApplication.class, args);

		PostRequest.postRequest();
//        System.out.println(ColorCounter.queueCounter());
//        System.out.println();
//
//		int [] todaySchedule=ColorCounter.colorCounter();
//		for (int j = 0; j < todaySchedule.length; j++) {
//			System.out.print(todaySchedule[j]+" ");
//		}
	}

}
