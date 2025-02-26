package com.example.calculator;

public class Main {

    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        String expression = "3234+843/3234-4232123/(34+123+32+5)*3234";
        controller.processExpression(expression);
    }
}
