package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class p5 extends zzbvm {
    public final zzefg i;
    public final zzeid j;

    public p5(zzeid zzeid0, zzefg zzefg0) {
        this.j = zzeid0;
        super();
        this.i = zzefg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvn
    public final void zze(String s) {
        ((zzegz)this.i.zzc).zzi(0, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvn
    public final void zzf(zze zze0) {
        ((zzegz)this.i.zzc).zzh(zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvn
    public final void zzg(zzbup zzbup0) {
        this.j.c = zzbup0;
        ((zzegz)this.i.zzc).zzo();
    }
}

