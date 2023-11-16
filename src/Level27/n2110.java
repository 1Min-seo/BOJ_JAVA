package Level27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2110 {
	
	public static int binarySearch(int []arr, int start, int end, int cnt) {
		while(start<end) {
			int result=1;
			int mid=(start+end)/2;
			int before=arr[0];	
			for(int i=1; i<arr.length; i++) {
				 if(arr[i]-before>=mid){
					result+=1;
					before=arr[i];
				}
			}
			if(result<cnt) {
				end=mid;
			}
			else start=mid+1;	
		}
		
		return end-1;
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

/*
1   2   8   4   9

1   2   4   8   9
*		*	*
*		*		*

가장 거리가 짧은 경우  1
가장 거리가 긴   경우  8

최소 거리 4인 경우

첫 번째 집	  1
2-1  안됨
4-1  안됨
8-1  됨
9-8  안됨


가장 거리가 짧은 경우  1
가장 거리가 긴   경우  3
최소 거리가 2
2-1  안됨
4-1  됨
8-4  됨


1) 첫 번째 집은 무조건 카운트를 한다
2) 비교했을 때 최소 거리보다 커야한다.
3) 최소 거리보다 큰 경우 또 한번 카운트
4) 직전 집을 다시 초기화
5) 카운트가 부족한 경우 최소 거리 줄인다.
6) 카운트가 C보다 큰 경우 최소 거리를 늘린다.

*/