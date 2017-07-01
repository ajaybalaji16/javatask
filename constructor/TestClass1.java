class A
{
A()
{
System.out.println("executing constructor");
}
}
class TestClass1
{
public static void main(String[] args)
{
new A();
new A();
}
}
