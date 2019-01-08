package org.manjunath.test.interviewproblems.strings;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.strings.PalindromeOfString;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPalindromeOfString2 {
	private PalindromeOfString palin;

	@BeforeClass
	public void doInitialization() {
		palin = new PalindromeOfString();
	}

	@Test(testName = "testIsPalindrome4", expectedExceptions = { NullPointerException.class, Exception.class })
	@TestCase(author = "Manjunath HM", 
			 testCaseDescription = "Checking the Null pointer exception thrown by the calling method i.e isStringPalindrome() method")
	public void testIsPalindrome4() {
		Reporter.log("TestPalindromeOfString2: Start of testIsPalindrome4() method", true);
		palin.isStringPalindrome(null);
		Reporter.log("TestPalindromeOfString2: End of testIsPalindrome4() method", true);
	}
	
	@Test(testName = "testIsPalindrome1")
	@TestCase(author = "Manjunath HM", 
			 testCaseDescription = "Checking the string SoftwareTest is palindrome or not", 
			 expectedResult = "isPalindrome() method should return false")
	public void testIsPalindrome5() {
		Reporter.log("TestPalindromeOfString2: Start of testIsPalindrome5() method", true);
		try {
			boolean condition = palin.isStringPalindrome("SoftwareTest");
			Assert.assertEquals(condition, false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:" + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:" + e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPalindromeOfString2: End of testIsPalindrome5() method", true);
	}

	@Test(testName = "testIsPalindrome2")
	@TestCase(author = "Manjunath HM", 
			 testCaseDescription = "Checking the string racecar is palindrome or not",
			 expectedResult = "isPalindrome() method should return true")
	public void testIsPalindrome6() {
		Reporter.log("TestPalindromeOfString2: Start of testIsPalindrome6() method", true);
		try {
			boolean condition = palin.isStringPalindrome("racecar");
			Assert.assertEquals(condition, true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:" + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:" + e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPalindromeOfString2: End of testIsPalindrome6() method", true);
	}
}
