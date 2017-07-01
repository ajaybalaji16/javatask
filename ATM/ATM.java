import java.util.Scanner;
class Account
{
double bal;
void getBal()
{
System.out.println("curr bal: "+bal+"rs");
}
void withDraw(int amt)
{
if(amt>bal)
{
System.out.println("less balance");
return;
}
//dispatch amount
System.out.println(amt+"rs withdraw");
bal-=amt;
}
}
class ATM
{
public static void main(String[] args)
{
Account acc1=new Account();
acc1.bal=3000;
Scanner scn=new Scanner(System.in);
int n;
do
{
System.out.println("1-view curr bal");
System.out.println("2-withdraw amount");
System.out.print("enter your option:");
int option=scn.nextInt();
switch(option)
{
case 2:System.out.print("enter amount:");
       int amt=scn.nextInt();
	acc1.withDraw(amt);
case 1:acc1.getBal();
	break;
default:System.out.println("invalid option");
}
System.out.println("1-continue; 0-exist");
	n=scn.nextInt();
}
while(n==1);
System.out.println("thank you");
}
}