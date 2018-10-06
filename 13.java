import java.util.*;
import java.lang.*;
class Ideone 
{
    public static void main(String aa[])
    {
   int n;
   int sum=0;
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
       while(n>0)
       {
           int j=n%10;
           sum=sum+(j*j);
           n=n/10;
       }
       System.out.print(sum);
}
}
