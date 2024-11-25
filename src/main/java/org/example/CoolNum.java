package org.example;
//Andrew Smiley
//Chapter 4
//Program 17
public class CoolNum
{
    /*
     *method isCoolNumber will return true if
     *	num % 3-6 all have a remainder of 1
     *it will return false otherwise
     */
    public static boolean isCoolNumber( int num ) {
        return (num % 3 == 1) && (num % 4 == 1) && (num % 5 == 1) && (num % 6 == 1);//returns true if all conditions are met
    }

    /*
     *method countCoolNumbers will return the count
     *of the coolNumbers between 6 and stop
     */
    public static int countCoolNumbers( int stop ) {
        int coolNums = 0;
        for (int i = 6; i < stop; i++) {
            if (isCoolNumber(i)) {
                coolNums++;
            }
        } // for every number between 6 and stop check if its a cool number
        return coolNums;
    }
    public String toString(int stop) {
        return "There are "+countCoolNumbers(stop) + " cool numbers between 6 - "+stop+"."; //textual representation of output
    }
    public static void main( String[] args )
    {
        //all the given test cases
        CoolNum test = new CoolNum(); //making a new instance of CoolNum
        System.out.println(test.toString(250));//test case for 250
        System.out.println(test.toString(1250));
        System.out.println(test.toString(2250));
        System.out.println(test.toString(5500));
        System.out.println(test.toString(9500));//test case for 9500
        System.out.println(test.toString(23500));
        System.out.println(test.toString(32500));
    }
    /*
    OUTPUT
    There are 4 cool numbers between 6 - 250.
    There are 20 cool numbers between 6 - 1250.
    There are 37 cool numbers between 6 - 2250.
    There are 91 cool numbers between 6 - 5500.
    There are 158 cool numbers between 6 - 9500.
    There are 391 cool numbers between 6 - 23500.
    There are 541 cool numbers between 6 - 32500.
     */
}
