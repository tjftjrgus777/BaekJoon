import java.util.*;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String result = sc.nextLine();
        String d[]  = result.split(" ");
        Long sum = 0L;
        for (int i=0; i<d.length; i++){
            sum += Long.parseLong(d[i]);
        };
        System.out.print(sum);
    }
}