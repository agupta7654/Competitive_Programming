import java.io.*;
import java.util.*;

public class PromotionCounting{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("promote");
		int b1 = io.nextInt();
		int b2 = io.nextInt();
		int s1 = io.nextInt();
		int s2 = io.nextInt();
		int g1 = io.nextInt();
		int g2 = io.nextInt();
		int p1 = io.nextInt();
		int p2 = io.nextInt();
		int gp = p2-p1;
		int sp = g2-g1+gp;
		int bp = s2-s1+sp;
		io.println(bp);
		io.println(sp);		
		io.println(gp);
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