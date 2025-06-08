package com.google.android.gms.measurement.internal;

public final class zzhl implements Runnable {
    public final zzij zza;

    public zzhl(zzij zzij0) {
        this.zza = zzij0;
    }

    @Override
    public final void run() {
        this.zza.zzg();
        zzge zzge0 = this.zza.a;
        if(!zzge0.zzm().q.zzb()) {
            long v = zzge0.zzm().r.zza();
            zzge0.zzm().r.zzb(v + 1L);
            if(v >= 5L) {
                zzge0.zzay().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                zzge0.zzm().q.zza(true);
                return;
            }
            zzge0.zzE();
            return;
        }
        zzge0.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
    }
}

