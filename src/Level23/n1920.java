package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n1920 {
	
	public static int binarySearch(int []arr, int target, int start, int end) {
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) return 1;
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
		}
		return 0;
	}

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int []arr1=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr1[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr1);
		
		int M=Integer.parseInt(br.readLine());
		int []arr2=new int[M];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			arr2[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<M; i++) {
			int result=-1;
			result= binarySearch(arr1,arr2[i] ,0,N-1);
			System.out.println(result);
		}
		
	}

}
