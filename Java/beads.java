/*
ID: 8971101
LANG: JAVA
TASK: beads
*/

import java.io.*;
import java.util.*;

public class beads {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("beads");
		
		int num = io.nextInt();
		String chain = io.next();
		int count = 0;
		
		for(int i = 0; i < chain.length(); i++) {
			int endStart = 0;
			int endBack = 0;
			String color = "";
			String newChain = chain.substring(i);
			if(i != 0) {
				newChain = chain.substring(i) + chain.substring(0,i);
			}
			for(int j = 0; j < newChain.length(); j++) {
				if(newChain.charAt(j) == 'w') {
					continue;
				}
				else {
					if(color.equals("")) {
						color = newChain.substring(j, j+1);
					}
					else {
						if(color.equals(newChain.substring(j, j+1))) {
							continue;
						}
						else {
							if(i == 25) {
								System.out.println(newChain.charAt(j));
							}
							endStart = j-1;
							break;
						}
					}
				}
			}
			color = "";
			for(int j = newChain.length()-1; j >= 0; j--) {
				
				if(newChain.charAt(j) == 'w') {
					continue;
				}
				else {
					if(color.equals("")) {
						color = newChain.substring(j, j+1);
					}
					else {
						if(color.equals(newChain.substring(j, j+1))) {
							continue;
						}
						else {
							if(i == 25) {
								System.out.println(newChain.charAt(j));
							}
							endBack = j+1;
							break;
						}
					}
				}
			}
			System.out.println(i + " " + endStart + " " + endBack + " " + (endStart + (newChain.length()-endBack+1)));
			if(i == 25) {
				System.out.println(newChain);
			}
			int hold = endStart + 1 + (newChain.length()-endBack);
			if(hold > count) {
				count = hold;
			}
			if(endStart >= endBack) {
				count = chain.length();
			}
		}
		io.println(count);
		
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