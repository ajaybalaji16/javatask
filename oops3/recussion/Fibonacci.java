import java.util.Scanner;
class Fibonacci
{ 
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter a number");
for(int i=1; i<=10; i++)
System.out.print(getFibDigit(i));
System.out.print(" ");
}

static int getFibDigit(int n)
{
if(n==1) return 0;
if(n==2) return 1;
return getFibDigit(n-1)+getFibDigit(n-2);
}

}

