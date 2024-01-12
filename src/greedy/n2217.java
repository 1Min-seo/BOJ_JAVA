package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n2217 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());

		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int result=Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			result=Math.max(result, arr[i]*(n-i));		
		}
		System.out.println(result);
		
	}

}
