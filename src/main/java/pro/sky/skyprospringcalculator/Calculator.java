package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service

public class Calculator {

    public static String hello() {
        return "Добро пожоловать в калькулятор";
    }

    public static int plus(int num1, int num2) {
        return num1 + num2;
    }
    public static int minus(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
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
