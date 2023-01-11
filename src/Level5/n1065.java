package Level5;
import java.util.*;
import java.io.*;

public class n1065 {

	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        int N=fr.nextInt();
        int cnt=0;
        
        for(int i=1; i<=N; i++) {
        	if(i<100) cnt+=1;
        	else {
        		int n1=i%10;
            	int n10=i/10%10;
            	int n100=i/10/10;
            	if(n100-n10==n10-n1) cnt+=1;
        	}
        }
        System.out.println(cnt);
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