package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

public final class zzkb implements Runnable {
    public final zzkf zza;
    public final zzeu zzb;
    public final JobParameters zzc;

    public zzkb(zzkf zzkf0, zzeu zzeu0, JobParameters jobParameters0) {
        this.zza = zzkf0;
        this.zzb = zzeu0;
        this.zzc = jobParameters0;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        this.zzb.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((zzke)this.zza.a).zzb(this.zzc, false);
    }
}

