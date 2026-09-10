package com.ttbb.myfirsttry;
import java.util.*;
public class MyFirstTry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("=============== CALCULATOR ===============");
     
            System.out.print("<Enter The First Number>");
            double a = input.nextDouble();

            System.out.print("<Enter The Operation(* , - , / , +)>");
            String op = input.next();

            System.out.print("<Enter The Second Number>");
            double b = input.nextDouble();
            
            Calculator myCalc = new Calculator();
            Operation chosenOp = null;
            
            switch(op){
                case "+":
                  chosenOp = new Addition();  
                    break;
                case "-":
                    chosenOp = new Subtraction();
                      break;  
                case "*":
                    chosenOp = new Multiplication();
                      break;
                case "/":
                    chosenOp = new Division();
                      break;
                default:
                    System.out.println("Invalid Operator!");
                    return;
            }
            
            double finalAns = myCalc.executeOperation(chosenOp, a, b);
            System.out.println("=============== RESULT[" + finalAns + "] ===============");
            input.close();
    }
}
