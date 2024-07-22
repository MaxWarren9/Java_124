package lab11;

public class Ten {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new RunnableTask(), "Thread-" + i);
            System.out.println(thread.getName() + " state before start: " + thread.getState());
            thread.start();
            System.out.println(thread.getName() + " state after start: " + thread.getState());
        }
    }
}

class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " state during run: " + Thread.currentThread().getState());
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " state after completion: " + Thread.currentThread().getState());
    }
}
