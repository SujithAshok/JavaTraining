import java.io.Console;
class Main4
{
	static int arr[] = new int[4];
	int add(int a, int b)
	{
	int c = a + b;
	return c;
	}
	
	int sub(int d, int e)
	{
	int f = d - e;
	return f;
	}
	
	int mul(int g, int h)
	{
	int i = g * h;
	return i;
	}
	
	int div(int j, int k)
	{
	int l = j / k;
	return l;
	}
	
	public static void main(String args[])
	{
	Console con = System.console();
	System.out.println("Enter the number: ");
	int m = Integer.parseInt(con.readLine());
	int n = Integer.parseInt(con.readLine());
	Main4 ob = new Main4();
	arr[0] = ob.add(m,n);
	arr[1] = ob.sub(m,n);
	arr[2] = ob.mul(m,n);
	arr[3] = ob.div(m,n);
	System.out.println("The addition value is: " +arr[0]);
	System.out.println("The subtraction value is: " +arr[1]);
	System.out.println("The multiplication value is: " +arr[2]);
	System.out.println("The division value is: " +arr[3]);
}
}
	