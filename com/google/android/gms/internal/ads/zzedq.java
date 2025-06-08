package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzedq implements zzdbw, zzddh {
    public final zzg i;
    public final zzeea j;
    public static final Object k;
    public static int l;

    static {
        zzedq.k = new Object();
    }

    public zzedq(zzeea zzeea0, zzg zzg0) {
        this.j = zzeea0;
        this.i = zzg0;
    }

    public final void a(boolean z) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfg)).booleanValue()) {
            return;
        }
        if(!this.i.zzP()) {
            Object object0 = zzedq.k;
            synchronized(object0) {
                int v = zzedq.l;
                int v1 = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzfh)));
            }
            if(v >= v1) {
                return;
            }
            this.j.zzd(z);
            synchronized(object0) {
                ++zzedq.l;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        this.a(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        this.a(true);
    }
}

