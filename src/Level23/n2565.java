package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class n2565 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int [][]wire=new int[n][2];
		int []dp=new int[n];
		
		
		for(int i=0; i<n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			wire[i][0]=Integer.parseInt(st.nextToken());
			wire[i][1]=Integer.parseInt(st.nextToken());
			
			dp[i]=1;
		}
		
		Arrays.sort(wire, new Comparator<int[]>(){
			@Override
			public int compare(int []o1, int[]o2) {
				return o1[0]-o2[0];
			}
		});

		int max=-1;
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(wire[i][1]>wire[j][1] && dp[i]<=dp[j]) {
					dp[i]=Math.max(dp[j], 1)+1;
				}
			}
			max=Math.max(max, dp[i]);
		}
		
		System.out.println(n-max);
	}

}
