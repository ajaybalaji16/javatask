class D
{
static int i=1;
int j=2;
public static void main(String[] args)
{
System.out.println("main starts");
System.out.println(D.i);
D obj=new D();
System.out.println(obj.j);
obj.j=20;
System.out.println(obj.j);
}
}