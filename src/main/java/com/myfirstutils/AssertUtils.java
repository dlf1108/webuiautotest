package com.myfirstutils;

import junit.framework.Assert;

public class AssertUtils {
	
	//整形、字符串、字符串包含、非空、实型等断言封装
	
	//(String... com)  不定个数的String参数
	//(int... com)  不定个数的int参数
	
	public static void checkINT(int actual , int expected , String... com){
		Assert.assertEquals(actual, expected);
	}
	
	public void checkString(String actual , String expected , String... com){
		Assert.assertEquals(actual, expected);
	}
	
	public static void checkStringContains(String actual , String expected , String... com){
		Assert.assertEquals(true, actual.contains(expected));
	}
	
	public static void checkNotNull(Object actual , String... com){
		Assert.assertNull(actual);
	}

}
