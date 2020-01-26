package me.cam.payroll;

import java.util.Scanner;

/**
 * Author: Cameron Janssen
 * Acknowledgements: None
 * Purpose: Calculates payroll
 */
public class PayRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee's name:");
        String name = scanner.nextLine();

        System.out.println("Enter number of hours worked in a week:");
        double hours = scanner.nextDouble();

        System.out.println("Enter hourly pay rate:");
        double payRate = scanner.nextDouble();

        System.out.println("Enter federal tax withholding rate:");
        double federalTax = scanner.nextDouble();

        System.out.println("Enter state tax withholding rate:");
        double stateTax = scanner.nextDouble();

        System.out.println("----------------------");
        System.out.println("Employee Name: " + name + "\n" +
                " \n" +
                "Hours worked: " + hours + "\n" +
                "Pay Rate: $" + payRate + "\n" +
                "Gross Pay: $" + hours * payRate + "\n" +
                "Deductions:");

        System.out.printf("    Federal Withholding (" + (int) Math.floor(federalTax * 100) + "%%):   \t $%.2f \n", federalTax * hours * payRate);
        System.out.printf("    Provincial Withholding (" + (int) Math.floor(stateTax * 100) + "%%):\t $%.2f \n", stateTax * hours * payRate);
        System.out.printf("    Total Deduction: $%.2f \n", (hours * payRate)*(stateTax + federalTax));
        System.out.printf("Net Pay: $%.2f", (hours*payRate - (hours * payRate)*(stateTax + federalTax)));
    }
}