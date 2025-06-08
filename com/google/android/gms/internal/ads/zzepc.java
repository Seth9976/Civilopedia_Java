package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

public final class zzepc implements zzetg {
    public final String a;
    public final String b;
    public final zzczk c;
    public final zzfdi d;
    public final zzfcd e;
    public final zzg f;
    public final zzdwc g;
    public static final Object h;

    static {
        zzepc.h = new Object();
    }

    public zzepc(String s, String s1, zzczk zzczk0, zzfdi zzfdi0, zzfcd zzfcd0, zzdwc zzdwc0) {
        this.a = s;
        this.b = s1;
        this.c = zzczk0;
        this.d = zzfdi0;
        this.e = zzfcd0;
        this.f = zzt.zzo().zzh();
        this.g = zzdwc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 12;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        Bundle bundle0 = new Bundle();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzgw)).booleanValue()) {
            this.g.zza().put("seq_num", this.a);
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeB)).booleanValue()) {
            this.c.zzg(this.e.zzd);
            bundle0.putAll(this.d.zzb());
        }
        return zzfvc.zzi(new zzepb(this, bundle0));
    }
}

