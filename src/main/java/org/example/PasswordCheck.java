package org.example;
import java.util.Scanner;
//Andrew Smiley
//Chapter 4
//Program 25
class PasswordCheck{
    private static String password;

    public PasswordCheck(){
    }
    public static void setPassword(String p) {
        password = p;
    }
    public static void check() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the password: ");//asks the user a question
        String userInput = keyboard.next();//gets user input
        while(!userInput.equals(password)) {
            System.out.println("INVALID");
            check();//try again
        }
        System.out.println("VALID");

    }
    public static void main( String args[] ) {
        setPassword("correctPassword");//sets password
        check();
    }
    /*
    OUTPUT
    Enter the password: a
    INVALID
    Enter the password: b
    INVALID
    Enter the password: c
    INVALID
    Enter the password: d
    INVALID
    Enter the password: e
    INVALID
    Enter the password: f
    INVALID
    Enter the password: g
    INVALID
    Enter the password: h
    INVALID
    Enter the password: i
    INVALID
    Enter the password: j
    INVALID
    Enter the password: correctPassword
    VALID
     */
}

