class lab1
{
public static void main(String args[])
{
int a,b;
a = 10;
b = 5;
int R1;
R1=(a<<2)+(b>>2);
System.out.println("(a<<2)+(b>>2)= "+R1);

boolean R2;
R2 = b > 0;
System.out.println("b > 0 is "+R2);

double R3;
R3 = (a+b*100)/10;
System.out.println("(a+b*100)/10 is "+R3);

int R4;
R4 = a&b;
System.out.println("a&b is "+R4);
}
}