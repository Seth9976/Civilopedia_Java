package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzas;

public final class zzdap implements zzfok {
    public final Context zza;
    public final zzcfo zzb;
    public final zzfcd zzc;

    public zzdap(Context context0, zzcfo zzcfo0, zzfcd zzfcd0) {
        this.zza = context0;
        this.zzb = zzcfo0;
        this.zzc = zzfcd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        zzas zzas0 = new zzas(this.zza);
        zzas0.zzp(((zzfbl)object0).zzC);
        zzas0.zzq(((zzfbl)object0).zzD.toString());
        zzas0.zzo(this.zzb.zza);
        zzas0.zzn(this.zzc.zzf);
        return zzas0;
    }
}

