package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2579 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int []step=new int[n+1];
		int []dp=new int[n+1];
		
		for(int i=1; i<=n; i++) {
			step[i]=Integer.parseInt(br.readLine());
		}
		
		dp[0]=0;
		dp[1]=step[1];
		
		//n의 값이 1일 경우 예외처리
		if(n>=2) {
			dp[2]=step[1]+step[2];
		}
		
		for(int i=3; i<=n; i++) {
			dp[i]=Math.max(dp[i-2],dp[i-3]+step[i-1])+step[i];
		}
		
		System.out.println(dp[n]);
	}

}

/*		 1	2	3	4	5	6					*
 * 시작	10	20	15	25	10	20
 * 
 * dp[0] 0
 * dp[1] 10				
 * dp[2] 10+20			
 * dp[3] 10+15	20+15	
 * dp[4] 10+20+25	10+15+25	
 * dp[5] 10+20+25+10	20+15+10
 */
