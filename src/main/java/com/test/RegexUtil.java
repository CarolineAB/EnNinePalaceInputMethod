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
	
	
	public static void main(String[] args) {
		boolean numberic = isNumberlow3("99");
		System.out.println(numberic);
	}
}
