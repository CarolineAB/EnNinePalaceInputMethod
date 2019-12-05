package com.test;

import java.util.regex.Pattern;

public class RegexUtil {
	public static boolean isNumberic(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
	
	/// ^[0-9][1-9]|[1-9]0$
	
	
	public static boolean isNumberlow3(String str) {
        Pattern pattern = Pattern.compile("[0-9]{1,2}?");
        return pattern.matcher(str).matches();
    }
	public static byte[] intToBytes(int a, int length) {
	    byte[] bs = new byte[length];
	    for (int i = bs.length - 1; i >= 0; i--) {
	        bs[i] = (byte) (a % 255);
	        a = a / 255;
	    }
	    return bs;
	}
	
	public static void main(String[] args) {
		byte[] intToBytes = intToBytes(99,2);
		System.out.println(intToBytes);
	}
}
