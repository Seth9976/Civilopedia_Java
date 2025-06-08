package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public final class zzfcz {
    public final LinkedBlockingDeque a;
    public final Callable b;
    public final zzfvm c;

    public zzfcz(Callable callable0, zzfvm zzfvm0) {
        this.a = new LinkedBlockingDeque();
        this.b = callable0;
        this.c = zzfvm0;
    }

    public final zzfvl zza() {
        synchronized(this) {
            this.zzc(1);
            return (zzfvl)this.a.poll();
        }
    }

    public final void zzb(zzfvl zzfvl0) {
        synchronized(this) {
            this.a.addFirst(zzfvl0);
        }
    }

    public final void zzc(int v) {
        synchronized(this) {
            int v2 = this.a.size();
            for(int v3 = 0; v3 < v - v2; ++v3) {
                zzfvl zzfvl0 = this.c.zzb(this.b);
                this.a.add(zzfvl0);
            }
        }
    }
}

