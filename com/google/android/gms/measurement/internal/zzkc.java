package com.google.android.gms.measurement.internal;

import android.content.Intent;

public final class zzkc implements Runnable {
    public final zzkf zza;
    public final int zzb;
    public final zzeu zzc;
    public final Intent zzd;

    public zzkc(zzkf zzkf0, int v, zzeu zzeu0, Intent intent0) {
        this.zza = zzkf0;
        this.zzb = v;
        this.zzc = zzeu0;
        this.zzd = intent0;
    }

    @Override
    public final void run() {
        zzkf zzkf0 = this.zza;
        int v = this.zzb;
        zzeu zzeu0 = this.zzc;
        Intent intent0 = this.zzd;
        zzke zzke0 = (zzke)zzkf0.a;
        if(zzke0.zzc(v)) {
            zzeu0.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", v);
            zzkf0.a().zzj().zza("Completed wakeful intent.");
            zzke0.zza(intent0);
        }
    }
}

