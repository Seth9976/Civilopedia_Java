package com.google.android.gms.measurement;

import J.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzke;
import com.google.android.gms.measurement.internal.zzkf;

public final class AppMeasurementService extends Service implements zzke {
    public zzkf i;

    public final zzkf a() {
        if(this.i == null) {
            this.i = new zzkf(this);
        }
        return this.i;
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return this.a().zzb(intent0);
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

    @Override  // android.app.Service
    public int onStartCommand(Intent intent0, int v, int v1) {
        this.a().zza(intent0, v, v1);
        return 2;
    }

    @Override  // android.app.Service
    public boolean onUnbind(Intent intent0) {
        this.a().zzj(intent0);
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzke
    public final void zza(Intent intent0) {
        a.completeWakefulIntent(intent0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzke
    public final void zzb(JobParameters jobParameters0, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.measurement.internal.zzke
    public final boolean zzc(int v) {
        return this.stopSelfResult(v);
    }
}

