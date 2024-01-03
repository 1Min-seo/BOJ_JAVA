package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1292 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		
		int []arr=new int[10002];
		int cnt=1;
		
		for(int i=1; i<10001; i++) {
			for(int j=0; j<i; j++) {
				if(cnt==10001) break;
				arr[cnt]=i;
				cnt++;
			}
		}
		
		int sum=0;
		
		for(int i=a; i<=b; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
/*
 * 1223334444
 *   23334
 */
