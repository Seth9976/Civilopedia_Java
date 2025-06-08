package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbsm {
    public final Object a;
    public final Context b;
    public final String c;
    public final zzcfo d;
    public final zzfhu e;
    public final zzbb f;
    public final zzbb g;
    public zzbsl h;
    public int i;

    public zzbsm(Context context0, zzcfo zzcfo0, String s, zzbb zzbb0, zzbb zzbb1, zzfhu zzfhu0) {
        this.a = new Object();
        this.i = 1;
        this.c = s;
        this.b = context0.getApplicationContext();
        this.d = zzcfo0;
        this.e = zzfhu0;
        this.f = zzbb0;
        this.g = zzbb1;
    }

    public final zzbsl a() {
        zzfhh zzfhh0 = zzfhg.zza(this.b, 6);
        zzfhh0.zzf();
        zzbsl zzbsl0 = new zzbsl(this.g);
        zzbrt zzbrt0 = new zzbrt(this, null, zzbsl0);
        zzcfv.zze.execute(zzbrt0);
        zzbsl0.zzi(new Y1(this, zzbsl0, zzfhh0), new Y1(this, zzbsl0, zzfhh0));
        return zzbsl0;
    }

    public final zzbsg zzb(zzaoc zzaoc0) {
        synchronized(this.a) {
            synchronized(this.a) {
                zzbsl zzbsl0 = this.h;
                if(zzbsl0 != null && this.i == 0) {
                    zzbsl0.zzi(new zzbrr(this), zzbrs.zza);
                }
            }
            if(this.h != null && this.h.zze() != -1) {
                int v2 = this.i;
                if(v2 == 0) {
                    return this.h.zza();
                }
                if(v2 == 1) {
                    this.i = 2;
                    this.a();
                    return this.h.zza();
                }
                return this.h.zza();
            }
            this.i = 2;
            zzbsl zzbsl1 = this.a();
            this.h = zzbsl1;
            return zzbsl1.zza();
        }
    }
}

