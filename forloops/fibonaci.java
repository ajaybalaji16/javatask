import java.util.Scanner;
class fibonaci
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter a number");
int n=scn.nextInt();
int a=0,b=1,c;
System.out.print(a+" "+b);
for(int i=3;i<=20;i++)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}
}
}