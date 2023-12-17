package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1463 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int dp[]=new int[n+1];
		
		dp[1]=0;
		
		if(n>1) {
			dp[2]=1;
		}
		
		for(int i=3; i<=n; i++) {
			if(i%6==0) {
				dp[i]=Math.min(Math.min(dp[i/2],dp[i/3]),dp[i-1])+1;
			}else if(i%3==0) {
				dp[i]=Math.min(dp[i/3], dp[i-1])+1;
			}else if(i%2==0) {
				dp[i]=Math.min(dp[i/2], dp[i-1])+1;
			}else {
				dp[i]=dp[i-1]+1;
			}
		}
		
		System.out.println(dp[n]);
		
	}

}
