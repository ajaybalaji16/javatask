class B
{
static
{
System.out.println("static block");
}
{
System.out.println("non-static block");
}
B()
{
System.out.println("ctt");
}
}
class TestClass9
{
public static void main(String[] args)
{
new B();
new B();
new B();
}
}