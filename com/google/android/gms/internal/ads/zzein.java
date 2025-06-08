package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzein extends zzeii {
    public final zzcnf a;
    public final zzdbd b;
    public final zzdhf c;

    public zzein(zzcnf zzcnf0, zzdbd zzdbd0, zzdhf zzdhf0) {
        this.a = zzcnf0;
        this.b = zzdbd0;
        this.c = zzdhf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzeii
    public final zzfvl a(zzfcd zzfcd0, Bundle bundle0) {
        zzdsx zzdsx0 = this.a.zzi();
        this.b.zzf(zzfcd0);
        this.b.zzd(bundle0);
        zzdsx0.zzd(this.b.zzg());
        zzdsx0.zzc(this.c);
        zzcza zzcza0 = zzdsx0.zze().zzb();
        return zzcza0.zzh(zzcza0.zzi());
    }
}

