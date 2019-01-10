package org.manjunath.test.interviewproblems.strings;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.strings.StringAnagramUsingQuickSort;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStringAnagramUsingQuickSort {
	private StringAnagramUsingQuickSort anagrams;
	
	@BeforeClass
	public void doInitialization() {
		anagrams = new StringAnagramUsingQuickSort();
	}
	
	@Test(testName = "isSilentAndListenAreAnagrams")
	@TestCase(author = "Manjunath HM", 
	expectedResult = "the method isAnagrams() should return true",
	testCaseDescription = "To test the strings silent and listen are anagrams or not")
	public void isSilentAndListenAreAnagrams() {
		Reporter.log("TestStringAnagramUsingQuickSort: Start of isSilentAndListenAreAnagrams() method", true);
		
		try {
			Assert.assertEquals(anagrams.isAnagrams("silent", "listen"), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagramUsingQuickSort: End of isSilentAndListenAreAnagrams() method", true);
	}
	
	
	@Test(testName = "isRestfulAndFlusterAreAnagrams")
	@TestCase(author = "Manjunath HM", 
	expectedResult = "the method isAnagrams() should return true",
	testCaseDescription = "To test the strings silent and listen are anagrams or not")
	public void isRestfulAndFlusterAreAnagrams() {
		Reporter.log("TestStringAnagramUsingQuickSort: Start of isRestfulAndFlusterAreAnagrams() method", true);
		
		try {
			Assert.assertEquals(anagrams.isAnagrams("restful", "fluster"), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagramUsingQuickSort: End of isRestfulAndFlusterAreAnagrams() method", true);
	}
	
	
	@Test(testName = "isRestfulAndExampleAreAnagrams")
	@TestCase(author = "Manjunath HM", 
	expectedResult = "the method isAnagrams() should return false",
	testCaseDescription = "To test the strings silent and listen are anagrams or not")
	public void isRestfulAndExampleAreAnagrams() {
		Reporter.log("TestStringAnagramUsingQuickSort: Start of isRestfulAndExampleAreAnagrams() method", true);
		
		try {
			Assert.assertEquals(anagrams.isAnagrams("restful", "example"), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagramUsingQuickSort: End of isRestfulAndExampleAreAnagrams() method", true);
	}
}
