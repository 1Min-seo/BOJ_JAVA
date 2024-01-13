package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class n1758 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		Integer tip[]=new Integer[n];
		
		for(int i=0; i<n; i++) {
			tip[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(tip, Collections.reverseOrder());
		
		long money=0;
		for(int i=0; i<n; i++) {
			if(tip[i]-i<0) {
				continue;
			}
			money+=tip[i]-i;
		}
		
		System.out.println(money);
	}

}
