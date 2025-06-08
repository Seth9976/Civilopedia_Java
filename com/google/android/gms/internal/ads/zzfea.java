package com.google.android.gms.internal.ads;

public final class zzfea implements zzfdy {
    public final String a;

    public zzfea(String s) {
        this.a = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfdy
    public final boolean equals(Object object0) {
        return object0 instanceof zzfea ? this.a.equals(((zzfea)object0).a) : false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfdy
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

