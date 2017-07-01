class Box
{
int height;
int width;
int length;
Box()
{
}
Box(int h,int w,int l)
{
height=h;
width=w;
length=l;
}
Box(int d)
{
height=width=length=d;
}
void displayDimensions()
{
System.out.println("["+height+","+width+","+length+"]");
}
}
class TestClass5
{
public static void main(String[] args)
{
Box b1=new Box();
Box b2=new Box(3);
Box b3=new Box(3,5,7);

b1.displayDimensions();
b2.displayDimensions();
b3.displayDimensions();
}
}
