import java.util.Scanner;
class Factorial
{ 
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter a number");
int a=scn.nextInt();
int res= getFact(a);
System.out.println("Fact of "+a+" is: " +res);
}

static int getFact(int n)
{
if(n==0) return 1;

return n*getFact(n-1);
}

}

