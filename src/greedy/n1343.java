package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1343 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		String[] arr=str.split("\\.");
		StringBuilder sb=new StringBuilder();
		
		if(arr.length==0) {
			System.out.println(str);
			return;
		}
		
		for(int i=0; i<arr.length; i++) {
			int p=arr[i].length();
			
			while(p!=0) {
				if(p>=4) {
					sb.append("AAAA");
					p-=4;
				}else {
					sb.append("BB");
					p-=2;
				}
				
				if(p%2!=0 || p<0) {
					System.out.println("-1");
					return;
				}
			}	
			if(i<arr.length-1) {
				sb.append(".");
			}else break;
		}
		System.out.println(sb);

	}

}