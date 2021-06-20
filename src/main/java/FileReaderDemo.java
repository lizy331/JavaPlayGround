import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        //读取每个字符，返回 一个 int，
        try{
            java.io.FileReader fin = new java.io.FileReader("/Users/liziyang/Downloads/JavaPlayGround/src/main/java/word.txt");
            int n;
            while((n=fin.read())!=-1){
//                System.out.println(n);
            }
            fin.close();
        }catch(IOException e){
            System.out.println("file not found");
        }

        //读取字符到数组中，然后将数组打印
        try{
            java.io.FileReader fin = new java.io.FileReader("/Users/liziyang/Downloads/JavaPlayGround/src/main/java/word.txt");
            char[] ch = new char[10];
            fin.read(ch);
            for(char c : ch){
                System.out.print(c);
            }
            fin.close();
        }catch(IOException e){
            System.out.println("file not found");
        }
    }
}
