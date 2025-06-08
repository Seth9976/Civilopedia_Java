package com.google.android.gms.internal.ads;

public final class nb extends zzro {
    public final Object b;
    public final Object c;
    public static final Object d;

    static {
        nb.d = new Object();
    }

    public nb(zzci zzci0, Object object0, Object object1) {
        super(zzci0);
        this.b = object0;
        this.c = object1;
    }

    @Override  // com.google.android.gms.internal.ads.zzro
    public final int zza(Object object0) {
        if(nb.d.equals(object0)) {
            Object object1 = this.c;
            if(object1 != null) {
                object0 = object1;
            }
        }
        return this.a.zza(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzro
    public final zzcf zzd(int v, zzcf zzcf0, boolean z) {
        this.a.zzd(v, zzcf0, z);
        if(zzeg.zzS(zzcf0.zzc, this.c) && z) {
            zzcf0.zzc = nb.d;
        }
        return zzcf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzro
    public final zzch zze(int v, zzch zzch0, long v1) {
        this.a.zze(v, zzch0, v1);
        if(zzeg.zzS(zzch0.zzc, this.b)) {
            zzch0.zzc = zzch.zza;
        }
        return zzch0;
    }

    @Override  // com.google.android.gms.internal.ads.zzro
    public final Object zzf(int v) {
        Object object0 = this.a.zzf(v);
        return zzeg.zzS(object0, this.c) ? nb.d : object0;
    }
}

