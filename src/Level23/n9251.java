package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n9251 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String a=br.readLine();
		String b=br.readLine();
		int dp[][]=new int[b.length()+1][a.length()+1];
		
		char []ca=new char[a.length()+1];
		char []cb=new char[b.length()+1];
		
		for(int i=1; i<=a.length(); i++) {
			ca[i]=a.charAt(i-1);
		}
		for(int i=1; i<=b.length(); i++) {
			cb[i]=b.charAt(i-1);
		}
		
		for(int i=1; i<=b.length(); i++) {
			for(int j=1; j<=a.length(); j++) {
				if(cb[i]==ca[j]) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		System.out.println(dp[b.length()][a.length()]);

	}

}
