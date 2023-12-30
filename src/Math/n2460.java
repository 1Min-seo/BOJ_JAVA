package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2460 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int people=0;
		int result=0;
		
		for(int i=1; i<=10; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			
			people+=(-n+m);
			result=Math.max(result, people);
		}
		
		System.out.println(result);

	}

}
