public class Numbers {
    private int limit;

    public Numbers(int limit) {
        this.limit = limit;
    }

    public void printEven() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100); // Adding delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printOdd() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100); // Adding delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int limit = 20; // Specify the limit here
        Numbers printer = new Numbers(limit);

        Thread evenThread = new Thread(printer::printEven);
        evenThread.setName("Even Thread");

        Thread oddThread = new Thread(printer::printOdd);
        oddThread.setName("Odd Thread");

        evenThread.start();
        oddThread.start();
    }
}
