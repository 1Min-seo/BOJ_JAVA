package Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class n25305 {

	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		
		for(int i=0; i<N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(arr);
		
		System.out.println(arr.get(N-K));
	}

}
