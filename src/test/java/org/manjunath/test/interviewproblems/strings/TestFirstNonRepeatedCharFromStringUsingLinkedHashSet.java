package org.manjunath.test.interviewproblems.strings;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.strings.FirstNonRepeatedCharFromStringUsingLinkedHashSet;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFirstNonRepeatedCharFromStringUsingLinkedHashSet {
	private FirstNonRepeatedCharFromStringUsingLinkedHashSet getFirst;
	
	@BeforeClass
	public void doInitialization() {
		getFirst = new FirstNonRepeatedCharFromStringUsingLinkedHashSet();
	}
	
	
	@Test(testName = "getFirstCharFromString1")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "to check getFirstNonRepeatedChar() method returns proper character or not",
	expectedResult = "getFirstNonRepeatedChar() method should return character e")
	public void getFirstCharFromString1() {
		Reporter.log("TestFirstNonRepeatedCharFromStringUsingLinkedHashSet: Strat of getFirstCharFromString1() method", true);
		
		try {
			Assert.assertEquals(getFirst.getFirstNonRepeatedChar("assertion"), 'a');
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestFirstNonRepeatedCharFromStringUsingLinkedHashSet: Strat of getFirstCharFromString1() method", true);
	}
	
	
	@Test(testName = "getFirstCharFromString2", expectedExceptions = {RuntimeException.class, Exception.class})
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "to check getFirstNonRepeatedChar() method returns proper character or not",
	expectedResult = "getFirstNonRepeatedChar() method should throw the RuntimeException")
	public void getFirstCharFromString2() {
		Reporter.log("TestFirstNonRepeatedCharFromStringUsingLinkedHashSet: Strat of getFirstCharFromString2() method", true);
		
		Assert.assertEquals(getFirst.getFirstNonRepeatedChar("aass"), 'a');
		
		Reporter.log("TestFirstNonRepeatedCharFromStringUsingLinkedHashSet: Strat of getFirstCharFromString2() method", true);
	}
}
