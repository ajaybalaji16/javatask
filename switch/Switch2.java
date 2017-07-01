import java.util.Scanner;
class Switch2
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter a month number");
int m=scn.nextInt();
switch (m)
{
case 12:
case 1:
case 2:System.out.println("winter season");
	break;
case 3:
case 4:
case 5:System.out.println("summer season");
	break;
case 6:
case 7:
case 8:System.out.println("rainy season");
	break;
case 9:
case 10:
case 11:System.out.println("rainy season");
	break;
default:System.out.println("invalid day");
	break;

}
}
}


