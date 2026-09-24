import java.io.*;
import java.util.*;

public class Photoshoot {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("photo");
		
		int n = io.nextInt();
		int[] vals = new int[n-1];
		int[] test = new int[n];
		for(int i  = 0 ;i < n-1; i++) {
			vals[i] = io.nextInt();
		}
		
		for(int i  = 1 ;i <= n; i++) {
			test[0] = i;
			ArrayList<Integer> valsUsed = new ArrayList<Integer>();
			valsUsed.add(test[0]);
			for(int j  = 1 ;j < n; j++) {
				
				test[j] = vals[j-1]-test[j-1];
				if(valsUsed.contains(test[j]) || test[j] < 1) {
					test[j] = 0;
					break;
				}
				valsUsed.add(test[j]);
			}
			if(test[n-1] != 0) {	
				String end = "";
				for(int val: test) {
					end += val + " ";
				}
				io.println(end.substring(0,end.length()-1));
				break;
			}
			test = new int[n];
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