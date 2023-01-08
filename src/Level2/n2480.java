package Level2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2480 {

	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        
        int a=fr.nextInt();
        int b=fr.nextInt();
        int c=fr.nextInt();
        
        if(a==b && b==c && a==c) {
        	System.out.println(10000+a*1000);
        }
        else if (a!=b && b!=c && a!=c) {
        	int max=Math.max(a, Math.max(b, c));
        	System.out.println(100*max);
        }
        else {
        	if(a==b) System.out.println(1000+a*100);
        	else if(b==c) System.out.println(1000+b*100);
        	else System.out.println(1000+c*100);
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

