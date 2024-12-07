package org.example;
//Andrew Smiley
//Chapter 4
//Program 22
public class Divisors {
    public static String getDivisors( int number ){
        String string = "";
        for(int i = 1; i < number; i++) { //goes through all numbers from 0 to number exclusive
            if (number % i == 0) { //checks if divisible with no remainder
                string += " "+i; //adds the number to the string with a space
            }
        }
        // this skeleton is very bare, you do not need to get too creative.
        return ""+number+" has divisors"+string; //returns readable string
    }
    public static void main( String args[] ) {
        System.out.println(getDivisors(10)); //prints result for number 10
        System.out.println(getDivisors(45));
        System.out.println(getDivisors(14));
        System.out.println(getDivisors(1024));
        System.out.println(getDivisors(1245));
        System.out.println(getDivisors(33));
        System.out.println(getDivisors(65535));
    }
    /*
    OUTPUT
    10 has divisors 1 2 5
    45 has divisors 1 3 5 9 15
    14 has divisors 1 2 7
    1024 has divisors 1 2 4 8 16 32 64 128 256 512
    1245 has divisors 1 3 5 15 83 249 415
    33 has divisors 1 3 11
    65535 has divisors 1 3 5 15 17 51 85 255 257 771 1285 3855 4369 13107 21845
     */
}
