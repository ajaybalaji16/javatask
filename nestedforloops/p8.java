import java.util.Scanner;
class p8
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter size:");
int n=scn.nextInt();
int spaces=4;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=spaces;j++)
{
System.out.print(" ");
}
for(int k=1; k<=i;k++)
{
System.out.print("*");
}
System.out.println();
spaces--;
}
}
}
