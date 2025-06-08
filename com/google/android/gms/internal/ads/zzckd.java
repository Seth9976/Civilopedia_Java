package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

public final class zzckd extends zzcju implements zzchh {
    public zzchi l;
    public String m;
    public boolean n;
    public boolean o;
    public zzcjm p;
    public long q;
    public long r;
    public static final int zzd;

    public zzckd(zzchr zzchr0, zzchq zzchq0) {
        super(zzchr0);
        Context context0 = zzchr0.getContext();
        zzckv zzckv0 = zzchq0.zzm ? new zzckv(context0, zzchq0, ((zzchr)this.k.get())) : new zzciz(context0, zzchq0, ((zzchr)this.k.get()));
        this.l = zzckv0;
        zzckv0.zzI(this);
    }

    public static String b(String s, Exception exception0) {
        return s + "/" + exception0.getClass().getCanonicalName() + ":" + exception0.getMessage();
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final void release() {
        zzchi zzchi0 = this.l;
        if(zzchi0 != null) {
            zzchi0.zzI(null);
            this.l.zzE();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzC(int v, int v1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
        synchronized(this) {
            this.n = true;
            this.notify();
            this.release();
        }
        String s = this.m;
        if(s != null) {
            String s1 = "cache:" + zzcfb.zze(s);
            this.zzc(this.m, s1, "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final void zzh(int v) {
        this.l.zzG(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzi(boolean z, long v) {
        zzchr zzchr0 = (zzchr)this.k.get();
        if(zzchr0 != null) {
            zzckc zzckc0 = new zzckc(zzchr0, z, v);
            zzcfv.zze.execute(zzckc0);
        }
    }

    public final zzchi zzj() {
        synchronized(this) {
            this.o = true;
            this.notify();
        }
        this.l.zzI(null);
        zzchi zzchi0 = this.l;
        this.l = null;
        return zzchi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzk(String s, Exception exception0) {
        zzcfi.zzk("Precache error", exception0);
        zzt.zzo().zzs(exception0, "VideoStreamExoPlayerCache.onError");
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzl(String s, Exception exception0) {
        zzcfi.zzk("Precache exception", exception0);
        zzt.zzo().zzs(exception0, "VideoStreamExoPlayerCache.onException");
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzm(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final void zzn(int v) {
        this.l.zzH(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final void zzo(int v) {
        this.l.zzJ(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final void zzp(int v) {
        this.l.zzK(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final boolean zzq(String s) {
        return this.zzr(s, new String[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final boolean zzr(String s, String[] arr_s) {
        long v15;
        String s6;
        long v14;
        long v13;
        long v12;
        long v11;
        long v10;
        long v9;
        long v8;
        long v7;
        long v6;
        zzckd zzckd1;
        String s5;
        String s4;
        long v5;
        boolean z;
        long v4;
        long v3;
        long v2;
        zzckd zzckd0 = this;
        String s1 = s;
        zzckd0.m = s1;
        String s2 = "cache:" + zzcfb.zze(s);
        String s3 = "error";
        try {
            Uri[] arr_uri = new Uri[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                arr_uri[v] = Uri.parse(arr_s[v]);
            }
            zzckd0.l.zzC(arr_uri, zzckd0.j);
            zzchr zzchr0 = (zzchr)zzckd0.k.get();
            if(zzchr0 != null) {
                zzchr0.zzv(s2, zzckd0);
            }
            Clock clock0 = zzt.zzA();
            long v1 = clock0.currentTimeMillis();
            v2 = (long)(((Long)zzay.zzc().zzb(zzbhz.zzw)));
            v3 = ((long)(((Long)zzay.zzc().zzb(zzbhz.zzv)))) * 1000L;
            v4 = (long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzu)))));
            z = ((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();
            v5 = -1L;
            while(true) {
            label_22:
                __monitor_enter(this);
                break;
            }
        }
        catch(Exception exception0) {
            s4 = s1;
            s5 = s2;
            zzckd1 = zzckd0;
            goto label_118;
        }
        try {
            if(clock0.currentTimeMillis() - v1 > v3) {
                goto label_109;
            }
            if(zzckd0.n) {
                goto label_104;
            }
            if(zzckd0.o) {
                __monitor_exit(this);
                return true;
            }
            if(!zzckd0.l.zzR()) {
                goto label_99;
            }
            v6 = zzckd0.l.zzz();
            if(v6 > 0L) {
                v7 = zzckd0.l.zzv();
                if(v7 == v5) {
                    goto label_55;
                }
                else {
                    v8 = z ? zzckd0.l.zzA() : -1L;
                    v9 = z ? zzckd0.l.zzx() : -1L;
                    v10 = z ? zzckd0.l.zzB() : -1L;
                    goto label_42;
                }
                goto label_60;
            }
            else {
                goto label_75;
            }
            goto label_87;
        }
        catch(Throwable throwable0) {
            s4 = s1;
            s5 = s2;
            zzckd1 = zzckd0;
            goto label_115;
        }
        try {
        label_42:
            v11 = v6;
            v12 = v4;
            v13 = v3;
            v14 = v2;
            s6 = s2;
            this.zzg(s, s2, v7, v11, v7 > 0L, v8, v9, v10, zzchi.zzs(), zzchi.zzu());
            v5 = v7;
            goto label_60;
        }
        catch(Throwable throwable0) {
            zzckd1 = this;
            s4 = s;
            s5 = s6;
            goto label_115;
        }
        try {
        label_55:
            v11 = v6;
            v12 = v4;
            v13 = v3;
            v14 = v2;
            s6 = s2;
        }
        catch(Throwable throwable0) {
            s4 = s1;
            s5 = s2;
            zzckd1 = zzckd0;
            goto label_115;
        }
        try {
        label_60:
            if(v7 >= v11) {
                zzckd1 = this;
                s4 = s;
                s5 = s6;
                zzckd1.zze(s4, s5, v11);
                __monitor_exit(this);
                return true;
            }
            zzckd1 = this;
            s4 = s;
            s5 = s6;
            if(zzckd1.l.zzw() >= v12 && v7 > 0L) {
                __monitor_exit(this);
                return true;
            }
            v15 = v14;
            goto label_87;
        }
        catch(Throwable throwable0) {
            goto label_115;
        }
        try {
        label_75:
            v12 = v4;
            v13 = v3;
            s4 = s1;
            s5 = s2;
            zzckd1 = zzckd0;
            v15 = v2;
        }
        catch(Throwable throwable0) {
            s4 = s1;
            s5 = s2;
            zzckd1 = zzckd0;
            goto label_115;
        }
        try {
            try {
            label_87:
                zzckd1.wait(v15);
            }
            catch(InterruptedException unused_ex) {
                s3 = "interrupted";
                throw new IOException("Wait interrupted.");
            }
            __monitor_exit(this);
            zzckd0 = zzckd1;
            s1 = s4;
            s2 = s5;
            v2 = v15;
            v4 = v12;
            v3 = v13;
            goto label_22;
        label_99:
            s4 = s1;
            s5 = s2;
            zzckd1 = zzckd0;
            s3 = "exoPlayerReleased";
            throw new IOException("ExoPlayer was released during preloading.");
        label_104:
            s4 = s1;
            s5 = s2;
            zzckd1 = zzckd0;
            s3 = "externalAbort";
            throw new IOException("Abort requested before buffering finished. ");
        label_109:
            s4 = s1;
            s5 = s2;
            zzckd1 = zzckd0;
            s3 = "downloadTimeout";
            throw new IOException("Timeout reached. Limit: " + v3 + " ms");
        label_115:
            __monitor_exit(this);
        }
        catch(Throwable throwable0) {
            goto label_115;
        }
        try {
            throw throwable0;
        }
        catch(Exception exception0) {
        }
    label_118:
        zzcfi.zzj(("Failed to preload url " + s4 + " Exception: " + exception0.getMessage()));
        zzt.zzo().zzs(exception0, "VideoStreamExoPlayerCache.preload");
        this.release();
        zzckd1.zzc(s4, s5, s3, zzckd.b(s3, exception0));
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final boolean zzs(String s, String[] arr_s, zzcjm zzcjm0) {
        this.m = s;
        this.p = zzcjm0;
        String s1 = "cache:" + zzcfb.zze(s);
        try {
            Uri[] arr_uri = new Uri[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                arr_uri[v] = Uri.parse(arr_s[v]);
            }
            this.l.zzC(arr_uri, this.j);
            zzchr zzchr0 = (zzchr)this.k.get();
            if(zzchr0 != null) {
                zzchr0.zzv(s1, this);
            }
            this.q = zzt.zzA().currentTimeMillis();
            this.r = -1L;
            zzckb zzckb0 = new zzckb(this);
            zzs.zza.postDelayed(zzckb0, 0L);
            return true;
        }
        catch(Exception exception0) {
        }
        zzcfi.zzj(("Failed to preload url " + s + " Exception: " + exception0.getMessage()));
        zzt.zzo().zzs(exception0, "VideoStreamExoPlayerCache.preload");
        this.release();
        this.zzc(s, s1, "error", zzckd.b("error", exception0));
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzv() {
        zzcfi.zzj("Precache onRenderedFirstFrame");
    }
}

