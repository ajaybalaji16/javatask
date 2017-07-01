class overloading2
{
public static void main(String[] args)
{
System.out.println("main(String[])");
main();
main(10);
}
static void main()

{
System.out.println("main()");
}
static void main(int i)
{
System.out.println("main(int)");
}

}
