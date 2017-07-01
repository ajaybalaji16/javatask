import java.util.Scanner;
class p14
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter size:");
int n=scn.nextInt();
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
if((i+j)%2==0)
System.out.print("1");
else
System.out.print("0");
}
System.out.println();

}
}
}

