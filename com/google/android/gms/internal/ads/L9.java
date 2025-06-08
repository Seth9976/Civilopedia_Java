package com.google.android.gms.internal.ads;

public final class l9 extends zzgjx {
    public final byte[] d;
    public final int e;
    public int f;

    public l9(byte[] arr_b, int v) {
        if((arr_b.length - v | v) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), 0, v));
        }
        this.d = arr_b;
        this.f = 0;
        this.e = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void b(int v, zzgma zzgma0, T9 t90) {
        this.zzs(v << 3 | 2);
        int v1 = ((zzgir)zzgma0).a();
        if(v1 == -1) {
            v1 = t90.c(((zzgir)zzgma0));
            ((zzgir)zzgma0).c(v1);
        }
        this.zzs(v1);
        t90.b(zzgma0, this.a);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzN() {
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzO(byte b) {
        try {
            int v = this.f;
            this.f = v + 1;
            this.d[v] = b;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzP(int v, boolean z) {
        this.zzs(v << 3);
        this.zzO(((byte)z));
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzQ(int v, zzgji zzgji0) {
        this.zzs(v << 3 | 2);
        this.zzs(zzgji0.zzd());
        zzgji0.p(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zza(byte[] arr_b, int v, int v1) {
        try {
            System.arraycopy(arr_b, v, this.d, this.f, v1);
            this.f += v1;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, v1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final int zzb() {
        return this.e - this.f;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzh(int v, int v1) {
        this.zzs(v << 3 | 5);
        this.zzi(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzi(int v) {
        try {
            int v1 = this.f;
            this.f = v1 + 1;
            this.d[v1] = (byte)(v & 0xFF);
            this.f = v1 + 2;
            this.d[v1 + 1] = (byte)(v >> 8 & 0xFF);
            this.f = v1 + 3;
            this.d[v1 + 2] = (byte)(v >> 16 & 0xFF);
            this.f = v1 + 4;
            this.d[v1 + 3] = (byte)(v >> 24 & 0xFF);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzj(int v, long v1) {
        this.zzs(v << 3 | 1);
        this.zzk(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzk(long v) {
        try {
            int v1 = this.f;
            this.f = v1 + 1;
            this.d[v1] = (byte)(((int)v) & 0xFF);
            this.f = v1 + 2;
            this.d[v1 + 1] = (byte)(((int)(v >> 8)) & 0xFF);
            this.f = v1 + 3;
            this.d[v1 + 2] = (byte)(((int)(v >> 16)) & 0xFF);
            this.f = v1 + 4;
            this.d[v1 + 3] = (byte)(((int)(v >> 24)) & 0xFF);
            this.f = v1 + 5;
            this.d[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
            this.f = v1 + 6;
            this.d[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
            this.f = v1 + 7;
            this.d[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
            this.f = v1 + 8;
            this.d[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzl(int v, int v1) {
        this.zzs(v << 3);
        this.zzm(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzm(int v) {
        if(v >= 0) {
            this.zzs(v);
            return;
        }
        this.zzu(((long)v));
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzo(int v, String s) {
        this.zzs(v << 3 | 2);
        int v1 = this.f;
        try {
            int v2 = zzgjx.zzE(s.length());
            int v3 = this.e;
            byte[] arr_b = this.d;
            if(v2 == zzgjx.zzE(s.length() * 3)) {
                int v4 = v1 + v2;
                this.f = v4;
                int v5 = ka.b(s, arr_b, v4, v3 - v4);
                this.f = v1;
                this.zzs(v5 - v1 - v2);
                this.f = v5;
                return;
            }
            this.zzs(ka.c(s));
            this.f = ka.b(s, arr_b, this.f, v3 - this.f);
            return;
        }
        catch(ja ja0) {
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgju(indexOutOfBoundsException0);
        }
        this.f = v1;
        this.a(s, ja0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzq(int v, int v1) {
        this.zzs(v << 3 | v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzr(int v, int v1) {
        this.zzs(v << 3);
        this.zzs(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzs(int v) {
        try {
            while(true) {
                byte[] arr_b = this.d;
                if((v & 0xFFFFFF80) == 0) {
                    int v1 = this.f;
                    this.f = v1 + 1;
                    arr_b[v1] = (byte)v;
                    return;
                }
                int v2 = this.f;
                this.f = v2 + 1;
                arr_b[v2] = (byte)(v & 0x7F | 0x80);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
        }
        throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzt(int v, long v1) {
        this.zzs(v << 3);
        this.zzu(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzu(long v) {
        int v1 = this.e;
        byte[] arr_b = this.d;
        if(zzgjx.c && v1 - this.f >= 10) {
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                int v2 = this.f;
                this.f = v2 + 1;
                ia.m(arr_b, ((long)v2), ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.f;
            this.f = v3 + 1;
            ia.m(arr_b, ((long)v3), ((byte)(((int)v))));
            return;
        }
        try {
            while(true) {
                if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    int v4 = this.f;
                    this.f = v4 + 1;
                    arr_b[v4] = (byte)(((int)v));
                    return;
                }
                int v5 = this.f;
                this.f = v5 + 1;
                arr_b[v5] = (byte)(((int)v) & 0x7F | 0x80);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
        }
        throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", this.f, v1, 1), indexOutOfBoundsException0);
    }
}

