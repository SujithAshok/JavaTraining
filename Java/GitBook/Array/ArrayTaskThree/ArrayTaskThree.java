class ArrayTaskThree
{
public static void main(String args[])
{
int numbers[] = new int[5];
 numbers[0]=1;
 numbers[1]=2;
 numbers[2]=3;
 numbers[3]=4;
 numbers[4]=5;
 
 numbers[1] = 10;
    System.out.print("Modified array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
}
}
