package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzdba;
import com.google.android.gms.internal.ads.zzffz;
import com.google.android.gms.internal.ads.zzfgf;
import com.google.android.gms.internal.ads.zzfvl;
import com.google.android.gms.internal.ads.zzgqu;
import com.google.android.gms.internal.ads.zzgrh;
import java.util.concurrent.TimeUnit;

public final class zzai implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzai(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzfgf zzfgf0 = (zzfgf)this.a.zzb();
        zzak zzak0 = ((zzal)this.b).zza();
        zzfvl zzfvl0 = ((zzdba)this.c).zza().zzc();
        return zzfgf0.zzb(zzffz.zzt, zzfvl0).zzf(zzak0).zzi(((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzey)))))), TimeUnit.SECONDS).zza();
    }
}

