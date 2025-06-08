package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public final class j9 extends zzgjq {
    public final Iterator c;
    public ByteBuffer d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public long j;
    public long k;
    public long l;

    public j9(int v, ArrayList arrayList0) {
        this.g = 0x7FFFFFFF;
        this.e = v;
        this.c = arrayList0.iterator();
        this.i = 0;
        if(v == 0) {
            this.d = zzgla.zze;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            return;
        }
        this.d();
    }

    public final void a(int v) {
        if(v < 0 || ((long)v) > ((long)(this.e - this.i)) - this.j + this.k) {
            throw v >= 0 ? zzglc.f() : zzglc.d();
        }
        while(v > 0) {
            if(this.l - this.j == 0L) {
                if(!this.c.hasNext()) {
                    throw zzglc.f();
                }
                this.d();
            }
            int v1 = Math.min(v, ((int)(this.l - this.j)));
            v -= v1;
            this.j += (long)v1;
        }
    }

    public final int b() {
        return (int)(((long)(this.e - this.i)) - this.j + this.k);
    }

    public final void c(int v, byte[] arr_b) {
        if(v <= this.b()) {
            int v1 = v;
            while(v1 > 0) {
                if(this.l - this.j == 0L) {
                    if(!this.c.hasNext()) {
                        throw zzglc.f();
                    }
                    this.d();
                }
                int v2 = Math.min(v1, ((int)(this.l - this.j)));
                ia.c.d(this.j, arr_b, ((long)(v - v1)), ((long)v2));
                v1 -= v2;
                this.j += (long)v2;
            }
            return;
        }
        if(v > 0) {
            throw zzglc.f();
        }
    }

    public final void d() {
        Object object0 = this.c.next();
        this.d = (ByteBuffer)object0;
        this.i += (int)(this.j - this.k);
        long v = (long)((ByteBuffer)object0).position();
        this.j = v;
        this.k = v;
        this.l = (long)this.d.limit();
        long v1 = ia.c.m(ia.g, this.d);
        this.j += v1;
        this.k += v1;
        this.l += v1;
    }

    public final byte e() {
        if(this.l - this.j == 0L) {
            if(!this.c.hasNext()) {
                throw zzglc.f();
            }
            this.d();
        }
        long v = this.j;
        this.j = v + 1L;
        return ia.c.a(v);
    }

    public final int f() {
        long v = this.j;
        if(this.l - v >= 4L) {
            this.j = v + 4L;
            int v1 = ia.c.a(v);
            int v2 = ia.c.a(v + 1L);
            int v3 = ia.c.a(v + 2L);
            return (ia.c.a(v + 3L) & 0xFF) << 24 | (v1 & 0xFF | (v2 & 0xFF) << 8 | (v3 & 0xFF) << 16);
        }
        return this.e() & 0xFF | (this.e() & 0xFF) << 8 | (this.e() & 0xFF) << 16 | (this.e() & 0xFF) << 24;
    }

    public final int g() {
        int v4;
        long v = this.j;
        if(this.l != v) {
            ha ha0 = ia.c;
            int v1 = ha0.a(v);
            if(v1 >= 0) {
                ++this.j;
                return v1;
            }
            if(this.l - this.j >= 10L) {
                long v2 = v + 2L;
                int v3 = ha0.a(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.j = v2;
                    return v4;
                }
                long v5 = v + 3L;
                int v6 = ha0.a(v2) << 14 ^ v3;
                if(v6 >= 0) {
                    v4 = v6 ^ 0x3F80;
                    v2 = v5;
                    this.j = v2;
                    return v4;
                }
                long v7 = v + 4L;
                int v8 = v6 ^ ha0.a(v5) << 21;
                if(v8 < 0) {
                    v4 = 0xFFE03F80 ^ v8;
                    v2 = v7;
                    this.j = v2;
                    return v4;
                }
                v5 = v + 5L;
                int v9 = ha0.a(v7);
                int v10 = v8 ^ v9 << 28 ^ 0xFE03F80;
                if(v9 >= 0) {
                    v2 = v5;
                    this.j = v2;
                    return v10;
                }
                v7 = v + 6L;
                if(ha0.a(v5) >= 0) {
                    v2 = v7;
                    this.j = v2;
                    return v10;
                }
                v5 = v + 7L;
                if(ha0.a(v7) >= 0) {
                    v2 = v5;
                    this.j = v2;
                    return v10;
                }
                v7 = v + 8L;
                if(ha0.a(v5) >= 0) {
                    v2 = v7;
                    this.j = v2;
                    return v10;
                }
                v5 = v + 9L;
                if(ha0.a(v7) >= 0) {
                    v2 = v5;
                    this.j = v2;
                    return v10;
                }
                else if(ha0.a(v5) >= 0) {
                    v2 = v + 10L;
                    this.j = v2;
                    return v10;
                }
            }
        }
        return (int)this.j();
    }

    public final long h() {
        long v = this.j;
        if(this.l - v >= 8L) {
            this.j = v + 8L;
            long v1 = ((long)ia.c.a(v)) & 0xFFL;
            long v2 = (((long)ia.c.a(v + 1L)) & 0xFFL) << 8 | v1 | (((long)ia.c.a(v + 2L)) & 0xFFL) << 16 | (((long)ia.c.a(v + 3L)) & 0xFFL) << 24 | (((long)ia.c.a(v + 4L)) & 0xFFL) << 0x20 | (((long)ia.c.a(v + 5L)) & 0xFFL) << 40 | (((long)ia.c.a(v + 6L)) & 0xFFL) << 0x30;
            return (((long)ia.c.a(v + 7L)) & 0xFFL) << 56 | v2;
        }
        long v3 = ((long)this.e()) & 0xFFL | (((long)this.e()) & 0xFFL) << 8 | (((long)this.e()) & 0xFFL) << 16 | (((long)this.e()) & 0xFFL) << 24 | (((long)this.e()) & 0xFFL) << 0x20 | (((long)this.e()) & 0xFFL) << 40 | (((long)this.e()) & 0xFFL) << 0x30;
        return (((long)this.e()) & 0xFFL) << 56 | v3;
    }

    public final long i() {
        long v12;
        long v9;
        long v4;
        long v = this.j;
        if(this.l != v) {
            ha ha0 = ia.c;
            int v1 = ha0.a(v);
            if(v1 >= 0) {
                ++this.j;
                return (long)v1;
            }
            if(this.l - this.j >= 10L) {
                long v2 = v + 2L;
                int v3 = ha0.a(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = (long)(v3 ^ 0xFFFFFF80);
                    this.j = v2;
                    return v4;
                }
                long v5 = v + 3L;
                int v6 = ha0.a(v2) << 14 ^ v3;
                if(v6 >= 0) {
                    v4 = (long)(v6 ^ 0x3F80);
                    v2 = v5;
                    this.j = v2;
                    return v4;
                }
                int v7 = v6 ^ ha0.a(v5) << 21;
                if(v7 < 0) {
                    v4 = (long)(0xFFE03F80 ^ v7);
                    v2 = v + 4L;
                    this.j = v2;
                    return v4;
                }
                v5 = v + 5L;
                long v8 = ((long)ha0.a(v + 4L)) << 28 ^ ((long)v7);
                if(v8 >= 0L) {
                    v9 = 0xFE03F80L;
                    v4 = v9 ^ v8;
                    v2 = v5;
                    this.j = v2;
                    return v4;
                }
                long v10 = v + 6L;
                long v11 = v8 ^ ((long)ha0.a(v5)) << 35;
                if(v11 < 0L) {
                    v12 = 0xFFFFFFF80FE03F80L;
                    v4 = v12 ^ v11;
                    v2 = v10;
                    this.j = v2;
                    return v4;
                }
                v5 = v + 7L;
                v8 = v11 ^ ((long)ha0.a(v10)) << 42;
                if(v8 >= 0L) {
                    v9 = 0x3F80FE03F80L;
                    v4 = v9 ^ v8;
                    v2 = v5;
                    this.j = v2;
                    return v4;
                }
                v10 = v + 8L;
                v11 = v8 ^ ((long)ha0.a(v5)) << 49;
                if(v11 < 0L) {
                    v12 = 0xFFFE03F80FE03F80L;
                    v4 = v12 ^ v11;
                    v2 = v10;
                    this.j = v2;
                    return v4;
                }
                v5 = v + 9L;
                long v13 = v11 ^ ((long)ha0.a(v10)) << 56 ^ 0xFE03F80FE03F80L;
                if(v13 >= 0L) {
                    v2 = v5;
                    this.j = v2;
                    return v13;
                }
                else if(((long)ha0.a(v5)) >= 0L) {
                    v2 = v + 10L;
                    this.j = v2;
                    return v13;
                }
            }
        }
        return this.j();
    }

    public final long j() {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.e();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw zzglc.c();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final void zzA(int v) {
        this.g = v;
        int v1 = this.e + this.f;
        this.e = v1;
        if(v1 > v) {
            int v2 = v1 - v;
            this.f = v2;
            this.e = v1 - v2;
            return;
        }
        this.f = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzC() {
        return ((long)this.i) + this.j - this.k == ((long)this.e);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzD() {
        return this.i() != 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzE(int v) {
        switch(v & 7) {
            case 0: {
                for(int v1 = 0; v1 < 10; ++v1) {
                    if(this.e() >= 0) {
                        return true;
                    }
                }
                throw zzglc.c();
            }
            case 1: {
                this.a(8);
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            do {
                                int v2 = this.zzm();
                            }
                            while(v2 != 0 && this.zzE(v2));
                            this.zzz(v >>> 3 << 3 | 4);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw zzglc.a();
                            }
                            this.a(4);
                            return true;
                        }
                    }
                }
                this.a(this.g());
                return true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final double zzb() {
        return Double.longBitsToDouble(this.h());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final float zzc() {
        return Float.intBitsToFloat(this.f());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzd() {
        return (int)(((long)this.i) + this.j - this.k);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zze(int v) {
        if(v < 0) {
            throw zzglc.d();
        }
        int v1 = this.zzd() + v;
        int v2 = this.g;
        if(v1 > v2) {
            throw zzglc.f();
        }
        this.g = v1;
        int v3 = this.e + this.f;
        this.e = v3;
        if(v3 > v1) {
            int v4 = v3 - v1;
            this.f = v4;
            this.e = v3 - v4;
            return v2;
        }
        this.f = 0;
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzf() {
        return this.g();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzg() {
        return this.f();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzh() {
        return this.g();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzk() {
        return this.f();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzl() {
        return zzgjq.zzF(this.g());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzm() {
        if(this.zzC()) {
            this.h = 0;
            return 0;
        }
        int v = this.g();
        this.h = v;
        if(v >>> 3 == 0) {
            throw new zzglc("Protocol message contained an invalid tag (zero).");
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzn() {
        return this.g();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzo() {
        return this.h();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzp() {
        return this.i();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzt() {
        return this.h();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzu() {
        return zzgjq.zzG(this.i());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzv() {
        return this.i();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final zzgji zzw() {
        int v = this.g();
        if(v > 0) {
            long v1 = this.j;
            if(((long)v) <= this.l - v1) {
                byte[] arr_b = new byte[v];
                ia.c.d(v1, arr_b, 0L, ((long)v));
                this.j += (long)v;
                return new h9(arr_b);
            }
        }
        if(v > 0 && v <= this.b()) {
            byte[] arr_b1 = new byte[v];
            this.c(v, arr_b1);
            return new h9(arr_b1);
        }
        if(v != 0) {
            throw v >= 0 ? zzglc.f() : zzglc.d();
        }
        return zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final String zzx() {
        int v = this.g();
        if(v > 0) {
            long v1 = this.j;
            if(((long)v) <= this.l - v1) {
                byte[] arr_b = new byte[v];
                ia.c.d(v1, arr_b, 0L, ((long)v));
                this.j += (long)v;
                return new String(arr_b, zzgla.a);
            }
        }
        if(v > 0 && v <= this.b()) {
            byte[] arr_b1 = new byte[v];
            this.c(v, arr_b1);
            return new String(arr_b1, zzgla.a);
        }
        if(v != 0) {
            throw v >= 0 ? zzglc.f() : zzglc.d();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final String zzy() {
        String s;
        int v = this.g();
        if(v > 0) {
            long v1 = this.j;
            if(((long)v) <= this.l - v1) {
                ByteBuffer byteBuffer0 = this.d;
                int v2 = (int)(v1 - this.k);
                if(byteBuffer0.hasArray()) {
                    int v3 = byteBuffer0.arrayOffset();
                    byte[] arr_b = byteBuffer0.array();
                    ka.a.getClass();
                    s = S.g(arr_b, v3 + v2, v);
                }
                else {
                    s = byteBuffer0.isDirect() ? S.i(byteBuffer0, v2, v) : S.i(byteBuffer0, v2, v);
                }
                this.j += (long)v;
                return s;
            }
        }
        if(v >= 0 && v <= this.b()) {
            byte[] arr_b1 = new byte[v];
            this.c(v, arr_b1);
            ka.a.getClass();
            return S.g(arr_b1, 0, v);
        }
        if(v != 0) {
            throw v > 0 ? zzglc.f() : zzglc.d();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final void zzz(int v) {
        if(this.h != v) {
            throw new zzglc("Protocol message end-group tag did not match expected tag.");
        }
    }
}

