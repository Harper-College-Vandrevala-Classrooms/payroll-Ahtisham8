package com.csc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class PayrollCalculator{


    public double grossPay(double hoursNum, double basePay)
    {  
        
        if (hoursNum <= 40) {
            return hoursNum * basePay;
        }

        else
        {
            return hoursNum * (1.5 * basePay);
        }
    }

    public Double socialTax(double grossPay)
    {  
        return grossPay * .06;
    }

    public double federalTax(double grossPay)
    {
        return grossPay * .14;
    }

    public double stateTax(double grossPay)
    {
        return grossPay * .05;
    }

    public double union()
    {
        return 10.00;
    }

    public double insuranceCalc(int dependents)
    {
        if (dependents >= 3) {
            return 35.00;
        }

        else
        {
            return 15.00;
        }
    }

    public double netPay(double grossPay, double socialTax, double federalTax, double stateTax, double union, double insuranceTax)
    {
        return grossPay - (socialTax + federalTax + stateTax + union + insuranceTax);
    }
}