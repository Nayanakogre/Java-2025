package com.xworkz.test;

public class Palindrome {
    public static void main(String[] args) {
        String name = "abcba";
        int left = 0;
        int right = name.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (name.charAt(left) != name.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Given String is a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}
