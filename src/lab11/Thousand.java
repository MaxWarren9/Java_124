package lab11;

class Counter {
    int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}

public class Thousand {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counter.increment();
                    }
                }
            });
            threads[i].start();
        }
        for (int i = 0; i < 100; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final count: " + counter.getCount());
    }
}
