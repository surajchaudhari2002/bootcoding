# Grade System
### ℹ Task: Level 1
Write a `Java` program to implement a Grade System. The program should take the student’s `score` as input and then determine and print the corresponding `grade` based on the following criteria:

`A`: 90 and above  
`B`: 80-89  
`C`: 70-79  
`D`: 60-69  
`E`: Below 60  

Ensure that your program includes input validation to handle cases where the entered score is not within the valid range (0-100). The program should display an appropriate message for invalid input.

## Student  Code 
### 🚀 Did you know?
Typically student’s approach is to start writing code without understanding it thoroughly .
Most of the students write entire logic in main().
Student’s hardly use OOPs concepts practically in given tasks.

```java
import java.util.Scanner;
public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int s = scanner.nextInt();
        char g;
        if(s < 0 || s > 100){
            System.err.println("Invalid Input!! Score must be between 0-100!");
        }
        if (s >= 90) {
            g = 'A';
        } else if (s >= 80) {
            g = 'B';
        } else if (s >= 70) {
            g = 'C';
        } else if (s >= 60) {
            g = 'D';
        } else {
            g = 'F';
        }
        System.out.println("Your grade: " + g);
    }
}
```

## Developer Code
### 🚀 Did you know?
Developer’s approach is generally as

Understand the given task
Identify assumptions, hidden requirements and ask questions if any
Think how to handle basic requirements with different use cases
Write clean, readable and maintainable code.
Use OOPs concepts while implementing the task.

Developers often break down the assigned tasks into smaller, more manageable steps.

### Define Grades
Define Grades as Array of Grade Values
```java
 private static final String[] grades = {"A", "B", "C", "D", "E"};
 ```

 ### Define Grades Ranges
 Define Grade Ranges as Array of Grade Range Values
 ```java
 private static final int[] gradeRanges = {90, 80, 70, 60};
 ```

 ### Define a method
 Define method `getGrade()` to get Grade by index where first index is for highest grade and last index is for lowest grade
 ```java
 public String getGrade(int index){
    return grades[index];
}
 ```

 Using `if` block
 ```java
 public String calculateGrade(int score){
    if(score < 0 || score > 100){
        return "Invalid Input!! Score must be between 0-100!";
    }
    if(score >= gradeRanges[0]){
        return getGrade(0);
    } if(score >= gradeRanges[1]){
        return getGrade(1);
    } if(score >= gradeRanges[2]){
        return getGrade(2);
    } if(score >= gradeRanges[3]){
        return getGrade(3);
    }
    return getGrade(4);
}
```
## ⚠ Problem
Above code may throw error if the size of your grades array changes.

Using `for` loop
```java
public String calculateGrade(int score){
    if(score < 0 || score > 100){
        return "Invalid Input!! Score must be between 0-100!";
    }
    for(int i = 0; i < gradeRanges.length; i++){
        if(score >= gradeRanges[i]){
            return getGrade(i);
        }
    }
    return getGrade(gradeRanges.length);
}
```
## Complete Code
```java
package com.bootcoding.developer.tasks.grade;

public class DeveloperGradeSystem {

    private static final String[] grades = {"A", "B", "C", "D", "E"};

    private static final int[] gradeRanges = {90, 80, 70, 60};

    public String getGrade(int index){
        return grades[index];
    }

    public String calculateGrade(int score){
        if(score < 0 || score > 100){
            return "Invalid Input!! Score must be between 0-100!";
        }
        for(int i = 0; i < gradeRanges.length; i++){
            if(score >= gradeRanges[i]){
                return getGrade(i);
            }
        }
        return getGrade(gradeRanges.length);
    }

}
```
## Execute Code 
```java
package com.bootcoding.developer.tasks.grade;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        DeveloperGradeSystem gradeSystem = new DeveloperGradeSystem();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score: ");
        int score = scanner.nextInt();
        String grade = gradeSystem.calculateGrade(score);
        System.out.println("Your grade is " + grade);
    }
}
```
## Conclusion
After understanding the developer’s approach, students should learn to:

Dive deep into task requirements.
Uncover hidden or implicit aspects of the task.
Write code that is not only functional but also clean, readable, and follows OOPs principles.

