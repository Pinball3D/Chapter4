package org.example;
import java.util.Scanner;
//Andrew Smiley
//Chapter 4
//Program 26
public class Triangle
{
    public String createTriangle( String let, int size)
    {
        String triangle = ""; //create string var
        for(int r = 0; r<size; r++) {
            for(int c = 0; c<=r; c++) {
                triangle += let;
            }
            triangle += "\n";//new line
        }
        return triangle; //return triangle.
    }
    public static void main( String args[] )
    {
        Triangle test = new Triangle();
        Boolean again = true;
        while(again) {
            Scanner keyboard = new Scanner(System.in);//new scanner object
            System.out.print("Size of triangle: ");
            int size = keyboard.nextInt();
            System.out.print("Letter in triangle: ");
            String letter = keyboard.next();
            System.out.println(test.createTriangle(letter, size));
            System.out.print("Play Again? (Y/N)"); //prompts user to play again.
            String userInput = keyboard.next().toLowerCase();
            again = (userInput.equals("y") || userInput.equals("yes"));
        }
    }
    /*
    OUTPUT
    Size of triangle: 3
    Letter in triangle: A
    A
    AA
    AAA

    Play Again? (Y/N)y
    Size of triangle: 7
    Letter in triangle: X
    X
    XX
    XXX
    XXXX
    XXXXX
    XXXXXX
    XXXXXXX

    Play Again? (Y/N)y
    Size of triangle: 1
    Letter in triangle: R
    R

    Play Again? (Y/N)n
     */
}

