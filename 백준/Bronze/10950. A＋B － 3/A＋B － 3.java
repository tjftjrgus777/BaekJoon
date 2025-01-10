import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int A = 0;
        int B = 0;
        for(int i=0; i<T; i++){
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);
    
        }
        
        
        
    }
}