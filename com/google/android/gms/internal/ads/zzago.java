package com.google.android.gms.internal.ads;

public final class zzago implements zzaga {
    public final zzdy a;
    public final zzzk b;
    public final String c;
    public zzzy d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public zzago() {
        this(null);
    }

    public zzago(String s) {
        this.f = 0;
        zzdy zzdy0 = new zzdy(4);
        this.a = zzdy0;
        zzdy0.zzH()[0] = -1;
        this.b = new zzzk();
        this.l = 0x8000000000000001L;
        this.c = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) {
        zzcw.zzb(this.d);
    label_1:
        while(zzdy0.zza() > 0) {
            zzdy zzdy1 = this.a;
            switch(this.f) {
                case 0: {
                    byte[] arr_b = zzdy0.zzH();
                    int v4 = zzdy0.zzc();
                    int v5 = zzdy0.zzd();
                    while(v4 < v5) {
                        int v6 = arr_b[v4];
                        boolean z = this.i && (v6 & 0xE0) == 0xE0;
                        this.i = (v6 & 0xFF) == 0xFF;
                        if(z) {
                            zzdy0.zzF(v4 + 1);
                            this.i = false;
                            zzdy1.zzH()[1] = arr_b[v4];
                            this.g = 2;
                            this.f = 1;
                            continue label_1;
                        }
                        ++v4;
                    }
                    zzdy0.zzF(v5);
                    continue;
                }
                case 1: {
                    int v7 = Math.min(zzdy0.zza(), 4 - this.g);
                    zzdy0.zzB(zzdy1.zzH(), this.g, v7);
                    int v8 = this.g + v7;
                    this.g = v8;
                    if(v8 < 4) {
                        continue;
                    }
                    zzdy1.zzF(0);
                    int v9 = zzdy1.zze();
                    zzzk zzzk0 = this.b;
                    if(!zzzk0.zza(v9)) {
                        this.g = 0;
                        this.f = 1;
                        continue;
                    }
                    this.k = zzzk0.zzc;
                    if(!this.h) {
                        this.j = ((long)zzzk0.zzg) * 1000000L / ((long)zzzk0.zzd);
                        zzab zzab0 = new zzab();
                        zzab0.zzH(this.e);
                        zzab0.zzS(zzzk0.zzb);
                        zzab0.zzL(0x1000);
                        zzab0.zzw(zzzk0.zze);
                        zzab0.zzT(zzzk0.zzd);
                        zzab0.zzK(this.c);
                        zzad zzad0 = zzab0.zzY();
                        this.d.zzk(zzad0);
                        this.h = true;
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzdy0.zza(), this.k - this.g);
                    zzzw.zzb(this.d, zzdy0, v);
                    int v1 = this.g + v;
                    this.g = v1;
                    int v2 = this.k;
                    if(v1 < v2) {
                        continue;
                    }
                    long v3 = this.l;
                    if(v3 != 0x8000000000000001L) {
                        this.d.zzs(v3, 1, v2, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                    continue;
                }
            }
            zzdy1.zzF(0);
            zzzw.zzb(this.d, zzdy1, 4);
            this.f = 2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        zzahm0.zzc();
        this.e = zzahm0.zzb();
        this.d = zzyu0.zzv(zzahm0.zza(), 1);
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
        this.i = false;
        this.l = 0x8000000000000001L;
    }
}

