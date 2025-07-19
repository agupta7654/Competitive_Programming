import java.io.*;
import java.util.*;

public class AirConditioning{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int N = io.nextInt();
		int[] cur = new int[N];
		int[] want = new int[N];
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			cur[i] = io.nextInt();
		}
		for(int i = 0; i < N; i++) {
			want[i] = io.nextInt();
			d.add(want[i]-cur[i]);
		}
		int fin = 0;
		while(d.size() != 0) {
			if(d.get(0) == 0) {
				d.remove(0);
				continue;
			}
			boolean isPositive = d.get(0) > 0;
			int count = 1;
			while(count < d.size()) {
				if(d.get(count) > 0 != isPositive) {
					break;
				}
				if(d.get(count) == 0) {
					break;
				}
				count++;
			}
			fin++;
			for(int i = 0; i < count; i++) {
				if(isPositive) {
					d.set(i, d.get(i)-1);
				}
				else {
					d.set(i, d.get(i)+1);
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