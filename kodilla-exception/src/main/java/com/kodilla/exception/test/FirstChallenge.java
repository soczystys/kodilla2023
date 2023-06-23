package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public int pow(int a, int b) {
//        a ^ b
        if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
////        double result;
        try {
            int result = firstChallenge.pow(3, 0);
//            Double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }

//        System.out.println(result);
    }
}
