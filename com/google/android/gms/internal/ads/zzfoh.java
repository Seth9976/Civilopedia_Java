package com.google.android.gms.internal.ads;

public abstract class zzfoh implements zzfov {
    @Override  // com.google.android.gms.internal.ads.zzfov
    @Deprecated
    public final boolean zza(Object object0) {
        return this.zzb(((Character)object0).charValue());
    }

    public abstract boolean zzb(char arg1);

    public static zzfoh zzc(char c) {
        return new y6(c);
    }
}

