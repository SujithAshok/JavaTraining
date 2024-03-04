class ArrayTaskNine
{
public static void main(String args[])
{
int numbers[] = {1,2,3,4,5};

 int[] copyNumbers = new int[numbers.length];

 System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);
		for(int i=0; i<copyNumbers.length; i++){
		System.out.println(copyNumbers[i]);}
}
}
