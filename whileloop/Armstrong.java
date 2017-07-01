import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter a number:");
int n=scn.nextInt();
int a=n;
int sum=0;
while (n>0)
{
sum+=Math.pow(3,n%10);
n/=10;
}
if(sum==a)System.out.print("Armstrong");
else System.out.print("not a Armstrong");

}
}
