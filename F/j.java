package f;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import p.c;
import p.g;

public abstract class j {
    public static final c i;
    public static final Object j;

    static {
        j.i = new c(0);
        j.j = new Object();
    }

    public abstract void a();

    public abstract void b();

    public static void c(t t0) {
        synchronized(j.j) {
            Iterator iterator0 = j.i.iterator();
            while(((g)iterator0).hasNext()) {
                j j0 = (j)((WeakReference)((g)iterator0).next()).get();
                if(j0 == t0 || j0 == null) {
                    ((g)iterator0).remove();
                }
            }
        }
    }

    public abstract boolean f(int arg1);

    public abstract void g(int arg1);

    public abstract void h(CharSequence arg1);
}

