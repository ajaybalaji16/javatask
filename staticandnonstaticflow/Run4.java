class F
{
static int i;
int j;
void increement()
{
++i;
++j;
}
void display()
{
System.out.println(i);
System.out.println(j);
}
}
class Run4
{
public static void main(String[] args)
{
F f1=new F();
F f2=new F();
F f3=new F();
f3.increement();
f3.increement();
f3.increement();
f1.display();
f2.display();
f3.display();
}
}




