import java.util.*;
class ArrayTask
{
public static void main(String args[])
{
ArrayList<String> li = new ArrayList<>();
li.add("1");
li.add("2");
li.add("3");
li.add("4");
li.add("5");
System.out.println("The array elements: "+li);
String remstr = li.remove(4);
System.out.println("The Array after removing 5th element: "+li);

System.out.println("\n");
//----------------

ArrayList<Integer> li1 = new ArrayList<>();
li1.add(1);
li1.add(3);
li1.add(4);
li1.add(5);
li1.add(2);
System.out.println("The ArrayList elements are: "+li1);
Collections.sort(li1);
System.out.println("The elements contains in an ArrayList: "+ li1);
Integer Maxi = Collections.max(li1);
Integer Mini = Collections.min(li1);
System.out.println("The Maximum is: "+Maxi);
System.out.println("The Minimum is: "+Mini);

System.out.println("\n");
//-----------------------

int[] arr = {1,3,2,4,5};
System.out.println("The array element before swapping: ");
for(int i:arr){
	System.out.println(i +" ");
}
int firstIndex = 1, secondIndex = 2;
int temp = arr[firstIndex];
arr[firstIndex] = arr[secondIndex];
arr[secondIndex] = temp;
System.out.println("\n The array element after swapping: ");
for(int i:arr){
	System.out.println(i+ " ");
}

ArrayList<Integer> Li = new ArrayList<>();
Li.add(1);
Li.add(2);
Li.add(3);
Li.add(4);
Li.add(5);
System.out.println("The ArrayList elements before swapping: "+Li);
Collections.swap(Li,1,2);
System.out.println("The ArrayList elements after swapping: "+Li);

System.out.println("\n");
//-----------------------

HashSet<String> set1 = new HashSet<String>();
		set1.add("Red");
		set1.add("Pink");
		set1.add("Green");
		set1.add("Black");
		set1.add("White");
		set1.add("Yellow");
		System.out.println("Frist HashSet : "+set1);
		
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Yellow");
		set2.add("Purple");
		set2.add("Black");
		set2.add("Orange");
		set2.add("Pink");
		System.out.println("Second HashSet : "+set2);
		
		set1.retainAll(set2);
		System.out.println("HashSet content : "+set1);
}
}	