package org.example;
//Andrew Smiley
//Chapter 4
//Program 20
public class LoopStats
{
    private int start, stop;
    public LoopStats(int b, int e) {
        setNums(b, e);
    }
    public void setNums(int beg, int end)
    {
        start = beg; //sets the start var
        stop = end; //sets the end var
    }
    public int getEvenCount() {
        int count = 0;
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) { //checks for no remainder when mod div by 2
                count++;
            }
        }
        return count;
    }
    public int getOddCount()
    {
        int count = 0;
        for (int i = start; i <= stop; i++) {
            if (i % 2 == 1) { //checks if there is a remainder when mod divided by 2
                count++;
            }
        }
        return count;
    }
    public int getTotal()
    {
        int count = 0;
        for (int i = start; i <= stop; i++) {
            count += i;//add i to the cound
        }
        return count;//return count at the end
    }
    public String toString() {
        return ""+start+"   "+stop+"\ntotal "+getTotal()+"\neven count "+getEvenCount()+"\nodd count "+getOddCount();
    }
    public static void main ( String[] args )
    {
        LoopStats test = new LoopStats(1, 5);
        System.out.println(test);
        test.setNums(2, 8);
        System.out.println(test);
        test.setNums(5, 15);
        System.out.println(test);
    }
    /*
    OUTPUT
    1   5
    total 15
    even count 2
    odd count 3
    2   8
    total 35
    even count 3
    odd count 3
    5   15
    total 110
    even count 5
    odd count 6
     */
}

