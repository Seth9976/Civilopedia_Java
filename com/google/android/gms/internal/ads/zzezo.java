package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

public final class zzezo implements zzemx {
    public final Context a;
    public final Executor b;
    public final zzcnf c;
    public final zzemh d;
    public final zzfao e;
    public zzbiu f;
    public final zzfhu g;
    public final zzfcb h;
    public zzfvl i;

    public zzezo(Context context0, Executor executor0, zzcnf zzcnf0, zzemh zzemh0, zzfao zzfao0, zzfcb zzfcb0) {
        this.a = context0;
        this.b = executor0;
        this.c = zzcnf0;
        this.d = zzemh0;
        this.h = zzfcb0;
        this.e = zzfao0;
        this.g = zzcnf0.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        return this.i != null && !this.i.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzemx
    public final boolean zzb(zzl zzl0, String s, zzemv zzemv0, zzemw zzemw0) {
        zzfhs zzfhs1;
        zzdky zzdky0;
        Executor executor0 = this.b;
        if(s == null) {
            zzcfi.zzg("Ad unit ID should not be null for interstitial ad.");
            executor0.execute(new zzezi(this));
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
        this.h.zzs(s);
        this.h.zzr(((zzezh)zzemv0).zza);
        this.h.zzE(zzl0);
        zzfcd zzfcd0 = this.h.zzG();
        Context context0 = this.a;
        zzfhh zzfhh0 = zzfhg.zzb(context0, zzfhr.zzf(zzfcd0), 4, zzl0);
        boolean z1 = ((Boolean)zzay.zzc().zzb(zzbhz.zzgR)).booleanValue();
        zzemh zzemh0 = this.d;
        if(z1) {
            zzdkx zzdkx0 = zzcnf0.zzg();
            zzdbd zzdbd0 = new zzdbd();
            zzdbd0.zzc(context0);
            zzdbd0.zzf(zzfcd0);
            zzdkx0.zze(zzdbd0.zzg());
            zzdhd zzdhd0 = new zzdhd();
            zzdhd0.zzj(zzemh0, executor0);
            zzdhd0.zzk(zzemh0, executor0);
            zzdkx0.zzd(zzdhd0.zzn());
            zzdkx0.zzc(new zzekr(this.f));
            zzdky0 = zzdkx0.zzf();
        }
        else {
            zzdhd zzdhd1 = new zzdhd();
            zzfao zzfao0 = this.e;
            if(zzfao0 != null) {
                zzdhd1.zze(zzfao0, executor0);
                zzdhd1.zzf(zzfao0, executor0);
                zzdhd1.zzb(zzfao0, executor0);
            }
            zzdkx zzdkx1 = zzcnf0.zzg();
            zzdbd zzdbd1 = new zzdbd();
            zzdbd1.zzc(context0);
            zzdbd1.zzf(zzfcd0);
            zzdkx1.zze(zzdbd1.zzg());
            zzdhd1.zzj(zzemh0, executor0);
            zzdhd1.zze(zzemh0, executor0);
            zzdhd1.zzf(zzemh0, executor0);
            zzdhd1.zzb(zzemh0, executor0);
            zzdhd1.zza(zzemh0, executor0);
            zzdhd1.zzl(zzemh0, executor0);
            zzdhd1.zzk(zzemh0, executor0);
            zzdhd1.zzi(zzemh0, executor0);
            zzdhd1.zzc(zzemh0, executor0);
            zzdkx1.zzd(zzdhd1.zzn());
            zzdkx1.zzc(new zzekr(this.f));
            zzdky0 = zzdkx1.zzf();
        }
        if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
            zzfhs zzfhs0 = zzdky0.zzf();
            zzfhs0.zzh(4);
            zzfhs0.zzb(zzl0.zzp);
            zzfhs1 = zzfhs0;
        }
        else {
            zzfhs1 = null;
        }
        zzcza zzcza0 = zzdky0.zza();
        zzfvl zzfvl0 = zzcza0.zzh(zzcza0.zzi());
        this.i = zzfvl0;
        zzfvc.zzr(zzfvl0, new O5(this, zzemw0, zzfhs1, zzfhh0, zzdky0), executor0);
        return true;
    }

    public final void zzi(zzbiu zzbiu0) {
        this.f = zzbiu0;
    }
}

