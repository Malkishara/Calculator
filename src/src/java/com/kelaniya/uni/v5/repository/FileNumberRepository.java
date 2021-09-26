package com.kelaniya.uni.v5.repository;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;


public class FileNumberRepository  implements NumberRepository{
    public Double[] getNumbers() throws NumberRepositoryException{
        //Read the numbers text line
        List<String> numbersStrs = null;
        try {
            numbersStrs = Files.readAllLines(
                    Paths.get("C:\\Users\\DELL\\Desktop\\Calculator\\src\\java\\com\\kelaniya\\uni\\Numbers.txt")
            );
        } catch (IOException e) {
            throw new NumberRepositoryException(e,"Couldn't find the text file");
        }

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1,number2};
    }


    @Override
    public Double[] getNumber() throws NumberRepositoryException {
        return new Double[0];
    }
}
