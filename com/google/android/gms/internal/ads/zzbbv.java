package com.google.android.gms.internal.ads;

public final class zzbbv {
    public final long a;
    public final String b;
    public final int c;

    public zzbbv(int v, long v1, String s) {
        this.a = v1;
        this.b = s;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0 instanceof zzbbv && ((zzbbv)object0).a == this.a && ((zzbbv)object0).c == this.c;
    }

    @Override
    public final int hashCode() {
        return (int)this.a;
    }
}

