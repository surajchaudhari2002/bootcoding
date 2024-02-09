package com.suraj.lambok;

import lombok.*;
import lombok.experimental.UtilityClass;

@Setter  // for setting the values
@Getter  // for getting values
@Data    // for setting getting and for tostring method
@AllArgsConstructor  //to set values by constructor
@NoArgsConstructor   // to call default constructor
public class EmployeesData {
    private int employeeId;
    private String employeeNmae;
    private String employeeAdress;
    private double employeeSalary;
    private long emoloyeeContact;


//    Without lambok we need to write this much amount of code for the setting and getting the value of private members of the
//    any java class.cunstructor also used for the setting the values so we need to write the numbers of line of code to avoid
//    this kind of problems and to improve the code readablity we can use the LAMBOK.
//    ----------------------------------------------------------------------------------------------------------------------------
//    public EmployeesData(int employeeId, String employeeNmae, String employeeAdress, double employeeSalary, long emoloyeeContact) {
//        this.employeeId = employeeId;
//        this.employeeNmae = employeeNmae;
//        this.employeeAdress = employeeAdress;
//        this.employeeSalary = employeeSalary;
//        this.emoloyeeContact = emoloyeeContact;
//    }
//
//    public EmployeesData() {
//    }
//
//    public int getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(int employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public String getEmployeeNmae() {
//        return employeeNmae;
//    }
//
//    public void setEmployeeNmae(String employeeNmae) {
//        this.employeeNmae = employeeNmae;
//    }
//
//    public String getEmployeeAdress() {
//        return employeeAdress;
//    }
//
//    public void setEmployeeAdress(String employeeAdress) {
//        this.employeeAdress = employeeAdress;
//    }
//
//    public double getEmployeeSalary() {
//        return employeeSalary;
//    }
//
//    public void setEmployeeSalary(double employeeSalary) {
//        this.employeeSalary = employeeSalary;
//    }
//
//    public long getEmoloyeeContact() {
//        return emoloyeeContact;
//    }
//
//    public void setEmoloyeeContact(long emoloyeeContact) {
//        this.emoloyeeContact = emoloyeeContact;
//    }


//    @Override
//    public String toString() {
//        return "EmployeesData{" +
//                "employeeId=" + employeeId +
//                ", employeeNmae='" + employeeNmae + '\'' +
//                ", employeeAdress='" + employeeAdress + '\'' +
//                ", employeeSalary=" + employeeSalary +
//                ", emoloyeeContact=" + emoloyeeContact +
//                '}';
//    }
}
