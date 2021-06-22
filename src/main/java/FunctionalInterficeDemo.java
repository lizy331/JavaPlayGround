public class FunctionalInterficeDemo {
    public static void main(String[] args) {
        //使用 lambda expression 实现 sayMessage 方法
        GreetingService greet = message -> System.out.println("hello " + message);
        greet.sayMessage("lizy");
    }
}

@FunctionalInterface
interface GreetingService
{
    //定义 abstract method
    void sayMessage(String message);
}
