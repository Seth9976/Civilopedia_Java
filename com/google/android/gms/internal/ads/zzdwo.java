package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class zzdwo {
    public final HashMap a;
    public final Executor b;
    public final zzcfn c;
    public final boolean d;
    public final zzfgz e;
    public final boolean f;
    public final boolean g;

    public zzdwo(Executor executor0, zzcfn zzcfn0, zzfgz zzfgz0) {
        this.a = new HashMap();
        this.b = executor0;
        this.c = zzcfn0;
        this.d = ((Boolean)zzay.zzc().zzb(zzbhz.zzbJ)).booleanValue();
        this.e = zzfgz0;
        this.f = ((Boolean)zzay.zzc().zzb(zzbhz.zzbM)).booleanValue();
        this.g = ((Boolean)zzay.zzc().zzb(zzbhz.zzfY)).booleanValue();
    }

    public final void a(Map map0, boolean z) {
        if(!map0.isEmpty()) {
            String s = this.e.zza(map0);
            zze.zza(s);
            boolean z1 = Boolean.parseBoolean(((String)map0.get("scar")));
            if(this.d && (!z || this.f) && (!z1 || this.g)) {
                zzdwn zzdwn0 = new zzdwn(this, s);
                this.b.execute(zzdwn0);
            }
            return;
        }
        zzcfi.zze("Empty paramMap.");
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.a);
    }

    public final void zzd(Map map0) {
        this.a(map0, true);
    }

    public final void zze(Map map0) {
        this.a(map0, false);
    }
}

