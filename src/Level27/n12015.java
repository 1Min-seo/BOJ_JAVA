package Level27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n12015 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int A[]=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		
		int LIS[]=new int[N];
		LIS[0]=A[0];
		
		for(int i=1; i<N; i++) {
			if(A[i]>LIS[i-1]) {
				LIS[i]=A[i];
			}else {
				
			}
		}

	}

}
