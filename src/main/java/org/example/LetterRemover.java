package org.example;
//Andrew Smiley
//Chapter 4
//Program 24
public class LetterRemover{
    private String sentence;
    private String lookFor;
    public LetterRemover(String s, String l) {//init constructor
        setRemover(s, l);
    }
    public void setRemover(String s, String rem){
        lookFor = rem;//set vars
        sentence = s;
    }
    public String toString() {
        return sentence+", letter to remove: "+lookFor+"\n"+removeLetters();//readable string
    }
    public String removeLetters(){
        String removed = "";
        int i = 0;
        while(i < sentence.length()) {
            if(sentence.charAt(i) != lookFor.charAt(0)) { //make sure char isnt the one we dont want
                removed += sentence.charAt(i);//add character
            }
            i++;
        }
        return removed;
    }



    public static void main( String args[] ){
        LetterRemover test = new LetterRemover("I am Sam I am", "a");
        System.out.println(test);
        test.setRemover("ssssssssxsssssesssesss", "s");
        System.out.println(test);
        test.setRemover("abababababa", "b");
        System.out.println(test);
        test.setRemover("aababababa", "x");
        System.out.println(test);
        test.setRemover("qwertqwerty", "a");
        System.out.println(test);

    }
    /*
    OUTPUT
    I am Sam I am, letter to remove: a
    I m Sm I m
    ssssssssxsssssesssesss, letter to remove: s
    xee
    abababababa, letter to remove: b
    aaaaaa
    aababababa, letter to remove: x
    aababababa
    qwertqwerty, letter to remove: a
    qwertqwerty
     */
}
