import java.io.*;
import java.util.*;

public class CountingLiars{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> more = new ArrayList<Integer>();
		ArrayList<Integer> less = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			String check = sc.next();
			int val = sc.nextInt();
			if(check.equals("G")) {
				more.add(val);
			}
			else {
				less.add(val);
			}
		}
		Collections.sort(more);
		Collections.sort(less);
		int moreThreshold = more.get(more.size()-1);
		int lessThreshold = less.get(0);
		if(more.size() == 0 || less.size() == 0) {
			System.out.println(0);
		}
		else if(lessThreshold >= moreThreshold) {
			System.out.println(0);
		}
		else {
			int moreLiars = 0;
			int i = more.size()-1;
			while(i >= 0 && more.get(i) > lessThreshold) {
				moreLiars++;
				i--;
			}
			int lessLiars = 0;
			i = 0;
			while(i < less.size() && less.get(i) < moreThreshold) {
				lessLiars++;
				i++;
			}
			System.out.println(moreThreshold);
			System.out.println(lessThreshold);
			System.out.println(more.get(0));
			System.out.println(more.size());
			System.out.println(less.size());
			System.out.println(moreLiars);
			System.out.println(lessLiars);
			if(moreLiars < lessLiars) {
				System.out.println(moreLiars);
			}
			else {
				System.out.println(lessLiars);
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