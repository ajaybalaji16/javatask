class B
{
B(int i)
{
System.out.println("parameterized constructor of class B");
}
}
class C
{
}
class TestClass2
{
public static void main(String[] args)
{
new B(10);
new C();
}
}
