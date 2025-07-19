import java.io.*;
import java.util.*;

public class StringTask_118A {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		
		String vowels = "aeiouyAEIOUY";
		String in = io.next();
		String fin = "";
		for(int i = 0; i < in.length(); i++) {
			if(!vowels.contains(in.substring(i, i+1))) {
				fin += "." + in.substring(i, i+1).toLowerCase();
			}
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