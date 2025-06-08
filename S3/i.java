package S3;

import I2.b;
import J2.j;
import J2.q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import v3.f;

public final class i {
    public final f a;
    public final q b;
    public final Collection c;
    public final b d;
    public final e[] e;

    public i(Collection collection0, e[] arr_e, b b0) {
        j.f(collection0, "nameList");
        this(null, null, collection0, b0, ((e[])Arrays.copyOf(arr_e, arr_e.length)));
    }

    public i(Set set0, e[] arr_e) {
        this(set0, arr_e, h.l);
    }

    public i(f f0, q q0, Collection collection0, b b0, e[] arr_e) {
        this.a = f0;
        this.b = q0;
        this.c = collection0;
        this.d = b0;
        this.e = arr_e;
    }

    public i(f f0, e[] arr_e) {
        this(f0, arr_e, h.j);
    }

    public i(f f0, e[] arr_e, b b0) {
        j.f(f0, "name");
        this(f0, null, null, b0, ((e[])Arrays.copyOf(arr_e, arr_e.length)));
    }
}

