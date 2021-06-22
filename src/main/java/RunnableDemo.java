public class RunnableDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}


class MyThread implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName()+"-->我是通过实现接口的线程实现方式！");
    }
}
