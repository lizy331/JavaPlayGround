public class SyncronizedDemo {
    public static void main(String[] args) {
        // 由于 SyncThread 中的 count 为 static类型，所以所有SyncThread class 中的 count 都是同步的
        Thread thread1 = new Thread(new SyncThread(), "SyncThread1");
        Thread thread2 = new Thread(new SyncThread(), "SyncThread2");
        thread1.start();
        thread2.start();

    }
}

class SyncThread implements Runnable {
    // 由于 SyncThread 中的 count 为 static类型，所以所有SyncThread class 中的 count 都是同步的
    private static int count;

    public SyncThread() {
        count = 0;
    }

    public  void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount() {
        return count;
    }
}

