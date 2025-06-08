package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

public final class zzeva implements zzetg {
    public final zzfvm a;

    public zzeva(zzcef zzcef0, zzfvm zzfvm0, String s, byte[] arr_b) {
        this.a = zzfvm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 0x2F;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzfvl zzfvl0 = zzfvc.zzi(null);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeN)).booleanValue()) {
            zzfvl0 = zzfvc.zzi(null);
        }
        zzfvl zzfvl1 = zzfvc.zzi(null);
        return zzfvc.zzd(new zzfvl[]{zzfvl0, zzfvl1}).zza(new zzeuz(zzfvl0, zzfvl1), zzcfv.zza);
    }
}

