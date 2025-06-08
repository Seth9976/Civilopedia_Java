package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public final class zzaxk implements zzauf {
    public final q1 a;
    public final zzaxg b;
    public final zzazh c;
    public final AtomicInteger d;
    public r1 e;
    public r1 f;
    public zzart g;
    public long h;
    public int i;
    public zzaxj j;
    public final zzaym k;

    public zzaxk(zzaym zzaym0, byte[] arr_b) {
        this.k = zzaym0;
        q1 q10 = new q1();  // 初始化器: Ljava/lang/Object;-><init>()V
        q10.a = 1000;
        q10.b = new int[1000];
        q10.c = new long[1000];
        q10.f = new long[1000];
        q10.e = new int[1000];
        q10.d = new int[1000];
        q10.g = new zzaue[1000];
        q10.h = new zzart[1000];
        q10.m = 0x8000000000000000L;
        q10.n = 0x8000000000000000L;
        q10.p = true;
        q10.o = true;
        this.a = q10;
        this.b = new zzaxg();
        this.c = new zzazh(0x20);
        this.d = new AtomicInteger();
        this.i = 0x10000;
        r1 r10 = new r1(0L);
        this.e = r10;
        this.f = r10;
    }

    public final int a(int v) {
        if(this.i == 0x10000) {
            this.i = 0;
            r1 r10 = this.f;
            if(r10.c) {
                this.f = r10.e;
            }
            r1 r11 = this.f;
            zzayg zzayg0 = this.k.zzb();
            r1 r12 = new r1(this.f.b);
            r11.d = zzayg0;
            r11.e = r12;
            r11.c = true;
        }
        return Math.min(v, 0x10000 - this.i);
    }

    public final void b() {
        this.a.j = 0;
        this.a.k = 0;
        this.a.l = 0;
        this.a.i = 0;
        this.a.o = true;
        r1 r10 = this.e;
        zzaym zzaym0 = this.k;
        if(r10.c) {
            int v1 = ((int)(this.f.a - r10.a)) / 0x10000 + this.f.c;
            zzayg[] arr_zzayg = new zzayg[v1];
            for(int v = 0; v < v1; ++v) {
                arr_zzayg[v] = r10.d;
                r10.d = null;
                r10 = r10.e;
            }
            zzaym0.zzd(arr_zzayg);
        }
        r1 r11 = new r1(0L);
        this.e = r11;
        this.f = r11;
        this.h = 0L;
        this.i = 0x10000;
        zzaym0.zzg();
    }

    public final void c(long v) {
        while(true) {
            r1 r10 = this.e;
            if(v < r10.b) {
                break;
            }
            this.k.zzc(r10.d);
            this.e.d = null;
            this.e = this.e.e;
        }
    }

    public final void d() {
        if(!this.d.compareAndSet(1, 0)) {
            this.b();
        }
    }

    public final void e(int v, long v1, byte[] arr_b) {
        this.c(v1);
        int v2 = 0;
        while(v2 < v) {
            int v3 = (int)(v1 - this.e.a);
            int v4 = Math.min(v - v2, 0x10000 - v3);
            zzayg zzayg0 = this.e.d;
            System.arraycopy(zzayg0.zza, v3, arr_b, v2, v4);
            v1 += (long)v4;
            v2 += v4;
            if(v1 == this.e.b) {
                this.k.zzc(zzayg0);
                this.e.d = null;
                this.e = this.e.e;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zza(zzart zzart0) {
        if(zzart0 == null) {
            zzart0 = null;
        }
        boolean z = true;
        q1 q10 = this.a;
        __monitor_enter(q10);
        int v = FIN.finallyOpen$NT();
        if(zzart0 == null) {
            q10.p = true;
            FIN.finallyExec$NT(v);
            z = false;
        }
        else {
            q10.p = false;
            if(zzazo.zzo(zzart0, q10.q)) {
                FIN.finallyExec$NT(v);
                z = false;
            }
            else {
                q10.q = zzart0;
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(q10);
                FIN.finallyCodeEnd$NT(v);
            }
        }
        zzaxj zzaxj0 = this.j;
        if(zzaxj0 != null && z) {
            zzaxj0.zzv(zzart0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzb(zzazh zzazh0, int v) {
        if(this.d.compareAndSet(0, 1)) {
            while(v > 0) {
                int v1 = this.a(v);
                zzazh0.zzq(this.f.d.zza, this.i, v1);
                this.i += v1;
                this.h += (long)v1;
                v -= v1;
            }
            this.d();
            return;
        }
        zzazh0.zzw(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzc(long v, int v1, int v2, int v3, zzaue zzaue0) {
        boolean z = this.d.compareAndSet(0, 1);
        q1 q10 = this.a;
        if(z) {
            try {
                q10.a(v, v1, this.h - ((long)v2), v2, zzaue0);
            }
            finally {
                this.d();
            }
            return;
        }
        q10.b(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final int zzd(zzatv zzatv0, int v, boolean z) throws IOException, InterruptedException {
        if(!this.d.compareAndSet(0, 1)) {
            int v1 = zzatv0.zzb(v);
            if(v1 == -1) {
                throw new EOFException();
            }
            return v1;
        }
        try {
            int v3 = this.a(v);
            int v4 = zzatv0.zza(this.f.d.zza, this.i, v3);
            if(v4 != -1) {
                this.i += v4;
                this.h += (long)v4;
                return v4;
            }
        }
        finally {
            this.d();
        }
        throw new EOFException();
    }

    public final int zze() {
        return this.a.j + this.a.i;
    }

    public final int zzf(zzaru zzaru0, zzato zzato0, boolean z, boolean z1, long v) {
        int v10;
        q1 q10 = this.a;
        zzart zzart0 = this.g;
        zzaxg zzaxg0 = this.b;
        synchronized(q10) {
            if(q10.c()) {
                if(!z) {
                    int v3 = q10.k;
                    if(q10.h[v3] == zzart0) {
                        if(zzato0.zzb != null) {
                            zzato0.zzc = q10.f[v3];
                            zzato0.zzc(q10.e[v3]);
                            int v4 = q10.k;
                            zzaxg0.zza = q10.d[v4];
                            zzaxg0.zzb = q10.c[v4];
                            zzaxg0.zzd = q10.g[v4];
                            q10.m = Math.max(q10.m, zzato0.zzc);
                            int v5 = q10.i - 1;
                            q10.i = v5;
                            int v6 = q10.k + 1;
                            q10.k = v6;
                            ++q10.j;
                            if(v6 == q10.a) {
                                q10.k = 0;
                                v6 = 0;
                            }
                            zzaxg0.zzc = v5 <= 0 ? zzaxg0.zzb + ((long)zzaxg0.zza) : q10.c[v6];
                        label_38:
                            if(!zzato0.zzf()) {
                                if(zzato0.zzc < v) {
                                    zzato0.zza(0x80000000);
                                }
                                if(zzato0.zzi()) {
                                    zzaxg zzaxg1 = this.b;
                                    long v7 = zzaxg1.zzb;
                                    this.c.zzs(1);
                                    this.e(1, v7, this.c.zza);
                                    int v8 = this.c.zza[0];
                                    zzatm zzatm0 = zzato0.zza;
                                    if(zzatm0.zza == null) {
                                        zzatm0.zza = new byte[16];
                                    }
                                    this.e(v8 & 0x7F, v7 + 1L, zzatm0.zza);
                                    long v9 = v7 + 1L + ((long)(v8 & 0x7F));
                                    if((v8 & 0x80) == 0) {
                                        v10 = 1;
                                    }
                                    else {
                                        this.c.zzs(2);
                                        this.e(2, v9, this.c.zza);
                                        v9 += 2L;
                                        v10 = this.c.zzj();
                                    }
                                    int[] arr_v = zzato0.zza.zzd;
                                    arr_v = arr_v != null && arr_v.length >= v10 ? zzato0.zza.zzd : new int[v10];
                                    int[] arr_v1 = zzato0.zza.zze;
                                    arr_v1 = arr_v1 != null && arr_v1.length >= v10 ? zzato0.zza.zze : new int[v10];
                                    if((v8 & 0x80) == 0) {
                                        arr_v[0] = 0;
                                        arr_v1[0] = zzaxg1.zza - ((int)(v9 - zzaxg1.zzb));
                                    }
                                    else {
                                        this.c.zzs(v10 * 6);
                                        this.e(v10 * 6, v9, this.c.zza);
                                        v9 += (long)(v10 * 6);
                                        this.c.zzv(0);
                                        for(int v1 = 0; v1 < v10; ++v1) {
                                            arr_v[v1] = this.c.zzj();
                                            arr_v1[v1] = this.c.zzi();
                                        }
                                    }
                                    zzato0.zza.zzb(v10, arr_v, arr_v1, zzaxg1.zzd.zzb, zzato0.zza.zza, 1);
                                    int v11 = (int)(v9 - zzaxg1.zzb);
                                    zzaxg1.zzb += (long)v11;
                                    zzaxg1.zza -= v11;
                                }
                                zzato0.zzh(this.b.zza);
                                long v12 = this.b.zzb;
                                ByteBuffer byteBuffer0 = zzato0.zzb;
                                int v13 = this.b.zza;
                                this.c(v12);
                                while(v13 > 0) {
                                    int v14 = (int)(v12 - this.e.a);
                                    int v15 = Math.min(v13, 0x10000 - v14);
                                    zzayg zzayg0 = this.e.d;
                                    byteBuffer0.put(zzayg0.zza, v14, v15);
                                    v12 += (long)v15;
                                    v13 -= v15;
                                    if(v12 == this.e.b) {
                                        this.k.zzc(zzayg0);
                                        this.e.d = null;
                                        this.e = this.e.e;
                                    }
                                }
                                this.c(this.b.zzc);
                            }
                            return -4;
                        }
                        return -3;
                    }
                }
                zzaru0.zza = q10.h[q10.k];
            }
            else {
                if(z1) {
                    zzato0.zzc(4);
                    goto label_38;
                }
                zzart zzart1 = q10.q;
                if(zzart1 != null && (z || zzart1 != zzart0)) {
                    zzaru0.zza = zzart1;
                    this.g = zzaru0.zza;
                    return -5;
                }
                return -3;
            }
        }
        this.g = zzaru0.zza;
        return -5;
    }

    public final long zzg() {
        synchronized(this.a) {
        }
        return Math.max(this.a.m, this.a.n);
    }

    public final zzart zzh() {
        q1 q10 = this.a;
        synchronized(q10) {
            if(q10.p) {
                return null;
            }
        }
        return q10.q;
    }

    public final void zzi() {
        if(this.d.getAndSet(2) == 0) {
            this.b();
        }
    }

    public final void zzj(boolean z) {
        int v = this.d.getAndSet((z ? 0 : 2));
        this.b();
        this.a.m = 0x8000000000000000L;
        this.a.n = 0x8000000000000000L;
        if(v == 2) {
            this.g = null;
        }
    }

    public final void zzk(zzaxj zzaxj0) {
        this.j = zzaxj0;
    }

    public final void zzl() {
        int v5;
        long v4;
        q1 q10 = this.a;
        synchronized(q10) {
            if(q10.c()) {
                int v = q10.i;
                int v1 = q10.k + v;
                int v2 = q10.a;
                int v3 = (v1 - 1) % v2;
                q10.k = v1 % v2;
                q10.j += v;
                q10.i = 0;
                v4 = q10.c[v3];
                v5 = q10.d[v3];
                goto label_16;
            }
            else {
                goto label_19;
            }
            goto label_21;
        }
    label_16:
        long v6 = v4 + ((long)v5);
        goto label_21;
    label_19:
        v6 = -1L;
    label_21:
        if(v6 != -1L) {
            this.c(v6);
        }
    }

    public final boolean zzm() {
        return this.a.c();
    }

    public final boolean zzn(long v, boolean z) {
        long v5;
        q1 q10 = this.a;
        __monitor_enter(q10);
        int v1 = FIN.finallyOpen$NT();
        if(q10.c()) {
            int v2 = q10.k;
            if(v < q10.f[v2]) {
                FIN.finallyExec$NT(v1);
                v5 = -1L;
            }
            else if(v <= q10.n || z) {
                int v3 = -1;
                for(int v4 = 0; v2 != q10.l && q10.f[v2] <= v; ++v4) {
                    if(1 == (q10.e[v2] & 1)) {
                        v3 = v4;
                    }
                    v2 = (v2 + 1) % q10.a;
                }
                if(v3 == -1) {
                    FIN.finallyExec$NT(v1);
                    v5 = -1L;
                }
                else {
                    int v6 = (q10.k + v3) % q10.a;
                    q10.k = v6;
                    q10.j += v3;
                    q10.i -= v3;
                    v5 = q10.c[v6];
                    FIN.finallyExec$NT(v1);
                }
            }
            else {
                FIN.finallyCodeBegin$NT(v1);
                __monitor_exit(q10);
                FIN.finallyCodeEnd$NT(v1);
                v5 = -1L;
            }
        }
        else {
            FIN.finallyExec$NT(v1);
            v5 = -1L;
        }
        if(v5 == -1L) {
            return false;
        }
        this.c(v5);
        return true;
    }
}

