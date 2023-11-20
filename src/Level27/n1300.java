package Level27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n1300 {
	public static int binarySearch(int lo, int N, int k) {
		int hi=k;
		
		while(lo<hi) {
			int mid=(lo+hi)/2;
			int cnt=0;
			
			for(int i=1; i<=N; i++) {
				cnt+=Math.min(mid/i, N);
			}
			
			if(k<=cnt) {
				hi=mid;
			}else {
				lo=mid+1;
			}
		}
		return lo;
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int k=Integer.parseInt(br.readLine());
		
		int result=binarySearch(1,N,k);
		
		System.out.println(result);
		
	}

}
