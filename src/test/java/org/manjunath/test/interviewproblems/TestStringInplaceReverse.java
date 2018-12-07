package org.manjunath.test.interviewproblems;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.StringAnagram3;
import org.manjunath.java.interviewproblems.StringInplaceReverse;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStringInplaceReverse {
private StringInplaceReverse reverse;
	
	@BeforeClass
	public void doInitialization() {
		reverse = new StringInplaceReverse();
	}
	
	@Test(testName = "testReverseOfStringdeepa")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To produce reverse of string deepa",
	expectedResult = "isAnagram() method should return apeed")
	public void testReverseOfStringdeepa() {
		Reporter.log("TestStringAnagram3: Start of testReverseOfStringdeepa() method", true);
		try {
			Assert.assertEquals(reverse.reverseString("deepa"), "apeed");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagram3: End of testReverseOfStringdeepa() method", true);
	}
	
	
	@Test(testName = "testReverseOfStringtriplet")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To produce reverse of string triplet",
	expectedResult = "isAnagram() method should return telpirt")
	public void testReverseOfStringtriplet() {
		Reporter.log("TestStringAnagram3: Start of testReverseOfStringtriplet() method", true);
		try {
			Assert.assertEquals(reverse.reverseString("triplet"), "telpirt");
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagram3: End of testReverseOfStringtriplet() method", true);
	}
}
