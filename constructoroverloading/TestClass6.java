class Rectangle
{
int length;
int breadth;
Rectangle()
{
}
Rectangle(int l,int b)
{
length=l;
breadth=b;
}
Rectangle(Rectangle r)
{
length=r.length;
breadth=r.breadth;
}
void displayDimensions()
{
System.out.println("["+length+","+breadth+"]");
}
}
class TestClass6
{
public static void main(String[] args)
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle(5,10);
Rectangle r3=new Rectangle(r1);
Rectangle r4=new Rectangle(r2);

r1.displayDimensions();
r2.displayDimensions();
r3.displayDimensions();
r4.displayDimensions();
}
}
