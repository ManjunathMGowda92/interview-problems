package org.manjunath.test.interviewproblems.strings;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.strings.OccurenceOfCharsInString;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOccurenceOfCharsInString {
	private OccurenceOfCharsInString occurence;
	
	@BeforeClass
	public void doInitialization() {
		occurence = new OccurenceOfCharsInString();
	}
	
	@Test(testName = "testOccurenceOfCharcInStringCharacter")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "to check the charcter c is present in string character or not",
	expectedResult = "getOccurenceOfCharInString() method should return the number of occurence of given character")
	public void testOccurenceOfCharcInStringCharacter() {
		Reporter.log("TestOccurenceOfCharsInString: Start of testOccurenceOfCharcInStringCharacter() method", true);
		try {
			Assert.assertEquals(occurence.getOccurenceOfCharInString("character", 'r'), 2);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestOccurenceOfCharsInString: End of testOccurenceOfCharcInStringCharacter() method", true);
	}
	
	@Test(testName = "testOccurenceOfChareInStringDifference")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "to check the charcter c is present in string character or not",
	expectedResult = "getOccurenceOfCharInString() method should return the number of occurence of given character")
	public void testOccurenceOfChareInStringDifference() {
		Reporter.log("TestOccurenceOfCharsInString: Start of testOccurenceOfChareInStringDifference() method", true);
		try {
			Assert.assertEquals(occurence.getOccurenceOfCharInString("difference", 'e'), 3);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestOccurenceOfCharsInString: End of testOccurenceOfChareInStringDifference() method", true);
	}
}
