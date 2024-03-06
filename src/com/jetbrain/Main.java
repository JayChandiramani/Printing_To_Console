package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num1,num2,product; //Initializing
	Scanner Input_Number=new Scanner(System.in); //Naming the scanner

    // Entering Number 1
    System.out.println("Please enter the first number.");
    num1=Input_Number.nextInt();
    System.out.println();

    //Entering Number 2
    System.out.println("Please enter the second number.");
    num2=Input_Number.nextInt();
    System.out.println();

    //Finding and printing the product
    System.out.println("Product = "+num1+" x "+num2);
    product=num1*num2;
    System.out.println("The product is "+product+".");
    }
}
