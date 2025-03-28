import java.io.*;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
        
		StringBuilder sb = new StringBuilder();
 
		sb.append( (A+B)%C );
		sb.append('\n');
 
		sb.append( (A%C + B%C)%C );
		sb.append('\n');
 
		sb.append( (A*B)%C );
		sb.append('\n');
 
		sb.append( (A%C * B%C)%C );
 
		System.out.println(sb);
 
	}
}