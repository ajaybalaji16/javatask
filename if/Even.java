import java.util.Scanner;
class Evenorodd
{
public static void main(String[] args);
{
Scanner scn=new Scanner(System.in);
System.out.println("enter a number");
int n=scn.nextInt();
if(n%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}