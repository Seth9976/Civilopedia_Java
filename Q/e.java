package q;

public abstract class e {
    public static final int[] a;

    static {
        e.a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public static boolean a(int v, int v1) {
        if(v == 0) {
            throw null;
        }
        return v == v1;
    }

    public static String b(String s, String s1) {
        return s + s1;
    }

    public static int c(int v) {
        if(v == 0) {
            throw null;
        }
        return v - 1;
    }

    public static int[] d(int v) {
        int[] arr_v = new int[v];
        System.arraycopy(e.a, 0, arr_v, 0, v);
        return arr_v;
    }
}

