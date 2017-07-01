import java.util.Scanner;
class p4
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter size:");
int n=scn.nextInt();
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if((i+j)%2==0)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
