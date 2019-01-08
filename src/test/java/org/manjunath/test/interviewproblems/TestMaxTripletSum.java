package org.manjunath.test.interviewproblems;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.numbers.MaxTripletSum;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMaxTripletSum {
	private MaxTripletSum tripletSum;
	
	@BeforeClass
	public void doInitialization() {
		tripletSum = new MaxTripletSum();
	}
	
	@Test(testName = "getMaxTripletSum1")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To get maximum sum for triplets in given array",
	expectedResult = "getMaxTripletSumFromArray() should return 70")
	public void getMaxTripletSum1() {
		Reporter.log("TestMaxTripletSum: Start of getMaxTripletSum1() method", true);
		try {
			int[] arr = {5, 9, 11, 8, 3, 6, 19, 23, 25, 17, 22, 21};
			Assert.assertEquals(tripletSum.getMaxTripletSumFromArray(arr), 70);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestMaxTripletSum: End of getMaxTripletSum1() method", true);
	}
	
	@Test(testName = "getMaxTripletSum2")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To get maximum sum for triplets in given array",
	expectedResult = "getMaxTripletSumFromArray() should return 70")
	public void getMaxTripletSum2() {
		Reporter.log("TestMaxTripletSum: Start of getMaxTripletSum2() method", true);
		try {
			int[] arr = {5, 9, 11, 19, 25, 17, 22};
			Assert.assertEquals(tripletSum.getMaxTripletSumFromArray(arr), 66);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestMaxTripletSum: End of getMaxTripletSum2() method", true);
	}
	
	
}
