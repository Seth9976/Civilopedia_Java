package w;

import android.content.res.ColorStateList;
import android.util.SparseArray;
import java.util.WeakHashMap;

public abstract class h {
    public static final ThreadLocal a;
    public static final WeakHashMap b;
    public static final Object c;

    static {
        h.a = new ThreadLocal();
        h.b = new WeakHashMap(0);
        h.c = new Object();
    }

    public static void a(g g0, int v, ColorStateList colorStateList0) {
        synchronized(h.c) {
            WeakHashMap weakHashMap0 = h.b;
            SparseArray sparseArray0 = (SparseArray)weakHashMap0.get(g0);
            if(sparseArray0 == null) {
                sparseArray0 = new SparseArray();
                weakHashMap0.put(g0, sparseArray0);
            }
            sparseArray0.append(v, new f(colorStateList0, g0.a.getConfiguration()));
        }
    }
}

