package Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1316 {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		
		int N=Integer.parseInt(br.readLine());
		int cnt=0; 
		for(int i=0; i<N; i++) {
			if(check()== true) cnt+=1;
		}
		System.out.println(cnt);
	}
	
	public static boolean check() throws IOException {
		String str= br.readLine();
		boolean []apb=new boolean[26];
		char prev=' ';
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(prev != ch) {
				//해당 문자가 처음 나오는 경우
				if(apb[ch-'a']==false) {
					apb[ch-'a']=true;
					prev=ch;
				}
				else 
					return false;
			}
			//직전 문자와 같은 경우 (연속된 문자인 경우)
			else continue;
		}
		return true;
		
	}

}
