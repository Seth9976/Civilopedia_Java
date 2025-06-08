package com.google.android.gms.internal.ads;

import C1.d;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class zzanv implements zzany {
    public final Context i;
    public final zzfmj j;
    public final zzfmq k;
    public final zzfms l;
    public final d m;
    public final zzfku n;
    public final Executor o;
    public final E9 p;
    public final CountDownLatch q;
    public final zzapl r;
    public volatile long s;
    public final Object t;
    public volatile boolean u;
    public volatile boolean v;
    public final int w;
    public static zzanv x;

    public zzanv(Context context0, zzfku zzfku0, zzfmj zzfmj0, zzfmq zzfmq0, zzfms zzfms0, d d0, Executor executor0, zzfkp zzfkp0, int v, zzapl zzapl0) {
        this.s = 0L;
        this.t = new Object();
        this.v = false;
        this.i = context0;
        this.n = zzfku0;
        this.j = zzfmj0;
        this.k = zzfmq0;
        this.l = zzfms0;
        this.m = d0;
        this.o = executor0;
        this.w = v;
        this.r = zzapl0;
        this.q = new CountDownLatch(1);
        this.p = new E9(zzfkp0, 6);
    }

    public static void a(zzanv zzanv0) {
        String s1;
        String s;
        long v = System.currentTimeMillis();
        if(zzanv0.c() == null) {
            s1 = null;
            s = null;
        }
        else {
            s = "";
            s1 = "";
        }
        try {
            byte[] arr_b = zzfle.zza(zzanv0.i, 1, zzanv0.w, s1, s, "1", zzanv0.n).zzb;
            if(arr_b == null) {
                zzanv0.n.zzd(5009, System.currentTimeMillis() - v);
            }
            else if(arr_b.length == 0) {
                zzanv0.n.zzd(5009, System.currentTimeMillis() - v);
            }
            else {
                try {
                    zzaqs.zzc(zzgji.zzv(arr_b), zzgkc.zza());
                }
                catch(NullPointerException unused_ex) {
                    zzanv0.n.zzd(2030, System.currentTimeMillis() - v);
                    return;
                }
                zzanv0.n.zzd(5010, System.currentTimeMillis() - v);
            }
        }
        catch(zzglc zzglc0) {
            zzanv0.n.zzc(4002, System.currentTimeMillis() - v, zzglc0);
        }
        finally {
            zzanv0.q.countDown();
        }
    }

    public final void b() {
        synchronized(this) {
            long v1 = System.currentTimeMillis();
            zzfmi zzfmi0 = this.c();
            if(zzfmi0 != null) {
                if(this.l.zzc(zzfmi0)) {
                    this.v = true;
                    this.q.countDown();
                    return;
                }
                return;
            }
            this.n.zzd(0xFAD, System.currentTimeMillis() - v1);
        }
    }

    public final zzfmi c() {
        if(!zzflw.zza(this.w)) {
            return null;
        }
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzbO)).booleanValue() ? this.k.zzc(1) : this.j.zzd(1);
    }

    public static zzanv zza(String s, Context context0, boolean z, boolean z1) {
        synchronized(zzanv.class) {
            return zzanv.zzb(s, context0, Executors.newCachedThreadPool(), z, z1);
        }
    }

    @Deprecated
    public static zzanv zzb(String s, Context context0, Executor executor0, boolean z, boolean z1) {
        synchronized(zzanv.class) {
            if(zzanv.x == null) {
                zzfkv zzfkv0 = zzfkw.zza();
                zzfkv0.zza(s);
                zzfkv0.zzc(z);
                zzfkw zzfkw0 = zzfkv0.zzd();
                zzfku zzfku0 = zzfku.zza(context0, executor0, z1);
                zzaog zzaog0 = ((Boolean)zzay.zzc().zzb(zzbhz.zzcz)).booleanValue() ? zzaog.zzc(context0) : null;
                zzapl zzapl0 = ((Boolean)zzay.zzc().zzb(zzbhz.zzcA)).booleanValue() ? zzapl.zzd(context0, executor0) : null;
                zzfln zzfln0 = zzfln.zze(context0, executor0, zzfku0, zzfkw0);
                zzaov zzaov0 = new zzaov(context0);
                d d0 = new d(zzfkw0, zzfln0, new zzapj(context0, zzaov0), zzaov0, zzaog0, zzapl0);
                int v1 = zzflw.zzb(context0, zzfku0);
                zzfkp zzfkp0 = new zzfkp();
                zzanv zzanv0 = new zzanv(context0, zzfku0, new zzfmj(context0, v1), new zzfmq(context0, v1, new E9(zzfku0, 5), ((Boolean)zzay.zzc().zzb(zzbhz.zzbQ)).booleanValue()), new zzfms(context0, d0, zzfku0, zzfkp0), d0, executor0, zzfkp0, v1, zzapl0);
                zzanv.x = zzanv0;
                zzanv0.b();
                zzanv.x.zzo();
            }
            return zzanv.x;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zze(Context context0, String s, View view0) {
        return this.zzf(context0, s, view0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zzf(Context context0, String s, View view0, Activity activity0) {
        zzapl zzapl0 = this.r;
        if(zzapl0 != null) {
            zzapl0.zzh();
        }
        this.zzo();
        zzfkx zzfkx0 = this.l.zza();
        if(zzfkx0 != null) {
            String s1 = zzfkx0.zza(context0, null, s, view0, activity0);
            this.n.zzf(5000, 0L, s1, null);
            return s1;
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zzg(Context context0) {
        zzapl zzapl0 = this.r;
        if(zzapl0 != null) {
            zzapl0.zzh();
        }
        this.zzo();
        zzfkx zzfkx0 = this.l.zza();
        if(zzfkx0 != null) {
            String s = zzfkx0.zzc(context0, null);
            this.n.zzf(5001, 0L, s, null);
            return s;
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zzh(Context context0, View view0, Activity activity0) {
        zzapl zzapl0 = this.r;
        if(zzapl0 != null) {
            zzapl0.zzh();
        }
        this.zzo();
        zzfkx zzfkx0 = this.l.zza();
        if(zzfkx0 != null) {
            String s = zzfkx0.zzb(context0, null, view0, activity0);
            this.n.zzf(5002, 0L, s, null);
            return s;
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzk(MotionEvent motionEvent0) {
        zzfkx zzfkx0 = this.l.zza();
        if(zzfkx0 != null) {
            try {
                zzfkx0.zzd(null, motionEvent0);
            }
            catch(zzfmr zzfmr0) {
                this.n.zzc(zzfmr0.zza(), -1L, zzfmr0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzl(int v, int v1, int v2) {
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzn(View view0) {
        ((zzapj)this.m.k).a(view0);
    }

    public final void zzo() {
        if(!this.u) {
            Object object0 = this.t;
            synchronized(object0) {
                if(!this.u) {
                    if(System.currentTimeMillis() / 1000L - this.s < 3600L) {
                        return;
                    }
                    zzfmi zzfmi0 = this.l.zzb();
                    if((zzfmi0 == null || zzfmi0.zzd(3600L)) && zzflw.zza(this.w)) {
                        A0 a00 = new A0(this, 0);
                        this.o.execute(a00);
                    }
                }
            }
        }
    }

    public final boolean zzq() {
        synchronized(this) {
        }
        return this.v;
    }
}

