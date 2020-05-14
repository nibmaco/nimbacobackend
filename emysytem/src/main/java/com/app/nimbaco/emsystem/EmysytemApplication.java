package com.app.nimbaco.emsystem;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.nimbaco.emsystem.model.Employee;
import com.app.nimbaco.emsystem.repository.EmployeeRepository;

@SpringBootApplication
public class EmysytemApplication implements CommandLineRunner {

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String...args) throws Exception {

        // Create an employee
        Employee employee = new Employee();
        employee.setFirstName("Patrick");
        employee.setLastName("Lurlay");
        employee.setEmailId("lurlayp@gmail.com");
        employee.setUserName("plurlay");
        employee.setUserPassword("123123");
        employeeRepository.save(employee);
        // Create an employee
        Employee employee1 = new Employee();
        employee1.setFirstName("Cullen");
        employee1.setLastName("Lurlay");
        employee1.setEmailId("clurlaygmail.com");
        employee1.setUserName("clurlay");
        employee1.setUserPassword("123123");
        employeeRepository.save(employee1);
     // Create an employee
        Employee employee2 = new Employee();
        employee2.setFirstName("Tadhg");
        employee2.setLastName("Lurlay");
        employee2.setEmailId("lurlaytadhggmail.com");
        employee2.setUserName("tlurlay");
        employee2.setUserPassword("123123");
        employeeRepository.save(employee2);
        //create employee
        Employee employee3 = new Employee();
        employee3.setFirstName("Tadhg");
        employee3.setLastName("Lurlay");
        employee3.setEmailId("lurlaytadhggmail.com");
        employee3.setUserName("tlurlay");
        employee3.setUserPassword("123123");
        employeeRepository.save(employee3);
        //create employee
        Employee employee4 = new Employee();
        employee4.setFirstName("Tammie");
        employee4.setLastName("Lurlay");
        employee4.setEmailId("lurlaytgmail.com");
        employee4.setUserName("tdlurlay");
        employee4.setUserPassword("123123");
        employeeRepository.save(employee4);
        
       //create employee
        Employee employee5 = new Employee();
        employee5.setFirstName("Roisin");
        employee5.setLastName("Lurlay");
        employee5.setEmailId("roisinl@gmail.com");
        employee5.setUserName("tdlurlay");
        employee5.setUserPassword("123123");
        employeeRepository.save(employee5);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(EmysytemApplication.class, args);
	}

}
