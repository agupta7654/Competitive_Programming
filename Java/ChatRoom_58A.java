import java.io.*;
import java.util.*;

public class ChatRoom_58A {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		
		String in = io.next();
		String got = "";
		for(int i  = 0; i < in.length(); i++) {
			String val = in.substring(i, i+1);
			if(got.equals("") && val.equals("h")) {
				got += val;
			}
			else if(got.equals("h") && val.equals("e")) {
				got += val;
			}
			else if(got.equals("he") && val.equals("l")) {
				got += val;
			}
			else if(got.equals("hel") && val.equals("l")) {
				got += val;
			}
			else if(got.equals("hell") && val.equals("o")) {
				got += val;
				break;
			}
		}
		if(got.equals("hello")) {
			io.println("YES");
		}
		else {
			io.println("NO");
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