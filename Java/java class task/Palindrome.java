import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the letter: ");
String name = sc.next();

char letter[] = name.toCharArray();
char let[] = letter;

for(int i=letter.length-1; i>0; i--){
}
if(let == letter){
System.out.println("it is palindrome");
}else{
	System.out.println("it is not a palindrome");
}
}
}