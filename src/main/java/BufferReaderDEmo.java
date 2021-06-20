import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDEmo {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("/Users/liziyang/Downloads/JavaPlayGround/src/main/java/word.txt");
            BufferedReader bufr = new BufferedReader(fr);
            String line = null;
            while((line = bufr.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("file not found");
        }
    }
}
