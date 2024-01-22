import java.util.*;

class A
{
	void calc()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array: ");
	int arr_size = 0;
	
	if(sc.hasNextInt())
	{
	arr_size = sc.nextInt();
	}
	
	int[] arr = new int [arr_size];
	System.out.println("Enter the array values: ");
	for(int i=0; i < arr_size; i++)
	{
	if(sc.hasNextInt()){
	arr[i] = sc.nextInt();
	}
	}
	
	System.out.println("The array elements are: ");
	for(int i=0; i < arr_size; i++)
	{
	System.out.println(arr[i]+ " ");
	}
	
	int sum = 0;
	float avg;
	for(int i = 0; i < arr_size; i++)
	{
	sum = sum + arr[i];
	}
	avg = sum / arr_size;
	System.out.println("The average of the array value is: " +avg);
	
	sc.close();
}}

class Main3{
public static void main(String args[])
{
	A ob = new A();
	ob.calc();
}
}
