package org.example;

public class BiggestString{
    private String one, two, three;

    public BiggestString(String d, String e, String f) {//init constructor
        setStrings(d, e, f);
    }
    public void setStrings(String a, String b, String c){
        one =a;//sets first word
        two=b;
        three=c;
    }

    public String getBiggest(){
        int biggestAscii = one.charAt(0);
        if((int) two.charAt(0) > biggestAscii) {//checks if second word is bigger than first
            biggestAscii = two.charAt(0);
        }
        if((int) three.charAt(0) > biggestAscii) {
            biggestAscii = three.charAt(0);
        }
        if (biggestAscii == (int) one.charAt(0)) {
            return one;
        } else if (biggestAscii == (int) two.charAt(0)) {
            return two;
        } else {
            return three;//returns third word
        }
    }
    public String toString() {
        return one+" "+two+" "+three+"\nBiggest = "+getBiggest()+"\n";//readable string
    }
    public static void main(String args[]){
        BiggestString test = new BiggestString("abc", "cba", "bca");
        System.out.println(test);
        test.setStrings("one", "fourteen", "twenty");
        System.out.println(test);
        test.setStrings("124323", "20009", "3434");
        System.out.println(test);
        test.setStrings("abcde", "ABCDE", "1234234324");
        System.out.println(test);
    }
    /*
    OUTPUT

    abc cba bca
    Biggest = cba

    one fourteen twenty
    Biggest = twenty

    124323 20009 3434
    Biggest = 3434

    abcde ABCDE 1234234324
    Biggest = abcde
     */

}

