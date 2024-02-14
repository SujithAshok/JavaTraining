public class CommandLine
 {
    public static void main(String[] args) 
	{
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        if (age >= 18) 
		{
            System.out.println(name + " is eligible to vote");
        } else {
            System.out.println(name + " is not eligible to vote");
        }
    }
}
