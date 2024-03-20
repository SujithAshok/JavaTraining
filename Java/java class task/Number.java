import java.util.*;

class OENumbers extends Thread
{
	Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
public void numb(){
	for(int i=0; i<=num; i++){
if(i%2==0){
System.out.println("It's an even number");
}
else{
	System.out.println("It's an odd number");
}

try{
Thread.sleep(1000);
}catch(InterruptedException e){
System.out.println("Interpreted");
	}
}

}
}

public class Number
{
public static void main(String args[])
{
	System.out.println("Enter the length: ");
OENumbers obj = new OENumbers();
obj.numb();
}
}
