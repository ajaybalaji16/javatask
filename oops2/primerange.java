class primerange
{
public static void main(String[] args)
{
for(int i=1;i<=100;i++)
{
if(isprime(i))
System.out.println(i);
}
}
static boolean isprime(int n)
{
if(n<2) return false;
for(n<2; i< =n/2; i++)
{
if(n%i==0)
{
return false;
}
}
return true;
}
}