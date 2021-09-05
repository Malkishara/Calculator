package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.operation.Operation;
import com.kelaniya.uni.v4.operation.OperationFactory;

import java.io.IOException;

//LISKOV SUBSTITUTION PRINCIPLE
public class Main {

    //Refactoring the code
    //Main class is the coordinator now...
    public static void main(String[] args) throws IOException { //kinda wrong!

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The result is " + result);

    }
}