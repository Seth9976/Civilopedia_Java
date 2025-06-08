package com.google.android.gms.internal.ads;

import A.f;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

public final class zzaeo implements zzyr, zzzu {
    public final zzdy a;
    public final zzdy b;
    public final zzdy c;
    public final zzdy d;
    public final ArrayDeque e;
    public final ArrayList f;
    public int g;
    public int h;
    public long i;
    public int j;
    public zzdy k;
    public int l;
    public int m;
    public int n;
    public int o;
    public zzyu p;
    public E[] q;
    public long[][] r;
    public int s;
    public long t;
    public int u;
    public static final zzyy zza;

    static {
        zzaeo.zza = zzael.zza;
    }

    public zzaeo() {
        this(0);
    }

    public zzaeo(int v) {
        this.g = 0;
        new ArrayList();
        this.f = new ArrayList();
        this.d = new zzdy(16);
        this.e = new ArrayDeque();
        this.a = new zzdy(zzzo.zza);
        this.b = new zzdy(4);
        this.c = new zzdy();
        this.l = -1;
        this.p = zzyu.zza;
        this.q = new E[0];
    }

    public final void a() {
        this.g = 0;
        this.j = 0;
    }

    // This method was un-flattened
    public final void b(long v) {
        ArrayList arrayList7;
        int v40;
        zzzg zzzg2;
        zzbl zzbl8;
        ArrayList arrayList6;
        zzbl zzbl7;
        long v39;
        zzbl zzbl6;
        ArrayList arrayList4;
        zzaco zzaco0;
        ArrayList arrayList3;
        String[] arr_s1;
        int v32;
        zzbl zzbl5;
        zzbl zzbl4;
        ArrayDeque arrayDeque2;
        ArrayDeque arrayDeque1;
        zzacj zzacj0;
        zzacb zzacb1;
        String s3;
        zzacb zzacb0;
        while(true) {
            ArrayDeque arrayDeque0 = this.e;
            if(arrayDeque0.isEmpty() || ((s)arrayDeque0.peek()).b != v) {
                break;
            }
            s s0 = (s)arrayDeque0.pop();
            if(s0.a == 0x6D6F6F76) {
                ArrayList arrayList0 = new ArrayList();
                boolean z = this.u == 1;
                zzzg zzzg0 = new zzzg();
                t t0 = s0.d(0x75647461);
                if(t0 == null) {
                    arrayDeque2 = arrayDeque0;
                    zzbl5 = null;
                    zzbl4 = null;
                }
                else {
                    zzdy zzdy0 = t0.b;
                    zzdy0.zzF(8);
                    zzbl zzbl0 = null;
                    zzbl zzbl1 = null;
                    while(zzdy0.zza() >= 8) {
                        int v1 = zzdy0.zzc();
                        int v2 = zzdy0.zze();
                        int v3 = zzdy0.zze();
                        if(v3 == 0x6D657461) {
                            zzdy0.zzF(v1);
                            int v4 = v1 + v2;
                            zzdy0.zzG(8);
                            int v5 = zzdy0.zzc();
                            zzdy0.zzG(4);
                            if(zzdy0.zze() != 0x68646C72) {
                                v5 += 4;
                            }
                            zzdy0.zzF(v5);
                            while(zzdy0.zzc() < v4) {
                                int v6 = zzdy0.zzc();
                                int v7 = zzdy0.zze();
                                if(zzdy0.zze() != 0x696C7374) {
                                    goto label_182;
                                }
                                zzdy0.zzF(v6);
                                int v8 = v6 + v7;
                                zzdy0.zzG(8);
                                ArrayList arrayList1 = new ArrayList();
                                while(zzdy0.zzc() < v8) {
                                    int v9 = zzdy0.zze() + zzdy0.zzc();
                                    int v10 = zzdy0.zze();
                                    try {
                                        if((v10 >> 24 & 0xFF) == 0xA9 || (v10 >> 24 & 0xFF) == 0xFD) {
                                            goto label_139;
                                        }
                                        else {
                                            switch(v10) {
                                                case 757935405: {
                                                    String s1 = null;
                                                    String s2 = null;
                                                    int v11 = -1;
                                                    int v12 = -1;
                                                    while(zzdy0.zzc() < v9) {
                                                        int v13 = zzdy0.zze();
                                                        int v14 = zzdy0.zze();
                                                        int v15 = zzdy0.zzc();
                                                        zzdy0.zzG(4);
                                                        if(v14 == 1835360622) {
                                                            s2 = zzdy0.zzw(v13 - 12);
                                                        }
                                                        else {
                                                            switch(v14) {
                                                                case 1684108385: {
                                                                    v12 = v13;
                                                                label_56:
                                                                    if(v14 == 1684108385) {
                                                                        v11 = v15;
                                                                    }
                                                                    zzdy0.zzG(v13 - 12);
                                                                    break;
                                                                }
                                                                case 0x6E616D65: {
                                                                    s1 = zzdy0.zzw(v13 - 12);
                                                                    break;
                                                                }
                                                                default: {
                                                                    goto label_56;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if(s2 == null || s1 == null || v11 == -1) {
                                                        zzacb0 = null;
                                                    }
                                                    else {
                                                        zzdy0.zzF(v11);
                                                        zzdy0.zzG(16);
                                                        zzacb0 = new zzacd(s2, s1, zzdy0.zzw(v12 - 16));
                                                    }
                                                    break;
                                                }
                                                case 1631670868: {
                                                    zzacb0 = h.Q(1631670868, "TPE2", zzdy0);
                                                    break;
                                                }
                                                case 0x636F7672: {
                                                    int v16 = zzdy0.zze();
                                                    if(zzdy0.zze() == 1684108385) {
                                                        int v17 = zzdy0.zze() & 0xFFFFFF;
                                                        if(v17 == 13) {
                                                            s3 = "image/jpeg";
                                                            goto label_80;
                                                        }
                                                        else {
                                                            if(v17 == 14) {
                                                                s3 = "image/png";
                                                            label_80:
                                                                zzdy0.zzG(4);
                                                                byte[] arr_b = new byte[v16 - 16];
                                                                zzdy0.zzB(arr_b, 0, v16 - 16);
                                                                zzacb0 = new zzabm(s3, null, 3, arr_b);
                                                            }
                                                            else {
                                                                Log.w("MetadataUtil", "Unrecognized cover art flags: " + v17);
                                                                zzacb0 = null;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                                                    zzacb0 = null;
                                                    break;
                                                }
                                                case 0x6370696C: {
                                                    zzacb1 = h.B(0x6370696C, "TCMP", zzdy0, true, true);
                                                    goto label_130;
                                                }
                                                case 0x6469736B: {
                                                    zzacb0 = h.J(0x6469736B, "TPOS", zzdy0);
                                                    break;
                                                }
                                                case 0x676E7265: {
                                                    int v18 = h.m(zzdy0);
                                                    String s4 = v18 <= 0 || v18 > 0xC0 ? null : h.d[v18 - 1];
                                                    if(s4 == null) {
                                                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                        zzacj0 = null;
                                                    }
                                                    else {
                                                        zzacj0 = new zzacj("TCON", null, s4);
                                                    }
                                                    goto label_104;
                                                }
                                                case 0x70676170: {
                                                    zzacb1 = h.B(0x70676170, "ITUNESGAPLESS", zzdy0, false, true);
                                                    goto label_130;
                                                }
                                                case 1920233063: {
                                                    zzacb1 = h.B(1920233063, "ITUNESADVISORY", zzdy0, false, false);
                                                    goto label_130;
                                                }
                                                case 0x736F6161: {
                                                    zzacb0 = h.Q(0x736F6161, "TSOP", zzdy0);
                                                    break;
                                                }
                                                case 0x736F616C: {
                                                    zzacb0 = h.Q(0x736F616C, "TSO2", zzdy0);
                                                    break;
                                                }
                                                case 0x736F6172: {
                                                    zzacb0 = h.Q(0x736F6172, "TSOA", zzdy0);
                                                    break;
                                                }
                                                case 0x736F636F: {
                                                    zzacb0 = h.Q(0x736F636F, "TSOC", zzdy0);
                                                    break;
                                                }
                                                case 0x736F6E6D: {
                                                    zzacb0 = h.Q(0x736F6E6D, "TSOT", zzdy0);
                                                    break;
                                                }
                                                case 0x736F736E: {
                                                    zzacb0 = h.Q(0x736F736E, "TVSHOWSORT", zzdy0);
                                                    break;
                                                }
                                                case 0x746D706F: {
                                                    goto label_129;
                                                }
                                                case 0x74726B6E: {
                                                    zzacb0 = h.J(0x74726B6E, "TRCK", zzdy0);
                                                    break;
                                                }
                                                case 0x74767368: {
                                                    zzacb0 = h.Q(0x74767368, "TVSHOW", zzdy0);
                                                    break;
                                                }
                                                default: {
                                                    Log.d("MetadataUtil", "Skipped unknown metadata entry: " + u.b(v10));
                                                    goto label_141;
                                                }
                                            }
                                        }
                                        goto label_174;
                                    }
                                    catch(Throwable throwable0) {
                                        zzdy0.zzF(v9);
                                        throw throwable0;
                                    }
                                label_104:
                                    zzdy0.zzF(v9);
                                    zzacb0 = zzacj0;
                                    goto label_175;
                                    try {
                                        zzacb1 = h.B(0x70676170, "ITUNESGAPLESS", zzdy0, false, true);
                                        goto label_130;
                                    label_129:
                                        zzacb1 = h.B(0x746D706F, "TBPM", zzdy0, true, false);
                                    }
                                    catch(Throwable throwable0) {
                                        zzdy0.zzF(v9);
                                        throw throwable0;
                                    }
                                label_130:
                                    zzdy0.zzF(v9);
                                    zzacb0 = zzacb1;
                                    goto label_175;
                                    try {
                                        zzacb0 = h.J(0x74726B6E, "TRCK", zzdy0);
                                        goto label_174;
                                    label_139:
                                        switch(v10 & 0xFFFFFF) {
                                            case 4280916: {
                                                zzacb0 = h.Q(v10, "TPE1", zzdy0);
                                                goto label_174;
                                            }
                                            case 0x616C62: {
                                                zzacb0 = h.Q(v10, "TALB", zzdy0);
                                                goto label_174;
                                            }
                                            case 6516084: {
                                                goto label_148;
                                            }
                                            case 0x646179: {
                                                zzacb0 = h.Q(v10, "TDRC", zzdy0);
                                                goto label_174;
                                            }
                                            case 0x67656E: {
                                                zzacb0 = h.Q(v10, "TCON", zzdy0);
                                                goto label_174;
                                            }
                                            case 0x677270: {
                                                zzacb0 = h.Q(v10, "TIT1", zzdy0);
                                                goto label_174;
                                            }
                                            case 7108978: {
                                                zzacb0 = h.Q(v10, "USLT", zzdy0);
                                                goto label_174;
                                            }
                                            case 0x746F6F: {
                                                zzacb0 = h.Q(v10, "TSSE", zzdy0);
                                                goto label_174;
                                            }
                                            case 7233901: 
                                            case 0x74726B: {
                                                zzacb0 = h.Q(v10, "TIT2", zzdy0);
                                                goto label_174;
                                            }
                                            case 0x636F6D: 
                                            case 7828084: {
                                                zzacb0 = h.Q(v10, "TCOM", zzdy0);
                                                goto label_174;
                                            }
                                            default: {
                                                Log.d("MetadataUtil", "Skipped unknown metadata entry: " + u.b(v10));
                                            }
                                        }
                                    }
                                    catch(Throwable throwable0) {
                                        zzdy0.zzF(v9);
                                        throw throwable0;
                                    }
                                label_141:
                                    zzdy0.zzF(v9);
                                    zzacb0 = null;
                                    goto label_175;
                                    try {
                                        zzacb0 = h.Q(v10, "TPE1", zzdy0);
                                        goto label_174;
                                    label_148:
                                        int v19 = zzdy0.zze();
                                        if(zzdy0.zze() == 1684108385) {
                                            zzdy0.zzG(8);
                                            String s5 = zzdy0.zzw(v19 - 16);
                                            zzacb0 = new zzabu("und", s5, s5);
                                        }
                                        else {
                                            Log.w("MetadataUtil", "Failed to parse comment attribute: " + u.b(v10));
                                            zzacb0 = null;
                                        }
                                    }
                                    catch(Throwable throwable0) {
                                        zzdy0.zzF(v9);
                                        throw throwable0;
                                    }
                                label_174:
                                    zzdy0.zzF(v9);
                                label_175:
                                    if(zzacb0 != null) {
                                        arrayList1.add(zzacb0);
                                    }
                                }
                                arrayDeque1 = arrayDeque0;
                                if(!arrayList1.isEmpty()) {
                                    zzbl0 = new zzbl(arrayList1);
                                    goto label_210;
                                label_182:
                                    zzdy0.zzF(v6 + v7);
                                    continue;
                                }
                                goto label_185;
                            }
                            arrayDeque1 = arrayDeque0;
                        label_185:
                            zzbl0 = null;
                        }
                        else {
                            arrayDeque1 = arrayDeque0;
                            if(v3 == 1936553057) {
                                zzdy0.zzF(v1);
                                int v20 = v1 + v2;
                                zzdy0.zzG(12);
                            alab1:
                                while(true) {
                                    if(zzdy0.zzc() < v20) {
                                        int v21 = zzdy0.zzc();
                                        int v22 = zzdy0.zze();
                                        if(zzdy0.zze() != 1935766900) {
                                            zzdy0.zzF(v21 + v22);
                                            continue;
                                        }
                                        else if(v22 >= 14) {
                                            zzdy0.zzG(5);
                                            switch(zzdy0.zzk()) {
                                                case 12: {
                                                    zzdy0.zzG(1);
                                                    zzbl1 = new zzbl(new zzbk[]{new zzacu(240.0f, zzdy0.zzk())});
                                                    break alab1;
                                                }
                                                case 13: {
                                                    zzdy0.zzG(1);
                                                    zzbl1 = new zzbl(new zzbk[]{new zzacu(120.0f, zzdy0.zzk())});
                                                    break alab1;
                                                }
                                            }
                                        }
                                    }
                                    zzbl1 = null;
                                    break;
                                }
                            }
                        }
                    label_210:
                        zzdy0.zzF(v1 + v2);
                        arrayDeque0 = arrayDeque1;
                    }
                    arrayDeque2 = arrayDeque0;
                    Pair pair0 = Pair.create(zzbl0, zzbl1);
                    zzbl zzbl2 = (zzbl)pair0.first;
                    zzbl zzbl3 = (zzbl)pair0.second;
                    if(zzbl2 != null) {
                        zzzg0.zzb(zzbl2);
                    }
                    zzbl4 = zzbl3;
                    zzbl5 = zzbl2;
                }
                s s6 = s0.c(0x6D657461);
                if(s6 == null) {
                    arrayList4 = arrayList0;
                }
                else {
                    t t1 = s6.d(0x68646C72);
                    t t2 = s6.d(1801812339);
                    t t3 = s6.d(0x696C7374);
                    if(t1 == null || t2 == null || t3 == null) {
                        arrayList4 = arrayList0;
                    }
                    else {
                        t1.b.zzF(16);
                        if(t1.b.zze() == 0x6D647461) {
                            zzdy zzdy1 = t2.b;
                            zzdy1.zzF(12);
                            int v23 = zzdy1.zze();
                            String[] arr_s = new String[v23];
                            for(int v24 = 0; v24 < v23; ++v24) {
                                int v25 = zzdy1.zze();
                                zzdy1.zzG(4);
                                arr_s[v24] = zzdy1.zzx(v25 - 8, zzfoi.zzc);
                            }
                            zzdy zzdy2 = t3.b;
                            zzdy2.zzF(8);
                            ArrayList arrayList2 = new ArrayList();
                            while(zzdy2.zza() > 8) {
                                int v26 = zzdy2.zzc();
                                int v27 = zzdy2.zze();
                                int v28 = zzdy2.zze() - 1;
                                if(v28 < 0 || v28 >= v23) {
                                    v32 = v23;
                                    arr_s1 = arr_s;
                                    arrayList3 = arrayList0;
                                    f.p(v28, "Skipped metadata with unknown key index: ", "AtomParsers");
                                }
                                else {
                                    String s7 = arr_s[v28];
                                    int v29 = v26 + v27;
                                    while(true) {
                                        int v30 = zzdy2.zzc();
                                        if(v30 < v29) {
                                            int v31 = zzdy2.zze();
                                            v32 = v23;
                                            if(zzdy2.zze() == 1684108385) {
                                                int v33 = zzdy2.zze();
                                                int v34 = zzdy2.zze();
                                                arr_s1 = arr_s;
                                                byte[] arr_b1 = new byte[v31 - 16];
                                                arrayList3 = arrayList0;
                                                zzdy2.zzB(arr_b1, 0, v31 - 16);
                                                zzaco0 = new zzaco(s7, arr_b1, v34, v33);
                                                break;
                                            }
                                            else {
                                                zzdy2.zzF(v30 + v31);
                                                v23 = v32;
                                                continue;
                                            }
                                        }
                                        v32 = v23;
                                        arr_s1 = arr_s;
                                        arrayList3 = arrayList0;
                                        zzaco0 = null;
                                        break;
                                    }
                                    if(zzaco0 != null) {
                                        arrayList2.add(zzaco0);
                                    }
                                }
                                zzdy2.zzF(v26 + v27);
                                v23 = v32;
                                arr_s = arr_s1;
                                arrayList0 = arrayList3;
                            }
                            arrayList4 = arrayList0;
                            if(!arrayList2.isEmpty()) {
                                zzbl6 = new zzbl(arrayList2);
                                goto label_297;
                            }
                        }
                        else {
                            arrayList4 = arrayList0;
                        }
                    }
                }
                zzbl6 = null;
            label_297:
                zzzg zzzg1 = zzzg0;
                ArrayList arrayList5 = A.a(s0, zzzg0, 0x8000000000000001L, null, z, zzaem.zza);
                int v35 = arrayList5.size();
                long v36 = 0x8000000000000001L;
                int v37 = -1;
                int v38 = 0;
                while(true) {
                    v39 = 0L;
                    if(v38 >= v35) {
                        break;
                    }
                    H h0 = (H)arrayList5.get(v38);
                    if(h0.b == 0) {
                        zzbl7 = zzbl5;
                        arrayList6 = arrayList5;
                        zzbl8 = zzbl4;
                        zzzg2 = zzzg1;
                        v40 = v35;
                        arrayList7 = arrayList4;
                    }
                    else {
                        zzaet zzaet0 = h0.a;
                        long v41 = zzaet0.zze == 0x8000000000000001L ? h0.h : zzaet0.zze;
                        v36 = Math.max(v36, v41);
                        arrayList6 = arrayList5;
                        E e0 = new E(zzaet0, h0, this.p.zzv(v38, zzaet0.zzb));
                        zzab zzab0 = zzaet0.zzf.zzb();
                        zzab0.zzL(("audio/true-hd".equals(zzaet0.zzf.zzm) ? h0.e * 16 : h0.e + 30));
                        v40 = v35;
                        if(zzaet0.zzb == 2 && v41 > 0L) {
                            int v42 = h0.b;
                            if(v42 > 1) {
                                zzab0.zzE(((float)v42) / (((float)v41) / 1000000.0f));
                            }
                        }
                        if(zzaet0.zzb != 1 || !zzzg1.zza()) {
                            zzzg2 = zzzg1;
                        }
                        else {
                            zzzg2 = zzzg1;
                            zzab0.zzC(zzzg2.zza);
                            zzab0.zzD(zzzg2.zzb);
                        }
                        int v43 = zzaet0.zzb;
                        zzbl[] arr_zzbl = {zzbl4, (this.f.isEmpty() ? null : new zzbl(this.f))};
                        zzbl8 = zzbl4;
                        zzbl zzbl9 = new zzbl(new zzbk[0]);
                        if(v43 != 1) {
                            if(v43 == 2 && zzbl6 != null) {
                                int v44 = 0;
                                while(v44 < zzbl6.zza()) {
                                    zzbk zzbk0 = zzbl6.zzb(v44);
                                    if(zzbk0 instanceof zzaco) {
                                        zzbl7 = zzbl5;
                                        if("com.android.capture.fps".equals(((zzaco)zzbk0).zza)) {
                                            zzbl9 = new zzbl(new zzbk[]{((zzaco)zzbk0)});
                                            goto label_355;
                                        }
                                    }
                                    else {
                                        zzbl7 = zzbl5;
                                    }
                                    ++v44;
                                    zzbl5 = zzbl7;
                                }
                            }
                        }
                        else if(zzbl5 != null) {
                            zzbl9 = zzbl5;
                            zzbl7 = zzbl9;
                            goto label_355;
                        }
                        zzbl7 = zzbl5;
                    label_355:
                        for(int v45 = 0; v45 < 2; ++v45) {
                            zzbl9 = zzbl9.zzd(arr_zzbl[v45]);
                        }
                        if(zzbl9.zza() > 0) {
                            zzab0.zzM(zzbl9);
                        }
                        zzad zzad0 = zzab0.zzY();
                        e0.c.zzk(zzad0);
                        if(zzaet0.zzb == 2 && v37 == -1) {
                            v37 = arrayList4.size();
                        }
                        arrayList7 = arrayList4;
                        arrayList7.add(e0);
                    }
                    ++v38;
                    arrayList4 = arrayList7;
                    zzzg1 = zzzg2;
                    zzbl4 = zzbl8;
                    arrayList5 = arrayList6;
                    v35 = v40;
                    zzbl5 = zzbl7;
                }
                this.s = v37;
                this.t = v36;
                E[] arr_e = (E[])arrayList4.toArray(new E[0]);
                this.q = arr_e;
                long[][] arr2_v = new long[arr_e.length][];
                int[] arr_v = new int[arr_e.length];
                long[] arr_v1 = new long[arr_e.length];
                boolean[] arr_z = new boolean[arr_e.length];
                for(int v46 = 0; v46 < arr_e.length; ++v46) {
                    arr2_v[v46] = new long[arr_e[v46].b.b];
                    arr_v1[v46] = arr_e[v46].b.f[0];
                }
                int v47 = 0;
                while(v47 < arr_e.length) {
                    long v48 = 0x7FFFFFFFFFFFFFFFL;
                    int v49 = -1;
                    for(int v50 = 0; v50 < arr_e.length; ++v50) {
                        if(!arr_z[v50]) {
                            long v51 = arr_v1[v50];
                            if(v51 <= v48) {
                                v49 = v50;
                                v48 = v51;
                            }
                        }
                    }
                    int v52 = arr_v[v49];
                    long[] arr_v2 = arr2_v[v49];
                    arr_v2[v52] = v39;
                    H h1 = arr_e[v49].b;
                    v39 += (long)h1.d[v52];
                    int v53 = v52 + 1;
                    arr_v[v49] = v53;
                    if(v53 < arr_v2.length) {
                        arr_v1[v49] = h1.f[v53];
                    }
                    else {
                        arr_z[v49] = true;
                        ++v47;
                    }
                }
                this.r = arr2_v;
                this.p.zzB();
                this.p.zzL(this);
                arrayDeque2.clear();
                this.g = 2;
            }
            else if(!arrayDeque0.isEmpty()) {
                ((s)arrayDeque0.peek()).d.add(s0);
            }
        }
        if(this.g != 2) {
            this.a();
        }
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        zzzy zzzy1;
        int v15;
        boolean z;
        int v38;
        long v37;
        long v36;
        while(true) {
            ArrayDeque arrayDeque0 = this.e;
            zzdy zzdy0 = this.c;
            switch(this.g) {
                case 0: {
                    zzdy zzdy2 = this.d;
                    if(this.j == 0) {
                        if(!zzys0.zzn(zzdy2.zzH(), 0, 8, true)) {
                            return -1;
                        }
                        this.j = 8;
                        zzdy2.zzF(0);
                        this.i = zzdy2.zzs();
                        this.h = zzdy2.zze();
                    }
                    long v28 = this.i;
                    if(v28 == 1L) {
                        zzys0.zzi(zzdy2.zzH(), 8, 8);
                        this.j += 8;
                        this.i = zzdy2.zzt();
                    }
                    else if(v28 == 0L) {
                        long v29 = zzys0.zzd();
                        if(v29 == -1L) {
                            s s0 = (s)arrayDeque0.peek();
                            v29 = s0 == null ? -1L : s0.b;
                        }
                        if(v29 != -1L) {
                            this.i = v29 - zzys0.zzf() + ((long)this.j);
                        }
                    }
                    int v30 = this.j;
                    if(this.i < ((long)v30)) {
                        throw zzbp.zzc("Atom size less than header length (unsupported).");
                    }
                    switch(this.h) {
                        case 1701082227: 
                        case 0x6D646961: 
                        case 0x6D657461: 
                        case 1835626086: 
                        case 0x6D6F6F76: 
                        case 1937007212: 
                        case 1953653099: {
                            long v34 = zzys0.zzf() + this.i - ((long)this.j);
                            if(this.i != ((long)this.j) && this.h == 0x6D657461) {
                                zzdy0.zzC(8);
                                zzys0.zzh(zzdy0.zzH(), 0, 8);
                                int v35 = zzdy0.zzc();
                                zzdy0.zzG(4);
                                if(zzdy0.zze() != 0x68646C72) {
                                    v35 += 4;
                                }
                                zzdy0.zzF(v35);
                                zzys0.zzk(zzdy0.zzc());
                                zzys0.zzj();
                            }
                            arrayDeque0.push(new s(this.h, v34));
                            if(this.i == ((long)this.j)) {
                                this.b(v34);
                            }
                            else {
                                this.a();
                            }
                            break;
                        }
                        case 0x636F3634: 
                        case 0x63747473: 
                        case 1701606260: 
                        case 0x66747970: 
                        case 0x68646C72: 
                        case 0x696C7374: 
                        case 1801812339: 
                        case 0x6D646864: 
                        case 0x6D766864: 
                        case 1937007471: 
                        case 1937011555: 
                        case 1937011556: 
                        case 1937011571: 
                        case 1937011578: 
                        case 1937011827: 
                        case 1937013298: 
                        case 0x746B6864: 
                        case 0x75647461: {
                            zzcw.zzf(v30 == 8);
                            zzcw.zzf(this.i <= 0x7FFFFFFFL);
                            zzdy zzdy3 = new zzdy(((int)this.i));
                            System.arraycopy(zzdy2.zzH(), 0, zzdy3.zzH(), 0, 8);
                            this.k = zzdy3;
                            this.g = 1;
                            break;
                        }
                        default: {
                            long v31 = zzys0.zzf();
                            long v32 = (long)this.j;
                            long v33 = v31 - v32;
                            if(this.h == 0x6D707664) {
                                new zzacr(0L, v33, 0x8000000000000001L, v33 + v32, this.i - v32);
                            }
                            this.k = null;
                            this.g = 1;
                        }
                    }
                    continue;
                }
                case 1: {
                    v36 = this.i - ((long)this.j);
                    v37 = zzys0.zzf();
                    zzdy zzdy4 = this.k;
                    if(zzdy4 != null) {
                        zzys0.zzi(zzdy4.zzH(), this.j, ((int)v36));
                        if(this.h == 0x66747970) {
                            zzdy4.zzF(8);
                        alab1:
                            switch(zzdy4.zze()) {
                                case 0x68656963: {
                                    break;
                                }
                                case 0x71742020: {
                                    v38 = 1;
                                    break;
                                }
                                default: {
                                    zzdy4.zzG(4);
                                    while(zzdy4.zza() > 0) {
                                        switch(zzdy4.zze()) {
                                            case 0x68656963: {
                                                break alab1;
                                            }
                                            case 0x71742020: {
                                                v38 = 1;
                                                break alab1;
                                            }
                                            default: {
                                                v38 = 0;
                                            }
                                        }
                                    }
                                    v38 = 0;
                                }
                            }
                            this.u = v38;
                        }
                        else if(!arrayDeque0.isEmpty()) {
                            s s1 = (s)arrayDeque0.peek();
                            t t0 = new t(this.h, zzdy4);
                            s1.c.add(t0);
                        }
                        z = false;
                    }
                    else if(v36 < 0x40000L) {
                        zzys0.zzk(((int)v36));
                        z = false;
                    }
                    else {
                        zzzr0.zza = zzys0.zzf() + v36;
                        z = true;
                    }
                    break;
                }
                default: {
                    long v = zzys0.zzf();
                    int v1 = this.l;
                    if(v1 == -1) {
                        long v2 = 0x7FFFFFFFFFFFFFFFL;
                        long v3 = 0x7FFFFFFFFFFFFFFFL;
                        long v4 = 0x7FFFFFFFFFFFFFFFL;
                        int v5 = 0;
                        int v6 = -1;
                        int v7 = 1;
                        int v8 = 1;
                        int v9 = -1;
                        while(true) {
                            E[] arr_e = this.q;
                            if(v5 >= arr_e.length) {
                                break;
                            }
                            E e0 = arr_e[v5];
                            int v10 = e0.e;
                            H h0 = e0.b;
                            if(v10 != h0.b) {
                                long v11 = h0.c[v10];
                                long v12 = this.r[v5][v10];
                                long v13 = v11 - v;
                                int v14 = v13 >= 0L && v13 < 0x40000L ? 0 : 1;
                                if(v14 == 0) {
                                    if(v8 == 0) {
                                        v15 = 0;
                                        goto label_29;
                                    }
                                    else {
                                        goto label_30;
                                    }
                                    goto label_28;
                                }
                                else {
                                label_28:
                                    v15 = v8;
                                }
                            label_29:
                                if(v14 != v15 || v13 >= v3) {
                                    v8 = v15;
                                }
                                else {
                                label_30:
                                    v8 = v14;
                                    v6 = v5;
                                    v3 = v13;
                                    v4 = v12;
                                }
                                if(v12 < v2) {
                                    v7 = v14;
                                    v9 = v5;
                                    v2 = v12;
                                }
                            }
                            ++v5;
                        }
                        v1 = v2 == 0x7FFFFFFFFFFFFFFFL || v7 == 0 || v4 < v2 + 0xA00000L ? v6 : v9;
                        this.l = v1;
                        if(v1 == -1) {
                            return -1;
                        }
                    }
                    E e1 = this.q[v1];
                    int v16 = e1.e;
                    H h1 = e1.b;
                    zzzy zzzy0 = e1.c;
                    long v17 = h1.c[v16];
                    int v18 = h1.d[v16];
                    long v19 = v17 - v + ((long)this.m);
                    if(v19 >= 0L && v19 < 0x40000L) {
                        zzaet zzaet0 = e1.a;
                        if(zzaet0.zzg == 1) {
                            v19 += 8L;
                            v18 += -8;
                        }
                        zzys0.zzk(((int)v19));
                        int v20 = zzaet0.zzj;
                        zzzz zzzz0 = e1.d;
                        if(v20 == 0) {
                            zzzy1 = zzzy0;
                            if("audio/ac4".equals(zzaet0.zzf.zzm)) {
                                if(this.n == 0) {
                                    zzxz.zzb(v18, zzdy0);
                                    zzzw.zzb(zzzy1, zzdy0, 7);
                                    this.n += 7;
                                }
                                v18 += 7;
                            }
                            else if(zzzz0 != null) {
                                zzzz0.zzd(zzys0);
                            }
                            int v24;
                            while((v24 = this.n) < v18) {
                                int v25 = zzzw.zza(zzzy1, zzys0, v18 - v24, false);
                                this.m += v25;
                                this.n += v25;
                                this.o -= v25;
                            }
                        }
                        else {
                            zzdy zzdy1 = this.b;
                            byte[] arr_b = zzdy1.zzH();
                            arr_b[0] = 0;
                            arr_b[1] = 0;
                            arr_b[2] = 0;
                            while(this.n < v18) {
                                int v21 = this.o;
                                if(v21 == 0) {
                                    zzys0.zzi(arr_b, 4 - v20, v20);
                                    this.m += v20;
                                    zzdy1.zzF(0);
                                    int v22 = zzdy1.zze();
                                    if(v22 < 0) {
                                        throw zzbp.zza("Invalid NAL length", null);
                                    }
                                    this.o = v22;
                                    this.a.zzF(0);
                                    zzzw.zzb(zzzy0, this.a, 4);
                                    this.n += 4;
                                    v18 += 4 - v20;
                                }
                                else {
                                    int v23 = zzzw.zza(zzzy0, zzys0, v21, false);
                                    this.m += v23;
                                    this.n += v23;
                                    this.o -= v23;
                                }
                            }
                            zzzy1 = zzzy0;
                        }
                        long v26 = h1.f[v16];
                        int v27 = h1.g[v16];
                        if(zzzz0 == null) {
                            zzzy1.zzs(v26, v27, v18, 0, null);
                        }
                        else {
                            zzzz0.zzc(zzzy1, v26, v27, v18, 0, null);
                            if(v16 + 1 == h1.b) {
                                zzzz0.zza(zzzy1, null);
                            }
                        }
                        ++e1.e;
                        this.l = -1;
                        this.m = 0;
                        this.n = 0;
                        this.o = 0;
                        return 0;
                    }
                    zzzr0.zza = v17;
                    return 1;
                }
            }
            this.b(v37 + v36);
            if(z && this.g != 2) {
                break;
            }
        }
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.p = zzyu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        this.e.clear();
        this.j = 0;
        this.l = -1;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        if(v == 0L) {
            this.a();
            return;
        }
        E[] arr_e = this.q;
        int v2 = 0;
        while(v2 < arr_e.length) {
            E e0 = arr_e[v2];
            H h0 = e0.b;
            int v3 = zzeg.zzd(h0.f, v1, true, false);
            while(true) {
                if(v3 >= 0) {
                    if((h0.g[v3] & 1) == 0) {
                        --v3;
                        continue;
                    }
                    else {
                        break;
                    }
                }
                v3 = -1;
                break;
            }
            if(v3 == -1) {
                v3 = h0.a(v1);
            }
            e0.e = v3;
            zzzz zzzz0 = e0.d;
            if(zzzz0 != null) {
                zzzz0.zzb();
            }
            ++v2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        return h.G(zzys0, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.t;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        long v14;
        long v12;
        int v11;
        long v7;
        long v6;
        long v4;
        long v3;
        E[] arr_e = this.q;
        if(arr_e.length == 0) {
            return new zzzs(zzzv.zza, zzzv.zza);
        }
        int v1 = this.s;
        if(v1 == -1) {
            v4 = 0x7FFFFFFFFFFFFFFFL;
            v3 = v;
            v6 = 0x8000000000000001L;
            v7 = -1L;
        }
        else {
            H h0 = arr_e[v1].b;
            long[] arr_v = h0.f;
            int v2;
            for(v2 = zzeg.zzd(arr_v, v, true, false); true; --v2) {
                if(v2 < 0) {
                    v2 = -1;
                    break;
                }
                if((h0.g[v2] & 1) != 0) {
                    break;
                }
            }
            if(v2 == -1) {
                v2 = h0.a(v);
            }
            if(v2 == -1) {
                return new zzzs(zzzv.zza, zzzv.zza);
            }
            v3 = arr_v[v2];
            long[] arr_v1 = h0.c;
            v4 = arr_v1[v2];
            if(v3 >= v || v2 >= h0.b - 1) {
                v6 = 0x8000000000000001L;
                v7 = -1L;
            }
            else {
                int v5 = h0.a(v);
                if(v5 == -1 || v5 == v2) {
                    v6 = 0x8000000000000001L;
                    v7 = -1L;
                }
                else {
                    v6 = arr_v[v5];
                    v7 = arr_v1[v5];
                }
            }
        }
        long v8 = v4;
        int v9 = 0;
        while(true) {
            E[] arr_e1 = this.q;
            if(v9 >= arr_e1.length) {
                break;
            }
            if(v9 == this.s) {
                v14 = v7;
            }
            else {
                H h1 = arr_e1[v9].b;
                long[] arr_v2 = h1.f;
                int v10 = zzeg.zzd(arr_v2, v3, true, false);
                while(true) {
                    v11 = -1;
                    int[] arr_v3 = h1.g;
                    if(v10 >= 0) {
                        if((arr_v3[v10] & 1) == 0) {
                            --v10;
                            continue;
                        }
                        else {
                            v11 = v10;
                        }
                    }
                    break;
                }
                if(v11 == -1) {
                    v11 = h1.a(v3);
                }
                long[] arr_v4 = h1.c;
                if(v11 == -1) {
                    v12 = v7;
                }
                else {
                    v12 = v7;
                    v8 = Math.min(arr_v4[v11], v8);
                }
                if(v6 != 0x8000000000000001L) {
                    int v13 = zzeg.zzd(arr_v2, v6, true, false);
                    while(true) {
                        if(v13 >= 0) {
                            if((arr_v3[v13] & 1) == 0) {
                                --v13;
                                continue;
                            }
                            else {
                                break;
                            }
                        }
                        v13 = -1;
                        break;
                    }
                    if(v13 == -1) {
                        v13 = h1.a(v6);
                    }
                    if(v13 != -1) {
                        v12 = Math.min(arr_v4[v13], v12);
                    }
                }
                v14 = v12;
            }
            ++v9;
            v7 = v14;
        }
        zzzv zzzv0 = new zzzv(v3, v8);
        return v6 == 0x8000000000000001L ? new zzzs(zzzv0, zzzv0) : new zzzs(zzzv0, new zzzv(v6, v7));
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}

