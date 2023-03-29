package baitap;

import baitap.EmployeeFullTime;
import baitap.EmployeePartime;

import java.util.Scanner;

public class TestSalaryPolicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base salary for full-time employee:");
        float baseSalaryFullTime = scanner.nextFloat();
        EmployeeFullTime fullTimeEmployee = new EmployeeFullTime(baseSalaryFullTime);
        System.out.println("Full-time employee salary: " + fullTimeEmployee.getSalary());

        System.out.println("Enter base salary for part-time employee:");
        float baseSalaryPartTime = scanner.nextFloat();
        EmployeePartime partTimeEmployee = new EmployeePartime(baseSalaryPartTime);
        System.out.println("Part-time employee salary: " + partTimeEmployee.getSalary());
    }
}

