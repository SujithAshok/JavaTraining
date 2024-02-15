class ArrayTaskNine
{
public static void main(String args[])
{
int numbers[] = {1,2,3,4,5};

 int[] copyNumbers = new int[numbers.length];

 System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);
System.out.print("copyNumbers array: ");
        for (int num : copyNumbers) {
            System.out.print(num + " ");
        }
}
}
