package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n2668 {
	static int n;
	static int[]arr1;
	static int[]arr2;
	static boolean visited[];
	static int cnt;
	static int result[];
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		
		n=Integer.parseInt(br.readLine());
		arr1=new int[n+1];
		arr2=new int[n+1];
		visited=new boolean[n+1];
		
		for(int i=1; i<n+1; i++) arr1[i]=i;
		for(int i=1; i<n+1; i++) arr2[i]=Integer.parseInt(br.readLine());
		
		cnt=0;
		while(true) {
			for(int i=1; i<n+1; i++) {
				for(int j=1; j<n+1; j++) {
					if(arr1[i]==arr2[i]) {
						visited[i]=true;
						cnt+=1;
					}else {
						if(!visited[j]) {
						arr1[j]=	
					}
				}
			}
		}
	}
}
}
