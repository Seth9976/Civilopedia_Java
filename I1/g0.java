package i1;

import com.google.android.gms.common.internal.Preconditions;

public final class g0 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Object e;

    public g0(String s, String s1, String s2, long v, Object object0) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s2);
        Preconditions.checkNotNull(object0);
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
        this.e = object0;
    }
}

