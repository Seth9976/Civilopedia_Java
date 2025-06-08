package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzvs {
    public final CopyOnWriteArrayList a;

    public zzvs() {
        this.a = new CopyOnWriteArrayList();
    }

    public final void zza(Handler handler0, zzvt zzvt0) {
        this.zzc(zzvt0);
        Gb gb0 = new Gb(handler0, zzvt0);
        this.a.add(gb0);
    }

    public final void zzb(int v, long v1, long v2) {
        for(Object object0: this.a) {
            Gb gb0 = (Gb)object0;
            if(!gb0.c) {
                zzvq zzvq0 = new zzvq(gb0, v, v1, v2);
                gb0.a.post(zzvq0);
            }
        }
    }

    public final void zzc(zzvt zzvt0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.a;
        for(Object object0: copyOnWriteArrayList0) {
            Gb gb0 = (Gb)object0;
            if(gb0.b == zzvt0) {
                gb0.c = true;
                copyOnWriteArrayList0.remove(gb0);
            }
        }
    }
}

