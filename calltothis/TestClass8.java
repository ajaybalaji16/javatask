class Box1
{
int height;
int width;
int length;
Box1()
{
}
Box1(int h,int w,int l)
{
height=h;
width=w;
length=l;
}
Box1(int d)
{
this(d,d,d);
}
Box1(Box1 b)
{
this(b.height,b.width,b.length);
}
}
class TestClass8
{
public static void main(String[] args)
{
new Box1(10);

}
}
