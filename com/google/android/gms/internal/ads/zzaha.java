package com.google.android.gms.internal.ads;

public final class zzaha implements zzahn {
    public final zzagz a;
    public final zzdy b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public zzaha(zzagz zzagz0) {
        this.a = zzagz0;
        this.b = new zzdy(0x20);
    }

    @Override  // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzdy zzdy0, int v) {
        int v1 = (v & 1) == 0 ? -1 : zzdy0.zzc() + zzdy0.zzk();
        if(this.f) {
            if((v & 1) == 0) {
                return;
            }
            this.f = false;
            zzdy0.zzF(v1);
            this.d = 0;
        }
        while(zzdy0.zza() > 0) {
            int v2 = this.d;
            zzdy zzdy1 = this.b;
            if(v2 < 3) {
                if(v2 == 0) {
                    int v3 = zzdy0.zzk();
                    zzdy0.zzF(zzdy0.zzc() - 1);
                    if(v3 == 0xFF) {
                        this.f = true;
                        return;
                    }
                }
                int v4 = Math.min(zzdy0.zza(), 3 - this.d);
                zzdy0.zzB(zzdy1.zzH(), this.d, v4);
                int v5 = this.d + v4;
                this.d = v5;
                if(v5 != 3) {
                    continue;
                }
                zzdy1.zzF(0);
                zzdy1.zzE(3);
                zzdy1.zzG(1);
                int v6 = zzdy1.zzk();
                int v7 = zzdy1.zzk();
                this.e = (v6 & 0x80) != 0;
                this.c = ((v6 & 15) << 8 | v7) + 3;
                int v8 = this.c;
                if(zzdy1.zzb() >= v8) {
                    continue;
                }
                int v9 = zzdy1.zzb();
                zzdy1.zzz(Math.min(0x1002, Math.max(v8, v9 + v9)));
            }
            else {
                int v10 = Math.min(zzdy0.zza(), this.c - v2);
                zzdy0.zzB(zzdy1.zzH(), this.d, v10);
                int v11 = this.d + v10;
                this.d = v11;
                int v12 = this.c;
                if(v11 == v12) {
                    if(this.e) {
                        if(zzeg.zzg(zzdy1.zzH(), 0, v12, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        zzdy1.zzE(this.c - 4);
                    }
                    else {
                        zzdy1.zzE(v12);
                    }
                    zzdy1.zzF(0);
                    this.a.zza(zzdy1);
                    this.d = 0;
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzee zzee0, zzyu zzyu0, zzahm zzahm0) {
        this.a.zzb(zzee0, zzyu0, zzahm0);
        this.f = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
        this.f = true;
    }
}

