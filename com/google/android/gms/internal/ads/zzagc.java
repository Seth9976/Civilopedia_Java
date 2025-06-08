package com.google.android.gms.internal.ads;

import N.s;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

public final class zzagc implements zzaga {
    public String a;
    public zzzy b;
    public final Q c;
    public final zzdy d;
    public final s e;
    public final boolean[] f;
    public final W g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public static final double[] q;

    static {
        zzagc.q = new double[]{23.976024, 24.0, 25.0, 29.97003, 30.0, 50.0, 59.94006, 60.0};
    }

    public zzagc() {
        this(null);
    }

    public zzagc(Q q0) {
        zzdy zzdy0;
        this.c = q0;
        this.f = new boolean[4];
        W w0 = new W();  // 初始化器: Ljava/lang/Object;-><init>()V
        w0.d = new byte[0x80];
        this.g = w0;
        if(q0 == null) {
            zzdy0 = null;
            this.e = null;
        }
        else {
            this.e = new s(0xB2);
            zzdy0 = new zzdy();
        }
        this.d = zzdy0;
        this.l = 0x8000000000000001L;
        this.n = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) {
        int v13;
        float f;
        s s0;
        W w0;
        zzcw.zzb(this.b);
        int v = zzdy0.zzc();
        int v1 = zzdy0.zzd();
        byte[] arr_b = zzdy0.zzH();
        this.h += (long)zzdy0.zza();
        zzzw.zzb(this.b, zzdy0, zzdy0.zza());
        while(true) {
            int v2 = zzzo.zza(arr_b, v, v1, this.f);
            w0 = this.g;
            s0 = this.e;
            if(v2 == v1) {
                break;
            }
            int v3 = zzdy0.zzH()[v2 + 3] & 0xFF;
            int v4 = v2 - v;
            if(!this.j) {
                if(v4 > 0) {
                    w0.a(arr_b, v, v2);
                }
                if(w0.a) {
                    int v5 = w0.b - (v4 >= 0 ? 0 : -v4);
                    w0.b = v5;
                    if(w0.c != 0 || v3 != 0xB5) {
                        w0.a = false;
                        String s1 = this.a;
                        s1.getClass();
                        byte[] arr_b1 = Arrays.copyOf(w0.d, w0.b);
                        int v6 = (arr_b1[5] & 0xFF) >> 4 | (arr_b1[4] & 0xFF) << 4;
                        int v7 = (arr_b1[5] & 15) << 8 | arr_b1[6] & 0xFF;
                        switch((arr_b1[7] & 0xF0) >> 4) {
                            case 2: {
                                f = ((float)(v7 * 4)) / ((float)(v6 * 3));
                                break;
                            }
                            case 3: {
                                f = ((float)(v7 * 16)) / ((float)(v6 * 9));
                                break;
                            }
                            case 4: {
                                f = ((float)(v7 * 0x79)) / ((float)(v6 * 100));
                                break;
                            }
                            default: {
                                f = 1.0f;
                            }
                        }
                        zzab zzab0 = new zzab();
                        zzab0.zzH(s1);
                        zzab0.zzS("video/mpeg2");
                        zzab0.zzX(v6);
                        zzab0.zzF(v7);
                        zzab0.zzP(f);
                        zzab0.zzI(Collections.singletonList(arr_b1));
                        zzad zzad0 = zzab0.zzY();
                        int v8 = (arr_b1[7] & 15) - 1;
                        long v9 = 0L;
                        if(v8 >= 0 && v8 < 8) {
                            double f1 = zzagc.q[v8];
                            int v10 = arr_b1[w0.c + 9];
                            int v11 = (v10 & 0x60) >> 5;
                            int v12 = v10 & 0x1F;
                            if(v11 != v12) {
                                f1 *= (((double)v11) + 1.0) / ((double)(v12 + 1));
                            }
                            v9 = (long)(1000000.0 / f1);
                        }
                        Pair pair0 = Pair.create(zzad0, v9);
                        this.b.zzk(((zzad)pair0.first));
                        this.k = (long)(((Long)pair0.second));
                        this.j = true;
                        goto label_61;
                    }
                    else {
                        w0.c = v5;
                        goto label_60;
                    }
                    goto label_58;
                }
                else {
                label_58:
                    if(v3 == 0xB3) {
                        w0.a = true;
                    }
                }
            label_60:
                w0.a(W.e, 0, 3);
            }
        label_61:
            if(s0 != null) {
                if(v4 > 0) {
                    s0.e(arr_b, v, v2);
                    v13 = 0;
                }
                else {
                    v13 = -v4;
                }
                if(s0.h(v13)) {
                    int v14 = zzzo.zzb(((byte[])s0.f), s0.e);
                    this.d.zzD(((byte[])s0.f), v14);
                    this.c.a(this.n, this.d);
                }
                if(v3 == 0xB2) {
                    if(zzdy0.zzH()[v2 + 2] == 1) {
                        s0.g(0xB2);
                    }
                    v3 = 0xB2;
                }
            }
            switch(v3) {
                case 0: 
                case 0xB3: {
                    int v15 = v1 - v2;
                    if(this.p && this.j) {
                        long v16 = this.n;
                        if(v16 != 0x8000000000000001L) {
                            this.b.zzs(v16, ((int)this.o), ((int)(this.h - this.m)) - v15, v15, null);
                        }
                    }
                    if(!this.i || this.p) {
                        this.m = this.h - ((long)v15);
                        long v17 = this.l;
                        if(v17 == 0x8000000000000001L) {
                            v17 = this.n == 0x8000000000000001L ? 0x8000000000000001L : this.n + this.k;
                        }
                        this.n = v17;
                        this.o = false;
                        this.l = 0x8000000000000001L;
                        this.i = true;
                    }
                    this.p = v3 == 0;
                    break;
                }
                case 0xB8: {
                    this.o = true;
                }
            }
            v = v2 + 3;
        }
        if(!this.j) {
            w0.a(arr_b, v, v1);
        }
        if(s0 != null) {
            s0.e(arr_b, v, v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        zzahm0.zzc();
        this.a = zzahm0.zzb();
        this.b = zzyu0.zzv(zzahm0.zza(), 2);
        Q q0 = this.c;
        if(q0 != null) {
            q0.c(zzyu0, zzahm0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long v, int v1) {
        this.l = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        zzzo.zze(this.f);
        this.g.a = false;
        this.g.b = 0;
        this.g.c = 0;
        s s0 = this.e;
        if(s0 != null) {
            s0.f();
        }
        this.h = 0L;
        this.i = false;
        this.l = 0x8000000000000001L;
        this.n = 0x8000000000000001L;
    }
}

