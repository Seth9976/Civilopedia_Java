package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.Clock;

public final class zzfbk {
    public final Clock a;
    public final Object b;
    public volatile long c;
    public volatile int d;

    public zzfbk(Clock clock0) {
        this.b = new Object();
        this.d = 1;
        this.c = 0L;
        this.a = clock0;
    }

    public final void a() {
        long v = this.a.currentTimeMillis();
        synchronized(this.b) {
            if(this.d == 3 && this.c + ((long)(((Long)zzay.zzc().zzb(zzbhz.zzeU)))) <= v) {
                this.d = 1;
            }
        }
    }

    public final void b(int v, int v1) {
        this.a();
        long v2 = this.a.currentTimeMillis();
        synchronized(this.b) {
            if(this.d != v) {
                return;
            }
            this.d = v1;
            if(this.d == 3) {
                this.c = v2;
            }
        }
    }

    public final void zza() {
        this.b(2, 3);
    }

    public final void zzb(boolean z) {
        if(z) {
            this.b(1, 2);
            return;
        }
        this.b(2, 1);
    }

    public final boolean zzc() {
        synchronized(this.b) {
            this.a();
            return this.d == 3;
        }
    }

    public final boolean zzd() {
        synchronized(this.b) {
            this.a();
            return this.d == 2;
        }
    }
}

