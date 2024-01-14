package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n20115 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		double arr[]=new double[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		double total=0;
		
		Arrays.sort(arr);
		double max=arr[n-1];
		
		for(int i=0; i<n-1; i++) {
			total+=(arr[i]/2);
		}
		
		total+=max;
		
		System.out.println(total);
	}

}
