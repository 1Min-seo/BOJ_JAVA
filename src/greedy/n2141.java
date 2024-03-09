package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class n2141 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int position[]=new int[n];
		int people[]=new int[n];
		
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			position[i]=Integer.parseInt(st.nextToken());
			people[i]=Integer.parseInt(st.nextToken());
		}
		
		int sum=0;
		int result=0;
		int min=Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			sum=0;
			for(int j=0; j<n; j++) {
				sum+=(Math.abs(position[i]-position[j]))*people[j];
			}
			result=Math.min(min, sum);
			
			int result_min=result;
			result_min=Math.min(result, result_min);
			
		}
		
		
	}

}
