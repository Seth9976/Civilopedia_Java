package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;

public final class zzckb implements Runnable {
    public final zzckd zza;

    public zzckb(zzckd zzckd0) {
        this.zza = zzckd0;
    }

    @Override
    public final void run() {
        long v11;
        String s4;
        long v9;
        int v8;
        int v7;
        long v6;
        long v5;
        long v4;
        String s3;
        long v3;
        long v2;
        String s2;
        zzckd zzckd1;
        boolean z;
        long v1;
        long v;
        zzckd zzckd0 = this.zza;
        String s = "cache:" + zzcfb.zze(zzckd0.m);
        String s1 = "error";
        try {
            v = (long)(((Long)zzay.zzc().zzb(zzbhz.zzv)));
            v1 = (long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzu)))));
            z = ((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();
            __monitor_enter(zzckd0);
        }
        catch(Exception exception0) {
            zzckd1 = zzckd0;
            s2 = s;
            goto label_94;
        }
        try {
            if(zzt.zzA().currentTimeMillis() - zzckd0.q > v * 1000L) {
                zzckd1 = zzckd0;
                s2 = s;
                s1 = "downloadTimeout";
                throw new IOException("Timeout reached. Limit: " + v * 1000L + " ms");
            }
            if(zzckd0.n) {
                zzckd1 = zzckd0;
                s2 = s;
                s1 = "externalAbort";
                throw new IOException("Abort requested before buffering finished. ");
            }
            if(zzckd0.o) {
                __monitor_exit(zzckd0);
                zzckd1 = zzckd0;
            }
            else {
                if(!zzckd0.l.zzR()) {
                    zzckd1 = zzckd0;
                    s2 = s;
                    s1 = "exoPlayerReleased";
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                v2 = zzckd0.l.zzz();
                if(v2 <= 0L) {
                    goto label_71;
                }
                v3 = zzckd0.l.zzv();
                if(v3 == zzckd0.r) {
                    goto label_53;
                }
                else {
                    goto label_23;
                }
                goto label_58;
            }
            goto label_99;
        }
        catch(Throwable throwable0) {
            zzckd1 = zzckd0;
            s2 = s;
            goto label_91;
        }
        try {
        label_23:
            s3 = zzckd0.m;
            if(z) {
                v4 = zzckd0.l.zzA();
            }
            else {
                goto label_27;
            }
            goto label_28;
        }
        catch(Throwable throwable0) {
            zzckd1 = zzckd0;
            s2 = s;
            goto label_91;
        }
        try {
            v4 = zzckd0.l.zzA();
            goto label_28;
        label_27:
            v4 = -1L;
        label_28:
            v5 = z ? zzckd0.l.zzx() : -1L;
            v6 = z ? zzckd0.l.zzB() : -1L;
        }
        catch(Throwable throwable0) {
            zzckd1 = zzckd0;
            s2 = s;
            goto label_91;
        }
        try {
            v7 = zzchi.zzs();
            v8 = zzchi.zzu();
            v9 = v1;
            zzckd1 = zzckd0;
            s4 = s;
            goto label_48;
        }
        catch(Throwable throwable0) {
            try {
                zzckd1 = zzckd0;
                s2 = s;
                goto label_91;
            label_48:
                zzckd0.zzg(s3, s, v3, v2, v3 > 0L, v4, v5, v6, v7, v8);
                long v10 = v3;
                zzckd1.r = v10;
                v11 = v2;
                goto label_58;
            label_53:
                v10 = v3;
                v9 = v1;
                zzckd1 = zzckd0;
                s4 = s;
                v11 = v2;
            label_58:
                if(v10 >= v11) {
                    s2 = s4;
                    goto label_64;
                }
                else {
                    goto label_67;
                }
                goto label_99;
            }
            catch(Throwable throwable0) {
            }
        }
        s2 = s4;
        goto label_91;
        try {
        label_64:
            zzckd1.zze(zzckd1.m, s2, v11);
            __monitor_exit(zzckd1);
            goto label_99;
        label_67:
            s2 = s4;
            if(zzckd1.l.zzw() >= v9 && v10 > 0L) {
                __monitor_exit(zzckd1);
                goto label_99;
            label_71:
                zzckd1 = zzckd0;
                s2 = s;
            }
            __monitor_exit(zzckd1);
        }
        catch(Throwable throwable0) {
            goto label_91;
        }
        long v12 = (long)(((Long)zzay.zzc().zzb(zzbhz.zzw)));
        zzckb zzckb0 = new zzckb(zzckd1);
        zzs.zza.postDelayed(zzckb0, v12);
        return;
        try {
            zzckd1 = zzckd0;
            s2 = s;
            s1 = "exoPlayerReleased";
            throw new IOException("ExoPlayer was released during preloading.");
        label_91:
            __monitor_exit(zzckd1);
        }
        catch(Throwable throwable0) {
            goto label_91;
        }
        try {
            throw throwable0;
        }
        catch(Exception exception0) {
        }
    label_94:
        zzcfi.zzj(("Failed to preload url " + zzckd1.m + " Exception: " + exception0.getMessage()));
        zzt.zzo().zzs(exception0, "VideoStreamExoPlayerCache.preload");
        zzckd1.release();
        String s5 = zzckd.b(s1, exception0);
        zzckd1.zzc(zzckd1.m, s2, s1, s5);
    label_99:
        zzt.zzy().zzc(zzckd1.p);
    }
}

