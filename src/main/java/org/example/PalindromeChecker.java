package org.example;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Entfernen von Leerzeichen und Umwandeln in Kleinbuchstaben
        input = input.replaceAll("\\s", "").toLowerCase();
        
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String palindrome = "Anna";
        boolean isPal = isPalindrome(palindrome);
        
        System.out.println("Ist '" + palindrome + "' ein Palindrom? " + isPal);
    }
}
