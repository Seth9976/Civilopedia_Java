package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzbiy {
    public MotionEvent a;
    public MotionEvent b;
    public final ScheduledExecutorService c;

    public zzbiy(Context context0, ScheduledExecutorService scheduledExecutorService0, zzbja zzbja0, zzfhs zzfhs0, byte[] arr_b) {
        this.a = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
        this.b = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
        this.c = scheduledExecutorService0;
    }

    public final zzfvl zza() {
        return (zzfut)zzfvc.zzo(zzfut.zzv(zzfvc.zzi(null)), ((long)(((Long)zzbjo.zzc.zze()))), TimeUnit.MILLISECONDS, this.c);
    }

    public final void zzb(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 1 && motionEvent0.getEventTime() > this.a.getEventTime()) {
            this.a = MotionEvent.obtain(motionEvent0);
            return;
        }
        if(motionEvent0.getAction() == 0 && motionEvent0.getEventTime() > this.b.getEventTime()) {
            this.b = MotionEvent.obtain(motionEvent0);
        }
    }
}

