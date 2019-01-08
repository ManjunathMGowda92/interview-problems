package org.manjunath.test.interviewproblems.strings;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.strings.StringAnagramByMergeSort;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStringAnagramByMergeSort {
	private StringAnagramByMergeSort anagram;
	
	@BeforeClass
	public void doInitialization() {
		anagram = new StringAnagramByMergeSort();
	}
	
	@Test(testName = "isSilentAndListenAreAnagrams")
	@TestCase(author = "Manjunath HM", 
	expectedResult = "the method isAnagram() should return true",
	testCaseDescription = "To test the strings silent and listen are anagrams or not")
	public void isSilentAndListenAreAnagrams() {
		Reporter.log("TestStringAnagramByMergeSort: Start of isSilentAndListenAreAnagrams() method", true);
		
		try {
			Assert.assertEquals(anagram.isAnagram("silent", "listen"), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagramByMergeSort: End of isSilentAndListenAreAnagrams() method", true);
	}
	
	
	@Test(testName = "isRestfulAndFlusterAreAnagrams")
	@TestCase(author = "Manjunath HM", 
	expectedResult = "the method isAnagram() should return true",
	testCaseDescription = "To test the strings silent and listen are anagrams or not")
	public void isRestfulAndFlusterAreAnagrams() {
		Reporter.log("TestStringAnagramByMergeSort: Start of isRestfulAndFlusterAreAnagrams() method", true);
		
		try {
			Assert.assertEquals(anagram.isAnagram("restful", "fluster"), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagramByMergeSort: End of isRestfulAndFlusterAreAnagrams() method", true);
	}
	
	
	@Test(testName = "isRestfulAndExampleAreAnagrams")
	@TestCase(author = "Manjunath HM", 
	expectedResult = "the method isAnagram() should return false",
	testCaseDescription = "To test the strings silent and listen are anagrams or not")
	public void isRestfulAndExampleAreAnagrams() {
		Reporter.log("TestStringAnagramByMergeSort: Start of isRestfulAndExampleAreAnagrams() method", true);
		
		try {
			Assert.assertEquals(anagram.isAnagram("restful", "example"), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagramByMergeSort: End of isRestfulAndExampleAreAnagrams() method", true);
	}
}
