package org.example;

import java.util.Scanner;
//Andrew Smiley
//Chapter 4
//Program 27
public class BackwardTriangle{
    private int size;
    private String letter;

    public void setTriangle(int count, String let){
        size = count;
        letter = let;
    }

    public String buildTriangle() {
        String triangle = ""; //create string var
        for(int r = 0; r<size; r++) {
            for(int s = 0; s<size-r-1; s++) {
                triangle+=" ";
            }
            for(int c = 0; c<=r; c++) {
                triangle += letter;
            }
            triangle += "\n";//new line
        }
        return triangle; //return triangle.
    }

    public static void main( String args[] )
    {
        BackwardTriangle test = new BackwardTriangle();
        Boolean again = true;
        while(again) {
            Scanner keyboard = new Scanner(System.in);//new scanner object
            System.out.print("Size of triangle: ");
            int size = keyboard.nextInt();
            System.out.print("Letter in triangle: ");
            String letter = keyboard.next();
            test.setTriangle(size, letter);
            System.out.println(test.buildTriangle());
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

    Play Again? (Y/N)y
    Size of triangle: 5
    Letter in triangle: T
        T
       TT
      TTT
     TTTT
    TTTTT

    Play Again? (Y/N)y
    Size of triangle: 4
    Letter in triangle: W
       W
      WW
     WWW
    WWWW

    Play Again? (Y/N)n
     */

}
