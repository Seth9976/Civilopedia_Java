package com.google.android.gms.internal.ads;

public abstract class zzase {
    public static final zzase zza;

    static {
        zzase.zza = new J0();  // 初始化器: Lcom/google/android/gms/internal/ads/zzase;-><init>()V
    }

    public abstract int zza(Object arg1);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzasc zzd(int arg1, zzasc arg2, boolean arg3);

    public abstract zzasd zze(int arg1, zzasd arg2, boolean arg3, long arg4);

    public final int zzf(int v, zzasc zzasc0, zzasd zzasd0, int v1) {
        this.zzd(v, zzasc0, false);
        this.zzg(0, zzasd0, false);
        int v2 = 1;
        if(v == 0) {
            switch(v1) {
                case 0: {
                    if(this.zzc() - 1 == 0) {
                        v2 = -1;
                    }
                    break;
                }
                case 1: {
                    v2 = 0;
                    break;
                }
                default: {
                    if(v1 != 2) {
                        throw new IllegalStateException();
                    }
                    if(this.zzc() - 1 == 0) {
                        v2 = 0;
                        break;
                    }
                }
            }
            if(v2 == -1) {
                return -1;
            }
            this.zzg(v2, zzasd0, false);
            return 0;
        }
        return v + 1;
    }

    public final zzasd zzg(int v, zzasd zzasd0, boolean z) {
        return this.zze(v, zzasd0, false, 0L);
    }

    public final boolean zzh() {
        return this.zzc() == 0;
    }
}

