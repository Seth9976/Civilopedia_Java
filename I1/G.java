package i1;

import com.google.android.gms.common.internal.Preconditions;

public final class g {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public g(String s, String s1, long v, long v1, long v2, long v3, long v4, Long long0, Long long1, Long long2, Boolean boolean0) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        boolean z = false;
        Preconditions.checkArgument(v >= 0L);
        Preconditions.checkArgument(v1 >= 0L);
        Preconditions.checkArgument(v2 >= 0L);
        if(v4 >= 0L) {
            z = true;
        }
        Preconditions.checkArgument(z);
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = v4;
        this.h = long0;
        this.i = long1;
        this.j = long2;
        this.k = boolean0;
    }

    public final g a(Long long0, Long long1, Boolean boolean0) {
        return boolean0 == null || boolean0.booleanValue() ? new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, long0, long1, boolean0) : new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, long0, long1, null);
    }

    public final g b(long v) {
        return new g(this.a, this.b, this.c, this.d, this.e, v, this.g, this.h, this.i, this.j, this.k);
    }
}

