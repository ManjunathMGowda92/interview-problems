package org.manjunath.test.interviewproblems.numbers;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.numbers.FactorialOfNumber;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFactorialOfNumber {
	private FactorialOfNumber factorial;
	
	@BeforeClass
	public void doInitialization() {
		factorial = new FactorialOfNumber();
	}
	
	@Test(testName = "testFactorialOf5")
	@TestCase(author = "Manjunath HM", 
			testCaseDescription = "To test the fact() method to get Factorial of 5",
			expectedResult = "fact() method should return 120 as result")
	public void testFactorialOf5() {
		Reporter.log("TestFactorialOfNumber: Start of testFactorialOf5() method", true);
		try {
			int result = factorial.fact(5);
			Assert.assertEquals(result, 120);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestFactorialOfNumber: End of testFactorialOf5() method", true);
	}
	
	@Test(testName = "testFactorialOf10")
	@TestCase(author = "Manjunath HM", 
			testCaseDescription = "To test the fact() method to get Factorial of 10",
			expectedResult = "fact() method should return 3628800 as result")
	public void testFactorialOf10() {
		Reporter.log("TestFactorialOfNumber: Start of testFactorialOf10() method", true);
		try {
			int result = factorial.fact(10);
			Assert.assertEquals(result, 3628800);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestFactorialOfNumber: End of testFactorialOf10() method", true);
	}
}
