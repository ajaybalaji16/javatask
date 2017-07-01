 class A
{
public static void main(String[] args)
{
System.out.println("main starts");
A.m1();
System.out.println("main ends");
return;
}
 static void m1()
{
System.out.println("executing m1()");
return;
}
}