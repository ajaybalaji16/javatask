class overloading1
{
public static void main(String[] args)
{
m1(10);
m1(1+3);
m1(23.56);
m1();
//m1(1,3); compile time err
}
static void m1()

{
System.out.println("m1()");
}
static void m1(int i)
{
System.out.println("m1(int)");
}
static void m1(double d)
{
System.out.println("m1(double)");
}
}
