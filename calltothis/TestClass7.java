class E
{
E()
{
System.out.println("default ctt");
}
E(int i)
{
this();
System.out.println("parameterized ctt");
}
}

class TestClass7
{
public static void main(String[] args)
{
new E(10);
}
}