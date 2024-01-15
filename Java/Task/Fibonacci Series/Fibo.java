import java.util.*;
class Fibo
{
public static void main(String args[])
{	
	int num = 10;
	int i = 1;
	int a = 0;
	int b = 1;
	System.out.println("Fibonacci Series till " + num + " terms:");
	do{
		
		int c = a + b;
		a = b;
		b = c;
		System.out.print(c + ", ");
		i++;
		
	}while(i<=num);
}
}