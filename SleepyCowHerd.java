import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SleepyCowHerd {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("herding");
		int[] num = new int[3];
		num[0] = io.nextInt();
		num[1] = io.nextInt();
		num[2] = io.nextInt();
		Arrays.sort(num);
		
		if(num[1] - num[0] == 1 && num[2] - num[1] == 1) {
			io.println(0);
			
		}
		else if(num[2] - num[1] == 2 || num[1] - num[0] == 2){
			io.println(1);
		}
		else {
			io.println(2);
		}
		io.println(Math.max(num[2]-num[1]-1, num[1]-num[0]-1));

		
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