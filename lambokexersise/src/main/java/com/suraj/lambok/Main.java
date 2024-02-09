package com.suraj.lambok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
//		setting the values to the object of EmployeeData class by using @Data Annotaion and printing object.
		EmployeesData employee1=new EmployeesData();
		employee1.setEmployeeId(101);
		employee1.setEmployeeAdress("Nagpur");
		employee1.setEmployeeNmae("suraj");
		employee1.setEmployeeSalary(100000);
		employee1.setEmoloyeeContact(7456786789l);
		System.out.println(employee1.toString());

//		setting values by parameterised cunstructor using @AllArgsConstructor Annotation
		EmployeesData employee2=new EmployeesData(102,"badal","punr",20000,8909848938l);
		System.out.println(employee2.toString());

//		calling noargscunstructor by @NoArgsConstructor Annotation
		EmployeesData employee3=new EmployeesData();
		System.out.println(employee3.toString());







	}

}
