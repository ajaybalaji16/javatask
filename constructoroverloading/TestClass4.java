class D
{
D()
{
System.out.println("default cst");
}
D(int i)
{
System.out.println("parameterized cst");
}
}
class TestClass4
{
public static void main(String[] args)
{
new D();
new D(10);
}
}