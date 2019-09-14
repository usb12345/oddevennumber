package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter integer check if even and odd");
        int integer = new Scanner(System.in).nextInt();
        if(isEven(integer) == true){
            System.out.println("Number " +integer+ " is even" );
        }
        else {
            System.out.println("Number "+integer+" is odd");
        }
    }

    public static boolean isEven(int integer){
        if(integer % 2 == 0){
            return  true;
        }
        else {
            return  false;
        }
    }
    }

