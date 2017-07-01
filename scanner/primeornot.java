import java.util.Scanner;
class primeornot
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter a number");
int n=scn.nextInt();
if(n<2)
{
System.out.print("not a prime");
return;
}
int a=1;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
System.out.print("not a prime");
a=0;
break;
}
}
if(a==1)
System.out.print(" prime");
}
}