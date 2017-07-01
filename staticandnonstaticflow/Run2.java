class C
{
static int i;
int j;
}
class Run2
{
public static void main(String[] args)
{
System.out.println("executing starts");

C c1=new C();
C c2=new C();
c1.i=10;
c2.i=20;
System.out.println(c1.i);
System.out.println(c2.i);
System.out.println("executing ends");
}
}

