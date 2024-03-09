package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n20300 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		long t[]=new long[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			   t[i] = Long.parseLong(st.nextToken());
		}
             
		Arrays.sort(t);
		
		long result=0;
		
		if(n==1) {
			System.out.println(t[0]);
			return;
		}
		if(n>1) {
			if(n%2==0) {
				for(int i=0; i<n/2; i++) {
					result=Math.max(result, t[i]+t[n-1-i]);
				}
			}else {
				for(int i=0; i<n/2; i++) {
					result=Math.max(t[n-1], t[i]+t[n-2-i]);
				}
			}
		}
		System.out.println(result);
	}

}

