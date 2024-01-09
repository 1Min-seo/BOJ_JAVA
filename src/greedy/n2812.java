package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class n2812 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		String str=br.readLine();
		Stack<Integer> stk=new Stack<>();
		int cnt=k;
		
		stk.add(str.charAt(0)-'0');
		
		for(int i=1; i<str.length(); i++) {
			int num=str.charAt(i)-'0';
			while(!stk.isEmpty() && stk.peek()<num && cnt>0) {		
				stk.pop();
				cnt--;
			}
			stk.add(num);
		}
		
		while(cnt!=0) {
			stk.pop();
			cnt--;
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<stk.size(); i++) {
			sb.append(stk.get(i));
		}
		
		System.out.println(sb.toString());
	}
}
