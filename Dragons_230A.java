import java.io.*;
import java.util.*;

public class Dragons_230A {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();

		int s = io.nextInt();
		int n = io.nextInt();
		ArrayList<Integer> dragons = new ArrayList<Integer>();
		ArrayList<Integer> bonus = new ArrayList<Integer>();
		for(int i  =0 ;i < n; i++) {
			dragons.add(io.nextInt());
			bonus.add(io.nextInt());
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(s <= dragons.get(i)) {
				io.println("NO");
				break;
			}
			else {
				s += bonus.get(i);
				count++;
			}
		}
		if(count == n) {
			io.println("YES");
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