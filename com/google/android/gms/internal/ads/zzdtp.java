package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zza;

public final class zzdtp {
    public final Context a;
    public final zzaoc b;
    public final zzbiy c;
    public final zzcfo d;
    public final zza e;
    public final zzbdm f;
    public final zzdei g;

    public zzdtp(zzclu zzclu0, Context context0, zzaoc zzaoc0, zzbiy zzbiy0, zzcfo zzcfo0, zza zza0, zzbdm zzbdm0, zzdei zzdei0) {
        this.a = context0;
        this.b = zzaoc0;
        this.c = zzbiy0;
        this.d = zzcfo0;
        this.e = zza0;
        this.f = zzbdm0;
        this.g = zzdei0;
    }

    public final zzcli zza(zzq zzq0, zzfbl zzfbl0, zzfbo zzfbo0) throws zzclt {
        zzcmx zzcmx0 = zzcmx.zzc(zzq0);
        E9 e90 = new E9(this, 19);
        return zzclu.zza(this.a, zzcmx0, zzq0.zza, false, false, this.b, this.c, this.d, null, e90, this.e, this.f, zzfbl0, zzfbo0);
    }
}

