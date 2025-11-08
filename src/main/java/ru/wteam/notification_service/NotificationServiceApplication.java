package ru.wteam.notification_service;

//import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class NotificationServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

}
