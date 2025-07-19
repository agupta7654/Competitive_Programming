import java.io.*;
import java.util.*;

public class MilkingOrder{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("milkorder");
		int N = io.nextInt();
		int M = io.nextInt();
		int K = io.nextInt();
		ArrayList<Integer> h = new ArrayList<Integer>();
		int[] places = new int[N];
		for(int i = 0; i < M; i++) {
			h.add(io.nextInt());
		}
		boolean done = false;
		for(int i = 0; i < K; i++) {
			int val = io.nextInt();
			int spot = io.nextInt();
			places[spot-1] = val;
			if(val == 1) {
				io.println(spot);
				done = true;
			}
		}
		
		if(!done) {
			for(int i = 0; i < N; i++) {
				if(places[i] == 0) {
					boolean works = true;
					ArrayList<Integer> hold = (ArrayList<Integer>) h.clone();
					for(int j = 1; j < M+1; j++) {
						hold.remove(0);
						if(i+j < N && hold.contains(places[i+j])) {
							works = false;
							break;
						}
					}
					if(works) {
						io.println(i+1);
						break;
					}
				}
			}
			
		}
		
        io.close();
	}

	public static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
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