public class Counter {
    private int count = 0;

    // Synchronized method to ensure thread-safe increment
    public synchronized void increment() {
        count++;
    }

    // Method to get the current count
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        int numberOfThreads = 10;
        Thread[] threads = new Thread[numberOfThreads];

        // Creating multiple threads to increment the counter
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(new CounterTask(counter));
            threads[i].start();
        }

        // Waiting for all threads to finish
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Printing the final count
        System.out.println("Final count: " + counter.getCount());
    }
}

class CounterTask implements Runnable {
    private final Counter counter;

    public CounterTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
