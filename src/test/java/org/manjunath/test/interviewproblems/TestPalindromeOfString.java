package org.manjunath.test.interviewproblems;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.strings.PalindromeOfString;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPalindromeOfString {
	private PalindromeOfString palin;

	@BeforeClass
	public void doInitialization() {
		palin = new PalindromeOfString();
	}

	@Test(testName = "testIsNullPalindrome")
	@TestCase(author = "Manjunath HM", 
			  testCaseDescription = "Checking the null value of string is palindrome or not", 
			  expectedResult = "isPalindrome() method should return false because null check is handled")
	public void testIsNullPalindrome() {
		Reporter.log("TestPalindromeOfString: Start of testIsPalindrome() method", true);
		try {
			boolean condition = palin.isPalindrome(null);
			Assert.assertEquals(condition, false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:" + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:" + e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPalindromeOfString: End of testIsPalindrome() method", true);
	}

	@Test(testName = "testIsPalindrome1")
	@TestCase(author = "Manjunath HM", 
			 testCaseDescription = "Checking the string SoftwareTest is palindrome or not", 
			 expectedResult = "isPalindrome() method should return false")
	public void testIsPalindrome1() {
		Reporter.log("TestPalindromeOfString: Start of testIsPalindrome1() method", true);
		try {
			boolean condition = palin.isPalindrome("SoftwareTest");
			Assert.assertEquals(condition, false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:" + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:" + e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPalindromeOfString: End of testIsPalindrome1() method", true);
	}

	@Test(testName = "testIsPalindrome2")
	@TestCase(author = "Manjunath HM", 
			 testCaseDescription = "Checking the string racecar is palindrome or not",
			 expectedResult = "isPalindrome() method should return true")
	public void testIsPalindrome2() {
		Reporter.log("TestPalindromeOfString: Start of testIsPalindrome2() method", true);
		try {
			boolean condition = palin.isPalindrome("racecar");
			Assert.assertEquals(condition, true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:" + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:" + e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPalindromeOfString: End of testIsPalindrome2() method", true);
	}
}
