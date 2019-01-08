package org.manjunath.test.interviewproblems.strings;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.strings.ReverseOfSentence;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestReverseOfSentence {
	private ReverseOfSentence reverse;
	
	@BeforeClass
	public void doInitialization() {
		reverse = new ReverseOfSentence();
	}
	
	@Test(testName = "testReverseOfSentence1")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "to test the reverseSentence() method returns reversed sentence for the input sentence or not",
	expectedResult = "reverseSentence() method should return the reversed sentence")
	public void testReverseOfSentence1() {
		Reporter.log("TestReverseOfSentence: Strat of testReverseOfSentence1() method", true);
		
		try {
			String input = "This is to test the reverseSentence method";
			String actual = "method reverseSentence the test to is This";
			Assert.assertEquals(actual, reverse.reverseSentence(input));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestReverseOfSentence: End of testReverseOfSentence1() method", true);
	}
	
	
	@Test(testName = "testReverseOfSentence2")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "to test the reverseSentence() method returns reversed sentence for the input sentence or not",
	expectedResult = "reverseSentence() method should return the reversed sentence")
	public void testReverseOfSentence2() {
		Reporter.log("TestReverseOfSentence: Strat of testReverseOfSentence2() method", true);
		
		try {
			Assert.assertEquals(null, reverse.reverseSentence(null));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestReverseOfSentence: End of testReverseOfSentence2() method", true);
	}
	
	
	@Test(testName = "testReverseOfSentence3")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "to test the reverseSentence() method returns reversed sentence for the input sentence or not",
	expectedResult = "reverseSentence() method should return the reversed sentence")
	public void testReverseOfSentence3() {
		Reporter.log("TestReverseOfSentence: Strat of testReverseOfSentence3() method", true);
		
		try {
			String input = "testReverseOfSentence3";
			String actual = "testReverseOfSentence3";
			Assert.assertEquals(actual, reverse.reverseSentence(input));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestReverseOfSentence: End of testReverseOfSentence3() method", true);
	}
}
