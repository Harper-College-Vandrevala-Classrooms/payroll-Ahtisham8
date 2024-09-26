package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPayroll {

  PayrollCalculator payrollCalculator;

  @BeforeEach
  void setUp() {
    payrollCalculator = new PayrollCalculator();
  }

  // Add your tests here
  

  @Test
  void testSocSecEqualsZeroIfGrossPayZero() {
    assertEquals(0, payrollCalculator.socialTax(0), 0.001);
  }

  @Test
  void testSocSecIfGrossPayIsHundred() {
    assertEquals(6.00, payrollCalculator.socialTax(100), 0.001);
  }

  @Test
  void testFedTaxEqualsZeroIfGrossPayZero() {
    assertEquals(0, payrollCalculator.federalTax(0), 0.001);
  }

  @Test
  void testFedTaxIfGrossPayIsHundredTwenty() {
    assertEquals(16.80, payrollCalculator.federalTax(120), 0.001);
  }

  @Test
  void testStateTaxEqualsZeroIfGrossPayZero() {
    assertEquals(0, payrollCalculator.stateTax(0), 0.001);
  }

  @Test
  void testStateTaxIfGrossPayIsEighty() {
    assertEquals(4.00, payrollCalculator.stateTax(80), 0.001);
  }

  @Test
  void testInsEqualsFifteenIfDependtwo() {
    assertEquals(15.00, payrollCalculator.insuranceCalc(2), 0.001);
  }

  @Test
  void testInsEqualsThirtyFiveIfDependThree() {
    assertEquals(35.00, payrollCalculator.insuranceCalc(3), 0.001);
  }

  @Test
  void testNetPayIfTaxesZeroAndLessThanThreeDependWithHundredGross() {
    assertEquals(75.00, payrollCalculator.netPay(100.00, 0.00, 0.00, 0.00, 10.00, 15.00), 0.001);
  }

  @Test
  void testNetPayIfAllTaxesZeroAndMoreThanThreeDependWithHundredGross() {
    assertEquals(55.00, payrollCalculator.netPay(100.00, 0.00, 0.00, 0.00, 10.00, 35.00), 0.001);
  }
}
