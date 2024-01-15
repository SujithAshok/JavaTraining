class Odd
{
public static void main(String args[])
{
int sum = 0;
for(int i = 50; i<=100; i++)
{
	if(i%2==0)
	{
	sum = sum + i;
	}
	}
	System.out.print("Sum of 50 - 100 Odd Number is " +sum);
}
}