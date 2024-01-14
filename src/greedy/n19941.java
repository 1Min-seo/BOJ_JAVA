package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n19941 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		String str=br.readLine();
		char ch[]=new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			ch[i]=str.charAt(i);
		}
		
		int cnt=0;
		for(int i=0; i<ch.length; i++) {
			for(int j=k; j>=1; j--) {
				if(ch[i]=='P') {
					if((i-j)>=0 && ch[i-j]=='H') {
						cnt+=1;
						ch[i-j]='0';
						continue;
					}else if((i+j)<n && ch[i+j]=='H') {
						cnt+=1;
						ch[i+j]='0';
						continue;
					}else continue;
				}
			}
		}
		System.out.println(cnt);
	}
}