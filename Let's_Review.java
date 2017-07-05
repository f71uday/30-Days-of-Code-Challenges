import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        String str;
        int n ;
        n= scan.nextInt();
        for (int i=0;i<n;i++)
        {
            str= scan.next();
            char[] array = str.toCharArray();
            for (int j=0;j<str.length();j=j+2)
            {
                System.out.print(array[j]);
            }
            System.out.print(" ");
            for (int k=1; k<str.length();k=k+2)
            {
                System.out.print(array[k]);
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}