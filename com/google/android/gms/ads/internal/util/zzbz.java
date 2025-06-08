package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.zzt;

public final class zzbz {
    public long a;
    public long b;
    public final Object c;

    public zzbz(long v) {
        this.b = 0x8000000000000000L;
        this.c = new Object();
        this.a = v;
    }

    public final void zza(long v) {
        synchronized(this.c) {
            this.a = v;
        }
    }

    public final boolean zzb() {
        synchronized(this.c) {
            long v1 = zzt.zzA().elapsedRealtime();
            if(this.b + this.a > v1) {
                return false;
            }
            this.b = v1;
            return true;
        }
    }
}

