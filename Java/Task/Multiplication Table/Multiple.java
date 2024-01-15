import java.util.*;

class Multiple
{
public static void main(String args[])
{
	 Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 int mul=0;
	 int i;
	 for(i=1; i<=10; i++)
	 {
	 mul = i * num;
	 System.out.println( i +"*"+ num +"="+ mul);
	 }
	 
	 System.out.println();
	 int j=1;
	 while(j<=10)
	 {
		 mul = j * num;
	 System.out.println( j +"*"+ num +"="+ mul);
	 j++;
	 }

	 System.out.println();	 
	 int k=1;
	 do{
		 mul = k * num;
	 System.out.println( k +"*"+ num +"="+ mul);
	 k++;
	 }while(k<=10);
}
}