package org.manjunath.test.interviewproblems;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.StringRotationOfOther;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStringRotationOfOther {
	private StringRotationOfOther rotation;
	
	@BeforeClass
	public void initialization() {
		rotation = new StringRotationOfOther();
	}
	
	@Test(testName = "testStringdabcIsRotationOfabcd")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To check the string dabc is rotation of abcd",
	expectedResult = "isStringRotationOfOther() method should return true")
	public void testStringdabcIsRotationOfabcd() {
		Reporter.log("TestStringRotationOfOther: Start of testStringdabcIsRotationOfabcd() method", true);
		try {
			Assert.assertEquals(rotation.isStringRotationOfOther("abcd", "dabc"), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringRotationOfOther: End of testStringdabcIsRotationOfabcd() method", true);
	}
	
	
	@Test(testName = "testStringdbcaIsRotationOfabcd")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To check the string dbca is rotation of abcd",
	expectedResult = "isStringRotationOfOther() method should return false")
	public void testStringdbcaIsRotationOfabcd() {
		Reporter.log("TestStringRotationOfOther: Start of testStringdbcaIsRotationOfabcd() method", true);
		try {
			Assert.assertEquals(rotation.isStringRotationOfOther("abcd", "dbca"), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringRotationOfOther: End of testStringdbcaIsRotationOfabcd() method", true);
	}
}
