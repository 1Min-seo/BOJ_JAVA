package BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2798 {
	static int n;
	static int m;
	static int arr[];
	static int result[];
	static boolean visit[];
	static int max = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		result = new int[n];
		visit = new boolean[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		back(0,0,0);
		System.out.println(max);
	}

	static void back(int depth, int start, int sum) {
		if(depth==3) {
			if(sum<=m) {
				max=Math.max(sum, max);
			}
			return;
		}
		for(int i=start; i<n; i++) {
			if(!visit[i]) {
				visit[i]=true;
				back(depth+1, i+1, sum+arr[i]);
				visit[i]=false;
			}
		}
	}

}
