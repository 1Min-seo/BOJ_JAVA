package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n10816 {
	public static int lowerBound(int []arr, int target, int start, int end) {
		while(start<end) {
			int mid=(start+end)/2;
			if(arr[mid]>=target) end=mid+1;
			else start=mid+1;
		}
		return end;
	}
	
	public static int upperBound(int []arr, int target, int start, int end) {
		while(start<end) {
			int mid=(start+end)/2;
			if(arr[mid]>target) end=mid+1;
			else start=mid+1;
		}
		return end;
	}
	
	public static int countByRange(int []arr, int leftValue, int rightValue) {
		int rightIndex=upperBound(arr, rightValue, 0, arr.length);
		int leftIndex=lowerBound(arr, leftValue, 0, arr.length);
		return rightIndex-leftIndex;
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int []my=new int[N]; //상근이가 가지고 있는 카드
		for(int i=0; i<N; i++) {
			my[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(my);
		
		int M=Integer.parseInt(br.readLine());
		int []data=new int[M]; //보기 카드
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			data[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<M; i++) {
			int result=0;
			result=countByRange(my,data[i],data[i]);
			System.out.print(result+" ");
		}
		
	}

}
