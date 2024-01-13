package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n11399 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int sum=0;
		int result=0;
		
		for(int i=0; i<n; i++) {
			sum+=arr[i];
			result+=sum;
		}
		
		System.out.println(result);
	}

}
