/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        System.out.print("What is the first number? ");
        int num1= input.nextInt();
        System.out.print("What is the second number? ");
        int num2= input.nextInt();

        int add= num1+num2;
        int sub= num1-num2;
        int mul= num1*num2;
        int div= num1/num2;

        System.out.printf("%s + %s = %s%n%s - %s = %s%n%s * %s = %s%n%s / %s = %s%n",num1,num2,add,num1,num2,sub,num1,num2,mul,num1,num2,div);


    }
}
