package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1080 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		
		for(int i=0; i<n; i++) {
			String str=br.readLine();
			for(int j=0; j<m; j++) {
				a[i][j]=str.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<n; i++) {
			String str=br.readLine();
			for(int j=0; j<m; j++) {
				b[i][j]=str.charAt(j)-'0';
			}
		}
		
		int cnt=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i][j]!= b[i][j] && i+2<n && j+2<m) {
					for(int c=0; c<3; c++) {
						for(int r=0; r<3; r++) {
							if(a[i+r][j+c]==0) a[i+r][j+c]=1;
							else a[i+r][j+c]=0;
						}
					}
					cnt+=1;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i][j]!=b[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(cnt);

	}

}
