import java.io.*;
import java.util.*;

public class DiamondCollector {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("diamond");
		
		int N = io.nextInt();
		int K = io.nextInt();
		int[] vals = new int[N];
		for(int i = 0; i<N; i++) {
			vals[i] = io.nextInt();
		}
		Arrays.sort(vals);
		int maxCount = 0;
		for(int i = 0; i < N; i++) {
			int curCount = 0;
			for(int j = i; j < N; j++) {
				if(vals[j] <= vals[i]+K) {
					curCount++;
				}
			}
			maxCount = Math.max(maxCount, curCount);
		}
		io.println(maxCount);
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