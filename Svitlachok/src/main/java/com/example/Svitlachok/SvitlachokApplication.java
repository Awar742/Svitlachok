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

	}

}
