package Level27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2110 {
	public static int binarySearch(int []arr, int start, int end, int target) {
		
		while(start<end) {
			int mid=(start+end)/2;
			
			if(install(mid,arr)<target) {
				end=mid;
			}else{
				start=mid+1;
			}
		}
		return start-1;
	}
	
	public static int install(int mid, int []arr) {
		int cnt=1;
		int lastLocate=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]-lastLocate>=mid) {
				cnt+=1;
				lastLocate=arr[i];
			}
		}
		return cnt;
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());
		int []arr=new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int result=binarySearch(arr, 1, arr[N-1]+1, C);
		
		System.out.println(result);
		
	}

}
