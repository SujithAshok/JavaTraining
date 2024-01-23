import java.io.Console;
class Fibo
{
	
	  static int fib(int n)
    {
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
		
        return b;
    }
	
public static void main(String args[])
{
	Console con = System.console();
	System.out.println("Enter the Nth number: ");
	int n = Integer.parseInt(con.readLine());
	System.out.println(fib(n));
	
}
}