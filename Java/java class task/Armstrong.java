import java.util.*;
class Armstrong
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value: ");
int num = sc.nextInt();
int mod;
int temp=0, sum=0;
temp = num;

while(num!=0){
 mod = num%10;
 sum = sum + (mod*mod*mod);
 num = num/10;
}

if(temp == sum){
System.out.println(temp + "it is a armstrong");
}else{
System.out.println(temp + "it is not a armstrong");
}

}
}