import java.io.*;
import java.util.*;

public class CowGymnastics {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("gymnastics");

		int k = io.nextInt();
		int n = io.nextInt();
		boolean[][] fin = new boolean[n][n];
		while(k-->0) {
			int[] place = new int[n];
			for(int i = 0; i < n; i++) {
				place[i] = io.nextInt()-1;
			}
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					fin[place[i]][place[j]] = true;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					fin[i][j] = true;
				}
			}
		}
		
		int count = 0;
		for(int a = 0; a < n; a++) {
			for(int b = 0; b < n; b++) {
				if(fin[a][b] == false) {
//					io.println(a + " " + b);
					count++;
				}
			}
		}
		io.println(count);
		
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