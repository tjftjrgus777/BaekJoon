import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(bf.readLine());
        
        int minus = result - 543;
        
        System.out.print(minus);
        
        
    }
}