package com.google.android.gms.internal.ads;

public final class p9 {
    public final zzgma a;
    public final int b;

    public p9(zzgma zzgma0, int v) {
        this.a = zzgma0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof p9 ? this.a == ((p9)object0).a && this.b == ((p9)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 0xFFFF + this.b;
    }
}

