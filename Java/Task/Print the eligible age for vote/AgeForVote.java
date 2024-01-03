import java.util.*;
class AgeForVote
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int ageForVote = sc.nextInt();
final int EligibleAge = 18;

//if-else statement
if(ageForVote > EligibleAge)
{
System.out.println("They are Eligible to vote");
}
else if(ageForVote == EligibleAge)
{
System.out.println("They can also Eligible to vote");
}
else
{
System.out.println("They are not Eligible to vote");
}

//Switch statement
switch(ageForVote)
{
case 18:
System.out.println("They are Eligible to vote");
break;

default:
System.out.println("Default Error");
break;
}

//Ternary operator
String Result = ageForVote >= EligibleAge ? "Eligible to vote" : "Not Eligible to vote" ;
System.out.println(Result);
}
}