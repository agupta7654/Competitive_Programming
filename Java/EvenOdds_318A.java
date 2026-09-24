import java.io.*;
import java.util.*;

public class EvenOdds_318A {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		long n = io.nextLong();
		long k = io.nextLong();
		if(n%2==0)
		{
		   if(k==n/2)
			System.out.println(n-1);
		   if(k>n/2)
			System.out.println(2*(k-n/2));
		   if(k<n/2)
			System.out.println((2*k)-1);
		}
		else
		{
		   if(k==n/2+1)
			System.out.println(n);
		   if(k>n/2+1)
			System.out.println(2*(k-(n/2+1)));
		   if(k<n/2+1)
			System.out.println((2*k)-1);
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