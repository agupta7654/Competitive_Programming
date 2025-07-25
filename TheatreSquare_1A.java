import java.io.*;
import java.util.*;

public class TheatreSquare_1A {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		
		long n = io.nextLong();
		long m = io.nextLong();
		long a = io.nextLong();
		long numFlagstonesInN = (n + a - 1) / a;
        long numFlagstonesInM = (m + a - 1) / a;

        // Calculate the total number of flagstones needed
        io.println(numFlagstonesInN * numFlagstonesInM);
		
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