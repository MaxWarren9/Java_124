package lab11;

class NamePrinter implements Runnable {
    private String name;
    private static final Object lock = new Object();
    private static boolean isFirstThreadTurn = true;

    public NamePrinter(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                while ((name.equals("Thread-1") && !isFirstThreadTurn) ||
                        (name.equals("Thread-2") && isFirstThreadTurn)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(name);
                isFirstThreadTurn = !isFirstThreadTurn;
                lock.notifyAll();
            }
        }
    }
        public static void main(String[] args) {
            Thread thread1 = new Thread(new NamePrinter("Thread-1"));
            Thread thread2 = new Thread(new NamePrinter("Thread-2"));
            thread1.start();
            thread2.start();
        }
    }