class ABC{

ABC(){
System.out.println("hello world");
}

ABC(int x){
System.out.println(x);
}

ABC(String a){
System.out.println(a);
}

ABC(String str, String tr){
System.out.println(str +" "+ tr);
}

ABC(String b, int c){
System.out.println(b +" "+ c);
}

ABC(int s, int d, int f){
System.out.println(s+" "+d+" "+f);
}

public static void main(String args[]){
System.out.println("The Constructor values are: ");
ABC obj = new ABC();
ABC obj1 = new ABC(5);
ABC obj2 = new ABC("Sujith");
ABC obj3 = new ABC("SUJITH", "ASHOK");
ABC obj4 = new ABC("ASHOK", 56);
ABC obj5 = new ABC(24,28,58);
}
}