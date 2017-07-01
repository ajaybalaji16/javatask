class A
{
static int j=2;
int k=3;
public static void main(String[] args)
{
System.out.println("executing starts");
int i=1;
A a1=new A();
A a2=new A();
a1.k=100;
System.out.println(a1.k);
System.out.println(a2.k);
System.out.println(A.j);
System.out.println("executing ends");
}
}

