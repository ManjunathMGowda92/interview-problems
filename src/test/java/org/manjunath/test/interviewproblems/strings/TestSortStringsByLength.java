package org.manjunath.test.interviewproblems.strings;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.strings.SortStringsByLength;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSortStringsByLength {
	private SortStringsByLength sortArr;
	
	@BeforeClass
	public void doInitialization() {
		sortArr = new SortStringsByLength();
	}
	
	@Test(testName = "testSortStringArray1")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "to test getSortedStringArrayByLength() method and to get resulted array in sorted order of String length ",
	expectedResult = "getSortedStringArrayByLength() method should return sorted String array")
	public void testSortStringArray1() {
		Reporter.log("TestSortStringsByLength: Start of testSortStringArray1() method", true);
		try {
			String[] inputArr = {"Manjunath", "Manoj", "Deepa", "Suprabha", "RangaSwamy", "Sunil", "Vinay", "Santhosh", "Raju", "Suhas", "Akshitha"};
			String[] sortedArr = sortArr.getSortedStringArrayByLength(inputArr);
			String[] expectedArr = {"Raju", "Deepa", "Sunil", "Vinay", "Manoj", "Suhas", "Suprabha", "Santhosh", "Akshitha", "Manjunath", "RangaSwamy"};
			
			Assert.assertEquals(sortedArr, expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestSortStringsByLength: End of testSortStringArray1() method", true);
	}
	
	@Test(testName = "testSortStringArray2")
	@TestCase(author = "Manjunath HM",
	testCaseDescription = "to test getSortedStringArrayByLength() method and to get resulted array in sorted order of String length ",
	expectedResult = "getSortedStringArrayByLength() method should return sorted String array")
	public void testSortStringArray2() {
		Reporter.log("TestSortStringsByLength: Start of testSortStringArray2() method", true);
		try {
			String[] inputArr = {"123", "12345", "1", "12345678", "1234", "12", "1234567", "123456"};
			String[] sortedArr = sortArr.getSortedStringArrayByLength(inputArr);
			String[] expectedArr = {"1", "12", "123", "1234", "12345", "123456", "1234567", "12345678"};
			
			Assert.assertEquals(sortedArr, expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestSortStringsByLength: End of testSortStringArray2() method", true);
	}
}
