package q0;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import k.d;
import k2.f;
import n0.b;
import v0.c;
import w0.j;
import w0.k;
import z0.a;

public final class o {
    public final a a;
    public final a b;
    public final c c;
    public final j d;
    public static volatile q0.j e;

    public o(a a0, a a1, c c0, j j0, k k0) {
        this.a = a0;
        this.b = a1;
        this.c = c0;
        this.d = j0;
        k0.getClass();
        f f0 = new f(k0, 1);
        k0.a.execute(f0);
    }

    public static o a() {
        q0.j j0 = o.e;
        if(j0 == null) {
            throw new IllegalStateException("Not initialized!");
        }
        return (o)j0.n.get();
    }

    public static void b(Context context0) {
        if(o.e == null) {
            Class class0 = o.class;
            synchronized(class0) {
                if(o.e == null) {
                    d d0 = new d(9, false);
                    context0.getClass();
                    d0.j = context0;
                    o.e = d0.f();
                }
            }
        }
    }

    public final B1.a c(o0.a a0) {
        byte[] arr_b;
        Set set0;
        if(a0 instanceof q0.k) {
            a0.getClass();
            set0 = Collections.unmodifiableSet(o0.a.d);
        }
        else {
            set0 = Collections.singleton(new b("proto"));
        }
        B1.a a1 = i.a();
        a0.getClass();
        a1.j = "cct";
        String s = a0.a;
        String s1 = a0.b;
        if(s1 != null || s != null) {
            if(s1 == null) {
                s1 = "";
            }
            arr_b = A.f.j("1$", s, "\\", s1).getBytes(Charset.forName("UTF-8"));
        }
        else {
            arr_b = null;
        }
        a1.k = arr_b;
        return new B1.a(set0, a1.e(), this, 29);
    }
}

