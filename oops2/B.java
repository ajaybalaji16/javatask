class B
{
public static void main(String[] args)
{
m1(10);
int i=10+20;
m1(i);
m1(20+30);
}
static void m1(int a)
{
System.out.println("a=" +a);
}
}