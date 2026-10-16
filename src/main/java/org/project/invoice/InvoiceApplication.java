package org.project.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InvoiceApplication {

    public static void main(String[] args) {
        System.out.println("Changed timezone from calcutta to kolkata in run -> edit configurations -> add VM options");
        System.out.println(java.time.ZoneId.systemDefault());
        SpringApplication.run(InvoiceApplication.class, args);
    }

}
