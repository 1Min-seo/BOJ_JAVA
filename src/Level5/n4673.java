package Level5;
import java.util.*;
import java.io.*;

public class n4673 {
	
	public static int d(int number) {
		int sum=number;
		while(number!=0) {
			sum+=number%10;
			number/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        boolean []arr=new boolean[10001];
        for(int i=0; i<arr.length-1; i++) {
        	int n=d(i);
        	if(n<10001) {
        		arr[n]=true;
        	}
        }
        
        for(int i=0; i<arr.length-1; i++) {
        	if(arr[i]==false) {
        		System.out.println(i);
        	}
        }
        
    }


    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}