import java.util.*;
class Even
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if(a%2==0)
	{
	System.out.print(a + " it is an even number");
	}
	else 
	{
	System.out.print(a + " it is not an even number");
	}
}
}