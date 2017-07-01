class C
{
int j=2;
public static void main(String[] args)
{
System.out.println("main starts");
C obj=new C();
System.out.println(obj.j);
obj.j=20;
System.out.println(obj.j);
}
}