import java.io.Console;
class Factorial
{
public static void main(String args[])
{
	Console con = System.console();
	int i, n, f=1;
	System.out.print("Enter the number for factorial series: ");
	n = Integer.parseInt(con.readLine());
	
	for(i=1; i<=n; i++)
	{
	f = f*i;
	}
	System.out.print("The factorial series: ");
	System.out.print(f);
}
}