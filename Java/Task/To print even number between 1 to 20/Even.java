import java.util.*;
class Even
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the n Numbers: ");
int n = sc.nextInt();
System.out.println("The Even Numbers between two n numbers: ");
for (int i=1; i<=n; i++)
{
	if(i%2==0){
	System.out.println(i);
	}
}
}
}