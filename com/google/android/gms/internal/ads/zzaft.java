package com.google.android.gms.internal.ads;

public final class zzaft implements zzaga {
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

    public zzaft() {
        this(null);
    }

    public zzaft(String s) {
        zzdx zzdx0 = new zzdx(new byte[16], 16);
        this.a = zzdx0;
        this.b = new zzdy(zzdx0.zza);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = 0x8000000000000001L;
        this.c = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) {
        zzxy zzxy0;
        byte b;
        zzcw.zzb(this.e);
    label_1:
        while(zzdy0.zza() > 0) {
            zzdy zzdy1 = this.b;
            switch(this.f) {
                case 0: {
                    while(true) {
                        if(zzdy0.zza() <= 0) {
                            continue label_1;
                        }
                        if(this.h) {
                            int v4 = zzdy0.zzk();
                            this.h = v4 == 0xAC;
                            b = 0x40;
                            if(v4 == 0x40) {
                                break;
                            }
                            if(v4 == 65) {
                                v4 = 65;
                                break;
                            }
                        }
                        else {
                            this.h = zzdy0.zzk() == 0xAC;
                        }
                    }
                    this.f = 1;
                    zzdy1.zzH()[0] = -84;
                    byte[] arr_b = zzdy1.zzH();
                    if(v4 == 65) {
                        b = 65;
                    }
                    arr_b[1] = b;
                    this.g = 2;
                    continue;
                }
                case 1: {
                    int v5 = Math.min(zzdy0.zza(), 16 - this.g);
                    zzdy0.zzB(zzdy1.zzH(), this.g, v5);
                    int v6 = this.g + v5;
                    this.g = v6;
                    if(v6 != 16) {
                        continue;
                    }
                    this.a.zzh(0);
                    zzxy0 = zzxz.zza(this.a);
                    if(this.j == null || this.j.zzz != 2 || zzxy0.zza != this.j.zzA || !"audio/ac4".equals(this.j.zzm)) {
                        zzab zzab0 = new zzab();
                        zzab0.zzH(this.d);
                        zzab0.zzS("audio/ac4");
                        zzab0.zzw(2);
                        zzab0.zzT(zzxy0.zza);
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
            this.k = zzxy0.zzb;
            this.i = ((long)zzxy0.zzc) * 1000000L / ((long)this.j.zzA);
            zzdy1.zzF(0);
            zzzw.zzb(this.e, zzdy1, 16);
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

