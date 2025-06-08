package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

public final class q5 implements zzfuy {
    public final long i;
    public final String j;
    public final zzfbl k;
    public final zzfbo l;
    public final zzfie m;
    public final zzfbx n;
    public final zzeiq o;

    public q5(zzeiq zzeiq0, long v, String s, zzfbl zzfbl0, zzfbo zzfbo0, zzfie zzfie0, zzfbx zzfbx0) {
        this.o = zzeiq0;
        this.i = v;
        this.j = s;
        this.k = zzfbl0;
        this.l = zzfbo0;
        this.m = zzfie0;
        this.n = zzfbx0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable throwable0) {
        int v1;
        zzeiq zzeiq0 = this.o;
        long v = zzeiq0.a.elapsedRealtime() - this.i;
        if(throwable0 instanceof TimeoutException) {
            v1 = 2;
        }
        else if(throwable0 instanceof zzeif) {
            v1 = 3;
        }
        else if(throwable0 instanceof CancellationException) {
            v1 = 4;
        }
        else if(throwable0 instanceof zzfci) {
            v1 = 5;
        }
        else {
            v1 = !(throwable0 instanceof zzdzl) || zzfdc.zza(throwable0).zza != 3 ? 6 : 1;
        }
        zzfbl zzfbl0 = this.k;
        zzeiq.a(this.o, this.j, v1, v, zzfbl0.zzah);
        if(zzeiq0.e) {
            zzeiq0.b.zza(this.l, this.k, v1, (throwable0 instanceof zzefh ? ((zzefh)throwable0) : null), v);
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzgZ)).booleanValue()) {
            List list0 = this.m.zza(this.n, zzfbl0, zzfbl0.zzo);
            zzeiq0.c.zzd(list0);
        }
        zze zze0 = zzfdc.zza(throwable0);
        if((zze0.zza == 0 || zze0.zza == 3) && (zze0.zzd != null && !zze0.zzd.zzc.equals("com.google.android.gms.ads"))) {
            zze0 = zzfdc.zza(new zzefh(13, zze0.zzd));
        }
        zzeiq0.f.zze(zzfbl0, v, zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object object0) {
        zzeiq zzeiq0 = this.o;
        long v = zzeiq0.a.elapsedRealtime() - this.i;
        zzfbl zzfbl0 = this.k;
        zzeiq.a(this.o, this.j, 0, v, zzfbl0.zzah);
        if(zzeiq0.e) {
            zzeiq0.b.zza(this.l, this.k, 0, null, v);
        }
        zzeiq0.f.zzf(zzfbl0, v, null);
    }
}

