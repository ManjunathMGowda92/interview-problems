package org.manjunath.test.interviewproblems;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.numbers.PerfectNumber;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPerfectNumber {
	private PerfectNumber perfectNumber;
	
	@BeforeClass
	public void doInitialization() {
		perfectNumber = new PerfectNumber();
	}
	
	@Test(testName = "testIs6PerfectNumber")
	@TestCase(author = "Manjunath HM", 
			testCaseDescription = "To check 6 is a perfect number or not",
			expectedResult = "isPerfectNumber() method should return true")
	public void testIs6PerfectNumber() {
		Reporter.log("TestPerfectNumber: Start of testIs6PerfectNumber() method");
		try {
			boolean result = perfectNumber.isPerfectNumber(6);
			Assert.assertEquals(result, true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError Occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPerfectNumber: End of testIs6PerfectNumber() method");
	}
	
	@Test(testName = "testIs28PerfectNumber")
	@TestCase(author = "Manjunath HM", 
			testCaseDescription = "To check 28 is a perfect number or not",
			expectedResult = "isPerfectNumber() method should return true")
	public void testIs28PerfectNumber() {
		Reporter.log("TestPerfectNumber: Start of testIs28PerfectNumber() method");
		try {
			boolean result = perfectNumber.isPerfectNumber(28);
			Assert.assertEquals(result, true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError Occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPerfectNumber: End of testIs28PerfectNumber() method");
	}
	
	@Test(testName = "testIs496PerfectNumber")
	@TestCase(author = "Manjunath HM", 
			testCaseDescription = "To check 496 is a perfect number or not",
			expectedResult = "isPerfectNumber() method should return true")
	public void testIs496PerfectNumber() {
		Reporter.log("TestPerfectNumber: Start of testIs496PerfectNumber() method");
		try {
			boolean result = perfectNumber.isPerfectNumber(496);
			Assert.assertEquals(result, true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError Occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPerfectNumber: End of testIs496PerfectNumber() method");
	}
	
	@Test(testName = "testIs8128PerfectNumber")
	@TestCase(author = "Manjunath HM", 
			testCaseDescription = "To check 8128 is a perfect number or not",
			expectedResult = "isPerfectNumber() method should return true")
	public void testIs8128PerfectNumber() {
		Reporter.log("TestPerfectNumber: Start of testIs8128PerfectNumber() method");
		try {
			boolean result = perfectNumber.isPerfectNumber(8128);
			Assert.assertEquals(result, true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError Occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPerfectNumber: End of testIs8128PerfectNumber() method");
	}
	
	@Test(testName = "testIs12PerfectNumber")
	@TestCase(author = "Manjunath HM", 
			testCaseDescription = "To check 12 is a perfect number or not",
			expectedResult = "isPerfectNumber() method should return false")
	public void testIs12PerfectNumber() {
		Reporter.log("TestPerfectNumber: Start of testIs12PerfectNumber() method");
		try {
			boolean result = perfectNumber.isPerfectNumber(12);
			Assert.assertEquals(result, false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError Occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPerfectNumber: End of testIs12PerfectNumber() method");
	}
	
	@Test(testName = "testIs100PerfectNumber")
	@TestCase(author = "Manjunath HM", 
			testCaseDescription = "To check 100 is a perfect number or not",
			expectedResult = "isPerfectNumber() method should return false")
	public void testIs100PerfectNumber() {
		Reporter.log("TestPerfectNumber: Start of testIs100PerfectNumber() method");
		try {
			boolean result = perfectNumber.isPerfectNumber(100);
			Assert.assertEquals(result, false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError Occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPerfectNumber: End of testIs100PerfectNumber() method");
	}
}
