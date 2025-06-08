package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzdpw implements zzfuj {
    public final zzdqh zza;
    public final String zzb;

    public zzdpw(zzdqh zzdqh0, String s) {
        this.zza = zzdqh0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        String s = this.zzb;
        this.zza.getClass();
        zzcmx zzcmx0 = zzcmx.zza();
        zzcli zzcli0 = zzclu.zza(this.zza.a, zzcmx0, "native-omid", false, false, this.zza.c, null, this.zza.d, null, null, this.zza.e, this.zza.f, null, null);
        zzfvl zzfvl0 = zzcfz.zza(zzcli0);
        zzcli0.zzP().zzz(new zzdpx(((zzcfz)zzfvl0)));
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzee)).booleanValue()) {
            zzcli0.loadData(Base64.encodeToString(s.getBytes(), 1), "text/html", "base64");
            return zzfvl0;
        }
        zzcli0.loadData(s, "text/html", "UTF-8");
        return zzfvl0;
    }
}

