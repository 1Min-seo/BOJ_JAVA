package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1932  {
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int [][]arr=new int[n][n];
		int [][]dp=new int[n][n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0; j<=i; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			dp[n-1][i]=arr[n-1][i];
		}
		
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				dp[i-1][j]=Math.max(dp[i][j]+arr[i-1][j],dp[i][j+1]+arr[i-1][j]);
			}
		}
		
		System.out.println(dp[0][0]);
	}
}

/*
					7
				3		8
			8		1		0
		2		7		4		4
	4		5		2		6		5
					
					
					30					(0,0)
				23		21				(1,0)(1,1)	
			20		13		10			(2,0)(2,1),(2,2)
		7		12		10		10		(3,0) --- ---	
	4		5		2		6		5
	
*/