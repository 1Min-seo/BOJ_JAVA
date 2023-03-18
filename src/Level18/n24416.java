package Level18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n24416 {
	public static int fibo(int n) {
		int result=0;
		
		if(n==1 || n==2) return 1;
		else {
			result=fibo(n-1)+fibo(n-2);
			return result;
		}
	}
	
	public static int dp(int n) {
		int []arr=new int[n];
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2; i<n; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		return arr[n-1];
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int result1=fibo(n);
		int result2=dp(n);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
