import java.util.Scanner;
class SumWhile
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter a number:");
int n=scn.nextInt();
int sum=0;
while(n>0)
{
sum+=n%10;
n/=10;
}
System.out.print(sum);


}
}
