package com.google.android.gms.measurement.internal;

import B.a;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;

public final class zzkf {
    public final Context a;

    public zzkf(Context context0) {
        Preconditions.checkNotNull(context0);
        this.a = context0;
    }

    public final zzeu a() {
        return zzge.zzp(this.a, null, null).zzay();
    }

    public final int zza(Intent intent0, int v, int v1) {
        zzeu zzeu0 = zzge.zzp(this.a, null, null).zzay();
        if(intent0 == null) {
            zzeu0.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String s = intent0.getAction();
        zzeu0.zzj().zzc("Local AppMeasurementService called. startId, action", v1, s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            this.zzh(new zzkc(this, v1, zzeu0, intent0));
        }
        return 2;
    }

    public final IBinder zzb(Intent intent0) {
        if(intent0 == null) {
            this.a().zzd().zza("onBind called with null intent");
            return null;
        }
        String s = intent0.getAction();
        if("com.google.android.gms.measurement.START".equals(s)) {
            return new zzgw(zzlf.zzt(this.a), null);
        }
        this.a().zzk().zzb("onBind received unknown action", s);
        return null;
    }

    public final void zze() {
        zzge.zzp(this.a, null, null).zzay().zzj().zza("Local AppMeasurementService is starting up");
    }

    public final void zzf() {
        zzge.zzp(this.a, null, null).zzay().zzj().zza("Local AppMeasurementService is shutting down");
    }

    public final void zzg(Intent intent0) {
        if(intent0 == null) {
            this.a().zzd().zza("onRebind called with null intent");
            return;
        }
        String s = intent0.getAction();
        this.a().zzj().zzb("onRebind called. action", s);
    }

    public final void zzh(Runnable runnable0) {
        zzlf zzlf0 = zzlf.zzt(this.a);
        zzlf0.zzaz().zzp(new a(16, zzlf0, runnable0));
    }

    @TargetApi(24)
    public final boolean zzi(JobParameters jobParameters0) {
        zzeu zzeu0 = zzge.zzp(this.a, null, null).zzay();
        String s = jobParameters0.getExtras().getString("action");
        zzeu0.zzj().zzb("Local AppMeasurementJobService called. action", s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            this.zzh(new zzkb(this, zzeu0, jobParameters0));
        }
        return true;
    }

    public final boolean zzj(Intent intent0) {
        if(intent0 == null) {
            this.a().zzd().zza("onUnbind called with null intent");
            return true;
        }
        String s = intent0.getAction();
        this.a().zzj().zzb("onUnbind called for intent. action", s);
        return true;
    }
}

