import java.util.Scanner;

class Concate
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	String b = sc.nextLine();
	String c = a.concat(b);
	
	System.out.print(c);
}
}