import java.util.*;
class Prime
{
public static void main(String args[])
{
	int n;
	boolean prime = true;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	
	for(int i = 2; i<n; i++)
	{
	if(n%i==0)
	{
	prime = false;
	break;
	}
	}
	
	if(prime==true)
	{
	System.out.println("The given number " + n + " is a prime number");
	}
	else
	{
	System.out.println("The given number " + n + " is not a prime number");
	}
}
}