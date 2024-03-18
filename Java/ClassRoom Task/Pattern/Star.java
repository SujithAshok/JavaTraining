import java.util.*;
class Star
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the no.of rows: ");
int num = sc.nextInt();
for(int i=1; i<=num; i++)
{
for(int j=1; j<=i; j++)
{
	System.out.print("*");
}
System.out.println();
}

System.out.print("\n");

//Reverse Star
for(int i=num; i>=1; i--){
	for(int j=1; j<=i; j++){
		System.out.print("*");
	}
	System.out.println();
}

System.out.println("\n");

//Letter L
 for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 || i == num  ) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
			 System.out.println();
        }
		System.out.println();
			
System.out.println("\n");
			
//Letter T
for (int i = 1; i <=num; i++) {
    for (int j = 1; j <=num; j++) {
    if (i == 1 || j == num / 2)
    System.out.print("*");
    else
    System.out.print(" ");
    }
    System.out.println();
    }

System.out.println("\n");

//Letter Z
for (int i = 1; i <=num; i++) {
   if (i == 1 || i == num) {
     for (int j = 1; j <=num; j++) {
     System.out.print("#");
     }
     } else {
     for (int j = 1; j <=num - i ; j++) {
     System.out.print(" ");
     }
     System.out.print("#");
     }
     System.out.println();
     }
	 
System.out.println("\n");


//Odd-Star Triangle
 for (int i = 1; i <= num; i++) {
     for (int j = 1; j <= num - i; j++) {
          System.out.print(" ");
     }
     for (int k = 1; k <= 2 * i - 1; k++) {
         System.out.print("*");
     }
     System.out.println();
     }
	
System.out.print("\n");
	
//Sequence Star Triangle
for(int i=1; i<=num; i++){
	for(int j=i; j<=num; j++){
		System.out.print(" ");
	}
	for(int j=1; j<=i; j++){
		System.out.print(" *");
	}
	for(int j=2; j<=i; j++){
		System.out.print(" ");
	}
	System.out.println();
}

System.out.print("\n");

//Left-side Star Triangle
 for (int i = 1; i <=num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		
System.out.print("\n");

//Right-side Star Triangle
 for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
System.out.print("\n");

//Reverse Right-side Star Triangle
for (int i = 1; i <=num; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=num - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
}