package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeig extends zzeii {
    public final zzcnf a;
    public final zzdlp b;
    public final zzdbd c;
    public final zzdhf d;

    public zzeig(zzcnf zzcnf0, zzdlp zzdlp0, zzdbd zzdbd0, zzdhf zzdhf0) {
        this.a = zzcnf0;
        this.b = zzdlp0;
        this.c = zzdbd0;
        this.d = zzdhf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzeii
    public final zzfvl a(zzfcd zzfcd0, Bundle bundle0) {
        zzdlt zzdlt0 = this.a.zzh();
        this.c.zzf(zzfcd0);
        this.c.zzd(bundle0);
        zzdlt0.zzf(this.c.zzg());
        zzdlt0.zze(this.d);
        zzdlt0.zzd(this.b);
        zzdlt0.zzc(new zzcvs(null));
        zzcza zzcza0 = zzdlt0.zzg().zza();
        return zzcza0.zzh(zzcza0.zzi());
    }
}

