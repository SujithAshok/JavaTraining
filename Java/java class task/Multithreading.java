class Printnumber extends Thread
{
	int threadNumber;
	
	public Printnumber(int i){
		threadNumber = i;
	}
public void run()
{
for(int i=0; i<3; i++){
System.out.println(threadNumber +" " +i);
try{
	Thread.sleep(1000);
}catch(InterruptedException e){
	System.out.println("Interpreted");
}
}
}
}
public class Multithreading
{
public static void main(String args[])
{
for(int i=0; i<2; i++){
Printnumber obj = new Printnumber(i);
obj.run();
}
}
}