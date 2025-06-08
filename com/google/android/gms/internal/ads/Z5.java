package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class z5 implements zzfuy {
    public final zzemw i;
    public final zzfhs j;
    public final zzfhh k;
    public final zzdlu l;
    public final zzene m;

    public z5(zzene zzene0, zzemw zzemw0, zzfhs zzfhs0, zzfhh zzfhh0, zzdlu zzdlu0) {
        this.m = zzene0;
        this.i = zzemw0;
        this.j = zzfhs0;
        this.k = zzfhh0;
        this.l = zzdlu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable throwable0) {
        zze zze0 = this.l.zza().zza(throwable0);
        this.l.zzb().zza(zze0);
        zzene zzene0 = this.m;
        zzene0.b.zzA().execute(new zzenc(this, zze0));
        zzfcx.zzb(zze0.zza, throwable0, "NativeAdLoader.onFailure");
        this.i.zza();
        boolean z = ((Boolean)zzbji.zzc.zze()).booleanValue();
        zzfhh zzfhh0 = this.k;
        if(z) {
            zzfhs zzfhs0 = this.j;
            if(zzfhs0 != null) {
                zzfhs0.zzc(zze0);
                zzfhh0.zze(false);
                zzfhs0.zza(zzfhh0);
                zzfhs0.zzg();
                return;
            }
        }
        zzfhh0.zza(zze0);
        zzfhh0.zze(false);
        zzfhl zzfhl0 = zzfhh0.zzj();
        zzene0.e.zzb(zzfhl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object object0) {
        synchronized(this.m) {
            ((zzcxx)object0).zzn().zza(this.m.d.zzd());
            this.i.zzb(((zzcxx)object0));
            this.m.b.zzA().execute(new zzenb(this));
            if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
                zzfhs zzfhs0 = this.j;
                if(zzfhs0 != null) {
                    zzfhs0.zzf(((zzcxx)object0).zzp().zzb);
                    zzfhs0.zze(((zzcxx)object0).zzl().zzg());
                    this.k.zze(true);
                    zzfhs0.zza(this.k);
                    zzfhs0.zzg();
                    return;
                }
                goto label_15;
            }
            else {
            label_15:
                this.k.zzb(((zzcxx)object0).zzp().zzb);
                this.k.zzc(((zzcxx)object0).zzl().zzg());
                this.k.zze(true);
                zzfhl zzfhl0 = this.k.zzj();
                this.m.e.zzb(zzfhl0);
            }
        }
    }
}

