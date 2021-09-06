/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise03.solution03;

/*Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.*/

import java.util.Scanner;

public class Application {
    /*
    create a program that prompts for two input
    read in the two inputs provided
    store the input
    then use the inputs to create a statement
     */
    public static void main(String[] args) {
        System.out.println("What is the quote? ");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String Name;

        System.out.println("Who said it? ");

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        String Name2;


        Name = myObj.nextLine();
        Name2 = myObj.nextLine();
        System.out.println("" + Name2 + ",says \""
                + Name + "\"");
    }
}
