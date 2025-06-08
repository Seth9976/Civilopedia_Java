package com.google.android.gms.internal.ads;

public final class zzafq implements zzaga {
    public final zzdx a;
    public final zzdy b;
    public final String c;
    public String d;
    public zzzy e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public zzad j;
    public int k;
    public long l;

    public zzafq() {
        this(null);
    }

    public zzafq(String s) {
        zzdx zzdx0 = new zzdx(new byte[0x80], 0x80);
        this.a = zzdx0;
        this.b = new zzdy(zzdx0.zza);
        this.f = 0;
        this.l = 0x8000000000000001L;
        this.c = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) {
        zzxv zzxv0;
        zzcw.zzb(this.e);
        while(zzdy0.zza() > 0) {
            zzdy zzdy1 = this.b;
            switch(this.f) {
                case 0: {
                    while(zzdy0.zza() > 0) {
                        if(this.h) {
                            int v4 = zzdy0.zzk();
                            if(v4 == 0x77) {
                                this.h = false;
                                this.f = 1;
                                zzdy1.zzH()[0] = 11;
                                zzdy1.zzH()[1] = 0x77;
                                this.g = 2;
                                break;
                            }
                            this.h = v4 == 11;
                        }
                        else {
                            this.h = zzdy0.zzk() == 11;
                        }
                    }
                    continue;
                }
                case 1: {
                    int v5 = Math.min(zzdy0.zza(), 0x80 - this.g);
                    zzdy0.zzB(zzdy1.zzH(), this.g, v5);
                    int v6 = this.g + v5;
                    this.g = v6;
                    if(v6 != 0x80) {
                        continue;
                    }
                    this.a.zzh(0);
                    zzxv0 = zzxw.zze(this.a);
                    if(this.j == null || zzxv0.zzc != this.j.zzz || zzxv0.zzb != this.j.zzA || !zzeg.zzS(zzxv0.zza, this.j.zzm)) {
                        zzab zzab0 = new zzab();
                        zzab0.zzH(this.d);
                        zzab0.zzS(zzxv0.zza);
                        zzab0.zzw(zzxv0.zzc);
                        zzab0.zzT(zzxv0.zzb);
                        zzab0.zzK(this.c);
                        zzad zzad0 = zzab0.zzY();
                        this.j = zzad0;
                        this.e.zzk(zzad0);
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzdy0.zza(), this.k - this.g);
                    zzzw.zzb(this.e, zzdy0, v);
                    int v1 = this.g + v;
                    this.g = v1;
                    int v2 = this.k;
                    if(v1 != v2) {
                        continue;
                    }
                    long v3 = this.l;
                    if(v3 != 0x8000000000000001L) {
                        this.e.zzs(v3, 1, v2, 0, null);
                        this.l += this.i;
                    }
                    this.f = 0;
                    continue;
                }
            }
            this.k = zzxv0.zzd;
            this.i = ((long)zzxv0.zze) * 1000000L / ((long)this.j.zzA);
            zzdy1.zzF(0);
            zzzw.zzb(this.e, zzdy1, 0x80);
            this.f = 2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        zzahm0.zzc();
        this.d = zzahm0.zzb();
        this.e = zzyu0.zzv(zzahm0.zza(), 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.l = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = 0x8000000000000001L;
    }
}

