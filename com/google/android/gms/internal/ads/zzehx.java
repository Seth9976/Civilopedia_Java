package com.google.android.gms.internal.ads;

public final class zzehx implements zzehr {
    public final zzdlu a;
    public final zzfvm b;
    public final zzdpu c;
    public final zzfcz d;
    public final zzdsk e;

    public zzehx(zzdlu zzdlu0, zzfvm zzfvm0, zzdpu zzdpu0, zzfcz zzfcz0, zzdsk zzdsk0) {
        this.a = zzdlu0;
        this.b = zzfvm0;
        this.c = zzdpu0;
        this.d = zzfcz0;
        this.e = zzdsk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        return zzfvc.zzn(zzfvc.zzn(this.d.zza(), new zzehu(this, zzfbl0), this.b), new zzehv(this, zzfbx0, zzfbl0), this.b);
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return zzfbl0.zzt != null && zzfbl0.zzt.zzc != null;
    }
}

