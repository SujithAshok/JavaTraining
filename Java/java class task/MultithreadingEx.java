class PrintNumber extends Thread
{
int threadNumber;
public void run(){
for(int i=0; i<3; i++){
System.out.println(threadNumber +" "+ i);
try{
Thread.sleep(1000);
throw new ArrayIndexOutOfBoundsException();
}catch(InterruptedException e){
System.out.println("Interpreted");
}
catch(Exception e){
System.out.println("other Exception" +e);
}
}
}
}
public class MultithreadingEx{
public static void main(String args[]){
for(int i=0; i<3; i++){
PrintNumber obj = new PrintNumber();
obj.threadNumber = i;
obj.start();
}
}
}