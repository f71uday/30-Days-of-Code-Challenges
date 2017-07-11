import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j;
        int arr[][] = new int[6][6];
        for(i=0; i < 6; i++){
            for(j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int count=1;
int sum=0;
int maxSum=0;
for( i=0; i < 4; i++){

       for( j=0; j < 4; j++,count++){

          sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j+0]+arr[i+2][j+1]+arr[i+2][j+2];

           //set max value on first iteration
           if(count==1){
               maxSum=sum;
           }

           //check for the max value
            if(sum>=maxSum){
               maxSum=sum;

           }

          }
       }
   if(sum>=maxSum){
       System.out.println(sum);

    }
   else{
       System.out.println(maxSum);  
   }
        
    }
}