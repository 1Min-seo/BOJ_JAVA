package Level6;
import java.util.*;
import java.io.*;

public class n2675 {

	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        
        int testCase=fr.nextInt();
        for(int i=0; i<testCase; i++) {
        	int R=fr.nextInt();
        	String str=fr.next();
        	int strLen=str.length();
        	for(int j=0; j<strLen; j++) {
        		for(int k=0; k<R; k++) {
        			System.out.print(str.charAt(j));
        		}
        	}
        	System.out.println();
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
