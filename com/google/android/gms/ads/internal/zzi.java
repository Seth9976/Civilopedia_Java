package com.google.android.gms.ads.internal;

import T1.c;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzanv;
import com.google.android.gms.internal.ads.zzany;
import com.google.android.gms.internal.ads.zzaob;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzfku;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfmq;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

public final class zzi implements zzany, Runnable {
    public final Vector i;
    public final AtomicReference j;
    public final AtomicReference k;
    public boolean l;
    public final boolean m;
    public final boolean n;
    public final ExecutorService o;
    public final zzfku p;
    public Context q;
    public final Context r;
    public zzcfo s;
    public final zzcfo t;
    public final boolean u;
    public final CountDownLatch v;
    public int w;

    public zzi(Context context0, zzcfo zzcfo0) {
        this.i = new Vector();
        this.j = new AtomicReference();
        this.k = new AtomicReference();
        this.v = new CountDownLatch(1);
        this.q = context0;
        this.r = context0;
        this.s = zzcfo0;
        this.t = zzcfo0;
        ExecutorService executorService0 = Executors.newCachedThreadPool();
        this.o = executorService0;
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzbT)).booleanValue();
        this.u = z;
        this.p = zzfku.zza(context0, executorService0, z);
        this.m = ((Boolean)zzay.zzc().zzb(zzbhz.zzbP)).booleanValue();
        this.n = ((Boolean)zzay.zzc().zzb(zzbhz.zzbU)).booleanValue();
        this.w = ((Boolean)zzay.zzc().zzb(zzbhz.zzbS)).booleanValue() ? 2 : 1;
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzcC)).booleanValue()) {
            this.l = this.a();
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzcw)).booleanValue()) {
            zzcfv.zza.execute(this);
            return;
        }
        if(zzcfb.zzt()) {
            zzcfv.zza.execute(this);
            return;
        }
        this.run();
    }

    public final boolean a() {
        Context context0 = this.q;
        c c0 = new c(this, 1);
        return new zzfmq(context0, zzflw.zzb(context0, this.p), c0, ((Boolean)zzay.zzc().zzb(zzbhz.zzbQ)).booleanValue()).zzd(1);
    }

    // 去混淆评级： 低(30)
    public final zzany b() {
        return (!this.m || this.l ? this.w : 1) == 2 ? ((zzany)this.k.get()) : ((zzany)this.j.get());
    }

    public final void c() {
        zzany zzany0 = this.b();
        Vector vector0 = this.i;
        if(!vector0.isEmpty() && zzany0 != null) {
            for(Object object0: vector0) {
                Object[] arr_object = (Object[])object0;
                int v = arr_object.length;
                if(v == 1) {
                    zzany0.zzk(((MotionEvent)arr_object[0]));
                }
                else if(v == 3) {
                    zzany0.zzl(((int)(((Integer)arr_object[0]))), ((int)(((Integer)arr_object[1]))), ((int)(((Integer)arr_object[2]))));
                }
            }
            vector0.clear();
        }
    }

    public final void d(boolean z) {
        String s = this.s.zza;
        Context context0 = this.q;
        Context context1 = context0.getApplicationContext();
        if(context1 != null) {
            context0 = context1;
        }
        zzaob zzaob0 = zzaob.zzt(s, context0, z, this.w);
        this.j.set(zzaob0);
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch0;
        long v1;
        try {
            countDownLatch0 = this.v;
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzcC)).booleanValue()) {
                this.l = this.a();
            }
            boolean z = this.s.zzd;
            boolean z1 = !((Boolean)zzay.zzc().zzb(zzbhz.zzaQ)).booleanValue() && z;
            if((!this.m || this.l ? this.w : 1) == 1) {
                this.d(z1);
                if(this.w == 2) {
                    zzg zzg0 = new zzg(this, z1);
                    this.o.execute(zzg0);
                }
            }
            else {
                try {
                    v1 = System.currentTimeMillis();
                    String s = this.s.zza;
                    Context context0 = this.q;
                    Context context1 = context0.getApplicationContext();
                    if(context1 != null) {
                        context0 = context1;
                    }
                    zzanv zzanv0 = zzanv.zza(s, context0, z1, this.u);
                    this.k.set(zzanv0);
                    if(this.n && !zzanv0.zzq()) {
                        this.w = 1;
                        this.d(z1);
                    }
                }
                catch(NullPointerException nullPointerException0) {
                    this.w = 1;
                    this.d(z1);
                    this.p.zzc(0x7EF, System.currentTimeMillis() - v1, nullPointerException0);
                }
            }
        }
        finally {
            countDownLatch0.countDown();
            this.q = null;
            this.s = null;
        }
    }

    public final boolean zzd() {
        try {
            this.v.await();
            return true;
        }
        catch(InterruptedException interruptedException0) {
            zzcfi.zzk("Interrupted during GADSignals creation.", interruptedException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zze(Context context0, String s, View view0) {
        return this.zzf(context0, s, view0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zzf(Context context0, String s, View view0, Activity activity0) {
        if(this.zzd()) {
            zzany zzany0 = this.b();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzie)).booleanValue()) {
                zzs.zzF(view0, 4, null);
            }
            if(zzany0 != null) {
                this.c();
                Context context1 = context0.getApplicationContext();
                if(context1 != null) {
                    context0 = context1;
                }
                return zzany0.zzf(context0, s, view0, activity0);
            }
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zzg(Context context0) {
        if(this.zzd()) {
            zzany zzany0 = this.b();
            if(zzany0 != null) {
                this.c();
                Context context1 = context0.getApplicationContext();
                if(context1 != null) {
                    context0 = context1;
                }
                return zzany0.zzg(context0);
            }
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zzh(Context context0, View view0, Activity activity0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzid)).booleanValue()) {
            if(this.zzd()) {
                zzany zzany0 = this.b();
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzie)).booleanValue()) {
                    zzs.zzF(view0, 2, null);
                }
                return zzany0 == null ? "" : zzany0.zzh(context0, view0, activity0);
            }
            return "";
        }
        zzany zzany1 = this.b();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzie)).booleanValue()) {
            zzs.zzF(view0, 2, null);
        }
        return zzany1 == null ? "" : zzany1.zzh(context0, view0, activity0);
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzk(MotionEvent motionEvent0) {
        zzany zzany0 = this.b();
        if(zzany0 != null) {
            this.c();
            zzany0.zzk(motionEvent0);
            return;
        }
        this.i.add(new Object[]{motionEvent0});
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzl(int v, int v1, int v2) {
        zzany zzany0 = this.b();
        if(zzany0 != null) {
            this.c();
            zzany0.zzl(v, v1, v2);
            return;
        }
        this.i.add(new Object[]{v, v1, v2});
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzn(View view0) {
        zzany zzany0 = this.b();
        if(zzany0 != null) {
            zzany0.zzn(view0);
        }
    }
}

