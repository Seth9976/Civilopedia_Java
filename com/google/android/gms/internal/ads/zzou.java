package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzou extends zznv {
    public int h;
    public boolean i;
    public byte[] j;
    public byte[] k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public long p;

    public zzou() {
        this.j = zzeg.zzf;
        this.k = zzeg.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zznv
    public final void b() {
        if(this.i) {
            int v = this.a.zze;
            this.h = v;
            int v1 = this.a.zzb;
            int v2 = ((int)(150000L * ((long)v1) / 1000000L)) * v;
            if(this.j.length != v2) {
                this.j = new byte[v2];
            }
            int v3 = ((int)(20000L * ((long)v1) / 1000000L)) * v;
            this.n = v3;
            if(this.k.length != v3) {
                this.k = new byte[v3];
            }
        }
        this.l = 0;
        this.p = 0L;
        this.m = 0;
        this.o = false;
    }

    @Override  // com.google.android.gms.internal.ads.zznv
    public final void c() {
        int v = this.m;
        if(v > 0) {
            this.f(v, this.j);
        }
        if(!this.o) {
            this.p += (long)(this.n / this.h);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zznv
    public final void d() {
        this.i = false;
        this.n = 0;
        this.j = zzeg.zzf;
        this.k = zzeg.zzf;
    }

    public final int e(ByteBuffer byteBuffer0) {
        for(int v = byteBuffer0.position(); v < byteBuffer0.limit(); v += 2) {
            if(Math.abs(byteBuffer0.getShort(v)) > 0x400) {
                return v / this.h * this.h;
            }
        }
        return byteBuffer0.limit();
    }

    public final void f(int v, byte[] arr_b) {
        this.a(v).put(arr_b, 0, v).flip();
        if(v > 0) {
            this.o = true;
        }
    }

    public final void g(ByteBuffer byteBuffer0, byte[] arr_b, int v) {
        int v1 = Math.min(byteBuffer0.remaining(), this.n);
        int v2 = this.n - v1;
        System.arraycopy(arr_b, v - v2, this.k, 0, v2);
        byteBuffer0.position(byteBuffer0.limit() - v1);
        byteBuffer0.get(this.k, v2, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final void zze(ByteBuffer byteBuffer0) {
        int v6;
        while(byteBuffer0.hasRemaining() && !this.f.hasRemaining()) {
            switch(this.l) {
                case 0: {
                    int v2 = byteBuffer0.limit();
                    byteBuffer0.limit(Math.min(v2, byteBuffer0.position() + this.j.length));
                    int v3 = byteBuffer0.limit();
                    do {
                        v3 += -2;
                        if(v3 < byteBuffer0.position()) {
                            goto label_20;
                        }
                    }
                    while(Math.abs(byteBuffer0.getShort(v3)) <= 0x400);
                    int v4 = v3 / this.h * this.h + this.h;
                    goto label_21;
                label_20:
                    v4 = byteBuffer0.position();
                label_21:
                    if(v4 == byteBuffer0.position()) {
                        this.l = 1;
                    }
                    else {
                        byteBuffer0.limit(v4);
                        int v5 = byteBuffer0.remaining();
                        this.a(v5).put(byteBuffer0).flip();
                        if(v5 > 0) {
                            this.o = true;
                        }
                    }
                    byteBuffer0.limit(v2);
                    continue;
                }
                case 1: {
                    v6 = byteBuffer0.limit();
                    int v7 = this.e(byteBuffer0);
                    int v8 = v7 - byteBuffer0.position();
                    byte[] arr_b = this.j;
                    int v9 = this.m;
                    int v10 = arr_b.length - v9;
                    if(v7 < v6 && v8 < v10) {
                        this.f(v9, arr_b);
                        this.m = 0;
                        this.l = 0;
                        continue;
                    }
                    int v11 = Math.min(v8, v10);
                    byteBuffer0.limit(byteBuffer0.position() + v11);
                    byteBuffer0.get(this.j, this.m, v11);
                    int v12 = this.m + v11;
                    this.m = v12;
                    byte[] arr_b1 = this.j;
                    if(v12 == arr_b1.length) {
                        if(this.o) {
                            this.f(this.n, arr_b1);
                            int v13 = this.m;
                            this.p += (long)((v13 - (this.n + this.n)) / this.h);
                            v12 = v13;
                        }
                        else {
                            this.p += (long)((v12 - this.n) / this.h);
                        }
                        this.g(byteBuffer0, this.j, v12);
                        this.m = 0;
                        this.l = 2;
                    }
                    break;
                }
                default: {
                    int v = byteBuffer0.limit();
                    int v1 = this.e(byteBuffer0);
                    byteBuffer0.limit(v1);
                    this.p += (long)(byteBuffer0.remaining() / this.h);
                    this.g(byteBuffer0, this.k, this.n);
                    if(v1 >= v) {
                        continue;
                    }
                    this.f(this.n, this.k);
                    this.l = 0;
                    byteBuffer0.limit(v);
                    continue;
                }
            }
            byteBuffer0.limit(v6);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zznv
    public final boolean zzg() {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zznv
    public final zzmw zzi(zzmw zzmw0) throws zzmx {
        if(zzmw0.zzd != 2) {
            throw new zzmx(zzmw0);
        }
        return this.i ? zzmw0 : zzmw.zza;
    }

    public final long zzo() {
        return this.p;
    }

    public final void zzp(boolean z) {
        this.i = z;
    }
}

