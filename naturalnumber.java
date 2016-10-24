import java.io.*;
import java.util.*;
class naturalnumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
 int n,sum=0;
System.out.println("Enter size of natural number:");
n=sc.nextInt();
if(n==0)
{
System.out.println("Invalid data");
}
sum=(n*(n+1))/2;
System.out.println("The sum of natural numbers are:"+sum);
}
}
