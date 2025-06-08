package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzpc {
    public final CopyOnWriteArrayList a;
    public final int zza;
    public final zzsa zzb;

    public zzpc() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public zzpc(CopyOnWriteArrayList copyOnWriteArrayList0, int v, zzsa zzsa0) {
        this.a = copyOnWriteArrayList0;
        this.zza = v;
        this.zzb = zzsa0;
    }

    public final zzpc zza(int v, zzsa zzsa0) {
        return new zzpc(this.a, v, zzsa0);
    }

    public final void zzb(Handler handler0, zzpd zzpd0) {
        zzpd0.getClass();
        Za za0 = new Za(zzpd0);
        this.a.add(za0);
    }

    public final void zzc(zzpd zzpd0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.a;
        for(Object object0: copyOnWriteArrayList0) {
            Za za0 = (Za)object0;
            if(za0.a == zzpd0) {
                copyOnWriteArrayList0.remove(za0);
            }
        }
    }
}

