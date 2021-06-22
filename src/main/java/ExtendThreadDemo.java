public class ExtendThreadDemo extends Thread{
    public ExtendThreadDemo(){
    }
    @Override
    public void run(){
        //编写自己的线程代码
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ExtendThreadDemo ext = new ExtendThreadDemo();
        ext.setName("create thread from extending");
        ext.start();
    }
}
