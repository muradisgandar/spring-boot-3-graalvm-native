package com.example.demo;

import com.example.demo.features.StringTextBlock;
import com.example.demo.features.UserRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpGraalNativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpGraalNativeApplication.class, args);

		UserRecord userRecord = new UserRecord("Murad", 22);

		StringTextBlock.newStyle();

	}

}
