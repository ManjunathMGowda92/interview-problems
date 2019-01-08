package org.manjunath.test.interviewproblems;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.numbers.PrimeNumber1;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPrimeNumber1 {
	private PrimeNumber1 primeNumber;
	
	@BeforeClass
	public void doInitialization() {
		primeNumber = new PrimeNumber1();
	}
	
	@Test(testName = "testIs1PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return not a prime",
	testCaseDescription = "to test the number 1 is prime or not")
	public void testIs1PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIs1PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(1), "not a prime");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIs1PrimeNumber() method", true);
	}
	
	@Test(testName = "testIs0PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return not a prime",
	testCaseDescription = "to test the number 0 is prime or not")
	public void testIs0PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIs0PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(0), "not a prime");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIs0PrimeNumber() method", true);
	}
	
	@Test(testName = "testIsNegativeNum100PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return not valid",
	testCaseDescription = "to test the number -100 is prime or not")
	public void testIsNegativeNum100PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIsNegativeNum100PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(-100), "not valid");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIsNegativeNum100PrimeNumber() method", true);
	}
	
	@Test(testName = "testIs2PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return prime",
	testCaseDescription = "to test the number 2 is prime or not")
	public void testIs2PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIs2PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(2), "prime");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIs2PrimeNumber() method", true);
	}
	
	@Test(testName = "testIs3PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return prime",
	testCaseDescription = "to test the number 3 is prime or not")
	public void testIs3PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIs3PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(3), "prime");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIs3PrimeNumber() method", true);
	}
	
	@Test(testName = "testIs10PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return not a prime",
	testCaseDescription = "to test the number 10 is prime or not")
	public void testIs10PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIs10PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(10), "not a prime");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIs10PrimeNumber() method", true);
	}
	
	@Test(testName = "testIs11PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return prime",
	testCaseDescription = "to test the number 11 is prime or not")
	public void testIs11PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIs11PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(11), "prime");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIs11PrimeNumber() method", true);
	}
	
	@Test(testName = "testIs4PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return not a prime",
	testCaseDescription = "to test the number 4 is prime or not")
	public void testIs4PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIs4PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(4), "not a prime");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIs4PrimeNumber() method", true);
	}
	
	@Test(testName = "testIs5PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return prime",
	testCaseDescription = "to test the number 5 is prime or not")
	public void testIs5PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIs5PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(5), "prime");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIs5PrimeNumber() method", true);
	}
	
	@Test(testName = "testIs7PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return prime",
	testCaseDescription = "to test the number 11 is prime or not")
	public void testIs7PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIs7PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(7), "prime");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIs7PrimeNumber() method", true);
	}
	
	@Test(testName = "testIs13PrimeNumber")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return prime",
	testCaseDescription = "to test the number 13 is prime or not")
	public void testIs13PrimeNumber() {
		Reporter.log("TestPrimeNumber1: Start of testIs13PrimeNumber() method", true);
		try {
			Assert.assertEquals(primeNumber.isPrime(13), "prime");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber1: End of testIs13PrimeNumber() method", true);
	}
	
}
