package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.Executor;

public final class zzexv implements zzemx {
    public final Context a;
    public final Executor b;
    public final zzcnf c;
    public final zzemh d;
    public final zzeml e;
    public final FrameLayout f;
    public zzbiu g;
    public final zzdei h;
    public final zzfhu i;
    public final zzdgo j;
    public final zzfcb k;
    public zzfvl l;

    public zzexv(Context context0, Executor executor0, zzq zzq0, zzcnf zzcnf0, zzemh zzemh0, zzeml zzeml0, zzfcb zzfcb0, zzdgo zzdgo0) {
        this.a = context0;
        this.b = executor0;
        this.c = zzcnf0;
        this.d = zzemh0;
        this.e = zzeml0;
        this.k = zzfcb0;
        this.h = zzcnf0.zzf();
        this.i = zzcnf0.zzy();
        this.f = new FrameLayout(context0);
        this.j = zzdgo0;
        zzfcb0.zzr(zzq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        return this.l != null && !this.l.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzemx
    public final boolean zzb(zzl zzl0, String s, zzemv zzemv0, zzemw zzemw0) throws RemoteException {
        zzfhs zzfhs1;
        zzcws zzcws0;
        Executor executor0 = this.b;
        if(s == null) {
            zzcfi.zzg("Ad unit ID should not be null for banner ad.");
            executor0.execute(new zzexr(this));
            return false;
        }
        if(this.zza()) {
            return false;
        }
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue();
        zzcnf zzcnf0 = this.c;
        if(z && zzl0.zzf) {
            zzcnf0.zzk().zzl(true);
        }
        this.k.zzs(s);
        this.k.zzE(zzl0);
        zzfcd zzfcd0 = this.k.zzG();
        Context context0 = this.a;
        zzfhh zzfhh0 = zzfhg.zzb(context0, zzfhr.zzf(zzfcd0), 3, zzl0);
        boolean z1 = ((Boolean)zzbju.zzc.zze()).booleanValue();
        zzemh zzemh0 = this.d;
        if(z1 && this.k.zzg().zzk) {
            if(zzemh0 != null) {
                zzemh0.zza(zzfdc.zzd(7, null, null));
            }
            return false;
        }
        boolean z2 = ((Boolean)zzay.zzc().zzb(zzbhz.zzgP)).booleanValue();
        FrameLayout frameLayout0 = this.f;
        zzdgo zzdgo0 = this.j;
        zzdei zzdei0 = this.h;
        if(z2) {
            zzcwr zzcwr0 = zzcnf0.zze();
            zzdbd zzdbd0 = new zzdbd();
            zzdbd0.zzc(context0);
            zzdbd0.zzf(zzfcd0);
            zzcwr0.zzi(zzdbd0.zzg());
            zzdhd zzdhd0 = new zzdhd();
            zzdhd0.zzj(zzemh0, executor0);
            zzdhd0.zzk(zzemh0, executor0);
            zzcwr0.zzf(zzdhd0.zzn());
            zzcwr0.zze(new zzekr(this.g));
            zzcwr0.zzd(new zzdlp(zzdns.zza, null));
            zzcwr0.zzg(new zzcxp(zzdei0, zzdgo0));
            zzcwr0.zzc(new zzcvs(frameLayout0));
            zzcws0 = zzcwr0.zzj();
        }
        else {
            zzcwr zzcwr1 = zzcnf0.zze();
            zzdbd zzdbd1 = new zzdbd();
            zzdbd1.zzc(context0);
            zzdbd1.zzf(zzfcd0);
            zzcwr1.zzi(zzdbd1.zzg());
            zzdhd zzdhd1 = new zzdhd();
            zzdhd1.zzj(zzemh0, executor0);
            zzdhd1.zza(zzemh0, executor0);
            zzdhd1.zza(this.e, executor0);
            zzdhd1.zzl(zzemh0, executor0);
            zzdhd1.zzd(zzemh0, executor0);
            zzdhd1.zze(zzemh0, executor0);
            zzdhd1.zzf(zzemh0, executor0);
            zzdhd1.zzb(zzemh0, executor0);
            zzdhd1.zzk(zzemh0, executor0);
            zzdhd1.zzi(zzemh0, executor0);
            zzcwr1.zzf(zzdhd1.zzn());
            zzcwr1.zze(new zzekr(this.g));
            zzcwr1.zzd(new zzdlp(zzdns.zza, null));
            zzcwr1.zzg(new zzcxp(zzdei0, zzdgo0));
            zzcwr1.zzc(new zzcvs(frameLayout0));
            zzcws0 = zzcwr1.zzj();
        }
        if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
            zzfhs zzfhs0 = zzcws0.zzj();
            zzfhs0.zzh(3);
            zzfhs0.zzb(zzl0.zzp);
            zzfhs1 = zzfhs0;
        }
        else {
            zzfhs1 = null;
        }
        zzcza zzcza0 = zzcws0.zzd();
        zzfvl zzfvl0 = zzcza0.zzh(zzcza0.zzi());
        this.l = zzfvl0;
        zzfvc.zzr(zzfvl0, new K5(this, zzemw0, zzfhs1, zzfhh0, zzcws0), executor0);
        return true;
    }

    public final ViewGroup zzd() {
        return this.f;
    }

    public final zzfcb zzi() {
        return this.k;
    }

    public final void zzn() {
        int v = this.j.zzc();
        this.h.zzd(v);
    }

    public final void zzo(zzbc zzbc0) {
        this.e.zza(zzbc0);
    }

    public final void zzp(zzdej zzdej0) {
        this.h.zzj(zzdej0, this.b);
    }

    public final void zzq(zzbiu zzbiu0) {
        this.g = zzbiu0;
    }

    public final boolean zzr() {
        ViewParent viewParent0 = this.f.getParent();
        return viewParent0 instanceof View ? zzs.zzR(((View)viewParent0), ((View)viewParent0).getContext()) : false;
    }
}

