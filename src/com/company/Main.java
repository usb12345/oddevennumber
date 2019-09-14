package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter value check if even and odd");
        int value = new Scanner(System.in).nextInt();
        if(isEven(value) == true){
            System.out.println("Number " +value+ " is even" );
        }
        else {
            System.out.println("Number "+value+" is odd");
        }
    }

    public static boolean isEven(int value){
        if(integer % 2 == 0){
            return  true;
        }
        else {
            return  false;
        }
    }
    }

