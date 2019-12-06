package com.code.gazer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GazerApplication {

  public static void main(final String[] args) {
    disableWarning();
    SpringApplication.run(GazerApplication.class, args);
  }

  public static void disableWarning() {
    System.err.close();
    System.setErr(System.out);
  }

}

