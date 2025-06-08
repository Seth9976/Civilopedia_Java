package com.google.android.gms.internal.ads;

import B.k;
import H0.d;
import android.util.Log;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.IOException;
import jeb.synthetic.FIN;

public final class zztp implements zzzy {
    public zzpj A;
    public final d a;
    public final zb b;
    public final k c;
    public final zzpi d;
    public zzto e;
    public zzad f;
    public int g;
    public int[] h;
    public long[] i;
    public int[] j;
    public int[] k;
    public long[] l;
    public zzzx[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public long r;
    public long s;
    public long t;
    public boolean u;
    public boolean v;
    public boolean w;
    public zzad x;
    public boolean y;
    public boolean z;

    public zztp(zzvv zzvv0, zzpi zzpi0) {
        this.d = zzpi0;
        this.a = new d(zzvv0);
        this.b = new zb();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.g = 1000;
        this.h = new int[1000];
        this.i = new long[1000];
        this.l = new long[1000];
        this.k = new int[1000];
        this.j = new int[1000];
        this.m = new zzzx[1000];
        this.c = new k(zztk.zza);
        this.r = 0x8000000000000000L;
        this.s = 0x8000000000000000L;
        this.t = 0x8000000000000000L;
        this.w = true;
        this.v = true;
    }

    public final int a(int v) {
        int v1 = this.p + v;
        return v1 >= this.g ? v1 - this.g : v1;
    }

    public final long b(int v) {
        long v1 = this.s;
        long v2 = 0x8000000000000000L;
        if(v != 0) {
            int v4 = this.a(v - 1);
            for(int v5 = 0; v5 < v; ++v5) {
                v2 = Math.max(v2, this.l[v4]);
                if((this.k[v4] & 1) != 0) {
                    break;
                }
                --v4;
                v4 = v4 == -1 ? this.g - 1 : v4 - 1;
            }
        }
        this.s = Math.max(v1, v2);
        this.n -= v;
        int v6 = this.o + v;
        this.o = v6;
        int v7 = this.p + v;
        this.p = v7;
        int v8 = this.g;
        if(v7 >= v8) {
            this.p = v7 - v8;
        }
        int v9 = this.q - v;
        this.q = v9;
        if(v9 < 0) {
            this.q = 0;
        }
        for(int v3 = 0; true; ++v3) {
            k k0 = this.c;
            SparseArray sparseArray0 = (SparseArray)k0.j;
            if(v3 >= sparseArray0.size() - 1 || v6 < sparseArray0.keyAt(v3 + 1)) {
                break;
            }
            Ab ab0 = (Ab)sparseArray0.valueAt(v3);
            sparseArray0.removeAt(v3);
            int v10 = k0.i;
            if(v10 > 0) {
                k0.i = v10 - 1;
            }
        }
        if(this.n == 0) {
            int v11 = this.p == 0 ? this.g : this.p;
            return this.i[v11 - 1] + ((long)this.j[v11 - 1]);
        }
        return this.i[this.p];
    }

    public final void c(zzad zzad0, zziz zziz0) {
        zzad zzad1 = this.f;
        zzpj zzpj0 = null;
        this.f = zzad0;
        zziz0.zza = zzad0.zzc(this.d.zza(zzad0));
        zziz0.zzb = this.A;
        if(zzad1 != null && zzeg.zzS((zzad1 == null ? null : zzad1.zzp), zzad0.zzp)) {
            return;
        }
        if(zzad0.zzp != null) {
            zzpj0 = new zzpj(new zzpa(new zzpl(1), 6001));
        }
        this.A = zzpj0;
        zziz0.zzb = zzpj0;
    }

    public final void d() {
        synchronized(this) {
            this.q = 0;
            this.a.l = (K)this.a.k;
        }
    }

    public final int e(int v, int v1, long v2, boolean z) {
        int v3 = -1;
        int v4 = 0;
        while(v4 < v1) {
            int v5 = Long.compare(this.l[v], v2);
            if(v5 > 0) {
                break;
            }
            if(!z || (this.k[v] & 1) != 0) {
                v3 = v4;
                if(v5 != 0) {
                    goto label_8;
                }
                break;
            }
        label_8:
            ++v;
            v = v == this.g ? 0 : v + 1;
            ++v4;
        }
        return v3;
    }

    public final int zza() {
        return this.o + this.q;
    }

    public final int zzb(long v, boolean z) {
        synchronized(this) {
            int v2 = this.q;
            int v3 = this.a(v2);
            int v4 = this.n;
            if(this.q != v4 && v >= this.l[v3]) {
                if(v > this.t && z) {
                    return v4 - v2;
                }
                int v5 = this.e(v3, v4 - v2, v, true);
                return v5 == -1 ? 0 : v5;
            }
            return 0;
        }
    }

    public final int zzc() {
        return this.o + this.n;
    }

    public final int zzd(zziz zziz0, zzgb zzgb0, int v, boolean z) {
        boolean z1 = false;
        boolean z2 = (v & 2) != 0;
        zb zb0 = this.b;
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        zzgb0.zzc = false;
        int v2 = this.q;
        int v3 = -3;
        if(v2 != this.n) {
            zzad zzad1 = ((Ab)this.c.b(this.o + v2)).a;
            if(z2 || zzad1 != this.f) {
                this.c(zzad1, zziz0);
                FIN.finallyExec$NT(v1);
                v3 = -5;
            }
            else {
                int v4 = this.a(this.q);
                if(this.A == null) {
                    z1 = true;
                }
                else {
                    int v5 = this.k[v4];
                }
                if(z1) {
                    zzgb0.zzc(this.k[v4]);
                    long v6 = this.l[v4];
                    zzgb0.zzd = v6;
                    if(v6 < this.r) {
                        zzgb0.zza(0x80000000);
                    }
                    zb0.a = this.j[v4];
                    zb0.b = this.i[v4];
                    zb0.c = this.m[v4];
                label_39:
                    FIN.finallyCodeBegin$NT(v1);
                    __monitor_exit(this);
                    FIN.finallyCodeEnd$NT(v1);
                    v3 = -4;
                }
                else {
                    zzgb0.zzc = true;
                    FIN.finallyExec$NT(v1);
                }
            }
        }
        else if(!z && !this.u) {
            zzad zzad0 = this.x;
            if(zzad0 == null || !z2 && zzad0 == this.f) {
                FIN.finallyExec$NT(v1);
            }
            else {
                this.c(zzad0, zziz0);
                FIN.finallyExec$NT(v1);
                v3 = -5;
            }
        }
        else {
            zzgb0.zzc(4);
            goto label_39;
        }
        if(v3 == -4) {
            if(!zzgb0.zzg()) {
                boolean z3 = false;
                if((v & 4) == 0) {
                    z3 = true;
                    if((v & 1) != 0) {
                        d.e(((K)this.a.l), zzgb0, this.b, ((zzdy)this.a.j));
                        return -4;
                    }
                    this.a.l = d.e(((K)this.a.l), zzgb0, this.b, ((zzdy)this.a.j));
                }
                else if((v & 1) == 0) {
                    z3 = true;
                }
                if(z3) {
                    ++this.q;
                    return -4;
                }
            }
            return -4;
        }
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final int zze(zzp zzp0, int v, boolean z) {
        return zzzw.zza(this, zzp0, v, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final int zzf(zzp zzp0, int v, boolean z, int v1) throws IOException {
        d d0 = this.a;
        int v2 = d0.b(v);
        K k0 = (K)d0.m;
        int v3 = zzp0.zza(((zzvo)k0.k).zza, ((int)(d0.i - k0.i)), v2);
        if(v3 == -1) {
            if(!z) {
                throw new EOFException();
            }
            return -1;
        }
        long v4 = d0.i + ((long)v3);
        d0.i = v4;
        K k1 = (K)d0.m;
        if(v4 == k1.j) {
            d0.m = (K)k1.l;
        }
        return v3;
    }

    public final long zzg() {
        synchronized(this) {
        }
        return this.t;
    }

    public final zzad zzh() {
        synchronized(this) {
            if(this.w) {
                return null;
            }
        }
        return this.x;
    }

    public final void zzi(long v, boolean z, boolean z1) {
        d d0 = this.a;
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        int v2 = this.n;
        long v3 = -1L;
        if(v2 == 0) {
        label_17:
            FIN.finallyCodeBegin$NT(v1);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v1);
        }
        else {
            int v4 = this.p;
            if(v >= this.l[v4]) {
                if(z1) {
                    int v5 = this.q;
                    if(v5 != v2) {
                        v2 = v5 + 1;
                    }
                }
                int v6 = this.e(v4, v2, v, false);
                if(v6 == -1) {
                    FIN.finallyExec$NT(v1);
                }
                else {
                    v3 = this.b(v6);
                    goto label_17;
                }
            }
            else {
                goto label_17;
            }
        }
        d0.a(v3);
    }

    public final void zzj() {
        long v2;
        d d0 = this.a;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        int v1 = this.n;
        if(v1 == 0) {
            FIN.finallyExec$NT(v);
            v2 = -1L;
        }
        else {
            v2 = this.b(v1);
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
        }
        d0.a(v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final void zzk(zzad zzad0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        boolean z = false;
        this.w = false;
        if(zzeg.zzS(zzad0, this.x)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
        }
        else {
            this.x = ((SparseArray)this.c.j).size() == 0 || !((Ab)((SparseArray)this.c.j).valueAt(((SparseArray)this.c.j).size() - 1)).a.equals(zzad0) ? zzad0 : ((Ab)((SparseArray)this.c.j).valueAt(((SparseArray)this.c.j).size() - 1)).a;
            this.y = zzbo.zzf(this.x.zzm, this.x.zzj);
            this.z = false;
            FIN.finallyExec$NT(v);
            z = true;
        }
        zzto zzto0 = this.e;
        if(zzto0 != null && z) {
            zzto0.zzJ(zzad0);
        }
    }

    public final void zzm() throws IOException {
        zzpj zzpj0 = this.A;
        if(zzpj0 != null) {
            throw zzpj0.zza();
        }
    }

    public final void zzn() {
        this.zzj();
        if(this.A != null) {
            this.A = null;
            this.f = null;
        }
    }

    public final void zzo() {
        this.zzp(true);
        if(this.A != null) {
            this.A = null;
            this.f = null;
        }
    }

    public final void zzp(boolean z) {
        SparseArray sparseArray0;
        k k2;
        d d0 = this.a;
        K k0 = (K)d0.k;
        zzvo zzvo0 = (zzvo)k0.k;
        zzvv zzvv0 = (zzvv)d0.n;
        if(zzvo0 != null) {
            zzvv0.zzd(k0);
            k0.k = null;
            k0.l = null;
        }
        K k1 = (K)d0.k;
        zzcw.zzf(((zzvo)k1.k) == null);
        k1.i = 0L;
        k1.j = 0x10000L;
        d0.l = (K)d0.k;
        d0.m = (K)d0.k;
        d0.i = 0L;
        zzvv0.zzg();
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.v = true;
        this.r = 0x8000000000000000L;
        this.s = 0x8000000000000000L;
        this.t = 0x8000000000000000L;
        this.u = false;
        for(int v = 0; true; ++v) {
            k2 = this.c;
            sparseArray0 = (SparseArray)k2.j;
            if(v >= sparseArray0.size()) {
                break;
            }
            Ab ab0 = (Ab)sparseArray0.valueAt(v);
        }
        k2.i = -1;
        sparseArray0.clear();
        if(z) {
            this.x = null;
            this.w = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final void zzq(zzdy zzdy0, int v) {
        zzzw.zzb(this, zzdy0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final void zzr(zzdy zzdy0, int v, int v1) {
        d d0;
        while(true) {
            d0 = this.a;
            if(v <= 0) {
                break;
            }
            int v2 = d0.b(v);
            K k0 = (K)d0.m;
            zzdy0.zzB(((zzvo)k0.k).zza, ((int)(d0.i - k0.i)), v2);
            v -= v2;
            long v3 = d0.i + ((long)v2);
            d0.i = v3;
            K k1 = (K)d0.m;
            if(v3 == k1.j) {
                d0.m = (K)k1.l;
            }
        }
        d0.getClass();
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final void zzs(long v, int v1, int v2, int v3, zzzx zzzx0) {
        if(this.v) {
            if((v1 & 1) == 0) {
                return;
            }
            this.v = false;
        }
        if(this.y) {
            if(v < this.r) {
                return;
            }
            if((v1 & 1) == 0) {
                if(!this.z) {
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.x);
                    this.z = true;
                }
                v1 |= 1;
            }
        }
        long v4 = this.a.i - ((long)v2) - ((long)v3);
        synchronized(this) {
            int v6 = this.n;
            if(v6 > 0) {
                int v7 = this.a(v6 - 1);
                zzcw.zzd(this.i[v7] + ((long)this.j[v7]) <= v4);
            }
            this.u = (0x20000000 & v1) != 0;
            this.t = Math.max(this.t, v);
            int v8 = this.a(this.n);
            this.l[v8] = v;
            this.i[v8] = v4;
            this.j[v8] = v2;
            this.k[v8] = v1;
            this.m[v8] = zzzx0;
            this.h[v8] = 0;
            if(((SparseArray)this.c.j).size() == 0 || !((Ab)((SparseArray)this.c.j).valueAt(((SparseArray)this.c.j).size() - 1)).a.equals(this.x)) {
                zzph zzph0 = zzph.zzb;
                k k0 = this.c;
                int v9 = this.o + this.n;
                zzad zzad0 = this.x;
                if(zzad0 == null) {
                    throw null;
                }
                k0.e(v9, new Ab(zzad0, zzph0));
            }
            int v10 = this.n + 1;
            this.n = v10;
            int v11 = this.g;
            if(v10 == v11) {
                int[] arr_v = new int[v11 + 1000];
                long[] arr_v1 = new long[v11 + 1000];
                long[] arr_v2 = new long[v11 + 1000];
                int[] arr_v3 = new int[v11 + 1000];
                int[] arr_v4 = new int[v11 + 1000];
                zzzx[] arr_zzzx = new zzzx[v11 + 1000];
                int v12 = v11 - this.p;
                System.arraycopy(this.i, this.p, arr_v1, 0, v12);
                System.arraycopy(this.l, this.p, arr_v2, 0, v12);
                System.arraycopy(this.k, this.p, arr_v3, 0, v12);
                System.arraycopy(this.j, this.p, arr_v4, 0, v12);
                System.arraycopy(this.m, this.p, arr_zzzx, 0, v12);
                System.arraycopy(this.h, this.p, arr_v, 0, v12);
                int v13 = this.p;
                System.arraycopy(this.i, 0, arr_v1, v12, v13);
                System.arraycopy(this.l, 0, arr_v2, v12, v13);
                System.arraycopy(this.k, 0, arr_v3, v12, v13);
                System.arraycopy(this.j, 0, arr_v4, v12, v13);
                System.arraycopy(this.m, 0, arr_zzzx, v12, v13);
                System.arraycopy(this.h, 0, arr_v, v12, v13);
                this.i = arr_v1;
                this.l = arr_v2;
                this.k = arr_v3;
                this.j = arr_v4;
                this.m = arr_zzzx;
                this.h = arr_v;
                this.p = 0;
                this.g = v11 + 1000;
            }
        }
    }

    public final void zzt(long v) {
        this.r = v;
    }

    public final void zzu(zzto zzto0) {
        this.e = zzto0;
    }

    public final void zzv(int v) {
        boolean z = false;
        synchronized(this) {
            if(v >= 0 && this.q + v <= this.n) {
                z = true;
            }
            zzcw.zzd(z);
            this.q += v;
        }
    }

    public final boolean zzw() {
        synchronized(this) {
        }
        return this.u;
    }

    public final boolean zzx(boolean z) {
        synchronized(this) {
            int v1 = this.q;
            boolean z1 = false;
            if(v1 == this.n) {
                if(z || this.u) {
                    z1 = true;
                }
                else {
                    zzad zzad0 = this.x;
                    if(zzad0 != null) {
                        if(zzad0 == this.f) {
                            return false;
                        }
                        z1 = true;
                    }
                }
                return z1;
            }
            if(((Ab)this.c.b(this.o + v1)).a != this.f) {
                return true;
            }
            int v2 = this.a(this.q);
            if(this.A == null) {
                z1 = true;
            }
            else {
                int v3 = this.k[v2];
            }
            return z1;
        }
    }

    public final boolean zzy(long v, boolean z) {
        synchronized(this) {
            this.d();
            int v2 = this.q;
            int v3 = this.a(v2);
            int v4 = this.n;
            if(this.q != v4 && v >= this.l[v3] && (v <= this.t || z)) {
                int v5 = this.e(v3, v4 - v2, v, true);
                if(v5 == -1) {
                    return false;
                }
                this.r = v;
                this.q += v5;
                return true;
            }
            return false;
        }
    }
}

