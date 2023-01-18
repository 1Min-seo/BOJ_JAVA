package Level19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n13305 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		long []dist=new long[N-1];
		long []cost=new long[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<N-1; i++) {
			dist[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			cost[i]=Integer.parseInt(st.nextToken());
		}
		
		long minCost = cost[0];
		long result=0;
		for(int i=0; i<cost.length-1; i++) {
			if(minCost>cost[i]) {
				minCost=cost[i];
			}
			result+=dist[i]*minCost;
		}
		System.out.println(result);
	}

}
