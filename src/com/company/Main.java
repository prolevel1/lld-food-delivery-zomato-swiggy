package com.company;

import com.company.solid_prin.*;

import java.security.InvalidParameterException;

public class Main {

    public static void test(Calculation op) {
        if (op == null) {
            throw new InvalidParameterException("Not found");
        }
        op.calculate();
    }
    public static void main(String[] args) {
	// write your code here
        OrderCalculator o  = new OrderCalculator(20, 1, 1, 1);
        o.calculateOrder();
        Calculation calculation = new Calculation() {
            @Override
            public void calculate() {
                Addition addition = new Addition(1, 2);
                addition.calculate();
            }
        };
        test(calculation);
        WithEngine withEngine = new Car();
        withEngine.startEngine();


    }
}
