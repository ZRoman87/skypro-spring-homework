package pro.sky.skyprospringhomeworkrzr;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/hello")
    public String hello(@RequestParam("name") String name){
        return calculatorService.hello(name);
    }

    @GetMapping
    public String welcomeToCalculator(){
        return calculatorService.welcomeToCalculator();
    }

    @GetMapping (path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping (path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.minus(num1, num2);
    }

    @GetMapping (path = "/calculator/multiply")
    public String multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.multiplication(num1, num2);
    }

    @GetMapping (path = "/calculator/divide")
    public String division(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.division(num1, num2);
    }
}
