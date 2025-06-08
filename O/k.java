package O;

import R.d;
import S.b;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class k implements d, Closeable {
    public volatile String i;
    public final long[] j;
    public final double[] k;
    public final String[] l;
    public final byte[][] m;
    public final int[] n;
    public final int o;
    public int p;
    public static final TreeMap q;

    static {
        k.q = new TreeMap();
    }

    public k(int v) {
        this.o = v;
        this.n = new int[v + 1];
        this.j = new long[v + 1];
        this.k = new double[v + 1];
        this.l = new String[v + 1];
        this.m = new byte[v + 1][];
    }

    @Override  // R.d
    public final void a(b b0) {
        for(int v = 1; v <= this.p; ++v) {
            switch(this.n[v]) {
                case 1: {
                    b0.d(v);
                    break;
                }
                case 2: {
                    b0.c(v, this.j[v]);
                    break;
                }
                case 3: {
                    ((SQLiteProgram)b0.j).bindDouble(v, this.k[v]);
                    break;
                }
                case 4: {
                    b0.e(v, this.l[v]);
                    break;
                }
                case 5: {
                    b0.b(v, this.m[v]);
                }
            }
        }
    }

    @Override  // R.d
    public final String b() {
        return this.i;
    }

    public static k c(int v, String s) {
        TreeMap treeMap0 = k.q;
        synchronized(treeMap0) {
            Map.Entry map$Entry0 = treeMap0.ceilingEntry(v);
            if(map$Entry0 != null) {
                treeMap0.remove(map$Entry0.getKey());
                k k0 = (k)map$Entry0.getValue();
                k0.i = s;
                k0.p = v;
                return k0;
            }
        }
        k k1 = new k(v);
        k1.i = s;
        k1.p = v;
        return k1;
    }

    @Override
    public final void close() {
    }

    public final void d(int v, long v1) {
        this.n[v] = 2;
        this.j[v] = v1;
    }

    public final void e(int v) {
        this.n[v] = 1;
    }

    public final void f(int v, String s) {
        this.n[v] = 4;
        this.l[v] = s;
    }

    public final void release() {
        TreeMap treeMap0 = k.q;
        synchronized(treeMap0) {
            treeMap0.put(this.o, this);
            if(treeMap0.size() > 15) {
                int v1 = treeMap0.size() - 10;
                Iterator iterator0 = treeMap0.descendingKeySet().iterator();
                while(v1 > 0) {
                    iterator0.next();
                    iterator0.remove();
                    --v1;
                }
            }
        }
    }
}

