package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2581 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int sum=0;
		int min=n+1;
		
		for(int i=m; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				if(i==1) break;
				if(i==j) {
					min=Math.min(i, min);
					sum+=i;
				}
				if(i%j==0)break;
			}
		}
		
		if(sum==0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

}
