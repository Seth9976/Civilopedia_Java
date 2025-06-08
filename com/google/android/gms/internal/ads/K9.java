package com.google.android.gms.internal.ads;

import A.f;
import java.io.InputStream;
import java.util.ArrayList;

public final class k9 extends zzgjq {
    public final InputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public k9(InputStream inputStream0) {
        this.j = 0x7FFFFFFF;
        if(inputStream0 == null) {
            throw new NullPointerException("input");
        }
        this.c = inputStream0;
        this.d = new byte[0x1000];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    public final void a(int v) {
        int v10;
        long v7;
        InputStream inputStream0 = this.c;
        int v1 = this.g;
        int v2 = this.e - v1;
        if(v <= v2 && v >= 0) {
            this.g = v1 + v;
            return;
        }
        if(v < 0) {
            throw zzglc.d();
        }
        int v3 = this.i;
        int v4 = v3 + v1;
        int v5 = this.j;
        if(v4 + v <= v5) {
            this.i = v4;
            this.e = 0;
            this.g = 0;
            while(v2 < v) {
                try {
                    try {
                        long v6 = (long)(v - v2);
                        v7 = inputStream0.skip(v6);
                        int v8 = Long.compare(v7, 0L);
                    }
                    catch(zzglc zzglc0) {
                        zzglc0.j = true;
                        throw zzglc0;
                    }
                    if(v8 < 0 || v7 > v6) {
                        throw new IllegalStateException(inputStream0.getClass() + "#skip returned invalid result: " + v7 + "\nThe InputStream implementation is buggy.");
                    }
                    if(v8 == 0) {
                        break;
                    }
                    v2 += (int)v7;
                    continue;
                }
                catch(Throwable throwable0) {
                }
                this.i += v2;
                this.c();
                throw throwable0;
            }
            this.i += v2;
            this.c();
            if(v2 < v) {
                int v9 = this.e - this.g;
                this.g = this.e;
                this.d(1);
                while(true) {
                    v10 = v - v9;
                    int v11 = this.e;
                    if(v10 <= v11) {
                        break;
                    }
                    v9 += v11;
                    this.g = v11;
                    this.d(1);
                }
                this.g = v10;
            }
            return;
        }
        this.a(v5 - v3 - v1);
        throw zzglc.f();
    }

    public final ArrayList b(int v) {
        ArrayList arrayList0 = new ArrayList();
        while(v > 0) {
            int v1 = Math.min(v, 0x1000);
            byte[] arr_b = new byte[v1];
            for(int v2 = 0; v2 < v1; v2 += v3) {
                int v3 = this.c.read(arr_b, v2, v1 - v2);
                if(v3 == -1) {
                    throw zzglc.f();
                }
                this.i += v3;
            }
            v -= v1;
            arrayList0.add(arr_b);
        }
        return arrayList0;
    }

    public final void c() {
        int v = this.e + this.f;
        this.e = v;
        int v1 = this.i + v;
        int v2 = this.j;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.f = v3;
            this.e = v - v3;
            return;
        }
        this.f = 0;
    }

