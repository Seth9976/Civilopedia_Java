package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class i9 extends zzgjq {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i;

    public i9(byte[] arr_b, int v, int v1) {
        this.i = 0x7FFFFFFF;
        this.c = arr_b;
        this.d = v1 + v;
        this.f = v;
        this.g = v;
    }

    public final void a(int v) {
        if(v >= 0) {
            int v1 = this.f;
            if(v <= this.d - v1) {
                this.f = v1 + v;
                return;
            }
        }
        throw v >= 0 ? zzglc.f() : zzglc.d();
    }

    public final void b() {
        int v = this.d + this.e;
        this.d = v;
        int v1 = v - this.g;
        int v2 = this.i;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.e = v3;
            this.d = v - v3;
            return;
        }
        this.e = 0;
    }

    public final int c() {
        int v = this.f;
        if(this.d - v < 4) {
            throw zzglc.f();
        }
        this.f = v + 4;
        return (this.c[v + 3] & 0xFF) << 24 | (this.c[v] & 0xFF | (this.c[v + 1] & 0xFF) << 8 | (this.c[v + 2] & 0xFF) << 16);
    }

    public final int d() {
        int v5;
        int v = this.f;
        int v1 = this.d;
        if(v1 != v) {
            byte[] arr_b = this.c;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.f = v + 1;
                return v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = v4 ^ 0xFFFFFF80;
                    this.f = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = v7 ^ 0x3F80;
                    v3 = v6;
                    this.f = v3;
                    return v5;
                }
                int v8 = v + 4;
                int v9 = v7 ^ arr_b[v6] << 21;
                if(v9 < 0) {
                    v5 = 0xFFE03F80 ^ v9;
                    v3 = v8;
                    this.f = v3;
                    return v5;
                }
                v6 = v + 5;
                int v10 = arr_b[v8];
                int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                if(v10 >= 0) {
                    v3 = v6;
                    this.f = v3;
                    return v11;
                }
                v8 = v + 6;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.f = v3;
                    return v11;
                }
                v6 = v + 7;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.f = v3;
                    return v11;
                }
                v8 = v + 8;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.f = v3;
                    return v11;
                }
                v6 = v + 9;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.f = v3;
                    return v11;
                }
                else if(arr_b[v6] >= 0) {
                    v3 = v + 10;
                    this.f = v3;
                    return v11;
                }
            }
        }
        return (int)this.g();
    }

    public final long e() {
        int v = this.f;
        if(this.d - v < 8) {
            throw zzglc.f();
        }
        this.f = v + 8;
        return (((long)this.c[v + 7]) & 0xFFL) << 56 | (((long)this.c[v]) & 0xFFL | (((long)this.c[v + 1]) & 0xFFL) << 8 | (((long)this.c[v + 2]) & 0xFFL) << 16 | (((long)this.c[v + 3]) & 0xFFL) << 24 | (((long)this.c[v + 4]) & 0xFFL) << 0x20 | (((long)this.c[v + 5]) & 0xFFL) << 40 | (((long)this.c[v + 6]) & 0xFFL) << 0x30);
    }

    public final long f() {
        long v13;
        long v10;
        long v5;
        int v = this.f;
        int v1 = this.d;
        if(v1 != v) {
            byte[] arr_b = this.c;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.f = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = (long)(v4 ^ 0xFFFFFF80);
                    this.f = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = (long)(v7 ^ 0x3F80);
                    v3 = v6;
                    this.f = v3;
                    return v5;
                }
                int v8 = v7 ^ arr_b[v6] << 21;
                if(v8 < 0) {
                    v3 = v + 4;
                    v5 = (long)(0xFFE03F80 ^ v8);
                    this.f = v3;
                    return v5;
                }
                v6 = v + 5;
                long v9 = ((long)arr_b[v + 4]) << 28 ^ ((long)v8);
                if(v9 >= 0L) {
                    v10 = 0xFE03F80L;
                    v5 = v9 ^ v10;
                    v3 = v6;
                    this.f = v3;
                    return v5;
                }
                int v11 = v + 6;
                long v12 = v9 ^ ((long)arr_b[v6]) << 35;
                if(v12 < 0L) {
                    v13 = 0xFFFFFFF80FE03F80L;
                    v5 = v12 ^ v13;
                    v3 = v11;
                    this.f = v3;
                    return v5;
                }
                v6 = v + 7;
                v9 = v12 ^ ((long)arr_b[v11]) << 42;
                if(v9 >= 0L) {
                    v10 = 0x3F80FE03F80L;
                    v5 = v9 ^ v10;
                    v3 = v6;
                    this.f = v3;
                    return v5;
                }
                v11 = v + 8;
                v12 = v9 ^ ((long)arr_b[v6]) << 49;
                if(v12 < 0L) {
                    v13 = 0xFFFE03F80FE03F80L;
                    v5 = v12 ^ v13;
                    v3 = v11;
                    this.f = v3;
                    return v5;
                }
                v6 = v + 9;
                long v14 = v12 ^ ((long)arr_b[v11]) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v3 = v6;
                    this.f = v3;
                    return v14;
                }
                else if(((long)arr_b[v6]) >= 0L) {
                    v3 = v + 10;
                    this.f = v3;
                    return v14;
                }
            }
        }
        return this.g();
    }

    public final long g() {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.f;
            if(v2 == this.d) {
                throw zzglc.f();
            }
            this.f = v2 + 1;
            int v3 = this.c[v2];
            v |= ((long)(v3 & 0x7F)) << v1;
            if((v3 & 0x80) == 0) {
                return v;
            }
        }
        throw zzglc.c();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final void zzA(int v) {
        this.i = v;
        this.b();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzC() {
        return this.f == this.d;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzD() {
        return this.f() != 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzE(int v) {
        int v1 = 0;
        switch(v & 7) {
            case 0: {
                byte[] arr_b = this.c;
                if(this.d - this.f >= 10) {
                    while(v1 < 10) {
                        int v3 = this.f;
                        this.f = v3 + 1;
                        if(arr_b[v3] >= 0) {
                            return true;
                        }
                        ++v1;
                    }
                    throw zzglc.c();
                }
                else {
                    while(true) {
                        if(v1 >= 10) {
                            throw zzglc.c();
                        }
                        int v4 = this.f;
                        if(v4 == this.d) {
                            throw zzglc.f();
                        }
                        this.f = v4 + 1;
                        if(arr_b[v4] >= 0) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
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
                this.a(this.d());
                return true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final double zzb() {
        return Double.longBitsToDouble(this.e());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final float zzc() {
        return Float.intBitsToFloat(this.c());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzd() {
        return this.f - this.g;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zze(int v) {
        if(v < 0) {
            throw zzglc.d();
        }
        int v1 = this.f - this.g + v;
        if(v1 < 0) {
            throw zzglc.e();
        }
        int v2 = this.i;
        if(v1 > v2) {
            throw zzglc.f();
        }
        this.i = v1;
        this.b();
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzf() {
        return this.d();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzg() {
        return this.c();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzh() {
        return this.d();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzk() {
        return this.c();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzl() {
        return zzgjq.zzF(this.d());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzm() {
        if(this.zzC()) {
            this.h = 0;
            return 0;
        }
        int v = this.d();
        this.h = v;
        if(v >>> 3 == 0) {
            throw new zzglc("Protocol message contained an invalid tag (zero).");
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzn() {
        return this.d();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzo() {
        return this.e();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzp() {
        return this.f();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzt() {
        return this.e();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzu() {
        return zzgjq.zzG(this.f());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzv() {
        return this.f();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final zzgji zzw() {
        int v = this.d();
        byte[] arr_b = this.c;
        if(v > 0) {
            int v1 = this.f;
            if(v <= this.d - v1) {
                zzgji zzgji0 = zzgji.zzw(arr_b, v1, v);
                this.f += v;
                return zzgji0;
            }
        }
        if(v != 0) {
            if(v > 0) {
                int v2 = this.f;
                if(v <= this.d - v2) {
                    int v3 = v + v2;
                    this.f = v3;
                    return new h9(Arrays.copyOfRange(arr_b, v2, v3));
                }
            }
            throw v > 0 ? zzglc.f() : zzglc.d();
        }
        return zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final String zzx() {
        int v = this.d();
        if(v > 0) {
            int v1 = this.f;
            if(v <= this.d - v1) {
                String s = new String(this.c, v1, v, zzgla.a);
                this.f += v;
                return s;
            }
        }
        if(v != 0) {
            throw v >= 0 ? zzglc.f() : zzglc.d();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final String zzy() {
        int v = this.d();
        if(v > 0) {
            int v1 = this.f;
            if(v <= this.d - v1) {
                ka.a.getClass();
                String s = S.g(this.c, v1, v);
                this.f += v;
                return s;
            }
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

