import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LonelyPhoto{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int N = io.nextInt();
		String cows = io.next();
		int fin = 0;
		for(int i = 0; i < N; i++) {
			int g = 0;
			int h = 0;
			for(int j = i; j < N; j++) {
				if(cows.charAt(j) == 'G') {
					g++;
				}
				else {
					h++;
				}
				if(g+h >= 3 && (g == 1 || h == 1)) {
					fin++;
				}
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