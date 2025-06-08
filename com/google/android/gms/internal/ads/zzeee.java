package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

public final class zzeee implements zzfgg {
    public final zzeds i;
    public final zzedw j;

    public zzeee(zzeds zzeds0, zzedw zzedw0) {
        this.i = zzeds0;
        this.j = zzedw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzbF(zzffz zzffz0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzbG(zzffz zzffz0, String s, Throwable throwable0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && zzffz.zzd == zzffz0) {
            zzeds zzeds0 = this.i;
            if(zzeds0.zzc() != 0L) {
                zzeds0.zzf(zzt.zzA().elapsedRealtime() - zzeds0.zzc());
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzc(zzffz zzffz0, String s) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfg)).booleanValue()) {
            return;
        }
        zzeds zzeds0 = this.i;
        if(zzffz.zzd == zzffz0) {
            zzeds0.zzg(zzt.zzA().elapsedRealtime());
            return;
        }
        if(zzffz.zzx != zzffz0 && zzffz.zzc != zzffz0) {
            return;
        }
        zzeds0.zzh(zzt.zzA().elapsedRealtime());
        long v = zzeds0.zzd();
        zzedv zzedv0 = new zzedv(this.j, v);
        this.j.b.zza(zzedv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzd(zzffz zzffz0, String s) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && zzffz.zzd == zzffz0) {
            zzeds zzeds0 = this.i;
            if(zzeds0.zzc() != 0L) {
                zzeds0.zzf(zzt.zzA().elapsedRealtime() - zzeds0.zzc());
            }
        }
    }
}

