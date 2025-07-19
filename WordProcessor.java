import java.io.*;
import java.util.*;

public class WordProcessor {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("word");
		
		int n = io.nextInt();
		int k = io.nextInt();
		String fin = "";
		int cnt = 0;
		
		for(int i  =0; i < n; i++) {
			String in = io.next();
			if(cnt + in.length() > k) {
				io.println(fin.substring(0,fin.length()-1));
				cnt = in.length();
				fin = in + " ";
			}
			else {
				fin += in + " ";
				cnt += in.length();
			}
		}
		io.println(fin.substring(0,fin.length()-1));
		
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