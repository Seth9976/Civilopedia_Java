package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzdyj {
    public boolean a;
    public boolean b;
    public boolean c;
    public final long d;
    public final zzcga e;
    public final Context f;
    public final WeakReference g;
    public final zzduc h;
    public final Executor i;
    public final Executor j;
    public final ScheduledExecutorService k;
    public final zzdwq l;
    public final zzcfo m;
    public final ConcurrentHashMap n;
    public final zzdik o;
    public final zzfhu p;
    public boolean q;

    public zzdyj(Executor executor0, Context context0, WeakReference weakReference0, Executor executor1, zzduc zzduc0, ScheduledExecutorService scheduledExecutorService0, zzdwq zzdwq0, zzcfo zzcfo0, zzdik zzdik0, zzfhu zzfhu0) {
        this.a = false;
        this.b = false;
        this.c = false;
        this.e = new zzcga();
        this.n = new ConcurrentHashMap();
        this.q = true;
        this.h = zzduc0;
        this.f = context0;
        this.g = weakReference0;
        this.i = executor1;
        this.k = scheduledExecutorService0;
        this.j = executor0;
        this.l = zzdwq0;
        this.m = zzcfo0;
        this.o = zzdik0;
        this.p = zzfhu0;
        this.d = zzt.zzA().elapsedRealtime();
        this.b("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final zzfvl a() {
        synchronized(this) {
            String s = zzt.zzo().zzh().zzh().zzc();
            if(!TextUtils.isEmpty(s)) {
                return zzfvc.zzi(s);
            }
            zzfvl zzfvl1 = new zzcga();
            zzt.zzo().zzh().zzq(new zzdyf(this, ((zzcga)zzfvl1)));
            return zzfvl1;
        }
    }

    public final void b(String s, int v, String s1, boolean z) {
        zzbqg zzbqg0 = new zzbqg(s, z, v, s1);
        this.n.put(s, zzbqg0);
    }

    public final List zzg() {
        List list0 = new ArrayList();
        ConcurrentHashMap concurrentHashMap0 = this.n;
        for(Object object0: concurrentHashMap0.keySet()) {
            zzbqg zzbqg0 = (zzbqg)concurrentHashMap0.get(((String)object0));
            ((ArrayList)list0).add(new zzbqg(((String)object0), zzbqg0.zzb, zzbqg0.zzc, zzbqg0.zzd));
        }
        return list0;
    }

    public final void zzl() {
        this.q = false;
    }

    public final void zzr() {
        if(!((Boolean)zzbju.zza.zze()).booleanValue() && this.m.zzc >= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzby)))) && this.q) {
            if(this.a) {
                return;
            }
            synchronized(this) {
                if(this.a) {
                    return;
                }
                this.l.zzf();
                this.o.zzf();
                zzdxz zzdxz0 = new zzdxz(this);
                this.e.zzc(zzdxz0, this.i);
                this.a = true;
                zzfvl zzfvl0 = this.a();
                zzdyc zzdyc0 = new zzdyc(this);
                long v1 = (long)(((Long)zzay.zzc().zzb(zzbhz.zzbA)));
                this.k.schedule(zzdyc0, v1, TimeUnit.SECONDS);
                zzfvc.zzr(zzfvl0, new S4(this), this.i);
            }
            return;
        }
        if(!this.a) {
            this.b("com.google.android.gms.ads.MobileAds", 0, "", true);
            this.e.zzd(Boolean.FALSE);
            this.a = true;
            this.b = true;
        }
    }

    public final void zzs(zzbqn zzbqn0) {
        zzdyd zzdyd0 = new zzdyd(this, zzbqn0);
        this.e.zzc(zzdyd0, this.j);
    }

    public final boolean zzt() {
        return this.b;
    }
}

