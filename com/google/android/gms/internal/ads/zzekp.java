package com.google.android.gms.internal.ads;

import B.f;

public final class zzekp implements zzefd {
    public final zzbiu a;
    public final zzfvm b;
    public final zzfgf c;
    public final zzeky d;

    public zzekp(zzfgf zzfgf0, zzfvm zzfvm0, zzbiu zzbiu0, zzeky zzeky0, byte[] arr_b) {
        this.c = zzfgf0;
        this.b = zzfvm0;
        this.a = zzbiu0;
        this.d = zzeky0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        zzcga zzcga0 = new zzcga();
        zzeku zzeku0 = new zzeku();
        zzeku0.zzd(new f(this, zzcga0, zzfbx0, zzfbl0, zzeku0));
        return zzffp.zzd(new zzekn(this, new zzbip(zzeku0, zzfbl0.zzt.zzb, zzfbl0.zzt.zza)), this.b, zzffz.zzq, this.c).zzb(zzffz.zzr).zzd(zzcga0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return this.a != null && (zzfbl0.zzt != null && zzfbl0.zzt.zza != null);
    }
}

