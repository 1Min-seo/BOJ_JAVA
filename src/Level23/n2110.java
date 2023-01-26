package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2110 {

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
		
		int result=0;
		int start=1;
		int end=arr[N-1]-arr[0];
		while(start<=end) {
			int mid=(start+end)/2;
			int locate=arr[0];
			int cnt=1; //한개는 무조건 포함하고 시작
			for(int i=1; i<N; i++) {
				if(arr[i]-locate>=mid) {
					cnt+=1;
					locate=arr[i];
				}
			}
			//카운트가 제시된 공유기 개수보다 작으면 거리차이를 줄인다.
			if(cnt<C) {
				end=mid-1;
			}
			else {
				result=mid;
				start=mid+1;
			}
		}
		
		System.out.println(result);
	}

}
