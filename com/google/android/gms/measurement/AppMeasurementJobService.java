package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzke;
import com.google.android.gms.measurement.internal.zzkf;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements zzke {
    public zzkf i;

    public final zzkf a() {
        if(this.i == null) {
            this.i = new zzkf(this);
        }
        return this.i;
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a().zze();
    }

    @Override  // android.app.Service
    public void onDestroy() {
        this.a().zzf();
        super.onDestroy();
    }

    @Override  // android.app.Service
    public void onRebind(Intent intent0) {
        this.a().zzg(intent0);
    }

    @Override  // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters0) {
        this.a().zzi(jobParameters0);
        return true;
    }

    @Override  // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters0) {
        return false;
    }

    @Override  // android.app.Service
    public boolean onUnbind(Intent intent0) {
        this.a().zzj(intent0);
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzke
    public final void zza(Intent intent0) {
    }

    @Override  // com.google.android.gms.measurement.internal.zzke
    @TargetApi(24)
    public final void zzb(JobParameters jobParameters0, boolean z) {
        this.jobFinished(jobParameters0, false);
    }

    @Override  // com.google.android.gms.measurement.internal.zzke
    public final boolean zzc(int v) {
        throw new UnsupportedOperationException();
    }
}

