package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

public final class zzfjj {
    public float a;
    public zzfja b;
    public zzfjc c;
    public static zzfjj d;

    public zzfjj(zzfjb zzfjb0, zzfiz zzfiz0) {
        this.a = 0.0f;
    }

    public final float zza() {
        return this.a;
    }

    public static zzfjj zzb() {
        if(zzfjj.d == null) {
            zzfiz zzfiz0 = new zzfiz();
            zzfjj.d = new zzfjj(new zzfjb(), zzfiz0);
        }
        return zzfjj.d;
    }

    public final void zzc(Context context0) {
        zzfiy zzfiy0 = new zzfiy();
        this.b = new zzfja(new Handler(), context0, zzfiy0, this, null);
    }

    public final void zzd(float f) {
        this.a = f;
        if(this.c == null) {
            this.c = zzfjc.zza();
        }
        for(Object object0: this.c.zzb()) {
            ((zzfir)object0).zzg().zzh(f);
        }
    }

    public final void zze() {
        zzfje.zza().zzg(this);
        zzfje.zza().zzd();
        if(zzfje.zza().zzf()) {
            zzfkf.zzd().zzi();
        }
        this.b.zza();
    }

    public final void zzf() {
        zzfkf.zzd().zzj();
        zzfje.zza().zze();
        this.b.zzb();
    }
}

