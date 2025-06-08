package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

public final class z implements Z0, x {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public z(int v) {
        this.a = v;
        if(v != 4) {
            super();
            this.b = 0;
            this.c = -1;
            this.d = 0;
            this.f = new int[16];
            this.e = 15;
            return;
        }
        super();
    }

    public z(int v, int v1, int v2, int v3, int v4, byte[] arr_b) {
        this.a = 1;
        super();
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = arr_b;
    }

    public z(X0 x00) {
        this.a = 2;
        super();
        this.f = x00.P0;
        x00.P0.zzv(12);
        this.c = x00.P0.zzi() & 0xFF;
        this.b = x00.P0.zzi();
    }

    public z(t t0) {
        this.a = 0;
        super();
        this.f = t0.b;
        t0.b.zzF(12);
        this.c = t0.b.zzn() & 0xFF;
        this.b = t0.b.zzn();
    }

    public void a(int v) {
        int v1 = this.d;
        int[] arr_v = (int[])this.f;
        if(v1 == arr_v.length) {
            int v2 = arr_v.length + arr_v.length;
            if(v2 < 0) {
                throw new IllegalStateException();
            }
            int[] arr_v1 = new int[v2];
            int v3 = this.b;
            int v4 = arr_v.length - v3;
            System.arraycopy(arr_v, v3, arr_v1, 0, v4);
            System.arraycopy(((int[])this.f), 0, arr_v1, v4, v3);
            this.b = 0;
            this.c = this.d - 1;
            this.f = arr_v1;
            this.e = arr_v1.length - 1;
            arr_v = arr_v1;
        }
        int v5 = this.c + 1 & this.e;
        this.c = v5;
        arr_v[v5] = v;
        ++this.d;
    }

    @Override  // com.google.android.gms.internal.ads.x, com.google.android.gms.internal.ads.Z0
    public int zza() {
        switch(this.a) {
            case 0: {
                return -1;
            }
            case 2: {
                return this.b;
            }
            default: {
                int v = this.d;
                if(v == 0) {
                    throw new NoSuchElementException();
                }
                int v1 = this.b;
                this.b = v1 + 1 & this.e;
                this.d = v - 1;
                return ((int[])this.f)[v1];
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.x, com.google.android.gms.internal.ads.Z0
    public int zzb() {
        if(this.a != 0) {
            zzazh zzazh0 = (zzazh)this.f;
            int v = this.c;
            if(v == 8) {
                return zzazh0.zzg();
            }
            if(v == 16) {
                return zzazh0.zzj();
            }
            int v1 = this.d;
            this.d = v1 + 1;
            if(v1 % 2 == 0) {
                int v2 = zzazh0.zzg();
                this.e = v2;
                return (v2 & 0xF0) >> 4;
            }
            return this.e & 15;
        }
        return this.b;
    }

    @Override  // com.google.android.gms.internal.ads.x
    public int zzc() {
        zzdy zzdy0 = (zzdy)this.f;
        int v = this.c;
        if(v == 8) {
            return zzdy0.zzk();
        }
        if(v == 16) {
            return zzdy0.zzo();
        }
        int v1 = this.d;
        this.d = v1 + 1;
        if(v1 % 2 == 0) {
            int v2 = zzdy0.zzk();
            this.e = v2;
            return (v2 & 0xF0) >> 4;
        }
        return this.e & 15;
    }

    @Override  // com.google.android.gms.internal.ads.Z0
    public boolean zzc() {
        return false;
    }
}

