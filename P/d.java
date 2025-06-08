package p;

public abstract class d {
    public static final int[] a;
    public static final Object[] b;

    static {
        d.a = new int[0];
        d.b = new Object[0];
    }

    public static int a(int v, int v1, int[] arr_v) {
        int v2 = v - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = arr_v[v4];
            if(v5 < v1) {
                v3 = v4 + 1;
                continue;
            }
            if(v5 > v1) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return ~v3;
    }

    public static int b(long[] arr_v, int v, long v1) {
        int v2 = v - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = Long.compare(arr_v[v4], v1);
            if(v5 < 0) {
                v3 = v4 + 1;
                continue;
            }
            if(v5 > 0) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return ~v3;
    }
}

