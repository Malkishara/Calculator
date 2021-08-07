package com.kelaniya.uni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static int a;
    public static int b;
    public static int i=0;
    public static void main(String[] args) {
        try {
            File f1 = new File("C:/Users/DELL/Desktop/Calculator/src/java/com/kelaniya/uni/Numbers.txt");
            Scanner scn = new Scanner(f1);

            while (scn.hasNextInt()) {
                i++;

                switch (i) {
                    case 1:
                        a = scn.nextInt();
                        break;
                    case 2:
                        b = scn.nextInt();
                        break;
                    default:
                        System.out.println("There are more than 2 numbers");
                        break;
                }

            }

            operations obj = new operations();
            obj.operation(a, b);




        }catch(FileNotFoundException e){
            System.out.println("The file did not find.");
        }
    }

}
