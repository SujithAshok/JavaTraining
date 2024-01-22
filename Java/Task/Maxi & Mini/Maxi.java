import java.util.*;
class Maxi
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("\n Enter size of array: ");
	int n = sc.nextInt();
	int sum =0;
	int arr[] = new int[n];
	
	for(int i=0; i<n;i++)
	{
	System.out.println("\n Enter: ");
	arr[i] = sc.nextInt();
	}
	
	int max = arr[0], min = arr[0];
	for(int i=0; i<n; i++)
	{
	if(arr[i]>max){
	max = arr[i];
	}
	if(arr[i]<min){
	min = arr[i];
	}
	}
	
	System.out.println("\n Max number: "+max);
	System.out.println("\n Min number: "+min);
}
}