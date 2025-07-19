/*
ID: 8971101
LANG: JAVA
TASK: gift1
*/

import java.io.*;
import java.util.*;

public class gift1{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("gift1");
		
		int n = io.nextInt();
		String[] friends = new String[n];
		int[] friendsAmt = new int[n];
		for(int i = 0; i < n; i++) {
			String f = io.next();
			friends[i] = f;
		}
		
		for(int friend = 0; friend < n; friend++) {
			int friendIndex = find(friends, io.next());
			int amt = io.nextInt();
			int split = io.nextInt();
			if(split == 0) {
				continue;
			}
			int amtForEach = amt/split;
			int amtForOwner = amt % split - amt;
			friendsAmt[friendIndex] += amtForOwner;
			for(int i = 0; i < split; i++) {
				friendsAmt[find(friends, io.next())] += amtForEach;
			}
		}
		
		for(int i = 0; i < n; i++) {
			io.println(friends[i] + " " + friendsAmt[i]);
		}
		
		io.close();
	}
	
	public static int find(String[] arr, String friend) {
		for(int i = 0; i < arr.length; i++) {
			if(friend.equals(arr[i])) {
				return i;
			}
		}
		return -1;
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