package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2156 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int dp[]=new int[n+1];
		int now[]=new int[n+1];
		
		for(int i=1; i<=n; i++) {
			now[i]=Integer.parseInt(br.readLine());
		}
		dp[0]=0;
		dp[1]=now[1];
		
		if(n>=2) {
			dp[2]=now[1]+now[2];
		}
		
		for(int i=3; i<=n; i++) {
			dp[i]=Math.max(Math.max(dp[i-2]+now[i], now[i-1]+dp[i-3]+now[i]),dp[i-1]);
		}
		
		for(int i=1; i<=n; i++) System.out.println(dp[i]);
	}

}
