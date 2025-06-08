package com.google.android.gms.internal.ads;

import java.util.concurrent.CopyOnWriteArraySet;

public final class zzdi implements Runnable {
    public final CopyOnWriteArraySet zza;
    public final int zzb;
    public final zzdj zzc;

    public zzdi(CopyOnWriteArraySet copyOnWriteArraySet0, int v, zzdj zzdj0) {
        this.zza = copyOnWriteArraySet0;
        this.zzb = v;
        this.zzc = zzdj0;
    }

    @Override
    public final void run() {
        int v = this.zzb;
        zzdj zzdj0 = this.zzc;
        for(Object object0: this.zza) {
            p4 p40 = (p4)object0;
            if(!p40.d) {
                if(v != -1) {
                    p40.b.zza(v);
                }
                p40.c = true;
                zzdj0.zza(p40.a);
            }
        }
    }
}

