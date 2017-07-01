import java.util.Scanner;
class Biggest
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter 2 number");
int a=scn.nextInt();
int b=scn.nextInt();
if(a>b)
{
System.out.println(a+"is bigger");
}
else
{
System.out.println(b+"is bigger");
}
}
}