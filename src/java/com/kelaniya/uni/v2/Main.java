package com.kelaniya.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//SOLID PRINCIPLES -->> ALL SOLID PRINCIPLES ARE VIOLATED
public class Main {

    public static void main(String[] args) throws IOException {

        //Make sure to validate the arguments before using...
        if(args.length == 0){
            System.out.println("Please provide the operation as an argument");
            return;
        }

        //Another validation that we could do to these args?
        //add, sub, mul
        String operator = args[0];

        if(!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))){
            System.out.println("Please provide add, sub or mul as the operator argument.");
            return;
        }

        //Read the numbers text line
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("C:/Users/DELL/Desktop/Calculator/src/java/com/kelaniya/uni/Numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        double result = 0;

        // Or use SWITCH CASE
        if (operator.equals("add")){
            result = number1 + number2;
        } else if (operator.equals("sub")){
            result = number1 - number2;
        } else if (operator.equals("mul")){
            result = number1 * number2;
        }

        System.out.println("The result is " + result);
    }
}