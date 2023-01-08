package Level2;
import java.util.*;
import java.io.*;

public class n2525 {

	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        
        int hour=fr.nextInt();
        int min=fr.nextInt();
        int time=fr.nextInt();
        
        int total=hour*60+min+time;
        hour=total/60;
        min=total%60;
        
        if(hour>=24) hour-=24;
        
        System.out.println(hour+" "+min);
        
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

