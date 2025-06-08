package com.google.android.gms.internal.ads;

public final class oa implements zzjb {
    public final zzjz i;
    public final xa j;
    public zzjt k;
    public zzjb l;
    public boolean m;
    public boolean n;

    public oa(xa xa0, zzcx zzcx0) {
        this.j = xa0;
        this.i = new zzjz(zzcx0);
        this.m = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzjb
    public final long zza() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzjb
    public final zzbt zzc() {
        return this.l == null ? this.i.zzc() : this.l.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzjb
    public final void zzg(zzbt zzbt0) {
        zzjb zzjb0 = this.l;
        if(zzjb0 != null) {
            zzjb0.zzg(zzbt0);
            zzbt0 = this.l.zzc();
        }
        this.i.zzg(zzbt0);
    }
}

