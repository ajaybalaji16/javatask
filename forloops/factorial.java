import java.util.Scanner;
class factorial
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter a number");
int n=scn.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact *= i;
}
System.out.println("factorial of "+n+" is " +fact);
}
}