import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int count =0;
        int flag =0;
        int max =0;
        int div;
        div = n%2;
            n=n/2;
        if (div==1){
            count++;
            flag =1;
            max =count;
        }
        while (n>=1)
        {
        div = n%2;
            n=n/2;
            
            if (div == 1)
            {
                count++;
                if (count >max)
                {
                    max = count;
                }
                
            }
            else 
            {
                
                count =0;
            }
        }
        if (n==1)
        {
            count ++;
            if (max >count )
                max = count ;
        }
        System.out.println(max);
    }
}