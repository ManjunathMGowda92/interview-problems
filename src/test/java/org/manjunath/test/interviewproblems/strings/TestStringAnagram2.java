package org.manjunath.test.interviewproblems.strings;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.strings.StringAnagram2;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStringAnagram2 {
	private StringAnagram2 anagram;
	
	@BeforeClass
	public void doInitialization() {
		anagram = new StringAnagram2();		
	}
	
	@Test(testName = "testIsListenAndSilentAnagrams")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To chcek listen and silent are Anagrams or not",
	expectedResult = "isAnagram() method should return true")
	public void testIsListenAndSilentAnagrams() {
		Reporter.log("TestStringAnagram2: Start of testIsListenAndSilentAnagrams() method", true);
		try {
			Assert.assertEquals(anagram.isAnagram("listen", "silent"), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagram2: End of testIsListenAndSilentAnagrams() method", true);
	}
	
	
	@Test(testName = "testIsRestfulAndFlusterAnagrams")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To chcek restful and fluster are Anagrams or not",
	expectedResult = "isAnagram() method should return true")
	public void testIsRestfulAndFlusterAnagrams() {
		Reporter.log("TestStringAnagram2: Start of testIsRestfulAndFlusterAnagrams() method", true);
		try {
			Assert.assertEquals(anagram.isAnagram("restful", "fluster"), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagram2: End of testIsRestfulAndFlusterAnagrams() method", true);
	}
	
	
	@Test(testName = "testIsMaryAndArmyAnagrams")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To chcek mary and army are Anagrams or not",
	expectedResult = "isAnagram() method should return true")
	public void testIsMaryAndArmyAnagrams() {
		Reporter.log("TestStringAnagram2: Start of testIsMaryAndArmyAnagrams() method", true);
		try {
			Assert.assertEquals(anagram.isAnagram("mary", "army"), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagram2: End of testIsMaryAndArmyAnagrams() method", true);
	}
	
	
	@Test(testName = "testIsStopAndTopsAnagrams")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To chcek stop and tops are Anagrams or not",
	expectedResult = "isAnagram() method should return true")
	public void testIsStopAndTopsAnagrams() {
		Reporter.log("TestStringAnagram2: Start of testIsStopAndTopsAnagrams() method", true);
		try {
			Assert.assertEquals(anagram.isAnagram("stop", "tops"), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagram2: End of testIsStopAndTopsAnagrams() method", true);
	}
	
	
	@Test(testName = "testIsFillAndFilAnagrams")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To chcek fill and fil are Anagrams or not",
	expectedResult = "isAnagram() method should return false")
	public void testIsFillAndFilAnagrams() {
		Reporter.log("TestStringAnagram2: Start of testIsFillAndFilAnagrams() method", true);
		try {
			Assert.assertEquals(anagram.isAnagram("fill", "fil"), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagram2: End of testIsFillAndFilAnagrams() method", true);
	}
	
	
	@Test(testName = "testIsCallAndLackAnagrams")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To chcek Call and lack are Anagrams or not",
	expectedResult = "isAnagram() method should return false")
	public void testIsCallAndLackAnagrams() {
		Reporter.log("TestStringAnagram2: Start of testIsCallAndLackAnagrams() method", true);
		try {
			Assert.assertEquals(anagram.isAnagram("Call", "lack"), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagram2: End of testIsCallAndLackAnagrams() method", true);
	}
	
	
	@Test(testName = "testIsLoveAndEvolveAnagrams")
	@TestCase(author = "Manjunath HM", 
	testCaseDescription = "To chcek love and evolve are Anagrams or not",
	expectedResult = "isAnagram() method should return false")
	public void testIsLoveAndEvolveAnagrams() {
		Reporter.log("TestStringAnagram2: Start of testIsLoveAndEvolveAnagrams() method", true);
		try {
			Assert.assertEquals(anagram.isAnagram("love", "evolve"), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestStringAnagram2: End of testIsLoveAndEvolveAnagrams() method", true);
	}
}
