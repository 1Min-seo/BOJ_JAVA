package BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10819 {
	static int n;
	static int []arr;
	static boolean []visit;
	static int []result;
	static int max=Integer.MIN_VALUE;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		visit=new boolean[n];
		result=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		back(0);
		System.out.println(max);
	}

	static void back(int depth) {
		if(depth==n) {
			int sum=0;
			for(int i=0; i<n-1; i++) {
				sum+=Math.abs(result[i]-result[i+1]);
			}
			max=Math.max(sum, max);
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {
				visit[i]=true;
				result[depth]=arr[i];
				back(depth+1);
				visit[i]=false;
			}
		}
	}

}
