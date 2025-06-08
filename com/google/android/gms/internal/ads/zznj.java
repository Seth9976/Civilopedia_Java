package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class zznj {
    public final Handler a;
    public final zznk b;

    public zznj(Handler handler0, zznk zznk0) {
        if(zznk0 == null) {
            handler0 = null;
        }
        this.a = handler0;
        this.b = zznk0;
    }

    public final void zza(Exception exception0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzmz(this, exception0));
        }
    }

    public final void zzb(Exception exception0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zznf(this, exception0));
        }
    }

    public final void zzc(String s, long v, long v1) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzne(this, s, v, v1));
        }
    }

    public final void zzd(String s) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzng(this, s));
        }
    }

    public final void zze(zzgl zzgl0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzna(this, zzgl0));
        }
    }

    public final void zzf(zzgl zzgl0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zznb(this, zzgl0));
        }
    }

    public final void zzg(zzad zzad0, zzgm zzgm0) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zznh(this, zzad0, zzgm0));
        }
    }

    public final void zzr(long v) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zznc(this, v));
        }
    }

    public final void zzs(boolean z) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zznd(this, z));
        }
    }

    public final void zzt(int v, long v1, long v2) {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.post(new zzni(this, v, v1, v2));
        }
    }
}

