package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

public final class zzdbm extends zzdg {
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final long m;
    public final String n;
    public final zzefi o;
    public final Bundle p;

    public zzdbm(zzfbl zzfbl0, String s, zzefi zzefi0, zzfbo zzfbo0) {
        String s1 = null;
        this.j = zzfbl0 == null ? null : zzfbl0.zzac;
        this.k = zzfbo0 == null ? null : zzfbo0.zzb;
        if("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(s) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(s)) {
            try {
                s1 = zzfbl0.zzw.getString("class_name");
            }
            catch(JSONException unused_ex) {
            }
        }
        if(s1 != null) {
            s = s1;
        }
        this.i = s;
        this.l = zzefi0.zzc();
        this.o = zzefi0;
        this.m = zzt.zzA().currentTimeMillis() / 1000L;
        this.p = !((Boolean)zzay.zzc().zzb(zzbhz.zzfN)).booleanValue() || zzfbo0 == null ? new Bundle() : zzfbo0.zzj;
        this.n = !((Boolean)zzay.zzc().zzb(zzbhz.zzhM)).booleanValue() || zzfbo0 == null || TextUtils.isEmpty(zzfbo0.zzh) ? "" : zzfbo0.zzh;
    }

    public final long zzc() {
        return this.m;
    }

    public final String zzd() {
        return this.n;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final Bundle zze() {
        return this.p;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final zzu zzf() {
        return this.o == null ? null : this.o.zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final String zzg() {
        return this.i;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final String zzh() {
        return this.j;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final List zzi() {
        return this.l;
    }

    public final String zzj() {
        return this.k;
    }
}

