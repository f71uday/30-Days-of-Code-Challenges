//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
     HashMap mymap = new HashMap<String ,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            mymap.put(name,phone);
            
           
            
        }
        while(in.hasNext()){
            String s = in.next();
            if (mymap.containsKey(s)==true)
            {
                System.out.print(s+"="+mymap.get(s));
                System.out.println();
            }
            else 
                System.out.println("Not found");
        }
        in.close();
    }
}