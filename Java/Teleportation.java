import java.io.*;
import java.util.*;

public class Teleportation{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("teleport");
		int s = io.nextInt();
		int e = io.nextInt();
		int t1 = io.nextInt();
		int t2 = io.nextInt();
		
		int r1 = Math.abs(e-s);
		int r2 = Math.abs(e-t2) + Math.abs(s-t1);
		int r3 = Math.abs(e-t1) + Math.abs(s-t2);
		
		io.println(Math.min(Math.min(r2, r3), r1));
		
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