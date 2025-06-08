package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;

public final class zzchl {
    public final long a;
    public long b;
    public boolean c;

    public zzchl() {
        this.a = TimeUnit.MILLISECONDS.toNanos(((long)(((Long)zzay.zzc().zzb(zzbhz.zzB)))));
        this.c = true;
    }

    public final void zza(SurfaceTexture surfaceTexture0, zzcgw zzcgw0) {
        if(zzcgw0 == null) {
            return;
        }
        long v = surfaceTexture0.getTimestamp();
        if(!this.c && Math.abs(v - this.b) < this.a) {
            return;
        }
        this.c = false;
        this.b = v;
        zzchk zzchk0 = new zzchk(zzcgw0);
        zzs.zza.post(zzchk0);
    }

    public final void zzb() {
        this.c = true;
    }
}

