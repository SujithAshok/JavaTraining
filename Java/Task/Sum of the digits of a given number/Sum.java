import java.io.Console;
class Sum
{
public static void main(String args[])
{
	Console con = System.console();
	System.out.println("Enter the number: ");
	int n = Integer.parseInt(con.readLine());
	int sum=0, r;
	
	while(n!=0)
	{
		r = n%10;
		sum = sum + r;
		n = n/10;
	}
	System.out.println(sum + " is a sum of the given number");
}
}