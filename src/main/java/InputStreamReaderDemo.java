import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        try{
            InputStream ir = new FileInputStream("/Users/liziyang/Downloads/JavaPlayGround/src/main/java/word.txt");
            InputStreamReader isr = new InputStreamReader(ir);
            BufferedReader bufr = new BufferedReader(isr);
            String line = null;
            while((line = bufr.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("file not found");
        }
    }
}
