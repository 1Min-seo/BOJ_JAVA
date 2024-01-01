package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2693 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		
		for(int i=0; i<tc; i++) {
			int arr[]=new int[10];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<10; j++) {
				arr[j]=Integer.parseInt(st.nextToken());
			}		
			Arrays.sort(arr);
			System.out.println(arr[7]);
		}
		
	}

}
