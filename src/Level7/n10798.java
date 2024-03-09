package Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n10798 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char[][]arr=new char[5][15];
		
		for(int i=0; i<5; i++) {
			String st=br.readLine();
			for(int j=0; j<arr.length; j++) {
				arr[i][j]=st.charAt(j);
			}
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int j=0; j<15; j++) {
			for(int i=0; i<5; i++) {
				if(arr[i][j]!='\0')
				sb.append(arr[i][j]);
			}
		}
		
		System.out.println(sb);
	}

}
