package exercise03;

/*
 *  UCF COP3330 Fall 2021 Exercise 3 Solution
 *  Copyright 2021 Joshua Romero
 */

import java.util.Scanner;

public class solution03
{
    public static void main(String[] args)
    {

        System.out.println("What is the quote? ");

        Scanner input = new Scanner(System.in);
        String quote = input.next();

        System.out.println("Who said it? ");

        Scanner inputTwo = new Scanner(System.in);
        String person = inputTwo.next();

        System.out.println(person + " says, " + quote);

    }
}
