import java.io.Console;
class Prime
{
public static void main(String args[])
{
	int n;
	boolean prime = true;
	Console sc = System.console();
	System.out.print("The Prime number is: ");
	n = Integer.parseInt(sc.readLine());
	
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