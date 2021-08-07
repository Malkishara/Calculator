package com.kelaniya.uni;

import java.util.Scanner;

public class operations {
 public static int value;
 public static int a;
 public static int b;

public static int operation(int a,int b){

    System.out.println("1.For addition\n2.For substraction\n3.For multiple\n");
    System.out.println("Enter your choice:");
    Scanner s1=new Scanner(System.in);
    int op=s1.nextInt();

        switch (op) {
            case 1:
                value = a + b;
                System.out.println("Addition: "+value);
                break;

            case 2:
                value = a - b;
                System.out.println("Substraction: "+value);
                break;

            case 3:
                value = a * b;
                System.out.println("Multiple: "+value);
                break;



            default:
                System.out.println("Wrong choice..");
                break;
        }


    return value;
}

}
