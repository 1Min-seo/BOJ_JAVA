package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class n11047 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		Integer coinType[]=new Integer[n];
		for(int i=0; i<n; i++) {
			coinType[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(coinType,Collections.reverseOrder());
		
		int result=0;
		for(int i=0; i<n; i++) {
			if(k==0) break;
			if(coinType[i]<=k) {
				result+=(k/coinType[i]);
				k%=coinType[i];
				continue;
			}
		}
		
		System.out.println(result);
	}

}
