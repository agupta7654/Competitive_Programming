import java.io.*;
import java.util.*;

public class WhyDidTheCowCrossTheRoad3{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("cowqueue");
		int T = io.nextInt();
		int[][] times = new int[T][2];
		for(int i = 0; i < T; i++) {
			times[i][0] = io.nextInt();
			times[i][1] = io.nextInt();
		}
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
        
        long tot = 0;
        long curTime = 0;
        for(int i = 0; i < T; i++) {
        	if(curTime <= times[i][0]) {
        		tot += (times[i][0]+times[i][1]-curTime);
        		curTime = times[i][0] + times[i][1];
        	}
        	else {
        		tot += times[i][1];
        		curTime += times[i][1];
        	}
        }
        io.println(tot);
		
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