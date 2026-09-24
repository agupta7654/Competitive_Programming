import java.io.*;
import java.util.*;

public class MilkPails {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("pails");
		
		int a = io.nextInt();
		int b = io.nextInt();
		int m = io.nextInt();
		
		int closest = 0;
		for(int i = 0; i < m/a + 1;i++) {
			closest = Math.max(closest, m - ((m-a*i)%b));
		}

		io.println(closest);
		
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