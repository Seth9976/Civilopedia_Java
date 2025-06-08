package com.google.android.gms.ads.internal.util;

import D3.b;
import com.google.android.gms.internal.ads.zzaix;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzajy;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcga;
import java.util.Map;

public final class zzbn extends zzajb {
    public final zzcga u;
    public final zzcfh v;

    public zzbn(String s, Map map0, zzcga zzcga0) {
        super(0, s, new b(zzcga0, 2));
        this.u = zzcga0;
        zzcfh zzcfh0 = new zzcfh(null);
        this.v = zzcfh0;
        zzcfh0.zzd(s, "GET", null, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzajb
    public final zzajh a(zzaix zzaix0) {
        return zzajh.zzb(zzaix0, zzajy.zzb(zzaix0));
    }

    @Override  // com.google.android.gms.internal.ads.zzajb
    public final void b(Object object0) {
        zzcfh zzcfh0 = this.v;
        zzcfh0.zzf(((zzaix)object0).zzc, ((zzaix)object0).zza);
        byte[] arr_b = ((zzaix)object0).zzb;
        if(zzcfh.zzl() && arr_b != null) {
            zzcfh0.zzh(arr_b);
        }
        this.u.zzd(((zzaix)object0));
    }
}

