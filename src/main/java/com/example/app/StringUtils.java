package com.example.app;

public class StringUtils {

    public static String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        return s.equals(reverse(s));
    }
}
