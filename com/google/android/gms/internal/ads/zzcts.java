package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcts implements zza, zzdbt, zzdcj, zzdcn, zzddh {
    public final Context i;
    public final zzfvm j;
    public final Executor k;
    public final ScheduledExecutorService l;
    public final zzfbx m;
    public final zzfbl n;
    public final zzfie o;
    public final zzfcm p;
    public final zzaoc q;
    public final zzbiy r;
    public final WeakReference s;
    public final WeakReference t;
    public boolean u;
    public final AtomicBoolean v;

    public zzcts(Context context0, zzfvm zzfvm0, Executor executor0, ScheduledExecutorService scheduledExecutorService0, zzfbx zzfbx0, zzfbl zzfbl0, zzfie zzfie0, zzfcm zzfcm0, View view0, zzcli zzcli0, zzaoc zzaoc0, zzbiy zzbiy0) {
        this.v = new AtomicBoolean();
        this.i = context0;
        this.j = zzfvm0;
        this.k = executor0;
        this.l = scheduledExecutorService0;
        this.m = zzfbx0;
        this.n = zzfbl0;
        this.o = zzfie0;
        this.p = zzfcm0;
        this.q = zzaoc0;
        this.s = new WeakReference(view0);
        this.t = new WeakReference(zzcli0);
        this.r = zzbiy0;
    }

    public final void a() {
        String s;
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzcF)).booleanValue()) {
            View view0 = (View)this.s.get();
            s = this.q.zzc().zzh(this.i, view0, null);
        }
        else {
            s = null;
        }
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzal)).booleanValue();
        zzfbl zzfbl0 = this.n;
        if(z && this.m.zzb.zzb.zzg || !((Boolean)zzbjo.zzh.zze()).booleanValue()) {
            List list0 = this.o.zzb(this.m, zzfbl0, false, s, null, zzfbl0.zzd);
            this.p.zza(list0);
            return;
        }
        if(((Boolean)zzbjo.zzg.zze()).booleanValue() && (zzfbl0.zzb == 1 || zzfbl0.zzb == 2 || zzfbl0.zzb == 5)) {
            zzcli zzcli0 = (zzcli)this.t.get();
        }
        zzfvc.zzr(((zzfut)zzfvc.zzo(zzfut.zzv(zzfvc.zzi(null)), ((long)(((Long)zzay.zzc().zzb(zzbhz.zzaP)))), TimeUnit.MILLISECONDS, this.l)), new Q(this, s, 9, false), this.j);
    }

    public final void b(int v, int v1) {
        if(v > 0) {
            View view0 = (View)this.s.get();
            if(view0 == null || view0.getHeight() == 0 || view0.getWidth() == 0) {
                zzctl zzctl0 = new zzctl(this, v, v1);
                this.l.schedule(zzctl0, ((long)v1), TimeUnit.MILLISECONDS);
                return;
            }
        }
        this.a();
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzal)).booleanValue();
        zzfbx zzfbx0 = this.m;
        if((!z || !zzfbx0.zzb.zzb.zzg) && ((Boolean)zzbjo.zzd.zze()).booleanValue()) {
            zzfvc.zzr(zzfvc.zzf(zzfut.zzv(this.r.zza()), Throwable.class, zzctm.zza, zzcfv.zzf), new E9(this, 15), this.j);
            return;
        }
        List list0 = this.o.zza(zzfbx0, this.n, this.n.zzc);
        int v = zzt.zzo().zzv(this.i) ? 2 : 1;
        this.p.zzc(list0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
        List list0 = this.o.zza(this.m, this.n, this.n.zzj);
        this.p.zza(list0);
    }

    public static void zzf(zzcts zzcts0) {
        zzcts0.a();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(zze zze0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbo)).booleanValue()) {
            List list0 = zzfie.zzd(2, zze0.zza, this.n.zzp);
            List list1 = this.o.zza(this.m, this.n, list0);
            this.p.zza(list1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        if(!this.v.compareAndSet(false, true)) {
            return;
        }
        int v = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzcI)));
        if(v > 0) {
            this.b(v, ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzcJ)))));
            return;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzcH)).booleanValue()) {
            zzcto zzcto0 = new zzcto(this);
            this.k.execute(zzcto0);
            return;
        }
        this.a();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        synchronized(this) {
            if(this.u) {
                ArrayList arrayList0 = new ArrayList(this.n.zzd);
                arrayList0.addAll(this.n.zzg);
                List list0 = this.o.zzb(this.m, this.n, true, null, null, arrayList0);
                this.p.zza(list0);
            }
            else {
                List list1 = this.o.zza(this.m, this.n, this.n.zzn);
                this.p.zza(list1);
                List list2 = this.o.zza(this.m, this.n, this.n.zzg);
                this.p.zza(list2);
            }
            this.u = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcal0, String s, String s1) {
        List list0 = this.o.zzc(this.n, this.n.zzi, zzcal0);
        this.p.zza(list0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
        List list0 = this.o.zza(this.m, this.n, this.n.zzh);
        this.p.zza(list0);
    }
}

