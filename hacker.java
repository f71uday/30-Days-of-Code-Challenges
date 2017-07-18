import java.util.*;
class A
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number= scan.next();
        int num;
        int sum1=0;
        int sum2=0;
        int diff=1;
        
        for (int k=0;diff!=0;k++)
        {
            num=(Integer.parseInt(number))+1;
            sum1=0;
            sum2=0;
            number= Integer.toString(num);
            char[] numArray= number.toCharArray();
        for (int i=0;i<3;i++)
        {
            sum1= sum1+Integer.parseInt(String.valueOf(numArray[i]));

        }
        for(int i=3;i<6;i++)
        {
            sum2=sum2+Integer.parseInt(String.valueOf(numArray[i]));
        }
        diff = sum1-sum2;
        }
    System.out.print(Integer.parseInt(number));
    
        
    }
}