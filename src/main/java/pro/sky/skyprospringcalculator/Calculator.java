package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service

public class Calculator {

    public static String hello() {
        return "Добро пожоловать в калькулятор";
    }

    public static int plus(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public static int minus(int num1, int num2) {
        int min = num1 - num2;
        return min;
    }

    public static int multiply(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }

    public static int divide(int num1, int num2) {
        int dev = 0;
        if (num2 != 0) {
            dev = num1 / num2;
            } else {
            System.out.println("Второе число не должно равняться 0");
            }
        return dev;
    }
}
