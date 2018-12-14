package org.manjunath.test.interviewproblems;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.PrimeNumber2;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPrimeNumber2 {
	private PrimeNumber2 prime;
	
	@BeforeClass
	public void doInitialization() {
		prime = new PrimeNumber2();
	}
	
	@Test(testName = "testIs1PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return false",
	testCaseDescription = "to test the number 1 is prime or not")
	public void testIs1PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs1PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(1), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs1PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	@Test(testName = "testIs0PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return false",
	testCaseDescription = "to test the number 0 is prime or not")
	public void testIs0PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs0PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(0), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs0PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	
	@Test(testName = "testIs4PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return false",
	testCaseDescription = "to test the number 4 is prime or not")
	public void testIs4PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs4PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(4), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs4PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	@Test(testName = "testIs9PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return false",
	testCaseDescription = "to test the number 9 is prime or not")
	public void testIs9PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs9PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(9), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs9PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	@Test(testName = "testIs15PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return false",
	testCaseDescription = "to test the number 15 is prime or not")
	public void testIs15PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs15PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(15), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs15PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	@Test(testName = "testIs21PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return false",
	testCaseDescription = "to test the number 15 is prime or not")
	public void testIs21PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs21PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(21), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs21PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	
	@Test(testName = "testIs2PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return true",
	testCaseDescription = "to test the number 2 is prime or not")
	public void testIs2PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs2PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(2), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs2PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	@Test(testName = "testIs3PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return true",
	testCaseDescription = "to test the number 3 is prime or not")
	public void testIs3PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs3PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(3), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs3PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	@Test(testName = "testIs5PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return true",
	testCaseDescription = "to test the number 5 is prime or not")
	public void testIs5PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs5PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(5), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs5PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	@Test(testName = "testIs7PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return true",
	testCaseDescription = "to test the number 7 is prime or not")
	public void testIs7PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs7PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(7), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs7PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	@Test(testName = "testIs11PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return true",
	testCaseDescription = "to test the number 11 is prime or not")
	public void testIs11PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs11PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(11), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs11PrimeNumberUsingisPrimeMethod() method", true);
	}
	
	@Test(testName = "testIs47PrimeNumberUsingisPrimeMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrime() method should return true",
	testCaseDescription = "to test the number 47 is prime or not")
	public void testIs47PrimeNumberUsingisPrimeMethod() {
		Reporter.log("TestPrimeNumber2: Start of testIs47PrimeNumberUsingisPrimeMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrime(47), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber2: End of testIs47PrimeNumberUsingisPrimeMethod() method", true);
	}
}
