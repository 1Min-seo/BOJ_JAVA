package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n21758 {
	static int n;
	static int[] honeys;
	static long maxCnt;
	
	static long total;
	static long[] RightTotal;
	static long[] leftTotal;

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		honeys=new int[n];
		for(int i=0; i<n; i++) {
			honeys[i]=Integer.parseInt(st.nextToken());
		}
		
		
		
	}
	
	//벌 벌 꿀
	static void case1() {
		long bee1, bee2;
		
		for(int i=1; i<=n-2; i++) {
			bee1=total-honeys[n-1]-honeys[i];
		}
	}
	
	//꿀 벌 벌
	static void case2() {
		
	}
	
	//벌 꿀 벌
	static void case3() {
		
	}

}
