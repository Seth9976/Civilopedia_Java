package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

public final class zzdgo implements zzdeo {
    public int i;

    public zzdgo() {
        this.i = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzba)));
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbx0) {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbb)).booleanValue()) {
                this.i = zzfbx0.zzb.zzb.zzc;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzv0) {
    }

    public final int zzc() {
        synchronized(this) {
        }
        return this.i;
    }
}

