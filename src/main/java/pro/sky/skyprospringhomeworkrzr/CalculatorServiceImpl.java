package pro.sky.skyprospringhomeworkrzr;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello(String name){
        return "hello " + name;
    }

    public String welcomeToCalculator(){
        return "Добро пожаловать в калькулятор";
    }

    public Integer plus(int num1, int num2){
        return num1+num2;
    }
    public String minus(int num1, int num2){
        return Integer.toString(num1-num2);
    }
    public String multiplication(int num1, int num2){
        return Integer.toString(num1*num2);
    }
    public String division(int num1, int num2){
        return Integer.toString(num1/num2);
    }
}

