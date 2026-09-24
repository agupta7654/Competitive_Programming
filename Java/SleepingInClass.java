import java.io.*;
import java.util.*;

public class SleepingInClass{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int T = io.nextInt();
		
		while(T-->0) {
			int N = io.nextInt();
			int sum = 0;
			int[] vals = new int[N];
			boolean w = true;
			for(int i = 0; i < N; i++) {
				vals[i] = io.nextInt();
				if(vals[0] != vals[i]) {
					w = false;
				}
				sum += vals[i];
			}
			if(w) {
				io.println(0);
				continue;
			}
			io.println(sum);
			boolean works2 = true;
			for(int i = N; i > 0; i--) {
				boolean works = true;
				if(sum % i == 0) {
					int cnt = 0;
					io.println(i);
					for(int j = 0; j < N; j++) {
						cnt += vals[j];
						if(cnt == sum/i){
							cnt = 0;
						}
						if(cnt > sum/i) {
							io.println("works");
							works = false;
							break;
						}
					}
					if(works) {
						io.println(N-i);
						break;
					}
				}
				if(!works) {
					works2 = false;
				}
			}
			if(!works2) {
				io.println(N-1);
			}
			io.println();
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