package com.kelaniya.uni.v5.repository;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;


public class FileNumberRepository  implements NumberRepository{
    public Double[] getNumbers() throws IOException{
        //Read the numbers text line
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("C:/Users/DELL/Desktop/Calculator/src/java/com/kelaniya/uni/Numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1,number2};
    }



}
