class Car
{
int regNum;
private static int num=1000;
Car()
{
regNum=num++;
System.out.println("car is created and registered with" +regNum);
}
void start()
{
System.out.println(regNum+"car starts");
}
void accerlerate()
{
System.out.println(regNum+"car accerlerated");
}
void applyBrakes()
{
System.out.println(regNum+"car stops");
}
}
class Driver
{
String name;
Driver(String n)
{
name=n;
System.out.println("driver"+name+"is hired");
}
void drive(Car c)
{
c.start();
c.accerlerate();
c.applyBrakes();
}
}

class Owner
{
public static void main(String[] args)
{
Car c1=new Car();
Car c2=new Car();
Car c3=new Car();
Driver drive=new Driver("dinga");

drive. drive(c2);
drive. drive(c1);
drive. drive(c3);
}
}
