package com.google.android.gms.internal.ads;

import A.f;
import N.s;
import java.util.Collections;

public final class zzagl implements zzaga {
    public final zzahb a;
    public String b;
    public zzzy c;
    public a0 d;
    public boolean e;
    public final boolean[] f;
    public final s g;
    public final s h;
    public final s i;
    public final s j;
    public final s k;
    public long l;
    public long m;
    public final zzdy n;

    public zzagl(zzahb zzahb0) {
        this.a = zzahb0;
        this.f = new boolean[3];
        this.g = new s(0x20);
        this.h = new s(33);
        this.i = new s(34);
        this.j = new s(39);
        this.k = new s(40);
        this.m = 0x8000000000000001L;
        this.n = new zzdy();
    }

    public final void a(byte[] arr_b, int v, int v1) {
        a0 a00 = this.d;
        if(a00.f) {
            int v2 = a00.d;
            int v3 = v + 2 - v2;
            if(v3 < v1) {
                a00.g = (arr_b[v3] & 0x80) != 0;
                a00.f = false;
            }
            else {
                a00.d = v1 - v + v2;
            }
        }
        if(!this.e) {
            this.g.e(arr_b, v, v1);
            this.h.e(arr_b, v, v1);
            this.i.e(arr_b, v, v1);
        }
        this.j.e(arr_b, v, v1);
        this.k.e(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) {
        boolean z5;
        int v47;
        long v42;
        long v39;
        int v34;
        int v33;
        s s6;
        s s5;
        s s4;
        int v16;
        int v14;
        byte[] arr_b1;
        int v11;
        int v9;
        zzcw.zzb(this.c);
        while(zzdy0.zza() > 0) {
            int v = zzdy0.zzc();
            int v1 = zzdy0.zzd();
            byte[] arr_b = zzdy0.zzH();
            this.l += (long)zzdy0.zza();
            zzzw.zzb(this.c, zzdy0, zzdy0.zza());
            while(v < v1) {
                int v2 = zzzo.zza(arr_b, v, v1, this.f);
                if(v2 != v1) {
                    int v3 = (arr_b[v2 + 3] & 0x7E) >> 1;
                    int v4 = v2 - v;
                    if(v4 > 0) {
                        this.a(arr_b, v, v2);
                    }
                    int v5 = v1 - v2;
                    long v6 = this.l - ((long)v5);
                    int v7 = v4 >= 0 ? 0 : -v4;
                    long v8 = this.m;
                    a0 a00 = this.d;
                    boolean z = this.e;
                    if(a00.j && a00.g) {
                        a00.m = a00.c;
                        a00.j = false;
                    }
                    else if(a00.h || a00.g) {
                        if(!z || !a00.i) {
                            v11 = v1;
                            arr_b1 = arr_b;
                            v9 = v2 + 3;
                        }
                        else {
                            v9 = v2 + 3;
                            long v10 = a00.b;
                            v11 = v1;
                            arr_b1 = arr_b;
                            int v12 = v5 + ((int)(v6 - v10));
                            long v13 = a00.l;
                            if(v13 != 0x8000000000000001L) {
                                v14 = v3;
                                a00.a.zzs(v13, ((int)a00.m), ((int)(v10 - a00.k)), v12, null);
                                goto label_40;
                            }
                        }
                        v14 = v3;
                    label_40:
                        a00.k = a00.b;
                        a00.l = a00.e;
                        a00.m = a00.c;
                        a00.i = true;
                        goto label_49;
                    }
                    v11 = v1;
                    arr_b1 = arr_b;
                    v9 = v2 + 3;
                    v14 = v3;
                label_49:
                    s s0 = this.i;
                    s s1 = this.h;
                    s s2 = this.g;
                    if(this.e) {
                        v16 = v9;
                        v33 = v5;
                        s4 = s0;
                        s5 = s1;
                        s6 = s2;
                        v42 = v6;
                    }
                    else {
                        s2.h(v7);
                        s1.h(v7);
                        s0.h(v7);
                        if(s2.d && s1.d && s0.d) {
                            zzzy zzzy0 = this.c;
                            String s3 = this.b;
                            int v15 = s2.e;
                            byte[] arr_b2 = new byte[s1.e + v15 + s0.e];
                            v16 = v9;
                            System.arraycopy(((byte[])s2.f), 0, arr_b2, 0, v15);
                            System.arraycopy(((byte[])s1.f), 0, arr_b2, s2.e, s1.e);
                            System.arraycopy(((byte[])s0.f), 0, arr_b2, s2.e + s1.e, s0.e);
                            zzzq zzzq0 = new zzzq(((byte[])s1.f), 0, s1.e);
                            zzzq0.zze(44);
                            int v17 = zzzq0.zza(3);
                            zzzq0.zzd();
                            int v18 = zzzq0.zza(2);
                            boolean z1 = zzzq0.zzf();
                            int v19 = zzzq0.zza(5);
                            s4 = s0;
                            int v20 = 0;
                            for(int v21 = 0; v21 < 0x20; ++v21) {
                                if(zzzq0.zzf()) {
                                    v20 |= 1 << v21;
                                }
                            }
                            int[] arr_v = new int[6];
                            s5 = s1;
                            for(int v22 = 0; v22 < 6; ++v22) {
                                arr_v[v22] = zzzq0.zza(8);
                            }
                            int v23 = zzzq0.zza(8);
                            int v25 = 0;
                            for(int v24 = 0; v24 < v17; ++v24) {
                                if(zzzq0.zzf()) {
                                    v25 += 89;
                                }
                                if(zzzq0.zzf()) {
                                    v25 += 8;
                                }
                            }
                            zzzq0.zze(v25);
                            if(v17 > 0) {
                                zzzq0.zze(v17 * -2 + 16);
                            }
                            zzzq0.zzc();
                            int v26 = zzzq0.zzc();
                            if(v26 == 3) {
                                zzzq0.zzd();
                                v26 = 3;
                            }
                            int v27 = zzzq0.zzc();
                            int v28 = zzzq0.zzc();
                            if(zzzq0.zzf()) {
                                int v29 = zzzq0.zzc();
                                int v30 = zzzq0.zzc();
                                int v31 = zzzq0.zzc();
                                int v32 = zzzq0.zzc();
                                s6 = s2;
                                switch(v26) {
                                    case 1: {
                                        v33 = v5;
                                        v34 = 2;
                                        break;
                                    }
                                    case 2: {
                                        v33 = v5;
                                        v34 = 2;
                                        v26 = 2;
                                        break;
                                    }
                                    default: {
                                        v33 = v5;
                                        v34 = 1;
                                    }
                                }
                                v27 -= (v29 + v30) * v34;
                                v28 -= (v31 + v32) * (v26 == 1 ? 2 : 1);
                            }
                            else {
                                v33 = v5;
                                s6 = s2;
                            }
                            zzzq0.zzc();
                            zzzq0.zzc();
                            int v35 = zzzq0.zzc();
                            for(int v36 = zzzq0.zzf() ? 0 : v17; v36 <= v17; ++v36) {
                                zzzq0.zzc();
                                zzzq0.zzc();
                                zzzq0.zzc();
                            }
                            zzzq0.zzc();
                            zzzq0.zzc();
                            zzzq0.zzc();
                            zzzq0.zzc();
                            zzzq0.zzc();
                            zzzq0.zzc();
                            if(zzzq0.zzf() && zzzq0.zzf()) {
                                for(int v37 = 0; v37 < 4; ++v37) {
                                    int v38 = 0;
                                    while(v38 < 6) {
                                        if(zzzq0.zzf()) {
                                            v39 = v6;
                                            int v40 = Math.min(0x40, 1 << v37 * 2 + 4);
                                            if(v37 > 1) {
                                                zzzq0.zzb();
                                            }
                                            for(int v41 = 0; v41 < v40; ++v41) {
                                                zzzq0.zzb();
                                            }
                                        }
                                        else {
                                            zzzq0.zzc();
                                            v39 = v6;
                                        }
                                        v38 += (v37 == 3 ? 3 : 1);
                                        v6 = v39;
                                    }
                                }
                            }
                            v42 = v6;
                            zzzq0.zze(2);
                            if(zzzq0.zzf()) {
                                zzzq0.zze(8);
                                zzzq0.zzc();
                                zzzq0.zzc();
                                zzzq0.zzd();
                            }
                            int v43 = zzzq0.zzc();
                            int v44 = 0;
                            boolean z2 = false;
                            int v45 = 0;
                            while(v44 < v43) {
                                if(v44 != 0) {
                                    z2 = zzzq0.zzf();
                                }
                                if(z2) {
                                    zzzq0.zzd();
                                    zzzq0.zzc();
                                    for(int v46 = 0; v46 <= v45; ++v46) {
                                        if(zzzq0.zzf()) {
                                            zzzq0.zzd();
                                        }
                                    }
                                    v47 = v43;
                                }
                                else {
                                    int v48 = zzzq0.zzc();
                                    int v49 = zzzq0.zzc();
                                    v47 = v43;
                                    for(int v50 = 0; v50 < v48; ++v50) {
                                        zzzq0.zzc();
                                        zzzq0.zzd();
                                    }
                                    for(int v51 = 0; v51 < v49; ++v51) {
                                        zzzq0.zzc();
                                        zzzq0.zzd();
                                    }
                                    v45 = v48 + v49;
                                }
                                ++v44;
                                v43 = v47;
                            }
                            if(zzzq0.zzf()) {
                                for(int v52 = 0; v52 < zzzq0.zzc(); ++v52) {
                                    zzzq0.zze(v35 + 5);
                                }
                            }
                            zzzq0.zze(2);
                            float f = 1.0f;
                            if(zzzq0.zzf()) {
                                if(zzzq0.zzf()) {
                                    int v53 = zzzq0.zza(8);
                                    if(v53 == 0xFF) {
                                        int v54 = zzzq0.zza(16);
                                        int v55 = zzzq0.zza(16);
                                        if(v54 != 0 && v55 != 0) {
                                            f = ((float)v54) / ((float)v55);
                                        }
                                    }
                                    else if(v53 < 17) {
                                        f = zzzo.zzb[v53];
                                    }
                                    else {
                                        f.p(v53, "Unexpected aspect_ratio_idc value: ", "H265Reader");
                                    }
                                }
                                if(zzzq0.zzf()) {
                                    zzzq0.zzd();
                                }
                                if(zzzq0.zzf()) {
                                    zzzq0.zze(4);
                                    if(zzzq0.zzf()) {
                                        zzzq0.zze(24);
                                    }
                                }
                                if(zzzq0.zzf()) {
                                    zzzq0.zzc();
                                    zzzq0.zzc();
                                }
                                zzzq0.zzd();
                                if(zzzq0.zzf()) {
                                    v28 += v28;
                                }
                            }
                            String s7 = zzcy.zzb(v18, z1, v19, v20, arr_v, v23);
                            zzab zzab0 = new zzab();
                            zzab0.zzH(s3);
                            zzab0.zzS("video/hevc");
                            zzab0.zzx(s7);
                            zzab0.zzX(v27);
                            zzab0.zzF(v28);
                            zzab0.zzP(f);
                            zzab0.zzI(Collections.singletonList(arr_b2));
                            zzzy0.zzk(zzab0.zzY());
                            this.e = true;
                        }
                    }
                    s s8 = this.j;
                    boolean z3 = s8.h(v7);
                    zzahb zzahb0 = this.a;
                    zzdy zzdy1 = this.n;
                    if(z3) {
                        int v56 = zzzo.zzb(((byte[])s8.f), s8.e);
                        zzdy1.zzD(((byte[])s8.f), v56);
                        zzdy1.zzG(5);
                        zzahb0.zza(v8, zzdy1);
                    }
                    s s9 = this.k;
                    if(s9.h(v7)) {
                        int v57 = zzzo.zzb(((byte[])s9.f), s9.e);
                        zzdy1.zzD(((byte[])s9.f), v57);
                        zzdy1.zzG(5);
                        zzahb0.zza(v8, zzdy1);
                    }
                    a0 a01 = this.d;
                    boolean z4 = this.e;
                    a01.g = false;
                    a01.h = false;
                    a01.e = this.m;
                    a01.d = 0;
                    a01.b = v42;
                    if(v14 < 0x20) {
                        z5 = false;
                    }
                    else if(v14 == 40) {
                        z5 = false;
                    }
                    else {
                        if(!a01.i || a01.j) {
                            z5 = false;
                        }
                        else {
                            if(z4) {
                                long v58 = a01.l;
                                if(v58 != 0x8000000000000001L) {
                                    a01.a.zzs(v58, ((int)a01.m), ((int)(v42 - a01.k)), v33, null);
                                }
                            }
                            z5 = false;
                            a01.i = false;
                        }
                        if(v14 <= 35 || v14 == 39) {
                            a01.h = !a01.j;
                            a01.j = true;
                        }
                    }
                    boolean z6 = v14 >= 16 && v14 <= 21;
                    a01.c = z6;
                    if(z6 || v14 <= 9) {
                        z5 = true;
                    }
                    a01.f = z5;
                    if(!this.e) {
                        s6.g(v14);
                        s5.g(v14);
                        s4.g(v14);
                    }
                    s8.g(v14);
                    s9.g(v14);
                    v1 = v11;
                    arr_b = arr_b1;
                    v = v16;
                    continue;
                }
                this.a(arr_b, v, v1);
                return;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        zzahm0.zzc();
        this.b = zzahm0.zzb();
        zzzy zzzy0 = zzyu0.zzv(zzahm0.zza(), 2);
        this.c = zzzy0;
        this.d = new a0(zzzy0);
        this.a.zzb(zzyu0, zzahm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.m = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.l = 0L;
        this.m = 0x8000000000000001L;
        zzzo.zze(this.f);
        this.g.f();
        this.h.f();
        this.i.f();
        this.j.f();
        this.k.f();
        a0 a00 = this.d;
        if(a00 != null) {
            a00.f = false;
            a00.g = false;
            a00.h = false;
            a00.i = false;
            a00.j = false;
        }
    }
}

