import java.io.*;
import java.util.*;

public class SpeedingTicket {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("speeding");
		
		int N = io.nextInt();
		int M = io.nextInt();
		int[] sl = new int[100];
		int[] sp = new int[100];
		int cur = 0;
		while(N-->0) {
			int len = io.nextInt();
			int s = io.nextInt();
			for(int i = cur; i < len+cur; i++) {
				sl[i] = s; 
			}
			cur += len;
		}
		cur = 0;
		while(M-->0) {
			int len = io.nextInt();
			int s = io.nextInt();
			for(int i = cur; i < len+cur; i++) {
				sp[i] = s; 
			}
			cur += len;
		}
		int fin = 0;
		for(int i = 0; i < 100; i++) {
			fin = Math.max(fin, sp[i]-sl[i]);
		}
		io.println(fin);
		
		
		
		io.close();
	}
}


class Kattio extends PrintWriter {
    private BufferedReader r;
    private StringTokenizer st;
    // standard input
    public Kattio() { this(System.in, System.out); }
    public Kattio(InputStream i, OutputStream o) {
        super(o);
        r = new BufferedReader(new InputStreamReader(i));
    }
    // USACO-style file input
    public Kattio(String problemName) throws IOException {
        super(problemName + ".out");
        r = new BufferedReader(new FileReader(problemName + ".in"));
    }
    // returns null if no more input
    public String next() {
        try {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(r.readLine());
            return st.nextToken();
        } catch (Exception e) { }
        return null;
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public double nextDouble() { return Double.parseDouble(next()); }
    public long nextLong() { return Long.parseLong(next()); }
}