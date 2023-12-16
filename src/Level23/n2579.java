package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class n2579 {

	public static void main(String[] args)throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int []score=new int[n+1];
		int []dp=new int[n+1];
		
		for(int i=1; i<=n; i++) {
			score[i]=Integer.parseInt(br.readLine());
		}
		
		dp[0]=0;
		dp[1]=score[1];
		
		if(n>=2) {
			dp[2]=score[1]+score[2];
		}
		
		for(int i=3; i<=n; i++) {
			dp[i]=Math.max(dp[i-2], score[i-1]+dp[i-3])+score[i];
		}
		
		System.out.println(dp[n]);
		
	}
}
