package com.ttbb.myfirsttry;
public class Division implements Operation {

    @Override
    public double calculate(double a, double b) {
        if(b == 0){
            System.out.println("=============== Syantax Error! ===============");
                return 0;
        }
        
        return a / b;
    }
    
}
