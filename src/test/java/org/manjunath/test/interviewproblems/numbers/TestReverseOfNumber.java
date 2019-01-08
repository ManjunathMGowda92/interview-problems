package org.manjunath.test.interviewproblems.numbers;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.numbers.ReverseOfNumber;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestReverseOfNumber {
	private ReverseOfNumber reverse;
	
	@BeforeClass
	public void doInitialization() {
		reverse = new ReverseOfNumber();
	}
	
	@Test(testName = "testReverseOfNum10", alwaysRun = true, 
			description = "Test case to get the reverse of number 10 and to test the correct output")
	@TestCase(author = "Manjunath HM",
	expectedResult = "getReverseNum() method should return 01",
	testCaseDescription = "test case to get the reverse of number 10 and to test the correct output")
	public void testReverseOfNum10() {
		Reporter.log("TestReverseOfNumber: Start of testReverseOfNum10() method", true);
		try {
			Assert.assertEquals(reverse.getReverseNum(10), 01);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestReverseOfNumber: End of testReverseOfNum10() method", true);
	}
	
	
	@Test(testName = "testReverseOfNum123", alwaysRun = true, 
			description = "Test case to get the reverse of number 123 and to test the correct output")
	@TestCase(author = "Manjunath HM",
	expectedResult = "getReverseNum() method should return 321",
	testCaseDescription = "test case to get the reverse of number 123 and to test the correct output")
	public void testReverseOfNum123() {
		Reporter.log("TestReverseOfNumber: Start of testReverseOfNum123() method", true);
		try {
			Assert.assertEquals(reverse.getReverseNum(123), 321);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestReverseOfNumber: End of testReverseOfNum123() method", true);
	}
	
	
	@Test(testName = "testReverseOfNum87654", alwaysRun = true,
			description = "Test case to get the reverse of number 87654 and to test the correct output")
	@TestCase(author = "Manjunath HM",
	expectedResult = "getReverseNum() method should return 45678",
	testCaseDescription = "test case to get the reverse of number 87654 and to test the correct output")
	public void testReverseOfNum87654() {
		Reporter.log("TestReverseOfNumber: Start of testReverseOfNum87654() method", true);
		try {
			Assert.assertEquals(reverse.getReverseNum(87654), 45678);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestReverseOfNumber: End of testReverseOfNum87654() method", true);
	}
	
	
	@Test(testName = "testReverseOfNum5839245", alwaysRun = true,
			description = "Test case to get the reverse of number 5839245 and to test the correct output")
	@TestCase(author = "Manjunath HM",
	expectedResult = "getReverseNum() method should return 5429385",
	testCaseDescription = "test case to get the reverse of number 5839245 and to test the correct output")
	public void testReverseOfNum5839245() {
		Reporter.log("TestReverseOfNumber: Start of testReverseOfNum5839245() method", true);
		try {
			Assert.assertEquals(reverse.getReverseNum(5839245), 5429385);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestReverseOfNumber: End of testReverseOfNum5839245() method", true);
	}
}
