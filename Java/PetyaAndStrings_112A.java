import java.io.*;
import java.util.*;

public class PetyaAndStrings_112A {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		
		String x = io.next();
		String y = io.next();
		if(x.toLowerCase().compareTo(y.toLowerCase()) < 0) {
			io.println(-1);
		}
		else if(x.toLowerCase().compareTo(y.toLowerCase()) > 0) {
			io.println(1);
		}
		else {
			io.println(0);
		}
		
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