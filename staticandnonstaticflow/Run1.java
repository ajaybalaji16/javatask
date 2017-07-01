class B
{
static int i;
int j;
}
class Run1
{
public static void main(String[] args)
{
System.out.println("executing starts");
B.i=10;
B b1=new B();
b1.j=20;
B b2=new B();
b2.j=30;
System.out.println(B.i);
System.out.println(b1.j);
System.out.println(b2.j);
System.out.println("executing ends");
}
}

