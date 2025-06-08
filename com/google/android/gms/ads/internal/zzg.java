package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzanv;

public final class zzg implements Runnable {
    public final zzi zza;
    public final boolean zzb;

    public zzg(zzi zzi0, boolean z) {
        this.zza = zzi0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        zzi zzi0 = this.zza;
        boolean z = this.zzb;
        zzi0.getClass();
        long v = System.currentTimeMillis();
        try {
            String s = zzi0.t.zza;
            Context context0 = zzi0.r;
            Context context1 = context0.getApplicationContext();
            if(context1 != null) {
                context0 = context1;
            }
            zzanv.zza(s, context0, z, zzi0.u).zzo();
        }
        catch(NullPointerException nullPointerException0) {
            zzi0.p.zzc(2027, System.currentTimeMillis() - v, nullPointerException0);
        }
    }
}

