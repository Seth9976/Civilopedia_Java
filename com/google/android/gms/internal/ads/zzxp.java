package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

public final class zzxp {
    public final Handler a;
    public final zzxq b;

    public zzxp(Handler handler0, zzxq zzxq0) {
        if(zzxq0 == null) {
            handler0 = null;
        }
        this.a = handler0;
        this.b = zzxq0;
    }

    public final void zza(String s, long v, long v1) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzxl(this, s, v, v1));
        }
    }

    public final void zzb(String s) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzxo(this, s));
        }
    }

    public final void zzc(zzgl zzgl0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzxk(this, zzgl0));
        }
    }

    public final void zzd(int v, long v1) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzxf(this, v, v1));
        }
    }

    public final void zze(zzgl zzgl0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzxj(this, zzgl0));
        }
    }

    public final void zzf(zzad zzad0, zzgm zzgm0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzxm(this, zzad0, zzgm0));
        }
    }

    public final void zzq(Object object0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzxg(this, object0, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzr(long v, int v1) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzxi(this, v, v1));
        }
    }

    public final void zzs(Exception exception0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzxh(this, exception0));
        }
    }

    public final void zzt(zzcv zzcv0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzxn(this, zzcv0));
        }
    }
}

