package org.example;

import java.awt.font.NumericShaper;

public class LoopStats
{
    private int start, stop;
    public LoopStats(int b, int e) {
        setNums(b, e);
    }
    public void setNums(int beg, int end)
    {
        start = beg;
        stop =  end;
    }
    public int getEvenCount() {
        int count = 0;
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public int getOddCount()
    {
        int count = 0;
        for (int i = start; i <= stop; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }
    public int getTotal()
    {
        int count = 0;
        for (int i = start; i < stop; i++) {
            count += i;
        }
        return count;
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
        //add all test cases
    }
}

