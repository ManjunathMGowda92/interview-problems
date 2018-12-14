package org.manjunath.test.interviewproblems;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.PrimeNumber2;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPrimeNumber3 {
private PrimeNumber2 prime;
	
	@BeforeClass
	public void doInitialization() {
		prime = new PrimeNumber2();
	}
	
	@Test(testName = "testIs1PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return false",
	testCaseDescription = "to test the number 1 is prime or not")
	public void testIs1PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs1PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(1), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs1PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	@Test(testName = "testIs0PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return false",
	testCaseDescription = "to test the number 0 is prime or not")
	public void testIs0PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs0PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(0), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs0PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	
	@Test(testName = "testIs4PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return false",
	testCaseDescription = "to test the number 4 is prime or not")
	public void testIs4PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs4PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(4), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs4PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	@Test(testName = "testIs9PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return false",
	testCaseDescription = "to test the number 9 is prime or not")
	public void testIs9PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs9PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(9), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs9PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	@Test(testName = "testIs15PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return false",
	testCaseDescription = "to test the number 15 is prime or not")
	public void testIs15PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs15PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(15), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs15PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	@Test(testName = "testIs21PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return false",
	testCaseDescription = "to test the number 15 is prime or not")
	public void testIs21PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs21PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(21), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs21PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	
	@Test(testName = "testIs2PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return true",
	testCaseDescription = "to test the number 2 is prime or not")
	public void testIs2PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs2PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(2), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs2PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	@Test(testName = "testIs3PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return true",
	testCaseDescription = "to test the number 3 is prime or not")
	public void testIs3PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs3PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(3), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs3PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	@Test(testName = "testIs5PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return true",
	testCaseDescription = "to test the number 5 is prime or not")
	public void testIs5PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs5PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(5), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs5PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	@Test(testName = "testIs7PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return true",
	testCaseDescription = "to test the number 7 is prime or not")
	public void testIs7PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs7PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(7), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs7PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	@Test(testName = "testIs11PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return true",
	testCaseDescription = "to test the number 11 is prime or not")
	public void testIs11PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs11PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(11), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs11PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
	
	@Test(testName = "testIs47PrimeNumberUsingisPrimeNumberMethod")
	@TestCase(author = "Manjunath HM",
	expectedResult = "isPrimeNumber() method should return true",
	testCaseDescription = "to test the number 47 is prime or not")
	public void testIs47PrimeNumberUsingisPrimeNumberMethod() {
		Reporter.log("TestPrimeNumber3: Start of testIs47PrimeNumberUsingisPrimeNumberMethod() method", true);
		try {
			Assert.assertEquals(prime.isPrimeNumber(47), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestPrimeNumber3: End of testIs47PrimeNumberUsingisPrimeNumberMethod() method", true);
	}
}
