import java.io.FileNotFoundException;
import java.io.IOException;

public class exceptionHandle {
    public static void throwException() throws IOException {
        throw new IOException();
    }
    // demo of catch the superclass of the thrown exception
    public static void main(String[] args){
        try{
            throwException();
            //使用IOException 的父类进行 catch
        }catch(Exception e) {
            System.out.println("Exception catched");
        }

    }
}
