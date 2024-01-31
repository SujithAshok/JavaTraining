class Copy{

int Voting_Age=18;
String str = "Right Age for vote.";

Copy(){
Voting_Age = 24;
str = "Eligible to vote.";
}

Copy(Copy obj){
System.out.println(Voting_Age +" " +str);
System.out.println(obj.Voting_Age +" "+obj.str);
}

public static void main(String args[])
{
System.out.println("The Copy Constructor values are: ");
Copy obj = new Copy();
new Copy(obj);
}
}

/* A copy constructor in a Java class is a constructor that creates an object using 
another object of the same Java class. That's helpful when we want to copy a complex 
object that has several fields, or when we want to make a deep copy of an existing object. */