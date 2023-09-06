package org.example;

public class PrimeNumberGenerator {
    public static void generatePrimes(int n) {
        if (n <= 0) {
            System.out.println("Bitte geben Sie eine positive ganze Zahl n ein.");
            return;
        }

        int count = 0;
        int number = 2;

        System.out.println("Die ersten " + n + " Primzahlen sind:");

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 10; // Anzahl der gewünschten Primzahlen
        generatePrimes(n);
    }
}
