import java.io.Console;
class Palindrome
{
public static void main(String args[])
{
	Console con = System.console();
	System.out.println("Enter the number: ");
	int n = Integer.parseInt(con.readLine());
	int temp, r, sum = 0;
	
	temp = n;
	while(n>0)
	{
		r = n%10;
		sum = (sum * 10) + r;
		n = n/10;
	}
	
	if(temp == sum)
	{
	System.out.println(temp + " - It is a palindrome");
	}
	else
	{
	System.out.println(temp + " - It is not a palindrome");
	}
}
}