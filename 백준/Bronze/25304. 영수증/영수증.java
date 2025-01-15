import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(bf.readLine());
        int N = Integer.parseInt(bf.readLine());
        int a =0;
        int b =0;
        int sum =0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum += a*b;
        }
        if(X==sum){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
      
    }
}