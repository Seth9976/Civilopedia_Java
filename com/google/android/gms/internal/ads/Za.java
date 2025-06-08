package com.google.android.gms.internal.ads;

public final class za {
    public final zzsa a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public za(zzsa zzsa0, long v, long v1, long v2, long v3, boolean z, boolean z1, boolean z2) {
        boolean z3 = false;
        zzcw.zzd(!z2 || z);
        if(!z1 || z) {
            z3 = true;
        }
        zzcw.zzd(z3);
        this.a = zzsa0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = z;
        this.g = z1;
        this.h = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return za.class == class0 && this.b == ((za)object0).b && this.c == ((za)object0).c && this.d == ((za)object0).d && this.e == ((za)object0).e && this.f == ((za)object0).f && this.g == ((za)object0).g && this.h == ((za)object0).h && zzeg.zzS(this.a, ((za)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (((((((this.a.hashCode() + 0x20F) * 0x1F + ((int)this.b)) * 0x1F + ((int)this.c)) * 0x1F + ((int)this.d)) * 0x1F + ((int)this.e)) * 961 + this.f) * 0x1F + this.g) * 0x1F + this.h;
    }
}

