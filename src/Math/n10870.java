package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n10870 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int []pibo=new int[21];
		
		pibo[0]=0;
		pibo[1]=1;
		
		for(int i=2; i<=n; i++) {
			pibo[i]=pibo[i-1]+pibo[i-2];
		}
		
		System.out.println(pibo[n]);
	}

}
