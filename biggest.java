class biggest
{
public static void main(String args[])
{
int a,b,c;

a=4;
b=10;
c=9;

if (c < a && b < a)
System.out.println(a + " is biggest");

if (a < b && c < b)
System.out.println(b +" is biggest");

else
System.out.println(c +" is biggest");
}
}