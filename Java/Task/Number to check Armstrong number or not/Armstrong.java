import java.io.Console;
class Armstrong
{
public static void main(String args[])
{
	Console con = System.console();
	System.out.println("Enter the number: ");
	int n = Integer.parseInt(con.readLine());
	int temp, rev, sum = 0;
	
	temp = n;
	while(n!=0)
	{
		rev = n%10;
		sum = sum + (rev * rev * rev);
		n = n/10;
	}
	
	if(temp == sum )
	{
	System.out.println(temp + " - It is an Armstrong number");
	}
	else
	{
	System.out.println(temp + " - It is not an Armstrong number");
	}
}
}