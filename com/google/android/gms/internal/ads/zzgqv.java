package com.google.android.gms.internal.ads;

public final class zzgqv implements zzgqo, zzgqu {
    public final Object a;
    public static final zzgqv b;

    static {
        zzgqv.b = new zzgqv(null);
    }

    public zzgqv(Object object0) {
        this.a = object0;
    }

    public static zzgqu zza(Object object0) {
        zzgrc.zza(object0, "instance cannot be null");
        return new zzgqv(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqo, com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.a;
    }

    public static zzgqu zzc(Object object0) {
        return object0 == null ? zzgqv.b : new zzgqv(object0);
    }
}

