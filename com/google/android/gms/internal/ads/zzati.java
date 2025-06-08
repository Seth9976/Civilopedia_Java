package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class zzati implements zzasi {
    public int a;
    public int b;
    public S0 c;
    public float d;
    public float e;
    public ByteBuffer f;
    public ShortBuffer g;
    public ByteBuffer h;
    public long i;
    public long j;
    public boolean k;

    public zzati() {
        this.d = 1.0f;
        this.e = 1.0f;
        this.a = -1;
        this.b = -1;
        this.f = zzasi.zza;
        this.g = zzasi.zza.asShortBuffer();
        this.h = zzasi.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzasi
    public final int zza() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.ads.zzasi
    public final int zzb() {
        return 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzasi
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer0 = this.h;
        this.h = zzasi.zza;
        return byteBuffer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzasi
    public final void zzd() {
        S0 s00 = new S0(this.b, this.a);
        this.c = s00;
        s00.o = this.d;
        s00.p = this.e;
        this.h = zzasi.zza;
        this.i = 0L;
        this.j = 0L;
        this.k = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzasi
    public final void zze() {
        S0 s00 = this.c;
        int v = s00.q;
        int v1 = s00.r + ((int)((((float)v) / (s00.o / s00.p) + ((float)s00.s)) / s00.p + 0.5f));
        int v2 = s00.e + s00.e;
        s00.c(v2 + v);
        for(int v3 = 0; true; ++v3) {
            int v4 = s00.b;
            if(v3 >= v2 * v4) {
                break;
            }
            s00.h[v4 * v + v3] = 0;
        }
        s00.q += v2;
        s00.f();
        if(s00.r > v1) {
            s00.r = v1;
        }
        s00.q = 0;
        s00.t = 0;
        s00.s = 0;
        this.k = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzasi
    public final void zzf(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasRemaining()) {
            ShortBuffer shortBuffer0 = byteBuffer0.asShortBuffer();
            int v = byteBuffer0.remaining();
            this.i += (long)v;
            S0 s00 = this.c;
            s00.getClass();
            int v1 = shortBuffer0.remaining() / s00.b;
            int v2 = v1 * s00.b;
            s00.c(v1);
            shortBuffer0.get(s00.h, s00.q * s00.b, (v2 + v2) / 2);
            s00.q += v1;
            s00.f();
            byteBuffer0.position(byteBuffer0.position() + v);
        }
        int v3 = this.c.r * this.a;
        int v4 = v3 + v3;
        if(v4 > 0) {
            if(this.f.capacity() < v4) {
                ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(v4).order(ByteOrder.nativeOrder());
                this.f = byteBuffer1;
                this.g = byteBuffer1.asShortBuffer();
            }
            else {
                this.f.clear();
                this.g.clear();
            }
            S0 s01 = this.c;
            ShortBuffer shortBuffer1 = this.g;
            s01.getClass();
            int v5 = Math.min(shortBuffer1.remaining() / s01.b, s01.r);
            int v6 = v5 * s01.b;
            shortBuffer1.put(s01.j, 0, v6);
            int v7 = s01.r - v5;
            s01.r = v7;
            System.arraycopy(s01.j, v6, s01.j, 0, v7 * s01.b);
            this.j += (long)v4;
            this.f.limit(v4);
            this.h = this.f;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzasi
    public final void zzg() {
        this.c = null;
        this.f = zzasi.zza;
        this.g = zzasi.zza.asShortBuffer();
        this.h = zzasi.zza;
        this.a = -1;
        this.b = -1;
        this.i = 0L;
        this.j = 0L;
        this.k = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzasi
    public final boolean zzh(int v, int v1, int v2) throws zzash {
        if(v2 != 2) {
            throw new zzash(v, v1, v2);
        }
        if(this.b == v && this.a == v1) {
            return false;
        }
        this.b = v;
        this.a = v1;
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzasi
    public final boolean zzi() {
        return Math.abs(this.d - 1.0f) >= 0.01f || Math.abs(this.e - 1.0f) >= 0.01f;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzasi
    public final boolean zzj() {
        return this.k && (this.c == null || this.c.r == 0);
    }

    public final float zzk(float f) {
        this.e = 1.0f;
        return 1.0f;
    }

    public final float zzl(float f) {
        float f1 = zzazo.zza(f, 0.1f, 8.0f);
        this.d = f1;
        return f1;
    }

    public final long zzm() {
        return this.i;
    }

    public final long zzn() {
        return this.j;
    }
}

