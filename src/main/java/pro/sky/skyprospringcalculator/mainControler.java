package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

@RequestMapping ("/calculator")

public class mainControler {
    public int num1;
    public int num2;
    private final Calculator calculator;

    public mainControler(Calculator calculator) {
        this.calculator = calculator;
    }
    @GetMapping
    public String hello(){
        return calculator.hello();
    }

    @GetMapping( "/plus")
    public String getSum (@RequestParam () int num1, int num2) {
        return num1 + " + " + num2 + " = " + Calculator.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String getMinus (@RequestParam () int num1, int num2) {
        return num1 + " - " + num2 + " = " + Calculator.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String getMultiply (@RequestParam () int num1, int num2) {
        return num1 + " * " + num2 + " = " + Calculator.multiply(num1, num2);
    }

    @GetMapping("/divide")

    public String getDivide (@RequestParam () int num1, int num2) {
        return num1 + " / " + num2 + " = " + Calculator.divide(num1, num2);
    }
}
