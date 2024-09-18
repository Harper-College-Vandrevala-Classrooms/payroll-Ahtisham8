package com.csc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Payroll {
  // Implement your solution here!
  public static void main(String[] args)
  {

    NumberFormat nf = NumberFormat.getNumberInstance();
    nf.setGroupingUsed(true);
    nf.setMinimumFractionDigits(2);
    nf.setMaximumFractionDigits(2);

    System.out.println("\n\n\nWelcome to the Payroll Program!\n");
  
    System.out.println("How many hours did you work this week?");

    Scanner input = new Scanner(System.in);
    double hoursNum = input.nextDouble();

    System.out.println("How many dependents do you have?");
    int dependents = input.nextInt();

    System.out.println("Payroll Stub" + "\n");

    PayrollCalculator payrollCalculator = new PayrollCalculator();

    double grossPay = payrollCalculator.grossPay(hoursNum);

    System.out.println("Hours: " + hoursNum);
    System.out.println("Rate: 16.78 $/hr");
    System.out.println("Gross: $" + nf.format(grossPay));

    
    

    double socSec = payrollCalculator.socialTax(grossPay);
    double fedTax = payrollCalculator.federalTax(grossPay);
    double stTax = payrollCalculator.stateTax(grossPay);
    double union = payrollCalculator.union();
    double ins = payrollCalculator.insuranceCalc(dependents);

    System.out.println("\nSocial Security: $" + nf.format(socSec));
    System.out.println("Federal Tax: $" + nf.format(fedTax));
    System.out.println("State Tax: $" + nf.format(stTax));
    System.out.println("Union: $" + nf.format(union));
    System.out.println("Insurance: $" + nf.format(ins));

    System.out.println("\nNet: $" + payrollCalculator.netPay(grossPay, socSec, fedTax, stTax, union, ins));
  }
}
