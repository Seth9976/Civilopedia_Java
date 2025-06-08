package com.google.android.gms.internal.ads;

public final class zzdca implements Runnable {
    public final zzdcg zza;

    public zzdca(zzdcg zzdcg0) {
        this.zza = zzdcg0;
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            zzcfi.zzg("Timeout waiting for show call succeed to be called.");
            this.zza.zze(new zzdlf("Timeout for show call succeed."));
            this.zza.l = true;
        }
    }
}

