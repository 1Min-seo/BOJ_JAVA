package Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2566 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[][]=new int[9][9];
		int max=0;
		int r=0,c=0;
		for(int i=0; i<arr.length; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				if(max<arr[i][j]) {
					max=arr[i][j];
					r=i;
					c=j;
				}
			}
		}
		
		System.out.println(max);
		System.out.printf((r+1)+" "+(c+1));
		
	}

}
