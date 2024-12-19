package org.example;
//Andrew Smiley
//Chapter 4
//Program 28
import java.util.Scanner;
public class BigLetTriangle {
    private int size; // Size of the triangle
    private char letter; //Letter in triangle
    public String TriangletoString() {
        String triangle = "";
        int alphabetSize = 26;
        char currentLetter;
        for (int r = size; r>0; r--) {
            for (int c = 0; c < r; c++) {
                currentLetter = (char)((letter - 'a' + c) % alphabetSize + 'a');
                for (int repeat = r; repeat > c; repeat--) {
                    triangle+=currentLetter;
                }
                triangle+=" ";
            }
            triangle+="\n";
        }
        return triangle;
    }
    public void setSizeAndLetter(int size, char letter) {
        this.size = size;
        this.letter = letter;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of the Big Letter Triangle: "); //prompt for size
        int size = scanner.nextInt();
        System.out.print("Letter for the Big Letter Triangle: "); //prompt for letter
        char letter = scanner.next().toLowerCase().charAt(0);
        BigLetTriangle triangle = new BigLetTriangle();//make a new triangle
        triangle.setSizeAndLetter(size, letter);
        System.out.println("\nHere is your Big Letter Triangle:");
        System.out.println(triangle.TriangletoString());
    }
    /*
    OUTPUT
    /Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=55129:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/charsets.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/ext/cldrdata.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/ext/dnsns.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/ext/jaccess.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/ext/localedata.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/ext/nashorn.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/ext/sunec.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/ext/zipfs.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/jce.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/jfr.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/jsse.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/management-agent.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/resources.jar:/Users/andrew/Library/Java/JavaVirtualMachines/corretto-1.8.0_372/Contents/Home/jre/lib/rt.jar:/Users/andrew/IdeaProjects/Chapter4/target/classes org.example.BigLetTriangle
    Size of the Big Letter Triangle: 6
    Letter for the Big Letter Triangle: P

    Here is your Big Letter Triangle:
    pppppp qqqqq rrrr sss tt u
    ppppp qqqq rrr ss t
    pppp qqq rr s
    ppp qq r
    pp q
    p
     */
}
