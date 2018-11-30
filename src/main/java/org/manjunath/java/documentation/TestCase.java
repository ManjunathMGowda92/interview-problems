package org.manjunath.java.documentation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @ interface TestCase {
	
	String author() default "Manjunath HM";
	String testCaseDescription() default "";
	String expectedResult() default "";
}
