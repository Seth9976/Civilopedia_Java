package d0;

import Y.m;
import android.content.Context;
import e0.d;
import f0.e;
import f0.f;
import f0.g;
import java.util.ArrayList;
import java.util.Collection;
import k0.a;

public final class c {
    public final b a;
    public final e0.b[] b;
    public final Object c;
    public static final String d;

    static {
        c.d = "WM-WorkConstraintsTrack";
    }

    public c(Context context0, a a0, b b0) {
        Context context1 = context0.getApplicationContext();
        this.a = b0;
        this.b = new e0.b[]{new e0.a(((f0.a)g.g(context1, a0).j), 0), new e0.a(((f0.b)g.g(context1, a0).k), 1), new e0.a(((f)g.g(context1, a0).m), 4), new e0.a(((e)g.g(context1, a0).l), 2), new e0.a(((e)g.g(context1, a0).l), 3), new d(((e)g.g(context1, a0).l)), new e0.c(((e)g.g(context1, a0).l))};  // 初始化器: Le0/b;-><init>(Lf0/d;)V / 初始化器: Le0/b;-><init>(Lf0/d;)V
        this.c = new Object();
    }

    public final boolean a(String s) {
        synchronized(this.c) {
            e0.b[] arr_b = this.b;
            for(int v1 = 0; v1 < arr_b.length; ++v1) {
                e0.b b0 = arr_b[v1];
                if(b0.b != null && b0.b(b0.b) && b0.a.contains(s)) {
                    m.d().a("WM-WorkConstraintsTrack", "Work " + s + " constrained by " + b0.getClass().getSimpleName(), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(ArrayList arrayList0) {
        synchronized(this.c) {
            b b0 = this.a;
            if(b0 != null) {
                b0.c(arrayList0);
            }
        }
    }

    public final void c(Collection collection0) {
        synchronized(this.c) {
            e0.b[] arr_b = this.b;
            for(int v2 = 0; v2 < arr_b.length; ++v2) {
                e0.b b0 = arr_b[v2];
                if(b0.d != null) {
                    b0.d = null;
                    b0.d(null, b0.b);
                }
            }
            e0.b[] arr_b1 = this.b;
            for(int v3 = 0; v3 < arr_b1.length; ++v3) {
                arr_b1[v3].c(collection0);
            }
            e0.b[] arr_b2 = this.b;
            for(int v1 = 0; v1 < arr_b2.length; ++v1) {
                e0.b b1 = arr_b2[v1];
                if(b1.d != this) {
                    b1.d = this;
                    b1.d(this, b1.b);
                }
            }
        }
    }

    public final void d() {
        synchronized(this.c) {
            e0.b[] arr_b = this.b;
            for(int v1 = 0; v1 < arr_b.length; ++v1) {
                e0.b b0 = arr_b[v1];
                ArrayList arrayList0 = b0.a;
                if(!arrayList0.isEmpty()) {
                    arrayList0.clear();
                    b0.c.b(b0);
                }
            }
        }
    }
}

