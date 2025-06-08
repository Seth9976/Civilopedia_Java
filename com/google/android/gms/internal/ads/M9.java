package com.google.android.gms.internal.ads;

import java.io.OutputStream;

public final class m9 extends zzgjx {
    public final byte[] d;
    public final int e;
    public int f;
    public final OutputStream g;

    public m9(OutputStream outputStream0, int v) {
        if(v < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int v1 = Math.max(v, 20);
        this.d = new byte[v1];
        this.e = v1;
        this.g = outputStream0;
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

    public final void d() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void e(int v) {
        if(this.e - this.f < v) {
            this.d();
        }
    }

    public final void f(int v) {
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

    public final void g(long v) {
        int v1 = this.f;
        this.f = v1 + 1;
        this.d[v1] = (byte)(((int)(v & 0xFFL)));
        this.f = v1 + 2;
        this.d[v1 + 1] = (byte)(((int)(v >> 8 & 0xFFL)));
        this.f = v1 + 3;
        this.d[v1 + 2] = (byte)(((int)(v >> 16 & 0xFFL)));
        this.f = v1 + 4;
        this.d[v1 + 3] = (byte)(((int)(0xFFL & v >> 24)));
        this.f = v1 + 5;
        this.d[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
        this.f = v1 + 6;
        this.d[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
        this.f = v1 + 7;
        this.d[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
        this.f = v1 + 8;
        this.d[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
    }

    public final void h(int v) {
        byte[] arr_b = this.d;
        if(zzgjx.c) {
            while((v & 0xFFFFFF80) != 0) {
                int v1 = this.f;
                this.f = v1 + 1;
                ia.m(arr_b, ((long)v1), ((byte)(v & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v2 = this.f;
            this.f = v2 + 1;
            ia.m(arr_b, ((long)v2), ((byte)v));
            return;
        }
        while((v & 0xFFFFFF80) != 0) {
            int v3 = this.f;
            this.f = v3 + 1;
            arr_b[v3] = (byte)(v & 0x7F | 0x80);
            v >>>= 7;
        }
        int v4 = this.f;
        this.f = v4 + 1;
        arr_b[v4] = (byte)v;
    }

    public final void i(long v) {
        byte[] arr_b = this.d;
        if(zzgjx.c) {
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                int v1 = this.f;
                this.f = v1 + 1;
                ia.m(arr_b, ((long)v1), ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v2 = this.f;
            this.f = v2 + 1;
            ia.m(arr_b, ((long)v2), ((byte)(((int)v))));
            return;
        }
        while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
            int v3 = this.f;
            this.f = v3 + 1;
            arr_b[v3] = (byte)(((int)v) & 0x7F | 0x80);
            v >>>= 7;
        }
        int v4 = this.f;
        this.f = v4 + 1;
        arr_b[v4] = (byte)(((int)v));
    }

    public final void j(byte[] arr_b, int v, int v1) {
        int v2 = this.f;
        int v3 = this.e;
        int v4 = v3 - v2;
        byte[] arr_b1 = this.d;
        if(v4 >= v1) {
            System.arraycopy(arr_b, v, arr_b1, v2, v1);
            this.f += v1;
            return;
        }
        System.arraycopy(arr_b, v, arr_b1, v2, v4);
        int v5 = v + v4;
        int v6 = v1 - v4;
        this.f = v3;
        this.d();
        if(v6 <= v3) {
            System.arraycopy(arr_b, v5, arr_b1, 0, v6);
            this.f = v6;
            return;
        }
        this.g.write(arr_b, v5, v6);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzN() {
        if(this.f > 0) {
            this.d();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzO(byte b) {
        if(this.f == this.e) {
            this.d();
        }
        int v = this.f;
        this.f = v + 1;
        this.d[v] = b;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzP(int v, boolean z) {
        this.e(11);
        this.h(v << 3);
        int v1 = this.f;
        this.f = v1 + 1;
        this.d[v1] = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzQ(int v, zzgji zzgji0) {
        this.zzs(v << 3 | 2);
        this.zzs(zzgji0.zzd());
        zzgji0.p(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zza(byte[] arr_b, int v, int v1) {
        this.j(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzh(int v, int v1) {
        this.e(14);
        this.h(v << 3 | 5);
        this.f(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzi(int v) {
        this.e(4);
        this.f(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzj(int v, long v1) {
        this.e(18);
        this.h(v << 3 | 1);
        this.g(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzk(long v) {
        this.e(8);
        this.g(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzl(int v, int v1) {
        this.e(20);
        this.h(v << 3);
        if(v1 >= 0) {
            this.h(v1);
            return;
        }
        this.i(((long)v1));
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
        byte[] arr_b1;
        int v7;
        int v6;
        int v4;
        this.zzs(v << 3 | 2);
        try {
            int v1 = s.length();
            int v2 = zzgjx.zzE(v1 * 3);
            int v3 = v2 + v1 * 3;
            v4 = this.e;
            if(v3 > v4) {
                byte[] arr_b = new byte[v1 * 3];
                int v5 = ka.b(s, arr_b, 0, v1 * 3);
                this.zzs(v5);
                this.j(arr_b, 0, v5);
                return;
            }
            if(v3 > v4 - this.f) {
                this.d();
            }
            v6 = zzgjx.zzE(s.length());
            v7 = this.f;
            arr_b1 = this.d;
            if(v6 == v2) {
                goto label_17;
            }
            goto label_24;
        }
        catch(ja ja0) {
            this.a(s, ja0);
            return;
        }
        try {
        label_17:
            int v8 = v7 + v6;
            this.f = v8;
            int v9 = ka.b(s, arr_b1, v8, v4 - v8);
            this.f = v7;
            this.h(v9 - v7 - v6);
            this.f = v9;
            return;
        label_24:
            int v10 = ka.c(s);
            this.h(v10);
            this.f = ka.b(s, arr_b1, this.f, v10);
            return;
        }
        catch(ja ja1) {
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw new zzgju(arrayIndexOutOfBoundsException0);
        }
        try {
            this.f = v7;
            throw ja1;
        }
        catch(ja ja0) {
        }
        this.a(s, ja0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzq(int v, int v1) {
        this.zzs(v << 3 | v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzr(int v, int v1) {
        this.e(20);
        this.h(v << 3);
        this.h(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzs(int v) {
        this.e(5);
        this.h(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzt(int v, long v1) {
        this.e(20);
        this.h(v << 3);
        this.i(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final void zzu(long v) {
        this.e(10);
        this.i(v);
    }
}

