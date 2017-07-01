class E
{
int i;
void display()
{
System.out.println(i);
}
}
class Run3
{
public static void main(String[] args)
{
System.out.println("executing starts");

E e1=new E();
e1.i=10;
E e2=new E();
e2.i=20;
e1.display();
e2.display();
System.out.println("executing ends");
}
}

