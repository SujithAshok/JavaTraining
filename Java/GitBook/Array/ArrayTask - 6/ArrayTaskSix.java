class ArrayTaskSix
{
public static void main(String args[])
{
int numbers[] = new int[5];
 numbers[0]=1;
 numbers[1]=2;
 numbers[2]=3;
 numbers[3]=4;
 numbers[4]=5;
 int sum =0;
 int avg =0;
 
 for(int i=0; i<numbers.length; i++){
 sum = sum + numbers[i];
 }
 avg = sum/5;
 System.out.println("The average of an Array is: " +avg);
 
}
}
