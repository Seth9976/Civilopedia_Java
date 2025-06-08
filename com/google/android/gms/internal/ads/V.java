package com.google.android.gms.internal.ads;

public final class v {
    public final int a;
    public final int b;
    public int c;
    public int d;
    public long e;
    public final boolean f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;

    public v(zzazh zzazh0, zzazh zzazh1, boolean z) {
        this.a = 1;
        super();
        this.j = zzazh0;
        this.i = zzazh1;
        this.f = z;
        zzazh1.zzv(12);
        this.b = zzazh1.zzi();
        zzazh0.zzv(12);
        this.h = zzazh0.zzi();
        zzayz.zzf(zzazh0.zze() == 1, "first_chunk must be 1");
        this.c = -1;
    }

    public v(zzdy zzdy0, zzdy zzdy1, boolean z) {
        this.a = 0;
        super();
        this.j = zzdy0;
        this.i = zzdy1;
        this.f = z;
        zzdy1.zzF(12);
        this.b = zzdy1.zzn();
        zzdy0.zzF(12);
        this.h = zzdy0.zzn();
        zzyv.zzb(zzdy0.zze() == 1, "first_chunk must be 1");
        this.c = -1;
    }

    public final boolean a() {
        if(this.a != 0) {
            int v = this.c + 1;
            this.c = v;
            if(v == this.b) {
                return false;
            }
            zzazh zzazh0 = (zzazh)this.i;
            this.e = this.f ? zzazh0.zzn() : zzazh0.zzm();
            if(this.c == this.g) {
                zzazh zzazh1 = (zzazh)this.j;
                this.d = zzazh1.zzi();
                zzazh1.zzw(4);
                int v1 = -1;
                int v2 = this.h - 1;
                this.h = v2;
                if(v2 > 0) {
                    v1 = zzazh1.zzi() - 1;
                }
                this.g = v1;
            }
            return true;
        }
        int v3 = this.c + 1;
        this.c = v3;
        if(v3 == this.b) {
            return false;
        }
        zzdy zzdy0 = (zzdy)this.i;
        this.e = this.f ? zzdy0.zzt() : zzdy0.zzs();
        if(this.c == this.g) {
            zzdy zzdy1 = (zzdy)this.j;
            this.d = zzdy1.zzn();
            zzdy1.zzG(4);
            int v4 = -1;
            int v5 = this.h - 1;
            this.h = v5;
            if(v5 > 0) {
                v4 = zzdy1.zzn() - 1;
            }
            this.g = v4;
        }
        return true;
    }
}

