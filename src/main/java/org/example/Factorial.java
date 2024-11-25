package org.example;
//Andrew Smiley
//Chapter 4
//Program 21
public class Factorial
{
    private int number;

    public Factorial(int num) { //init constructor with an integer
        setNumber(num);
    }

    public void setNumber(int num) {
        number = num; //set the number variable to the num param.
    }

    public int getFactorial() {
        int factorial = number;
        for (int i = 1; i < number; i++){
            factorial *= i;//multiply the factorial by the next number
        }
        return factorial; //return the factorial at the end.
    }
    public String toString() {
        return ""+number+"! is "+getFactorial();//convert numbers to a readable string
    }
    public static void main ( String[] args ) {
        Factorial test = new Factorial(5);
        System.out.println(test);
        test.setNumber(4);
        System.out.println(test);
        test.setNumber(8);
        System.out.println(test);
        test.setNumber(6);
        System.out.println(test);
        test.setNumber(9);
        System.out.println(test);
        test.setNumber(3);
        System.out.println(test);
    }
    /*
    OUTPUT
    5! is 120
    4! is 24
    8! is 40320
    6! is 720
    9! is 362880
    3! is 6
     */
}
