import java.util.Scanner;
class p3
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter size:");
int n=scn.nextInt();
for(int i=1;i<=5;i++)
{
for(int j=5;j>=i;j--)
{
System.out.print("*");
}
System.out.println();
}
}
}