    public final void d(int v) {
        if(!this.e(v)) {
            throw v <= 0x7FFFFFFF - this.i - this.g ? zzglc.f() : new zzglc("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
    }

    public final boolean e(int v) {
        int v4;
        InputStream inputStream0 = this.c;
        int v1 = this.g;
        int v2 = this.e;
        if(v1 + v <= v2) {
            throw new IllegalStateException(f.e(v, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int v3 = this.i;
        if(v > 0x7FFFFFFF - v3 - v1) {
            return false;
        }
        if(v3 + v1 + v > this.j) {
            return false;
        }
        byte[] arr_b = this.d;
        if(v1 > 0) {
            if(v2 > v1) {
                System.arraycopy(arr_b, v1, arr_b, 0, v2 - v1);
            }
            v3 = this.i + v1;
            this.i = v3;
            v2 = this.e - v1;
            this.e = v2;
            this.g = 0;
        }
        try {
            v4 = inputStream0.read(arr_b, v2, Math.min(0x1000 - v2, 0x7FFFFFFF - v3 - v2));
        }
        catch(zzglc zzglc0) {
            zzglc0.j = true;
            throw zzglc0;
        }
        if(v4 == 0 || v4 < -1 || v4 > 0x1000) {
            throw new IllegalStateException(inputStream0.getClass() + "#read(byte[]) returned invalid result: " + v4 + "\nThe InputStream implementation is buggy.");
        }
        if(v4 > 0) {
            this.e += v4;
            this.c();
            return this.e < v ? this.e(v) : true;
        }
        return false;
    }

    public final byte[] f(int v) {
        byte[] arr_b = this.g(v);
        if(arr_b != null) {
            return arr_b;
        }
        int v1 = this.g;
        int v2 = this.e - v1;
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        ArrayList arrayList0 = this.b(v - v2);
        byte[] arr_b1 = new byte[v];
        System.arraycopy(this.d, v1, arr_b1, 0, v2);
        for(Object object0: arrayList0) {
            System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
            v2 += ((byte[])object0).length;
        }
        return arr_b1;
    }

    public final byte[] g(int v) {
        int v7;
        if(v == 0) {
            return zzgla.zzd;
        }
        if(v < 0) {
            throw zzglc.d();
        }
        int v1 = this.i;
        int v2 = this.g;
        int v3 = v1 + v2 + v;
        if(v3 - 0x7FFFFFFF > 0) {
            throw new zzglc("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int v4 = this.j;
        if(v3 <= v4) {
            int v5 = this.e - v2;
            int v6 = v - v5;
            InputStream inputStream0 = this.c;
            if(v6 >= 0x1000) {
                try {
                    if(v6 > inputStream0.available()) {
                        return null;
                    }
                }
                catch(zzglc zzglc0) {
                    zzglc0.j = true;
                    throw zzglc0;
                }
            }
            byte[] arr_b = new byte[v];
            System.arraycopy(this.d, this.g, arr_b, 0, v5);
            this.i += this.e;
            this.g = 0;
            this.e = 0;
            while(v5 < v) {
                try {
                    v7 = inputStream0.read(arr_b, v5, v - v5);
                }
                catch(zzglc zzglc1) {
                    zzglc1.j = true;
                    throw zzglc1;
                }
                if(v7 == -1) {
                    throw zzglc.f();
                }
                this.i += v7;
                v5 += v7;
            }
            return arr_b;
        }
        this.a(v4 - v1 - v2);
        throw zzglc.f();
    }

    public final int h() {
        int v = this.g;
        if(this.e - v < 4) {
            this.d(4);
            v = this.g;
        }
        this.g = v + 4;
        return (this.d[v + 3] & 0xFF) << 24 | (this.d[v] & 0xFF | (this.d[v + 1] & 0xFF) << 8 | (this.d[v + 2] & 0xFF) << 16);
    }

    public final int i() {
        int v5;
        int v = this.g;
        int v1 = this.e;
        if(v1 != v) {
            byte[] arr_b = this.d;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.g = v + 1;
                return v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = v4 ^ 0xFFFFFF80;
                    this.g = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = v7 ^ 0x3F80;
                    v3 = v6;
                    this.g = v3;
                    return v5;
                }
                int v8 = v + 4;
                int v9 = v7 ^ arr_b[v6] << 21;
                if(v9 < 0) {
                    v5 = 0xFFE03F80 ^ v9;
                    v3 = v8;
                    this.g = v3;
                    return v5;
                }
                v6 = v + 5;
                int v10 = arr_b[v8];
                int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                if(v10 >= 0) {
                    v3 = v6;
                    this.g = v3;
                    return v11;
                }
                v8 = v + 6;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.g = v3;
                    return v11;
                }
                v6 = v + 7;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.g = v3;
                    return v11;
                }
                v8 = v + 8;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.g = v3;
                    return v11;
                }
                v6 = v + 9;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.g = v3;
                    return v11;
                }
                else if(arr_b[v6] >= 0) {
                    v3 = v + 10;
                    this.g = v3;
                    return v11;
                }
            }
        }
        return (int)this.l();
    }

    public final long j() {
        int v = this.g;
        if(this.e - v < 8) {
            this.d(8);
            v = this.g;
        }
        this.g = v + 8;
        return (((long)this.d[v + 7]) & 0xFFL) << 56 | (((long)this.d[v]) & 0xFFL | (((long)this.d[v + 1]) & 0xFFL) << 8 | (((long)this.d[v + 2]) & 0xFFL) << 16 | (((long)this.d[v + 3]) & 0xFFL) << 24 | (((long)this.d[v + 4]) & 0xFFL) << 0x20 | (((long)this.d[v + 5]) & 0xFFL) << 40 | (((long)this.d[v + 6]) & 0xFFL) << 0x30);
    }

    public final long k() {
        long v13;
        long v10;
        long v5;
        int v = this.g;
        int v1 = this.e;
        if(v1 != v) {
            byte[] arr_b = this.d;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.g = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = (long)(v4 ^ 0xFFFFFF80);
                    this.g = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = (long)(v7 ^ 0x3F80);
                    v3 = v6;
                    this.g = v3;
                    return v5;
                }
                int v8 = v7 ^ arr_b[v6] << 21;
                if(v8 < 0) {
                    v3 = v + 4;
                    v5 = (long)(0xFFE03F80 ^ v8);
                    this.g = v3;
                    return v5;
                }
                v6 = v + 5;
                long v9 = ((long)arr_b[v + 4]) << 28 ^ ((long)v8);
                if(v9 >= 0L) {
                    v10 = 0xFE03F80L;
                    v5 = v9 ^ v10;
                    v3 = v6;
                    this.g = v3;
                    return v5;
                }
                int v11 = v + 6;
                long v12 = v9 ^ ((long)arr_b[v6]) << 35;
                if(v12 < 0L) {
                    v13 = 0xFFFFFFF80FE03F80L;
                    v5 = v12 ^ v13;
                    v3 = v11;
                    this.g = v3;
                    return v5;
                }
                v6 = v + 7;
                v9 = v12 ^ ((long)arr_b[v11]) << 42;
                if(v9 >= 0L) {
                    v10 = 0x3F80FE03F80L;
                    v5 = v9 ^ v10;
                    v3 = v6;
                    this.g = v3;
                    return v5;
                }
                v11 = v + 8;
                v12 = v9 ^ ((long)arr_b[v6]) << 49;
                if(v12 < 0L) {
                    v13 = 0xFFFE03F80FE03F80L;
                    v5 = v12 ^ v13;
                    v3 = v11;
                    this.g = v3;
                    return v5;
                }
                v6 = v + 9;
                long v14 = v12 ^ ((long)arr_b[v11]) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v3 = v6;
                    this.g = v3;
                    return v14;
                }
                else if(((long)arr_b[v6]) >= 0L) {
                    v3 = v + 10;
                    this.g = v3;
                    return v14;
                }
            }
        }
        return this.l();
    }

    public final long l() {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            if(this.g == this.e) {
                this.d(1);
            }
            int v2 = this.g;
            this.g = v2 + 1;
            int v3 = this.d[v2];
            v |= ((long)(v3 & 0x7F)) << v1;
            if((v3 & 0x80) == 0) {
                return v;
            }
        }
        throw zzglc.c();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final void zzA(int v) {
        this.j = v;
        this.c();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzC() {
        return this.g == this.e && !this.e(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzD() {
        return this.k() != 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final boolean zzE(int v) {
        int v1 = 0;
        switch(v & 7) {
            case 0: {
                byte[] arr_b = this.d;
                if(this.e - this.g >= 10) {
                    while(v1 < 10) {
                        int v3 = this.g;
                        this.g = v3 + 1;
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
                        if(this.g == this.e) {
                            this.d(1);
                        }
                        int v4 = this.g;
                        this.g = v4 + 1;
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
                this.a(this.i());
                return true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final double zzb() {
        return Double.longBitsToDouble(this.j());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final float zzc() {
        return Float.intBitsToFloat(this.h());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzd() {
        return this.i + this.g;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zze(int v) {
        if(v < 0) {
            throw zzglc.d();
        }
        int v1 = this.i + this.g + v;
        int v2 = this.j;
        if(v1 > v2) {
            throw zzglc.f();
        }
        this.j = v1;
        this.c();
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzf() {
        return this.i();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzg() {
        return this.h();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzh() {
        return this.i();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzk() {
        return this.h();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzl() {
        return zzgjq.zzF(this.i());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzm() {
        if(this.zzC()) {
            this.h = 0;
            return 0;
        }
        int v = this.i();
        this.h = v;
        if(v >>> 3 == 0) {
            throw new zzglc("Protocol message contained an invalid tag (zero).");
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final int zzn() {
        return this.i();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzo() {
        return this.j();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzp() {
        return this.k();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzt() {
        return this.j();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzu() {
        return zzgjq.zzG(this.k());
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final long zzv() {
        return this.k();
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final zzgji zzw() {
        int v = this.i();
        int v1 = this.g;
        byte[] arr_b = this.d;
        if(v <= this.e - v1 && v > 0) {
            zzgji zzgji0 = zzgji.zzw(arr_b, v1, v);
            this.g += v;
            return zzgji0;
        }
        if(v != 0) {
            byte[] arr_b1 = this.g(v);
            if(arr_b1 != null) {
                return zzgji.zzv(arr_b1);
            }
            int v2 = this.g;
            int v3 = this.e - v2;
            this.i += this.e;
            this.g = 0;
            this.e = 0;
            ArrayList arrayList0 = this.b(v - v3);
            byte[] arr_b2 = new byte[v];
            System.arraycopy(arr_b, v2, arr_b2, 0, v3);
            for(Object object0: arrayList0) {
                System.arraycopy(((byte[])object0), 0, arr_b2, v3, ((byte[])object0).length);
                v3 += ((byte[])object0).length;
            }
            return new h9(arr_b2);
        }
        return zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final String zzx() {
        int v = this.i();
        byte[] arr_b = this.d;
        if(v > 0) {
            int v1 = this.g;
            if(v <= this.e - v1) {
                String s = new String(arr_b, v1, v, zzgla.a);
                this.g += v;
                return s;
            }
        }
        if(v == 0) {
            return "";
        }
        if(v <= this.e) {
            this.d(v);
            String s1 = new String(arr_b, this.g, v, zzgla.a);
            this.g += v;
            return s1;
        }
        return new String(this.f(v), zzgla.a);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final String zzy() {
        int v = this.i();
        int v1 = this.g;
        int v2 = this.e;
        byte[] arr_b = this.d;
        if(v > v2 - v1 || v <= 0) {
            if(v == 0) {
                return "";
            }
            if(v <= v2) {
                this.d(v);
                this.g = v;
            }
            else {
                arr_b = this.f(v);
            }
        }
        else {
            this.g = v1 + v;
        }
        ka.a.getClass();
        return S.g(arr_b, v1, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjq
    public final void zzz(int v) {
        if(this.h != v) {
            throw new zzglc("Protocol message end-group tag did not match expected tag.");
        }
    }
}

