package com.google.android.gms.internal.ads;

public final class zzfdk {
    public zzfef a;

    public zzfdk() {
        this.a = null;
    }

    public final void zza() {
        zzfef zzfef0 = this.a;
        if(zzfef0 != null) {
            synchronized(zzfef0.zza) {
                zzfef0.zza.e = 1;
                zzfef0.zza.a();
            }
        }
    }

    public final void zzb(zzfef zzfef0) {
        this.a = zzfef0;
    }
}

