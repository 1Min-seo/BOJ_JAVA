package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class n11508 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		Integer price[]=new Integer[n];
		
		for(int i=0; i<n; i++) {
			price[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(price, Collections.reverseOrder());
		
		long result=0;
		
		for(int i=0; i<n; i++) {
			if(i%3==2) continue;
			result+=price[i];
		}
		
		System.out.println(result);
	}

}
