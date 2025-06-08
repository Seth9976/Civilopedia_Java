package com.google.android.gms.internal.ads;

public final class y3 implements zzcux, zzcvi, zzdsx {
    public final int i;
    public final v3 j;
    public zzezg k;
    public zzeyh l;
    public zzdhf m;
    public zzdbf n;

    public y3(v3 v30, int v) {
        this.i = v;
        this.j = v30;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbb
    public final zzdbb zza(zzeyh zzeyh0) {
        switch(this.i) {
            case 0: {
                this.l = zzeyh0;
                return this;
            }
            case 1: {
                this.l = zzeyh0;
                return this;
            }
            default: {
                this.l = zzeyh0;
                return this;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbb
    public final zzdbb zzb(zzezg zzezg0) {
        switch(this.i) {
            case 0: {
                this.k = zzezg0;
                return this;
            }
            case 1: {
                this.k = zzezg0;
                return this;
            }
            default: {
                this.k = zzezg0;
                return this;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcux
    public zzcux zzc(zzdhf zzdhf0) {
        this.m = zzdhf0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvi
    public zzcvi zzc(zzdhf zzdhf0) {
        this.m = zzdhf0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsx
    public zzdsx zzc(zzdhf zzdhf0) {
        this.m = zzdhf0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcux
    public zzcux zzd(zzdbf zzdbf0) {
        this.n = zzdbf0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvi
    public zzcvi zzd(zzdbf zzdbf0) {
        this.n = zzdbf0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsx
    public zzdsx zzd(zzdbf zzdbf0) {
        this.n = zzdbf0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsx
    public zzdsy zze() {
        zzgrc.zzc(this.m, zzdhf.class);
        zzgrc.zzc(this.n, zzdbf.class);
        zzczc zzczc0 = new zzczc();
        zzfdg zzfdg0 = new zzfdg();
        zzdan zzdan0 = new zzdan();
        zzdwu zzdwu0 = new zzdwu();
        return new N3(this.j, zzczc0, zzfdg0, zzdan0, zzdwu0, this.m, this.n, this.k, this.l);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbb
    public final Object zzh() {
        switch(this.i) {
            case 0: {
                zzgrc.zzc(this.m, zzdhf.class);
                zzgrc.zzc(this.n, zzdbf.class);
                zzczc zzczc0 = new zzczc();
                zzfdg zzfdg0 = new zzfdg();
                zzdan zzdan0 = new zzdan();
                zzdwu zzdwu0 = new zzdwu();
                return new z3(this.j, zzczc0, zzfdg0, zzdan0, zzdwu0, this.m, this.n, this.k, this.l);
            }
            case 1: {
                zzgrc.zzc(this.m, zzdhf.class);
                zzgrc.zzc(this.n, zzdbf.class);
                zzczc zzczc1 = new zzczc();
                zzfdg zzfdg1 = new zzfdg();
                zzdan zzdan1 = new zzdan();
                zzdwu zzdwu1 = new zzdwu();
                return new A3(this.j, zzczc1, zzfdg1, zzdan1, zzdwu1, this.m, this.n, this.k, this.l);
            }
            default: {
                return this.zze();
            }
        }
    }
}

