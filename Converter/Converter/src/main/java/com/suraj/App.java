package com.suraj;

import com.suraj.services.AssignmentService;

public class App {
    public static void main(String[] args) {
        AssignmentService csv = new AssignmentService();
        csv.JsonConvert(csv.readFile("C:\\Users\\ASUS\\suraj\\Converter\\Converter\\src\\main\\java\\com\\suraj\\utils\\questions.csv"));
    }
}
