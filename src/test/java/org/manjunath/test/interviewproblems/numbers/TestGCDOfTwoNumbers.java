package org.manjunath.test.interviewproblems.numbers;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.numbers.GCDOfTwoNumbers;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGCDOfTwoNumbers {
	private GCDOfTwoNumbers gcd;
	
	@BeforeClass
	public void doInitialization() {
		gcd = new GCDOfTwoNumbers();
	}
	
	@Test(testName = "testGCDOf10And5")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "To find the GCD of 10 and 5",
	expectedResult = "findGcd() method should return 5")
	public void testGCDOf10And5() {
		Reporter.log("TestGCDOfTwoNumbers: Start of testGCDOf10And5() method", true);
		try {
			Assert.assertEquals(gcd.findGcd(10, 5), 5);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestGCDOfTwoNumbers: End of testGCDOf10And5() method", true);
	}
	
	@Test(testName = "testGCDOf1And5")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "To find the GCD of 1 and 5",
	expectedResult = "findGcd() method should return 1")
	public void testGCDOf1And5() {
		Reporter.log("TestGCDOfTwoNumbers: Start of testGCDOf1And5() method", true);
		try {
			Assert.assertEquals(gcd.findGcd(1, 5), 1);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestGCDOfTwoNumbers: End of testGCDOf1And5() method", true);
	}
	
	
	@Test(testName = "testGCDOf15And3")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "To find the GCD of 15 and 3",
	expectedResult = "findGcd() method should return 3")
	public void testGCDOf15And3() {
		Reporter.log("TestGCDOfTwoNumbers: Start of testGCDOf15And3() method", true);
		try {
			Assert.assertEquals(gcd.findGcd(15, 3), 3);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestGCDOfTwoNumbers: End of testGCDOf15And3() method", true);
	}
	
	
	@Test(testName = "testGCDOf9And7")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "To find the GCD of 9 and 7",
	expectedResult = "findGcd() method should return 1")
	public void testGCDOf9And7() {
		Reporter.log("TestGCDOfTwoNumbers: Start of testGCDOf9And7() method", true);
		try {
			Assert.assertEquals(gcd.findGcd(9, 7), 1);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestGCDOfTwoNumbers: End of testGCDOf9And7() method", true);
	}
	
	
	@Test(testName = "testGCDOf4And26")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "To find the GCD of 4 and 26",
	expectedResult = "findGcd() method should return 2")
	public void testGCDOf4And26() {
		Reporter.log("TestGCDOfTwoNumbers: Start of testGCDOf4And26() method", true);
		try {
			Assert.assertEquals(gcd.findGcd(4, 26), 2);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestGCDOfTwoNumbers: End of testGCDOf4And26() method", true);
	}
	
	
	@Test(testName = "testGCDOf4And28")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "To find the GCD of 4 and 28",
	expectedResult = "findGcd() method should return 4")
	public void testGCDOf4And28() {
		Reporter.log("TestGCDOfTwoNumbers: Start of testGCDOf4And28() method", true);
		try {
			Assert.assertEquals(gcd.findGcd(4, 28), 4);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestGCDOfTwoNumbers: End of testGCDOf4And28() method", true);
	}
	
	
	@Test(testName = "testGCDOf13And0")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "To find the GCD of 13 and 0",
	expectedResult = "findGcd() method should return 13")
	public void testGCDOf13And0() {
		Reporter.log("TestGCDOfTwoNumbers: Start of testGCDOf13And0() method", true);
		try {
			Assert.assertEquals(gcd.findGcd(13, 0), 13);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestGCDOfTwoNumbers: End of testGCDOf13And0() method", true);
	}
	
	
	@Test(testName = "testGCDOf0And13")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "To find the GCD of 0 and 13",
	expectedResult = "findGcd() method should return 13")
	public void testGCDOf0And13() {
		Reporter.log("TestGCDOfTwoNumbers: Start of testGCDOf0And13() method", true);
		try {
			Assert.assertEquals(gcd.findGcd(0, 13), 13);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestGCDOfTwoNumbers: End of testGCDOf0And13() method", true);
	}
	
	
	@Test(testName = "testGCDOf13And13")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "To find the GCD of 13 and 13",
	expectedResult = "findGcd() method should return 13")
	public void testGCDOf13And13() {
		Reporter.log("TestGCDOfTwoNumbers: Start of testGCDOf13And13() method", true);
		try {
			Assert.assertEquals(gcd.findGcd(13, 13), 13);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestGCDOfTwoNumbers: End of testGCDOf13And13() method", true);
	}
}
