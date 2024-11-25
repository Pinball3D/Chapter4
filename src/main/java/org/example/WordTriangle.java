package org.example;
//Andrew Smiley
//Chapter 4
//Program 18
public class WordTriangle
{
    private String word;
    public WordTriangle(String s) {//init constructor
        setWord(s);//calls setWord method with value of param s
    }

    public void setWord(String s) {
        word = s; //set word to param s
    }

    public void print( ) {
        for (int i = 1; i <= word.length(); i++) {
            System.out.println(word.substring(0, i));//prints the word from the beginning index to i.
        }
        System.out.println(); // adds an extra line at bottom of triangle
    }
    public static void main ( String[] args ) {
        WordTriangle test = new WordTriangle("hippo");
        test.print();
        test.setWord("abcd");
        test.print();
        test.setWord("abcd");
        test.print();
        test.setWord("it"); //test for it
        test.print();
        test.setWord("a");
        test.print();
    }
    /*
    OUTPUT
    h
    hi
    hip
    hipp
    hippo

    a
    ab
    abc
    abcd

    a
    ab
    abc
    abcd

    i
    it

    a
     */
}
