package in.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring2AppnApplication {
	public Spring2AppnApplication(){
		System.err.println("\tSpring2AppnApplication :: Constructor");
	}
	public static void main(String[] args) {
		SpringApplication.run(Spring2AppnApplication.class, args);
	}

}
