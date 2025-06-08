package com.google.android.gms.internal.ads;

public final class zzajh {
    public final Object zza;
    public final zzaik zzb;
    public final zzajk zzc;
    public boolean zzd;

    public zzajh(zzajk zzajk0) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzajk0;
    }

    public zzajh(Object object0, zzaik zzaik0) {
        this.zzd = false;
        this.zza = object0;
        this.zzb = zzaik0;
        this.zzc = null;
    }

    public static zzajh zza(zzajk zzajk0) {
        return new zzajh(zzajk0);
    }

    public static zzajh zzb(Object object0, zzaik zzaik0) {
        return new zzajh(object0, zzaik0);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}

