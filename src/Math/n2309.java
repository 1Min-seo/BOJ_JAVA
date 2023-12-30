package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n2309 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int []arr=new int[9];
		int sum=0;
		
		for(int i=0; i<9; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		
		Arrays.sort(arr);
		int fake[]=new int[2];
		
		for(int i=1; i<9; i++) {
			for(int j=0; j<i; j++) {
				if(sum-arr[i]-arr[j]==100){
					fake[0]=arr[i];
					fake[1]=arr[j];
				}
			}
		}
		
		for(int i=0; i<9; i++) {
			if(arr[i]==fake[0] || arr[i]==fake[1]) continue;
			else System.out.println(arr[i]);
		}
	}

}
