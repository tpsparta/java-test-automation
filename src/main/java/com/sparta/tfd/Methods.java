package com.sparta.tfd;

public class Methods {

    // implement this method so that it returns true if x is greater than or equal to y
    public static boolean greaterEqual(int x, int y) {
        if (x >= y) {
            return true;
        }
        return false;
    }

    // implement this method so that it returns true if x is greater than or equal to y
    public static boolean greaterEqual(double x, double y) {
        if (x >= y) {
            return true;
        }
        return false;
    }


    // implement this method so that it take an int as an input,
    // squares it, adds 101, divides the result by 7, then subtracts 4.
    // return a double.
    public static double BODMAS(int inputNumber) {

        double in = (double)inputNumber;

        return (((in * in) + 101) / 7) - 4;
    }


    // implement this method so that it returns true if input is "password"
    // regardless of case
    public static boolean checkInput(String input) {

        String comp = "password";

        if (input.toLowerCase().equals(comp)) {
            return true;
        }
        return false;
    }

    // implement this method so that it returns the sum of all the numbers from start to end
    public static int sumNums(int start, int end ) {
        int i;
        int sum = 0;
        for (i = start ; i <= end; i++) {
            sum += i;
        }
        return sum;
 
    }

    // implement this method so that it returns the sum
    // of all the numbers in the array nums
    public static int sumArray(int[] nums) {

        int total = 0;
        for (int n : nums) {
            total += n;
        }

        return total;
    }
}
