import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class TwoSets {

    public static void main(String[] args) {
        FastScanner scan = new FastScanner();
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        int n = scan.nextInt();

        if (((n * (n + 1)) / 2) % 2 == 0) {
            System.out.println("YES");
            long sum1 = 0;
            long sum2 = 0;
            int idx = 0, idx1 = 0;

            for (int i = n; i >= 1; i--) {
                if (sum1 <= sum2) {
                    str.append(i + " ");
                    sum1 += i;
                    idx++;
                } else {
                    str1.append(i + " ");
                    sum2 += i;
                    idx1++;
                }
            }

            System.out.println(idx);
            System.out.println(str);
            System.out.println(idx1);
            System.out.println(str1);
        } else {
            System.out.println("NO");
        }
    }
}

final class FastScanner {

    private int BS = 1 << 16;
    private char NC = (char) 0;
    private byte[] buf = new byte[BS];
    private int bId = 0, size = 0;
    private char c = NC;
    private double cnt = 1;
    private BufferedInputStream in;

    public FastScanner() {
        in = new BufferedInputStream(System.in, BS);
    }

    public FastScanner(String s) {
        try {
            in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
        } catch (Exception e) {
            in = new BufferedInputStream(System.in, BS);
        }
    }

    private char getChar() {
        while (bId == size) {
            try {
                size = in.read(buf);
            } catch (Exception e) {
                return NC;
            }
            if (size == -1) return NC;
            bId = 0;
        }
        return (char) buf[bId++];
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public int[] nextInts(int N) {
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            res[i] = (int) nextLong();
        }
        return res;
    }

    public long[] nextLongs(int N) {
        long[] res = new long[N];
        for (int i = 0; i < N; i++) {
            res[i] = nextLong();
        }
        return res;
    }

    public long nextLong() {
        cnt = 1;
        boolean neg = false;
        if (c == NC) c = getChar();
        for (; (c < '0' || c > '9'); c = getChar()) {
            if (c == '-') neg = true;
        }
        long res = 0;
        for (; c >= '0' && c <= '9'; c = getChar()) {
            res = (res << 3) + (res << 1) + c - '0';
            cnt *= 10;
        }
        return neg ? -res : res;
    }

    public double nextDouble() {
        double cur = nextLong();
        return c != '.' ? cur : cur + nextLong() / cnt;
    }

    public double[] nextDoubles(int N) {
        double[] res = new double[N];
        for (int i = 0; i < N; i++) {
            res[i] = nextDouble();
        }
        return res;
    }

    public String next() {
        StringBuilder res = new StringBuilder();
        while (c <= 32) c = getChar();
        while (c > 32) {
            res.append(c);
            c = getChar();
        }
        return res.toString();
    }

    public String nextLine() {
        StringBuilder res = new StringBuilder();
        while (c <= 32) c = getChar();
        while (c != '\n') {
            res.append(c);
            c = getChar();
        }
        return res.toString();
    }

    public boolean hasNext() {
        if (c > 32) return true;
        while (true) {
            c = getChar();
            if (c == NC) return false;
            else if (c > 32) return true;
        }
    }

    public void close() throws Exception {
        in.close();
    }

    public static void sort(int[] arr) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int x : arr) ls.add(x);
        Collections.sort(ls);
        for (int i = 0; i < arr.length; i++) arr[i] = ls.get(i);
    }
}
