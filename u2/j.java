package U2;

import java.util.LinkedHashSet;
import java.util.Set;
import v3.f;
import w2.d;
import x2.w;

public enum j {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public final f i;
    public final f j;
    public final Object k;
    public final Object l;
    public static final Set m;

    static {
        Object[] arr_object = {j.o, j.p, j.q, j.r, j.s, j.t, j.u};
        Set set0 = new LinkedHashSet(10);
        for(int v = 0; v < 7; ++v) {
            set0.add(arr_object[v]);
        }
        j.m = set0;
    }

    public j(String s1) {
        this.i = f.e(s1);
        this.j = f.e((s1 + "Array"));
        i i0 = new i(this, 1);
        this.k = w.p(d.i, i0);
        i i1 = new i(this, 0);
        this.l = w.p(d.i, i1);
    }
}

