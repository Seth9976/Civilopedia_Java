package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzemh implements zza, zzarc, zzdbt, zzdbw, zzdcj, zzdcn, zzddh, zzdee, zzdeo, zzdjg {
    public final AtomicReference i;
    public final AtomicReference j;
    public final AtomicReference k;
    public final AtomicReference l;
    public final AtomicReference m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final zzfgp q;
    public final ArrayBlockingQueue r;

    public zzemh(zzfgp zzfgp0) {
        this.i = new AtomicReference();
        this.j = new AtomicReference();
        this.k = new AtomicReference();
        this.l = new AtomicReference();
        this.m = new AtomicReference();
        this.n = new AtomicBoolean(true);
        this.o = new AtomicBoolean(false);
        this.p = new AtomicBoolean(false);
        this.r = new ArrayBlockingQueue(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhs)))));
        this.q = zzfgp0;
    }

    public final void a() {
        if(this.o.get() && this.p.get()) {
            ArrayBlockingQueue arrayBlockingQueue0 = this.r;
            for(Object object0: arrayBlockingQueue0) {
                zzely zzely0 = new zzely(((Pair)object0));
                zzeyo.zza(this.j, zzely0);
            }
            arrayBlockingQueue0.clear();
            this.n.set(false);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
            zzeyo.zza(this.i, zzelz.zza);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        zzemb zzemb0 = new zzemb(zze0);
        zzeyo.zza(this.i, zzemb0);
        zzemc zzemc0 = new zzemc(zze0);
        zzeyo.zza(this.i, zzemc0);
        zzemd zzemd0 = new zzemd(zze0);
        zzeyo.zza(this.l, zzemd0);
        this.n.set(false);
        this.r.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbx0) {
        this.n.set(true);
        this.p.set(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzv0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzarc
    @TargetApi(5)
    public final void zzbu(String s, String s1) {
        synchronized(this) {
            if(this.n.get()) {
                Pair pair0 = new Pair(s, s1);
                if(!this.r.offer(pair0)) {
                    zzcfi.zze("The queue for app events is full, dropping the new event.");
                    zzfgp zzfgp0 = this.q;
                    if(zzfgp0 != null) {
                        zzfgo zzfgo0 = zzfgo.zzb("dae_action");
                        zzfgo0.zza("dae_name", s);
                        zzfgo0.zza("dae_data", s1);
                        zzfgp0.zzb(zzfgo0);
                        return;
                    }
                }
                return;
            }
            zzelu zzelu0 = new zzelu(s, s1);
            zzeyo.zza(this.j, zzelu0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
    }

    public final zzbf zzc() {
        synchronized(this) {
            return (zzbf)this.i.get();
        }
    }

    public final zzbz zzd() {
        synchronized(this) {
            return (zzbz)this.j.get();
        }
    }

    public final void zze(zzbf zzbf0) {
        this.i.set(zzbf0);
    }

    public final void zzf(zzbi zzbi0) {
        this.l.set(zzbi0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zzg(zzs zzs0) {
        zzelw zzelw0 = new zzelw(zzs0);
        zzeyo.zza(this.k, zzelw0);
    }

    public final void zzh(zzde zzde0) {
        this.k.set(zzde0);
    }

    public final void zzi(zzbz zzbz0) {
        this.j.set(zzbz0);
        this.o.set(true);
        this.a();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        zzeyo.zza(this.i, zzemg.zza);
        zzeyo.zza(this.m, zzelq.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(zze zze0) {
        zzelv zzelv0 = new zzelv(zze0);
        zzeyo.zza(this.m, zzelv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        zzeyo.zza(this.i, zzelp.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
        zzeyo.zza(this.i, zzelx.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        synchronized(this) {
            zzeyo.zza(this.i, zzeme.zza);
            zzeyo.zza(this.l, zzemf.zza);
            this.p.set(true);
            this.a();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        zzeyo.zza(this.i, zzelr.zza);
        zzeyo.zza(this.m, zzels.zza);
        zzeyo.zza(this.m, zzelt.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcal0, String s, String s1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
            zzeyo.zza(this.i, zzelz.zza);
        }
        zzeyo.zza(this.m, zzema.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
    }

    public final void zzs(zzcg zzcg0) {
        this.m.set(zzcg0);
    }
}

