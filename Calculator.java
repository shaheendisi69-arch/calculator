package com.ttbb.myfirsttry;
public class Calculator {

    public double executeOperation(Operation op, double a, double b) {
        return op.calculate(a, b);    
    } 
}
