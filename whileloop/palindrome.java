import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter a number:");
int n=scn.nextInt();
int a=n;
int m=0;
while (n>0)
{
m=(m*10)+(n%10);
n/=10;
}

if(a==m) System.out.print("palindrome");
else System.out.print("not a palindrome");

}
}
