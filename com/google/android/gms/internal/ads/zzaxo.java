package com.google.android.gms.internal.ads;

public final class zzaxo extends zzase {
    public final long a;
    public final long b;
    public static final Object c;

    static {
        zzaxo.c = new Object();
    }

    public zzaxo(long v, boolean z) {
        this.a = v;
        this.b = v;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzase
    public final int zza(Object object0) {
        return zzaxo.c.equals(object0) ? 0 : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzase
    public final int zzb() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzase
    public final int zzc() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzase
    public final zzasc zzd(int v, zzasc zzasc0, boolean z) {
        zzayz.zza(v, 0, 1);
        zzasc0.zza = z ? zzaxo.c : null;
        zzasc0.zzb = z ? zzaxo.c : null;
        zzasc0.zzc = this.a;
        return zzasc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzase
    public final zzasd zze(int v, zzasd zzasd0, boolean z, long v1) {
        zzayz.zza(v, 0, 1);
        zzasd0.zza = this.b;
        return zzasd0;
    }
}

