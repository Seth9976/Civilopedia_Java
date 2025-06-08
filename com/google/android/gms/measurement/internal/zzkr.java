package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbt;
import i1.a0;
import i1.c0;
import i1.f;

public final class zzkr extends c0 {
    public final AlarmManager d;
    public a0 e;
    public Integer f;

    public zzkr(zzlf zzlf0) {
        super(zzlf0);
        this.d = (AlarmManager)this.a.zzau().getSystemService("alarm");
    }

    @Override  // i1.c0
    public final void b() {
        AlarmManager alarmManager0 = this.d;
        if(alarmManager0 != null) {
            alarmManager0.cancel(this.d());
        }
        if(Build.VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler0 = (JobScheduler)this.a.zzau().getSystemService("jobscheduler");
            if(jobScheduler0 != null) {
                jobScheduler0.cancel(this.c());
            }
        }
    }

    public final int c() {
        if(this.f == null) {
            this.f = 0xB9F94320;
        }
        return (int)this.f;
    }

    public final PendingIntent d() {
        Context context0 = this.a.zzau();
        return PendingIntent.getBroadcast(context0, 0, new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza);
    }

    public final f e() {
        if(this.e == null) {
            this.e = new a0(this, this.b.l, 1);
        }
        return this.e;
    }

    public final void zza() {
        this.a();
        zzge zzge0 = this.a;
        zzge0.zzay().zzj().zza("Unscheduling upload");
        AlarmManager alarmManager0 = this.d;
        if(alarmManager0 != null) {
            alarmManager0.cancel(this.d());
        }
        this.e().a();
        if(Build.VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler0 = (JobScheduler)zzge0.zzau().getSystemService("jobscheduler");
            if(jobScheduler0 != null) {
                jobScheduler0.cancel(this.c());
            }
        }
    }

    public final void zzd(long v) {
        this.a();
        zzge zzge0 = this.a;
        Context context0 = zzge0.zzau();
        if(!zzln.A(context0)) {
            zzge0.zzay().zzc().zza("Receiver not registered/enabled");
        }
        if(!zzln.B(context0)) {
            zzge0.zzay().zzc().zza("Service not registered/enabled");
        }
        this.zza();
        zzge0.zzay().zzj().zzb("Scheduling upload, millis", v);
        long v1 = zzge0.zzav().elapsedRealtime();
        if(v < Math.max(0L, ((long)(((Long)zzeh.zzw.zza(null))))) && this.e().c == 0L) {
            this.e().c(v);
        }
        if(Build.VERSION.SDK_INT >= 24) {
            Context context1 = zzge0.zzau();
            ComponentName componentName0 = new ComponentName(context1, "com.google.android.gms.measurement.AppMeasurementJobService");
            int v2 = this.c();
            PersistableBundle persistableBundle0 = new PersistableBundle();
            persistableBundle0.putString("action", "com.google.android.gms.measurement.UPLOAD");
            zzbt.zza(context1, new JobInfo.Builder(v2, componentName0).setMinimumLatency(v).setOverrideDeadline(v + v).setExtras(persistableBundle0).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager0 = this.d;
        if(alarmManager0 != null) {
            alarmManager0.setInexactRepeating(2, v1 + v, Math.max(((long)(((Long)zzeh.zzr.zza(null)))), v), this.d());
        }
    }
}

