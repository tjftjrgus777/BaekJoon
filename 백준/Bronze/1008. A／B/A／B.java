import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        
        System.out.print(A/B);
        
        
        
    }
}