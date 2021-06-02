package com.example.gestionbilletsbus;

import com.example.api.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = Controller.class)
public class GestionbilletsbusApplication {

  public static void main(String[] args) {
    SpringApplication.run(GestionbilletsbusApplication.class, args);
  }

}
