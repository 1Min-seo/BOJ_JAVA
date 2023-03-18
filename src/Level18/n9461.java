package Level18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n9461 {
	public static long dp(int n) {
		long []dp=new long[101];
		
		dp[1]=1;
		dp[2]=1;
		dp[3]=1;
		
		//점화식
		for(int i=4; i<=n; i++) {
			dp[i]=dp[i-2]+dp[i-3];
		}
		
		return dp[n];
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		
		for(int i=0; i<tc; i++) {
			int n=Integer.parseInt(br.readLine());
			long result=dp(n);
			
			System.out.println(result);
		}

	}

}

