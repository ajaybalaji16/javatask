import java.util.Scanner;
class binarytodecimal
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter a number:");
int n=scn.nextInt();
int bin=scn.nextInt();
int dec=n;
int i=0;
while (bin>0)
{
int bit=bin%10;
if(bit==1)
{
dec+=Math.pow(2,i);
}
bin/=10;
i++;
}
System.out.print(dec);
}
}

