class StringBuilt
{
public static void main(String args[])
{
//String function using charAt()
	String str1 = "Java Programming";
	System.out.println("The value of charAt(): " +str1.charAt(2)); 
	System.out.println("\n");
	
//codePointAt()
	String str2 = "Hello";
	int result1 = str2.codePointAt(0);
	System.out.println("The value of codePointAt(): " +result1); 
	System.out.println("\n");

//codePointBefore
	String str3 = "Hello";
	int result2 = str3.codePointBefore(1);
	System.out.println("The value of codePointBefore(): " +result2);
	System.out.println("\n");
	
//codePointCount
	String str4 = "Hello";
    int result3 = str4.codePointCount(0, 5);
    System.out.println("The value of codePointCount(): " +result3); 
	System.out.println("\n");
	
//concat()
	String firstName = "Sujith ";
	String lastName = "Ashok";
	String name = firstName.concat(lastName);
	System.out.println("The value of concat(): " +name); 
	System.out.println("\n");

//contains()
	String str5 = "Hello";	
	System.out.println("The value of contains(): ");
	System.out.println(str5.contains("Hel"));   
	System.out.println(str5.contentEquals("e")); 
	System.out.println(str5.contains("Hi"));	
	System.out.println("\n");	
	
//contentEquals
	String str6 = "Hello";
	System.out.println("The value of contentEquals(): ");
	System.out.println(str6.contentEquals("Hello"));      
	System.out.println(str6.contentEquals("Hi"));   
	System.out.println("\n");

//copyValueOf()
	char[] str7 = {'H', 'e', 'l', 'l', 'o'};
	String str8 = "";
	str8 = str8.copyValueOf(str7, 0, 5);
	System.out.println("The value of copyValueOf(): ");
	System.out.println("Returned String: " + str8);
	System.out.println("\n");
	
//endsWith()
	String str9 = "Hello";
	System.out.println("The value of endsWith(): ");
	System.out.println(str9.endsWith("Hel"));   
	System.out.println(str9.endsWith("llo"));   
	System.out.println(str9.endsWith("o")); 
	System.out.println("\n");
	
//startWith()
	String str10 = "Hello";
	System.out.println("The value of startWith(): ");
	System.out.println(str10.endsWith("Hel"));   
	System.out.println(str10.endsWith("llo"));   
	System.out.println(str10.endsWith("o")); 
	System.out.println("\n");

//equals()
	String str11 = "Hello";
	String str12 = "Hello";
	String str13 = "Another String";
	System.out.println("The value of equals(): ");
	System.out.println(str11.equals(str12)); 
	System.out.println(str11.equals(str13));
	System.out.println("\n");
	
//equalsIngoreCase()
	String str14 = "Hello";
	String str15 = "HELLO";
	String str16 = "Another String";
	System.out.println("The value of equalsIgnoreCase(): ");
	System.out.println(str14.equalsIgnoreCase(str15)); 
	System.out.println(str14.equalsIgnoreCase(str16)); 
	System.out.println("\n");
	
//format()
	String str17 = "Java"; 
    String formatStr = String.format("Language: %s", str17);
	System.out.println("The value of format(): ");
    System.out.println(formatStr);
	System.out.println("\n");
	
//indexOf()
	String str18 = "Hello planet earth, you are a great planet.";
	System.out.println("The value of indexOf(): ");
	System.out.println(str18.lastIndexOf("earth"));
	System.out.println("\n");

//lastIndexOf()
	String str19 = "Hello planet earth, you are a great planet.";
	System.out.println("The value of lastIndexOf(): ");
	System.out.println(str19.lastIndexOf("planet"));
	System.out.println("\n");

//isEmpty()
	String str20 = "Hello";
	String str21 = "";
	System.out.println("The value of isEmpty(): ");
	System.out.println(str20.isEmpty());
	System.out.println(str21.isEmpty());
	System.out.println("\n");

//length()
	String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	System.out.println("The value of length(): ");
	System.out.println(txt.length());
	System.out.println("\n");

//replace()
	String str22 = "Hello";
	System.out.println("The value of replace(): ");
	System.out.println(str22.replace('l', 'p'));
	System.out.println("\n");

//replaceFirst
	String str23 = "aabbaaac";
      String regex = "\\d+";
	  System.out.println("The value of replaceFirst(): ");
      System.out.println(str23.replaceFirst("aa", "zz"));
	  System.out.println("\n");
	 
//replaceAll()
	String str24 = "Java123is456fun";
    String regex1 = "\\d+";
	System.out.println("The value of replaceAll(): ");
    System.out.println(str24.replaceAll(regex, " "));
	System.out.println("\n");

//matches()
	String regex2 = "^J..a$";  //  a regex pattern for four letter string that starts with 'J' and end with 'a'
	System.out.println("The value of matches(): ");
    System.out.println("Java".matches(regex));
	System.out.println("\n");

//subString()
	 String str25 = "java is fun";
    // extract substring from index 0 to 3
	System.out.println("The value of subString(): ");
    System.out.println(str25.substring(0, 4));
	System.out.println("\n");

//toCharArray
	String str26 = "Java Programming";
    char[] res;
    res = str26.toCharArray();
	System.out.println("The value of toCharArray(): ");
    System.out.println(res);
	System.out.println("\n");
	
//trim()
	String str27 = "       Hello World!       ";
	System.out.println("The value of trim(): ");
	System.out.println(str27);
	System.out.println(str27.trim());
	System.out.println("\n");

//join
	String str28 = "I";
    String str29 = "love";
    String str30 = "Java";
    // join strings with space between them
    String joinedStr = String.join(" ", str28, str29, str30);
	System.out.println("The value of join(): ");
    System.out.println(joinedStr);
	System.out.println("\n");

//valueOf()
	 double interest = 923.234d;
    // convert double to string
	System.out.println("The value of valueOf(): ");
    System.out.println(String.valueOf(interest));
	System.out.println("\n");

//toString
	 Integer number=10;
        // Calling the toString() method as a function of the Integer variable
		System.out.println("The value of toString(): ");
        System.out.println( number.toString() );
		System.out.println("\n");

//split()
	String text = "Java is a fun programming language";
    // split string from space
	System.out.println("The value of split(): ");
    String[] res1 = text.split(" ");
    System.out.print("res1 = ");
    for (String Str : res1) {
      System.out.print(Str + ", "); }
	  System.out.println("\n");

//toUpperCase()
	String txt1 = "Hello World";
	System.out.println("The value of toUpperCase(): ");
	System.out.println(txt1.toUpperCase());
	System.out.println("\n");
	
//toLowerCase()
	String txt2 = "Hello World";
	System.out.println("The value of toLowerCase(): ");
	System.out.println(txt2.toLowerCase());
}
}