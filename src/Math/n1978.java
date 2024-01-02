package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1978 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt=0;
		
		for(int i=0; i<n; i++) {
			int num=Integer.parseInt(st.nextToken());
			if(num==1) continue;
			for(int j=2; j<=num; j++) {
				if(j==num) cnt++;
				
				if(num%j==0) break;
			}
		}
		
		
		
		System.out.println(cnt);
	}

}
