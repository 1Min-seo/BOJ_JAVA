package Level27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n1920 {
	
	public static int binarySearch(int []my,int key) {
		int lo=0;
		int hi=my.length-1;
		
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			
			if(my[mid]==key) {
				return 1;
			}else if(my[mid]>key) {
				hi=mid-1;
			}else if(my[mid]<key){
				lo=mid+1;
			}
		}
		return 0;
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int []my=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			my[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(my);
		
		int M=Integer.parseInt(br.readLine());
		int []arr=new int[M];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<M; i++) {
			System.out.println(binarySearch(my,arr[i]));
		}
	}
}
