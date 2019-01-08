package org.manjunath.test.interviewproblems.numbers;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.numbers.PalindromeOfNumber;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPalindromeOfNumber {
	private PalindromeOfNumber palindrome;
	
	@BeforeClass
	public void doInitialization() {
		palindrome = new PalindromeOfNumber();
	}
	
	@Test(testName = "testIs121Palindrome")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To test whether the number 121 is palindrome or not",
	expectedResult = "isNumberPalindrome() method should return true")
	public void testIs121Palindrome() {
		Reporter.log("TestPalindromeOfNumber: Strat of testIs121Palindrome() method", true);
		
		try {
			Assert.assertEquals(true, palindrome.isNumberPalindrome(121));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPalindromeOfNumber: End of testIs121Palindrome() method", true);
	}
	
	
	@Test(testName = "testIs12345Palindrome")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To test whether the number 12345 is palindrome or not",
	expectedResult = "isNumberPalindrome() method should return false")
	public void testIs12345Palindrome() {
		Reporter.log("TestPalindromeOfNumber: Strat of testIs12345Palindrome() method", true);
		
		try {
			Assert.assertEquals(false, palindrome.isNumberPalindrome(12345));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPalindromeOfNumber: End of testIs12345Palindrome() method", true);
	}
	
	
	@Test(testName = "testIs4516154Palindrome")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To test whether the number 4516154 is palindrome or not",
	expectedResult = "isNumberPalindrome() method should return false")
	public void testIs4516154Palindrome() {
		Reporter.log("TestPalindromeOfNumber: Strat of testIs4516154Palindrome() method", true);
		
		try {
			Assert.assertEquals(true, palindrome.isNumberPalindrome(4516154));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPalindromeOfNumber: End of testIs4516154Palindrome() method", true);
	}
	
	
	@Test(testName = "testIs98456Palindrome")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To test whether the number 98456 is palindrome or not",
	expectedResult = "isNumberPalindrome() method should return false")
	public void testIs98456Palindrome() {
		Reporter.log("TestPalindromeOfNumber: Strat of testIs98456Palindrome() method", true);
		
		try {
			Assert.assertEquals(false, palindrome.isNumberPalindrome(98456));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPalindromeOfNumber: End of testIs98456Palindrome() method", true);
	}
}
