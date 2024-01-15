import java.util.*;

class SumWhile
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int i = 1;
	int sum = 0;
	while(i<=num)
	{
	sum = sum +i;
	i++;
	}
	System.out.print("Sum of number "+sum);
}
}