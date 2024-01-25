package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class n2668 {
	static int n;
	static int arr[];
	static boolean visited[];
	static ArrayList<Integer> list;
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		n=Integer.parseInt(br.readLine());
		arr=new int[n+1];
		visited=new boolean[n+1];
		list=new ArrayList<Integer>();
		
		for(int i=1; i<n+1; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=1; i<n+1; i++) {
			if(!visited[i]) {
				visited[i]=true;
				dfs(i,i);
				visited[i]=false;
			}
		}
		
		Collections.sort(list);
		bw.write(list.size()+" ");
		for(int i:list) {
			bw.newLine();
			bw.write(i+" ");
		}
		bw.flush();
		bw.close();
	}
	
	static void dfs(int start, int target) {
		if(!visited[arr[start]]) {
			visited[arr[start]]=true;
			dfs(arr[start],target);
			visited[arr[start]]=false;
		}
		if(arr[start]==target) {
			list.add(target);
		}
	}
	
}
