package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1912 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int []arr=new int[n];
		int []dp=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int max= -10001;
		dp[0]=arr[0];
		
		for(int i=1; i<n; i++) {
			dp[i]=Math.max(dp[i-1]+arr[i], arr[i]);
		}
		
		for(int i=0; i<n; i++) {
			max=Math.max(max, dp[i]);
		}
		
		System.out.println(max);
	}
		}
	
/*
 * 10	-4	3	1	5	6	-35	12	21	-1
 * 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합 구하기
 * 12+21 = > 33
 * 
 * dp 배열의 값
 * 
 * max(10 + -4 , -4) -> 6
 * max(6+3,3) -> 9
 * max(9+1,1) -> 10
 * 
 * 
 * dp 중에서 제일 큰 값 구하기
 * 이므로 정답은 33이다.
 * 
*/