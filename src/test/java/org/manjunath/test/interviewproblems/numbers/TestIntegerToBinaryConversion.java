package org.manjunath.test.interviewproblems.numbers;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.interviewproblems.numbers.IntegerToBinaryConversion;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIntegerToBinaryConversion {
	private IntegerToBinaryConversion conversion;
	
	@BeforeClass
	public void doInitialization() {
		conversion = new IntegerToBinaryConversion();
	}
	
	@Test(testName = "testBinaryAndCountOf1sInNum16")
	@TestCase(author = "Manjunath HM", 
			testCaseDescription = "to check the convertIntegerToBinary() method returns perfect required binary or not and then to count number of 1s in Binary",
			expectedResult = "convertIntegerToBinary() should return perfect binary value and countNumOfSpecifiedCharsInBinary() should return numebr of 1s in binary")
	public void testBinaryAndCountOf1sInNum16() {
		Reporter.log("TestIntegerToBinaryConversion: Start of testBinaryAndCountOf1sInNum16() method", true);
		try {
			String actualBinary = conversion.convertIntegerToBinary(16);
			Assert.assertEquals(actualBinary, "10000");
			
			int actualCount = conversion.countNumOfSpecifiedCharsInBinary(actualBinary, '1');
			Assert.assertEquals(actualCount, 1);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestIntegerToBinaryConversion: End of testBinaryAndCountOf1sInNum16() method", true);
	}
	
	@Test(testName = "testBinaryAndCountOf0sInNum16")
	@TestCase(author = "Manjunath HM", 
			testCaseDescription = "to check the convertIntegerToBinary() method returns perfect required binary or not and then to count number of 0s in Binary",
			expectedResult = "convertIntegerToBinary() should return perfect binary value and countNumOfSpecifiedCharsInBinary() should return numebr of 0s in binary")
	public void testBinaryAndCountOf0sInNum16() {
		Reporter.log("TestIntegerToBinaryConversion: Start of testBinaryAndCountOf0sInNum16() method", true);
		try {
			String actualBinary = conversion.convertIntegerToBinary(16);
			Assert.assertEquals(actualBinary, "10000");
			
			int actualCount = conversion.countNumOfSpecifiedCharsInBinary(actualBinary, '0');
			Assert.assertEquals(actualCount, 4);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestIntegerToBinaryConversion: End of testBinaryAndCountOf0sInNum16() method", true);
	}
}
