package com.company.app;

import com.company.app.entity.Employee;
import com.company.app.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

@Slf4j
@SpringBootApplication
public class App {

    private Employee employee;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        EmployeeRepository repository = context.getBean(EmployeeRepository.class);

        repository.save(new Employee("Jack", "Bauer","jbauer@gmail.com"));
        repository.save(new Employee("Chloe", "Nelson","cnelson@gmail.com"));
        repository.save(new Employee("Carla", "Addams","cadams@rocketsoftware.com"));
        repository.save(new Employee("Tammy", "Wood","twood@rocketsoftware.com"));

        Iterable<Employee> employees = repository.findAll();
        System.out.println("Employee found with findAll():");
        System.out.println("-------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
        context.close();
    }
}