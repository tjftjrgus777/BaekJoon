import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n <= 100 && n >= 90){
            System.out.print("A");
        }else if(n <= 89 && n >= 80){
            System.out.print("B");
        }else if(n <= 79 && n >= 70){
            System.out.print("C");
        }else if(n <= 69 && n >= 60){
            System.out.print("D");
        }else{
            System.out.print("F");
        }     
    }
}