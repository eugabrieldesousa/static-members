package application;

import entities.MathUtils;

public class Main {
    public static void main(String[] args) {
        // Testando o método powUtil
        System.out.println("2^3 = " + MathUtils.powUtil(2, 3)); // 8.0
        System.out.println("3^4 = " + MathUtils.powUtil(3, 4)); // 81.0
        System.out.println("5^-2 = " + MathUtils.powUtil(5, -2)); // 0.04
        System.out.println("7^0 = " + MathUtils.powUtil(7, 0)); // 1.0

        // Testando a constante EULER_NUMBER
        System.out.println("Euler Number: " + MathUtils.EULER_NUMBER); // 2.71828
    }
}