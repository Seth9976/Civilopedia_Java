package com.google.android.gms.internal.ads;

public final class zzpv implements Runnable {
    public final db zza;

    public zzpv(db db0) {
        this.zza = db0;
    }

    @Override
    public final void run() {
        db db0 = this.zza;
        synchronized(db0.a) {
            if(db0.l) {
                return;
            }
            long v1 = db0.k - 1L;
            db0.k = v1;
            int v2 = Long.compare(v1, 0L);
            if(v2 > 0) {
                return;
            }
            if(v2 < 0) {
                IllegalStateException illegalStateException0 = new IllegalStateException();
                synchronized(db0.a) {
                    db0.m = illegalStateException0;
                }
                return;
            }
            db0.a();
        }
    }
}

