import java.util.Scanner;
class perfect
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter a number:");
int n=scn.nextInt();
int sum=0;int i=1;
int a=n;
int m=0;
while (i<=n/2)
{
if(n%i==0)
sum=sum+i;
i++;
}
if(a==m)System.out.println("perfect");
else System.out.println("not a perfect");

}
}
