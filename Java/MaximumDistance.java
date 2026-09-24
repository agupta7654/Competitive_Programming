import java.io.*;
import java.util.*;

public class MaximumDistance {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		
		int N = io.nextInt();
		long[] x= new long[N];
		long[] y= new long[N];
		
		for(int i = 0; i < N; i++) {
			x[i] = io.nextInt();
		}
		for(int i = 0; i < N; i++) {
			y[i] = io.nextInt();
		}
		
		long max = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				max = Math.max(max, (long)(Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2)));
			}
		}
		io.println(max);
		
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