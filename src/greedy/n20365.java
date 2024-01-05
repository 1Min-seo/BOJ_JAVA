package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n20365 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int n=Integer.parseInt(br.readLine());
			int day[]=new int[n];
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0; i<n; i++) {
				day[j]=Integer.parseInt(st.nextToken());
			}
			
			int sum=0;
			int result=0;

			for(int x=1; x<n; x++) {
				for(int y=0; y<i; y++) {
					if(day[x]>day[y]) {
						sum+=day[x]-day[y];
					}
					result=Math.max(sum, result);
				}
			}
			System.out.println(result);
		}
	}

}
