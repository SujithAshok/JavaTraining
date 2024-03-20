class PriorityPrinters implements Runnable {
    private int priority;

    public PriorityPrinters(int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println("Thread with priority " + priority + " is running.");
    }
}

public class Mains {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new PriorityPrinters(i));
            thread.setPriority(i);
            thread.start();
        }
    }
}
