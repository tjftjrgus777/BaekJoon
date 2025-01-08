import java.io.*;
public class Main{

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        
        if((num%4 ==0 && num%100 != 0) || num%400==0){
            System.out.print('1');
        }else{
            System.out.print('0');
        }
        bf.close();
    }

}