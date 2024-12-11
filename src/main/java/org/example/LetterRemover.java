package org.example;

public class LetterRemover{
    private String sentence;
    private String lookFor;

    public void setRemover(String s, String rem){
        lookFor = rem;
        sentence = s;
    }

    public String removeLetters(){
        String removed = "";
        for(int i = 0; i < sentence.length(); i++) {
            if(String.valueOf(sentence.charAt(i)) != lookFor) {
                removed+=String.valueOf(sentence.charAt(i));
            }
        }
        return removed;
    }



    public static void main( String args[] ){


    }
}