package com.example.bootcodingmaster;

import com.example.bootcodingmaster.model.Assignment;
import com.example.bootcodingmaster.service.AssignmentService;
import com.example.bootcodingmaster.service.JsonWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class BootcodingMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcodingMasterApplication.class, args);
		List<Assignment> assignmentList = new ArrayList<>();
		JsonWriter file = new JsonWriter();
		AssignmentService assignmentService = new AssignmentService();
		Scanner sc = new Scanner(System.in);
		System.out.println("1 for insert value in database");
		System.out.println("2 for fetch value from database");
		System.out.println("3 for fetch value from database by diificultyLevel");
		System.out.println("4 for fetch value from database by PaidOnly");
		System.out.print("Enter your operation :-");
		int x = sc.nextInt();
		if(x==1) {

			assignmentService.readFile("C:\\Users\\ASUS\\suraj\\bootcoding-master\\bootcoding-master\\src\\main\\java\\com\\example\\bootcodingmaster\\utils\\questions.csv");
			System.out.println("Data inserted in database");
		} else if (x==2) {


			assignmentList = assignmentService.getAssignment();
			file.write(assignmentList, "assignment");
		} else if (x==3) {


			System.out.print("Enter your search level : ");
			String input = sc.next();
			assignmentList = assignmentService.getByDifficultyLevel(input);
			file.write(assignmentList, "DifficultyLevel");
		} else if (x==4) {


			System.out.print("Enter is it paid or unpaid if it is paid true otherwise enter false :");
			boolean userinput = sc.nextBoolean();
			assignmentList = assignmentService.getByPaidonly(userinput);
			file.write(assignmentList, "PaidOnly");

		}
		else{
			System.out.println("Incorrect choice");

		}

	}
}


