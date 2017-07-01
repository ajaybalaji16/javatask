import java.util.Scanner;
class p10
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter size:");
int n=scn.nextInt();
int spaces=4;
int stars=1;
for(int i=1;i<=9;i++)
{
for(int j=1;j<=spaces;j++)
{
System.out.print(" ");
}
for(int k=1; k<=stars;k++)
{
System.out.print("*");
}
System.out.println();
if(i<=4) {spaces--; stars+=2;}
else {spaces++; stars-=2;}
}
}
}
