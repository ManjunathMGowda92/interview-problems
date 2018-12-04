package org.manjunath.test.interviewproblems;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.ExtractLargestNumberFromString;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestExtractLargestNumberFromString {
	private ExtractLargestNumberFromString largest;
	
	@BeforeClass
	public void doInitialization() {
		largest = new ExtractLargestNumberFromString();
	}
	
	@Test(testName = "testExtractLargestFromStringabc123rty45")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "to extract largest integer from the string abc123rty45",
	expectedResult = "getLargestNumber() method should return 123")
	public void testExtractLargestFromStringabc123rty45() {
		Reporter.log("TestExtractLargestNumberFromString: Start of testExtractLargestFromStringabc123rty45() method", true);
		try {
			Assert.assertEquals(largest.getLargestNumber("abc123rty45"), 123);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestExtractLargestNumberFromString: End of testExtractLargestFromStringabc123rty45() method", true);
	}
	
	
	@Test(testName = "testExtractLargestFromEmptyString")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "to extract largest integer from the empty string",
	expectedResult = "getLargestNumber() method should return 0")
	public void testExtractLargestFromEmptyString() {
		Reporter.log("TestExtractLargestNumberFromString: Start of testExtractLargestFromEmptyString() method", true);
		try {
			Assert.assertEquals(largest.getLargestNumber(""), 0);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestExtractLargestNumberFromString: End of testExtractLargestFromEmptyString() method", true);
	}
	
	
	@Test(testName = "testExtractLargestFromStringa123")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "to extract largest integer from the string a123",
	expectedResult = "getLargestNumber() method should return 123")
	public void testExtractLargestFromStringa123() {
		Reporter.log("TestExtractLargestNumberFromString: Start of testExtractLargestFromStringa123() method", true);
		try {
			Assert.assertEquals(largest.getLargestNumber("a123"), 123);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestExtractLargestNumberFromString: End of testExtractLargestFromStringa123() method", true);
	}
	
	
	@Test(testName = "testExtractLargestFromNull", expectedExceptions = {RuntimeException.class})
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "to extract largest integer from the string null",
	expectedResult = "getLargestNumber() method should throw RuntimeException saying Given String is null")
	public void testExtractLargestFromNull() {
		Reporter.log("TestExtractLargestNumberFromString: Start of testExtractLargestFromNull() method", true);
		
		Assert.assertEquals(largest.getLargestNumber(null), new RuntimeException());
		Reporter.log("TestExtractLargestNumberFromString: End of testExtractLargestFromNull() method", true);
	}
}
