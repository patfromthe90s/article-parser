package io.github.patfromthe90s.grabber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the application. Bootstraps Spring and then runs the application
 * as a Spring application. 
 * @see {@link SpringApplication}.
 * @author Patrick
 *
 */
@SpringBootApplication(scanBasePackages="io.github.patfromthe90s")
public class Main {
		
	public static void main(String[] args)  {
		SpringApplication.run(Main.class, args);
	}
	
}
