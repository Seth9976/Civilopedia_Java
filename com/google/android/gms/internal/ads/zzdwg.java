package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ConcurrentHashMap;

public final class zzdwg {
    public final ConcurrentHashMap a;
    public final zzdwh b;

    public zzdwg(zzdwh zzdwh0) {
        this.b = zzdwh0;
        this.a = new ConcurrentHashMap();
    }

    public final zzdwg zzb(String s, String s1) {
        this.a.put(s, s1);
        return this;
    }

    public final zzdwg zzc(String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            this.a.put(s, s1);
        }
        return this;
    }

    public final zzdwg zzd(zzfbl zzfbl0) {
        this.a.put("aai", zzfbl0.zzx);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            this.zzc("rid", zzfbl0.zzap);
        }
        return this;
    }

    public final zzdwg zze(zzfbo zzfbo0) {
        this.a.put("gqi", zzfbo0.zzb);
        return this;
    }

    public final String zzf() {
        return this.b.a.e.zza(this.a);
    }

    public final void zzg() {
        zzdwf zzdwf0 = new zzdwf(this);
        this.b.b.execute(zzdwf0);
    }

    public final void zzh() {
        zzdwe zzdwe0 = new zzdwe(this);
        this.b.b.execute(zzdwe0);
    }
}

