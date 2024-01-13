package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n13305 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		long distance[]=new long[n-1];
		long cost[]=new long[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n-1; i++) {
			distance[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			cost[i]=Integer.parseInt(st.nextToken());
		}
		
		long minCost=cost[0];
		long result=0;
		for(int i=1; i<n; i++) {
			result+=(minCost*distance[i-1]);
			if(minCost>cost[i]) {
				minCost=cost[i];
			}
		}
		
		System.out.println(result);

	}

}
