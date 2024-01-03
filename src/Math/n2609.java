package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2609 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int g=gcd(a,b);
		int I=a*b/g;
		System.out.println(g);
		System.out.println(I);
	}
	
	public static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}

}