package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzcjm extends zzb {
    public final zzchr b;
    public final zzcju c;
    public final String d;
    public final String[] e;

    public zzcjm(zzchr zzchr0, zzcju zzcju0, String s, String[] arr_s) {
        this.b = zzchr0;
        this.c = zzcju0;
        this.d = s;
        this.e = arr_s;
        zzt.zzy().zzb(this);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.c.zzr(this.d, this.e);
        }
        finally {
            A0 a00 = new A0(this, 7);
            zzs.zza.post(a00);
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final zzfvl zzb() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbI)).booleanValue() && this.c instanceof zzckd) {
            zzcjk zzcjk0 = new zzcjk(this);
            return zzcfv.zze.zzb(zzcjk0);
        }
        return super.zzb();
    }

    public final String zze() {
        return this.d;
    }
}

