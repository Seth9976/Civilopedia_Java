package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class zzwj {
    public final ExecutorService a;
    public Hb b;
    public IOException c;
    public static final zzwd zza;
    public static final zzwd zzb;
    public static final zzwd zzc;
    public static final zzwd zzd;

    static {
        zzwj.zza = new zzwd(0, 0x8000000000000001L);
        zzwj.zzb = new zzwd(1, 0x8000000000000001L);
        zzwj.zzc = new zzwd(2, 0x8000000000000001L);
        zzwj.zzd = new zzwd(3, 0x8000000000000001L);
    }

    public zzwj(String s) {
        this.a = zzeg.zzP("ExoPlayer:Loader:ProgressiveMediaPeriod");
    }

    public final long zza(zzwf zzwf0, zzwb zzwb0, int v) {
        Looper looper0 = Looper.myLooper();
        zzcw.zzb(looper0);
        this.c = null;
        long v1 = SystemClock.elapsedRealtime();
        Hb hb0 = new Hb(this, looper0, zzwf0, zzwb0, v1);
        zzcw.zzf(this.b == null);
        this.b = hb0;
        hb0.l = null;
        this.a.execute(hb0);
        return v1;
    }

    public static zzwd zzb(boolean z, long v) {
        return new zzwd(((int)z), v);
    }

    public final void zzg() {
        Hb hb0 = this.b;
        zzcw.zzb(hb0);
        hb0.a(false);
    }

    public final void zzh() {
        this.c = null;
    }

    public final void zzi(int v) throws IOException {
        IOException iOException0 = this.c;
        if(iOException0 != null) {
            throw iOException0;
        }
        Hb hb0 = this.b;
        if(hb0 != null) {
            IOException iOException1 = hb0.l;
            if(iOException1 != null && hb0.m > v) {
                throw iOException1;
            }
        }
    }

    public final void zzj(zzwg zzwg0) {
        Hb hb0 = this.b;
        if(hb0 != null) {
            hb0.a(true);
        }
        A0 a00 = new A0(zzwg0, 13);
        this.a.execute(a00);
        this.a.shutdown();
    }

    public final boolean zzk() {
        return this.c != null;
    }

    public final boolean zzl() {
        return this.b != null;
    }
}

