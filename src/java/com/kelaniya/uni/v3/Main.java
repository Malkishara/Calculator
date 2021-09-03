package com.kelaniya.uni.v3;

import com.kelaniya.uni.v3.operation.AddOperation;
import com.kelaniya.uni.v3.operation.MulOperation;
import com.kelaniya.uni.v3.operation.SubOperation;

import java.io.IOException;

public class Main {

    //Refactoring the code
    //Main class is the coordinator now...
    public static void main(String[] args) throws IOException { //kinda wrong!

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();
        Double number1 = numbers[0];
        Double number2 = numbers[1];

        double result = 0;

        //or use a if else statement
        switch (operator) {
            case "add":
                AddOperation addOperation = new AddOperation();
                result = addOperation.excute(numbers);
                break;
            case "sub":
                SubOperation subOperation = new SubOperation();
                result = subOperation.excute(numbers);
                break;
            case "mul":
                MulOperation mulOperation = new MulOperation();
                result = mulOperation.excute(numbers);
                break;
        }

        System.out.println("The result is " + result);

    }
}