package org.example;
//Andrew Smiley
//Chapter 4
//Program 19
public class Word {
    private String word;
    public Word(String s) {//init constructor
        setString(s);
    }
    public void setString(String s) {
        word = s; //set word to value of param s
    }
    public char getFirstChar()
    {
        return word.charAt(0);//get char at 0 which is the first.
    }
    public char getLastChar()
    {
        return word.charAt(word.length()-1);
    }
    public String getBackWards() {
        String backwards = "";
        for(int i = word.length(); i > 0; i--) {//going through the nums backwards.
            backwards += word.substring(i-1, i);//adding the char to the string
        }
        return backwards;
    }
    public String toString()
    {
        return getFirstChar()+"\n"+ String.valueOf(getLastChar()).toUpperCase()+"\n"+getBackWards()+"\n"+word;
    }
    public static void main ( String[] args )
    {
        //add test cases reflecting ALL the Sample Data given.
        Word test = new Word("Hello");
        System.out.println(test);
        test.setString("World");//test for World
        System.out.println(test);
        test.setString("JukeBox");
        System.out.println(test);
        test.setString("LordoftheRings");
        System.out.println(test);
        test.setString("IceCream");
        System.out.println(test);
    }
    /*
    OUTPUT
    H
    O
    olleH
    Hello
    W
    D
    dlroW
    World
    J
    X
    xoBekuJ
    JukeBox
    L
    S
    sgniRehtfodroL
    LordoftheRings
    I
    M
    maerCecI
    IceCream
     */

}
