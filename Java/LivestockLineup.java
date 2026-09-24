import java.io.*;
import java.util.*;

public class LivestockLineup {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("whereami");
		String[] arr = new String[] {"Bessie", "Buttercup", "Belinda", "Beatrice", "Bella", "Blue", "Betsy", "Sue"};
		Arrays.sort(arr);
		List<String> vals = Arrays.asList(arr);
		
		String[] connections = new String[8];
		
		
		int K = io.nextInt();
		for(int i = 0; i < K; i++) {
			String first = io.next();
			io.next();
			io.next();
			io.next();
			io.next();
			String second = io.next();
			
			for(int j = 0; j < vals.size(); j++) {
				if(vals.get(j).equals(first)) {
					vals.remove(second);
					vals.add(j, second);
				}
			}
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