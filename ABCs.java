import java.io.*;
import java.util.*;

public class ABCs{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		ArrayList<Integer> vals = new ArrayList<Integer>(7);
		for(int i = 0; i < 7; i++) {
			vals.add(io.nextInt());
		}
		Collections.sort(vals);
		if(vals.get(0) + vals.get(1) == vals.get(2)) {
			io.println(vals.get(0) + " " + vals.get(1) + " " + vals.get(3));
		}
		else {
			io.println(vals.get(0) + " " + vals.get(1) + " " + vals.get(2));
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