package v3;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import x2.k;
import x2.w;

public abstract class j {
    static {
        new c("java.lang").c(f.e("annotation"));
    }

    public static final b a(String s) {
        f f0 = f.e(s);
        return new b(i.a, f0);
    }

    public static final b b(String s) {
        f f0 = f.e(s);
        return new b(i.c, f0);
    }

    public static final void c(LinkedHashMap linkedHashMap0) {
        Iterable iterable0 = linkedHashMap0.entrySet();
        int v = w.q(k.E(iterable0));
        if(v < 16) {
            v = 16;
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(v);
        for(Object object0: iterable0) {
            Object object1 = ((Map.Entry)object0).getKey();
            linkedHashMap1.put(((Map.Entry)object0).getValue(), object1);
        }
    }

    public static final b d(f f0) {
        return new b(i.h.g(), f.e((f0.c() + i.h.i().c())));
    }

    public static final b e(String s) {
        f f0 = f.e(s);
        return new b(i.b, f0);
    }

    public static final b f(b b0) {
        f f0 = f.e(("U" + b0.i().c()));
        return new b(i.a, f0);
    }
}

