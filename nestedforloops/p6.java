import java.util.Scanner;
class p6
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter size:");
int n=scn.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1||j==1||i==n||j==n)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
