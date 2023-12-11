//01타일
package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n1904 {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int []dp=new int[1000001];
		
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		
		for(int i=3; i<=n; i++) {
			dp[i]=(dp[i-1]+dp[i-2])%15746;
		}
		System.out.println(dp[n]);
	}

}

/*
	타일이 0장 -> 0가지
	타일이 1장 -> 1  1가지
	타일이 2장 -> 00 11  2가지
	타일이 3장 -> 001 100 111 3가지
	타일이 4장 -> 0000 1100 1001 0011 1111 5가지
	타일이 5장 -> 11100 11001	10011 00111 11111 10000 00100 00001 8가지
	
	조건, 출력 값은 2진 수열의 개수를 15746으로 나눈 나머지를 출력
	
*/