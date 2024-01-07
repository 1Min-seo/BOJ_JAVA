package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2212 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int k=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int house[]=new int[n];
		
		for(int i=0; i<n; i++) {
			house[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(house);
		
		int distance[]=new int[n-1];
		for(int i=0; i<n-1; i++) {
			distance[i]=house[i+1]-house[i];
		}
		
		Arrays.sort(distance);
		
		int sum=0;
		for(int i=0; i<n-k; i++) {
			sum+=distance[i];
		}
		
		System.out.println(sum);

	}

}
