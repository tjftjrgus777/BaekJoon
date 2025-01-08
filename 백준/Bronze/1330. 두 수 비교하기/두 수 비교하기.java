import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        StringTokenizer st = new StringTokenizer(s);
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        if(A>B){
            System.out.print('>');
        }else if(A<B){
            System.out.print('<');
        }else if(A==B){
            System.out.print("==");
        }
    }
}