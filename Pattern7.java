import java.util.*;  
public class Pattern7  
{  
public static void main(String[] args)  
{  
int i, j, rows;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number of rows youy want to print: ");  
rows = sc.nextInt();  
for (i = rows; i >= 1; i--)  
{  
for (j = rows; j >= i; j--)  
{  
System.out.print(j+" ");  
}  
   
System.out.println();  
}  
}  
} public class Pattern8  
{  
public static void main(String[] args)   
{  
int rows=9;   //number of rows to print  
for (int i = 1; i <= rows; i++)   
{  
int num;  
if(i%2 == 0)  
{  
num = 0;  
for (int j = 1; j <= rows; j++)  
{  
System.out.print(num);  
num = (num == 0)? 1 : 0;  
}  
}  
else  
{  
num = 1;  
for (int j = 1; j <= rows; j++)  
{  
System.out.print(num);  
num = (num == 0)? 1 : 0;  
}  
}  
System.out.println();  
}  
}  
}   