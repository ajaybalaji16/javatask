import java.util.Scanner;
class perfectrange
{ 
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter a number");
{
for(int i=1; i<=100; i++)
{
if(isperfect(i))
System.out.print(i);
}
}
static boolean isperfect(int n)
{
int sum=0;i=1;
while(i<=n/2);
{
if(n%i==0)
sum+=i;
i++;
}
if(n==sum)
 return true;
else 
 return false;
}

}
}
