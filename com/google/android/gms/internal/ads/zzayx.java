package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class zzayx {
    public final ExecutorService a;
    public s1 b;
    public IOException c;

    public zzayx(String s) {
        this.a = zzazo.zzl("Loader:ExtractorMediaPeriod");
    }

    public final long zza(zzayv zzayv0, zzayt zzayt0, int v) {
        Looper looper0 = Looper.myLooper();
        boolean z = false;
        zzayz.zze(looper0 != null);
        long v1 = SystemClock.elapsedRealtime();
        s1 s10 = new s1(this, looper0, zzayv0, zzayt0, v, v1);
        if(this.b == null) {
            z = true;
        }
        zzayz.zze(z);
        this.b = s10;
        s10.m = null;
        this.a.execute(s10);
        return v1;
    }

    public final void zzf() {
        this.b.a(false);
    }

    public final void zzg(int v) throws IOException {
        IOException iOException0 = this.c;
        if(iOException0 != null) {
            throw iOException0;
        }
        s1 s10 = this.b;
        if(s10 != null) {
            IOException iOException1 = s10.m;
            if(iOException1 != null && s10.n > s10.k) {
                throw iOException1;
            }
        }
    }

    public final void zzh(Runnable runnable0) {
        s1 s10 = this.b;
        if(s10 != null) {
            s10.a(true);
        }
        this.a.execute(runnable0);
        this.a.shutdown();
    }

    public final boolean zzi() {
        return this.b != null;
    }
}

