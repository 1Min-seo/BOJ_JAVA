package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n10816 {
	public static int lowerBound(int []arr, int target, int start, int end) {
		while(start<end) {
			int mid=(start+end)/2;
			
			if(target<=arr[mid]) {
				end=mid;
			}
			else start=mid+1;
		}
		return end;
	}
	
	public static int upperBound(int []arr, int target, int start, int end) {
		while(start<end) {
			int mid=(start+end)/2;
			
			if(target<arr[mid]) {
				end=mid;
			}
			else start=mid+1;
		}
		
		return end;
		
	}
	
	public static int getLength(int lowerBound, int upperBound) {
		int result=upperBound-lowerBound;
		
		return result;
	}
	
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int []my=new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			my[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(my);
		
		int M=Integer.parseInt(br.readLine());
		int []arr=new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<M; i++) {
			int low= lowerBound(my,arr[i],0,my.length);
			int hi=upperBound(my,arr[i],0,my.length);
			int result=getLength(low,hi);
			
			sb.append(result).append(' ');
		}
		
		System.out.println(sb);
	}

}
