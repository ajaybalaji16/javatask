class Person
{
String name;
char gender;
static int count;
Person(String n, char g)
{
name=n;
gender=g;
count++;
}
void display()
{
System.out.println("name:"+name);
System.out.println("gender:"+gender);
}
}

class TestClass3
{
public static void main(String[] args)
{
Person P1=new Person("govinda",'m');
Person P2=new Person("champa",'f');
P1.display();
P2.display();
System.out.println("count:" +Person.count);
}
}

