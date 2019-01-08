package org.manjunath.test.interviewproblems.numbers;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.numbers.ArmstrongNumber;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestArmstrongNumber {
	private ArmstrongNumber armstrongNumber;
	
	@BeforeClass
	public void doInitialization() {
		armstrongNumber = new ArmstrongNumber();
	}
	
	@Test(testName = "testIs153ArmstrongNumber")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To check whether 153 is armstrong number or not", 
	expectedResult = "isArmstrongNumber() should return true")
	public void testIs153ArmstrongNumber() {
		Reporter.log("TestArmstrongNumber: Start of testIs153ArmstrongNumber() method", true);
		try {
			Assert.assertEquals(armstrongNumber.isArmstrongNumber(153), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestArmstrongNumber: End of testIs153ArmstrongNumber() method", true);
	}
	
	@Test(testName = "testIs370ArmstrongNumber")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To check whether 370 is armstrong number or not", 
	expectedResult = "isArmstrongNumber() should return true")
	public void testIs370ArmstrongNumber() {
		Reporter.log("TestArmstrongNumber: Start of testIs370ArmstrongNumber() method", true);
		try {
			Assert.assertEquals(armstrongNumber.isArmstrongNumber(370), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestArmstrongNumber: End of testIs370ArmstrongNumber() method", true);
	}
	
	@Test(testName = "testIs371ArmstrongNumber")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To check whether 371 is armstrong number or not", 
	expectedResult = "isArmstrongNumber() should return true")
	public void testIs371ArmstrongNumber() {
		Reporter.log("TestArmstrongNumber: Start of testIs371ArmstrongNumber() method", true);
		try {
			Assert.assertEquals(armstrongNumber.isArmstrongNumber(371), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestArmstrongNumber: End of testIs371ArmstrongNumber() method", true);
	}
	
	@Test(testName = "testIs407ArmstrongNumber")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To check whether 407 is armstrong number or not", 
	expectedResult = "isArmstrongNumber() should return true")
	public void testIs407ArmstrongNumber() {
		Reporter.log("TestArmstrongNumber: Start of testIs407ArmstrongNumber() method", true);
		try {
			Assert.assertEquals(armstrongNumber.isArmstrongNumber(407), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestArmstrongNumber: End of testIs407ArmstrongNumber() method", true);
	}
	
	@Test(testName = "testIs5ArmstrongNumber")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To check whether 5 is armstrong number or not", 
	expectedResult = "isArmstrongNumber() should return true")
	public void testIs5ArmstrongNumber() {
		Reporter.log("TestArmstrongNumber: Start of testIs5ArmstrongNumber() method", true);
		try {
			Assert.assertEquals(armstrongNumber.isArmstrongNumber(5), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestArmstrongNumber: End of testIs5ArmstrongNumber() method", true);
	}
	
	@Test(testName = "testIs25ArmstrongNumber")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To check whether 25 is armstrong number or not", 
	expectedResult = "isArmstrongNumber() should return false")
	public void testIs25ArmstrongNumber() {
		Reporter.log("TestArmstrongNumber: Start of testIs25ArmstrongNumber() method", true);
		try {
			Assert.assertEquals(armstrongNumber.isArmstrongNumber(25), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestArmstrongNumber: End of testIs25ArmstrongNumber() method", true);
	}
	
	@Test(testName = "testIs100ArmstrongNumber")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To check whether 100 is armstrong number or not", 
	expectedResult = "isArmstrongNumber() should return false")
	public void testIs100ArmstrongNumber() {
		Reporter.log("TestArmstrongNumber: Start of testIs100ArmstrongNumber() method", true);
		try {
			Assert.assertEquals(armstrongNumber.isArmstrongNumber(100), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestArmstrongNumber: End of testIs100ArmstrongNumber() method", true);
	}
	
	@Test(testName = "testIs100ArmstrongNumber", expectedExceptions = {NumberFormatException.class})
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To check whether 1abcd is armstrong number or not", 
	expectedResult = "isArmstrongNumber() should throw NumberFormatException")
	public void testIs1abcdArmstrongNumber() {
		Reporter.log("TestArmstrongNumber: Start of testIs1abcdArmstrongNumber() method", true);
		
		Assert.assertEquals(armstrongNumber.isArmstrongNumber(Integer.parseInt("1abcd")), false);
		
		Reporter.log("TestArmstrongNumber: End of testIs1abcdArmstrongNumber() method", true);
	}
}
