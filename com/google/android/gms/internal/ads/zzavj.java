package com.google.android.gms.internal.ads;

import A.f;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public final class zzavj implements zzatw, zzaud {
    public final zzazh a;
    public final zzazh b;
    public final zzazh c;
    public final Stack d;
    public int e;
    public int f;
    public long g;
    public int h;
    public zzazh i;
    public int j;
    public int k;
    public zzatx l;
    public e1[] m;
    public long n;
    public boolean o;
    public static final int p;
    public static final zzaty zza;

    static {
        zzavj.zza = new S(4);
        zzavj.p = zzazo.zzg("qt  ");
    }

    public zzavj() {
        this.c = new zzazh(16);
        this.d = new Stack();
        this.a = new zzazh(zzazf.zza);
        this.b = new zzazh(4);
    }

    // This method was un-flattened
    public final void a(long v) {
        zzavj zzavj1;
        ArrayList arrayList4;
        zzawe zzawe2;
        zzaua zzaua5;
        int v97;
        int[] arr_v26;
        int[] arr_v25;
        int[] arr_v24;
        long[] arr_v23;
        int[] arr_v22;
        boolean z2;
        int[] arr_v21;
        zzaua zzaua4;
        int[] arr_v13;
        int[] arr_v12;
        zzavl zzavl3;
        int v79;
        h1 h11;
        zzaua zzaua3;
        int v67;
        int v66;
        int v65;
        long[] arr_v6;
        long v53;
        int v52;
        zzaua zzaua2;
        zzavl zzavl2;
        int[] arr_v5;
        long[] arr_v4;
        int[] arr_v3;
        int v32;
        int v31;
        int v30;
        zzazh zzazh4;
        boolean z;
        zzavl zzavl1;
        long v25;
        long v24;
        zzaua zzaua1;
        ArrayList arrayList3;
        zzawe zzawe1;
        int v23;
        h1 h10;
        Stack stack1;
        W0 w03;
        y y0;
        zzawk zzawk1;
        String s1;
        zzawm zzawm0;
        String s;
        zzavj zzavj0 = this;
        while(true) {
            Stack stack0 = zzavj0.d;
            if(stack0.isEmpty() || ((W0)stack0.peek()).P0 != v) {
                break;
            }
            W0 w00 = (W0)stack0.pop();
            if(w00.a == Y0.C) {
                zzawe zzawe0 = null;
                ArrayList arrayList0 = new ArrayList();
                zzaua zzaua0 = new zzaua();
                X0 x00 = w00.d(Y0.A0);
                if(x00 != null) {
                    if(!zzavj0.o) {
                        zzazh zzazh0 = x00.P0;
                        zzazh0.zzv(8);
                        while(zzazh0.zza() >= 8) {
                            int v1 = zzazh0.zzc();
                            int v2 = zzazh0.zze();
                            if(zzazh0.zze() == Y0.B0) {
                                zzazh0.zzv(v1);
                                int v3 = v1 + v2;
                                zzazh0.zzw(12);
                                while(zzazh0.zzc() < v3) {
                                    int v4 = zzazh0.zzc();
                                    int v5 = zzazh0.zze();
                                    if(zzazh0.zze() == Y0.C0) {
                                        zzazh0.zzv(v4);
                                        int v6 = v4 + v5;
                                        zzazh0.zzw(8);
                                        ArrayList arrayList1 = new ArrayList();
                                        while(zzazh0.zzc() < v6) {
                                            int v7 = zzazh0.zze() + zzazh0.zzc();
                                            int v8 = zzazh0.zze();
                                            try {
                                                if((v8 >> 24 & 0xFF) == 0xA9) {
                                                }
                                                else if(v8 == d1.m) {
                                                    int v9 = d1.a(zzazh0);
                                                    if(v9 > 0) {
                                                        String[] arr_s = d1.D;
                                                        if(v9 <= 0x94) {
                                                            s = arr_s[v9 - 1];
                                                        }
                                                    }
                                                    else {
                                                        s = null;
                                                    }
                                                    if(s == null) {
                                                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                        zzawm0 = null;
                                                    }
                                                    else {
                                                        zzawm0 = new zzawm("TCON", null, s);
                                                    }
                                                    goto label_45;
                                                }
                                                else {
                                                    goto label_48;
                                                }
                                                goto label_142;
                                            }
                                            catch(Throwable throwable0) {
                                                zzazh0.zzv(v7);
                                                throw throwable0;
                                            }
                                        label_45:
                                            zzazh0.zzv(v7);
                                            zzawk zzawk0 = zzawm0;
                                            goto label_187;
                                            try {
                                            label_48:
                                                if(v8 != d1.o) {
                                                    if(v8 != d1.p) {
                                                        if(v8 != d1.q) {
                                                            if(v8 == d1.r) {
                                                            }
                                                            else if(v8 == d1.l) {
                                                                int v10 = zzazh0.zze();
                                                                if(zzazh0.zze() == Y0.F0) {
                                                                    int v11 = zzazh0.zze() & 0xFFFFFF;
                                                                    switch(v11) {
                                                                        case 13: {
                                                                            s1 = "image/jpeg";
                                                                            goto label_62;
                                                                        }
                                                                        case 14: {
                                                                            s1 = "image/png";
                                                                        label_62:
                                                                            zzazh0.zzw(4);
                                                                            byte[] arr_b = new byte[v10 - 16];
                                                                            zzazh0.zzq(arr_b, 0, v10 - 16);
                                                                            zzawk0 = new zzawg(s1, null, 3, arr_b);
                                                                            goto label_186;
                                                                        }
                                                                        default: {
                                                                            Log.w("MetadataUtil", "Unrecognized cover art flags: " + v11);
                                                                            zzawk0 = null;
                                                                            goto label_186;
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                                                                    zzawk0 = null;
                                                                    goto label_186;
                                                                }
                                                                goto label_70;
                                                            }
                                                            else {
                                                            label_70:
                                                                if(v8 != d1.s) {
                                                                    if(v8 != d1.t) {
                                                                        if(v8 != d1.u) {
                                                                            if(v8 != d1.v) {
                                                                                if(v8 != d1.w) {
                                                                                    if(v8 != d1.x) {
                                                                                        if(v8 == d1.y) {
                                                                                        }
                                                                                        else if(v8 != d1.z) {
                                                                                            if(v8 != d1.A) {
                                                                                                if(v8 == d1.B) {
                                                                                                }
                                                                                                else if(v8 == d1.C) {
                                                                                                    String s2 = null;
                                                                                                    String s3 = null;
                                                                                                    int v12 = -1;
                                                                                                    int v13 = -1;
                                                                                                    while(zzazh0.zzc() < v7) {
                                                                                                        int v14 = zzazh0.zzc();
                                                                                                        int v15 = zzazh0.zze();
                                                                                                        int v16 = zzazh0.zze();
                                                                                                        zzazh0.zzw(4);
                                                                                                        if(v16 == Y0.D0) {
                                                                                                            s3 = zzazh0.zzo(v15 - 12);
                                                                                                        }
                                                                                                        else if(v16 == Y0.E0) {
                                                                                                            s2 = zzazh0.zzo(v15 - 12);
                                                                                                        }
                                                                                                        else {
                                                                                                            int v17 = Y0.F0;
                                                                                                            if(v16 == v17) {
                                                                                                                v13 = v15;
                                                                                                            }
                                                                                                            if(v16 == v17) {
                                                                                                                v12 = v14;
                                                                                                            }
                                                                                                            zzazh0.zzw(v15 - 12);
                                                                                                        }
                                                                                                    }
                                                                                                    if("com.apple.iTunes".equals(s3) && "iTunSMPB".equals(s2) && v12 != -1) {
                                                                                                        zzazh0.zzv(v12);
                                                                                                        zzazh0.zzw(16);
                                                                                                        zzawk0 = new zzawi("und", s2, zzazh0.zzo(v13 - 16));
                                                                                                        goto label_186;
                                                                                                    }
                                                                                                    zzawk0 = null;
                                                                                                    goto label_186;
                                                                                                }
                                                                                                else {
                                                                                                    Log.d("MetadataUtil", "Skipped unknown metadata entry: " + Y0.b(v8));
                                                                                                    goto label_164;
                                                                                                }
                                                                                                zzawk0 = d1.d(v8, "TVSHOW", zzazh0);
                                                                                                goto label_186;
                                                                                            }
                                                                                            zzawk0 = d1.d(v8, "TVSHOWSORT", zzazh0);
                                                                                            goto label_186;
                                                                                        }
                                                                                        else {
                                                                                            zzawk1 = d1.b(v8, "ITUNESGAPLESS", zzazh0, false, true);
                                                                                            goto label_117;
                                                                                        }
                                                                                        zzawk0 = d1.b(v8, "ITUNESADVISORY", zzazh0, false, false);
                                                                                        goto label_186;
                                                                                    }
                                                                                    zzawk0 = d1.d(v8, "TSOC", zzazh0);
                                                                                    goto label_186;
                                                                                }
                                                                                zzawk0 = d1.d(v8, "TSOP", zzazh0);
                                                                                goto label_186;
                                                                            }
                                                                            zzawk0 = d1.d(v8, "TSOA", zzazh0);
                                                                            goto label_186;
                                                                        }
                                                                        zzawk0 = d1.d(v8, "TSO2", zzazh0);
                                                                        goto label_186;
                                                                    }
                                                                    zzawk0 = d1.d(v8, "TSOT", zzazh0);
                                                                    goto label_186;
                                                                }
                                                                zzawk0 = d1.d(v8, "TPE2", zzazh0);
                                                                goto label_186;
                                                            }
                                                            zzawk0 = d1.b(v8, "TCMP", zzazh0, true, true);
                                                            goto label_186;
                                                        }
                                                        zzawk0 = d1.b(v8, "TBPM", zzazh0, true, false);
                                                        goto label_186;
                                                    }
                                                    zzawk0 = d1.c(v8, "TRCK", zzazh0);
                                                    goto label_186;
                                                }
                                                zzawk0 = d1.c(v8, "TPOS", zzazh0);
                                                goto label_186;
                                            }
                                            catch(Throwable throwable0) {
                                                zzazh0.zzv(v7);
                                                throw throwable0;
                                            }
                                        label_117:
                                            zzazh0.zzv(v7);
                                            zzawk0 = zzawk1;
                                            goto label_187;
                                            try {
                                                zzawk0 = d1.b(v8, "ITUNESADVISORY", zzazh0, false, false);
                                                goto label_186;
                                            label_142:
                                                if((v8 & 0xFFFFFF) == d1.c) {
                                                    int v18 = zzazh0.zze();
                                                    if(zzazh0.zze() == Y0.F0) {
                                                        zzazh0.zzw(8);
                                                        String s4 = zzazh0.zzo(v18 - 16);
                                                        zzawk0 = new zzawi("und", s4, s4);
                                                    }
                                                    else {
                                                        Log.w("MetadataUtil", "Failed to parse comment attribute: " + Y0.b(v8));
                                                        zzawk0 = null;
                                                    }
                                                }
                                                else {
                                                    if((v8 & 0xFFFFFF) != d1.a && (v8 & 0xFFFFFF) != d1.b) {
                                                        if((v8 & 0xFFFFFF) != d1.h && (v8 & 0xFFFFFF) != d1.i) {
                                                            if((v8 & 0xFFFFFF) != d1.d) {
                                                                if((v8 & 0xFFFFFF) != d1.e) {
                                                                    if((v8 & 0xFFFFFF) != d1.f) {
                                                                        if((v8 & 0xFFFFFF) != d1.g) {
                                                                            if((v8 & 0xFFFFFF) == d1.j) {
                                                                            }
                                                                            else if((v8 & 0xFFFFFF) != d1.k) {
                                                                                if((v8 & 0xFFFFFF) == d1.n) {
                                                                                    zzawk0 = d1.d(v8, "TIT1", zzazh0);
                                                                                    goto label_186;
                                                                                }
                                                                                else {
                                                                                    Log.d("MetadataUtil", "Skipped unknown metadata entry: " + Y0.b(v8));
                                                                                }
                                                                                goto label_164;
                                                                            }
                                                                            else {
                                                                                zzawk0 = d1.d(v8, "TCON", zzazh0);
                                                                                goto label_186;
                                                                            }
                                                                            zzawk0 = d1.d(v8, "USLT", zzazh0);
                                                                            goto label_186;
                                                                        }
                                                                        zzawk0 = d1.d(v8, "TALB", zzazh0);
                                                                        goto label_186;
                                                                    }
                                                                    zzawk0 = d1.d(v8, "TSSE", zzazh0);
                                                                    goto label_186;
                                                                }
                                                                zzawk0 = d1.d(v8, "TPE1", zzazh0);
                                                                goto label_186;
                                                            }
                                                            zzawk0 = d1.d(v8, "TDRC", zzazh0);
                                                            goto label_186;
                                                        }
                                                        zzawk0 = d1.d(v8, "TCOM", zzazh0);
                                                        goto label_186;
                                                    }
                                                    zzawk0 = d1.d(v8, "TIT2", zzazh0);
                                                }
                                                goto label_186;
                                            }
                                            catch(Throwable throwable0) {
                                                zzazh0.zzv(v7);
                                                throw throwable0;
                                            }
                                        label_164:
                                            zzazh0.zzv(v7);
                                            zzawk0 = null;
                                            goto label_187;
                                            try {
                                                zzawk0 = d1.d(v8, "TCON", zzazh0);
                                            }
                                            catch(Throwable throwable0) {
                                                zzazh0.zzv(v7);
                                                throw throwable0;
                                            }
                                        label_186:
                                            zzazh0.zzv(v7);
                                        label_187:
                                            if(zzawk0 != null) {
                                                arrayList1.add(zzawk0);
                                            }
                                        }
                                        if(!arrayList1.isEmpty()) {
                                            zzawe0 = new zzawe(arrayList1);
                                        }
                                        break;
                                    }
                                    zzazh0.zzw(v5 - 8);
                                }
                                break;
                            }
                            zzazh0.zzw(v2 - 8);
                        }
                    }
                    if(zzawe0 != null) {
                        zzaua0.zzb(zzawe0);
                    }
                }
                long v19 = 0x8000000000000001L;
                long v20 = 0x7FFFFFFFFFFFFFFFL;
                int v21 = 0;
                while(true) {
                    ArrayList arrayList2 = w00.R0;
                    if(v21 >= arrayList2.size()) {
                        break;
                    }
                    W0 w01 = (W0)arrayList2.get(v21);
                    if(w01.a == Y0.E) {
                        zzavl zzavl0 = a1.a(w01, w00.d(Y0.D), 0x8000000000000001L, null, zzavj0.o);
                        if(zzavl0 == null) {
                            goto label_614;
                        }
                        else {
                            W0 w02 = w01.c(Y0.F).c(Y0.G).c(Y0.H);
                            X0 x01 = w02.d(Y0.q0);
                            if(x01 == null) {
                                X0 x02 = w02.d(Y0.r0);
                                if(x02 == null) {
                                    throw new zzarw("Track has no sample table size information");
                                }
                                y0 = new z(x02);
                            }
                            else {
                                y0 = new y(x01);
                            }
                            int v22 = y0.zza();
                            if(v22 == 0) {
                                w03 = w00;
                                stack1 = stack0;
                                h10 = new h1(new long[0], new int[0], 0, new long[0], new int[0]);
                                v23 = v21;
                                zzawe1 = zzawe0;
                                arrayList3 = arrayList0;
                                zzaua1 = zzaua0;
                                v24 = v19;
                                v25 = v20;
                                zzavl1 = zzavl0;
                            }
                            else {
                                stack1 = stack0;
                                w03 = w00;
                                X0 x03 = w02.d(Y0.s0);
                                if(x03 == null) {
                                    x03 = w02.d(Y0.t0);
                                    z = true;
                                }
                                else {
                                    z = false;
                                }
                                zzazh zzazh1 = x03.P0;
                                zzazh zzazh2 = w02.d(Y0.p0).P0;
                                v25 = v20;
                                zzazh zzazh3 = w02.d(Y0.m0).P0;
                                X0 x04 = w02.d(Y0.n0);
                                if(x04 == null) {
                                    arrayList3 = arrayList0;
                                    zzazh4 = null;
                                }
                                else {
                                    zzazh4 = x04.P0;
                                    arrayList3 = arrayList0;
                                }
                                X0 x05 = w02.d(Y0.o0);
                                zzazh zzazh5 = x05 == null ? null : x05.P0;
                                v v26 = new v(zzazh2, zzazh1, z);
                                zzazh3.zzv(12);
                                int v27 = zzazh3.zzi() - 1;
                                int v28 = zzazh3.zzi();
                                int v29 = zzazh3.zzi();
                                if(zzazh5 == null) {
                                    v30 = 0;
                                }
                                else {
                                    zzazh5.zzv(12);
                                    v30 = zzazh5.zzi();
                                }
                                if(zzazh4 == null) {
                                label_269:
                                    v31 = 0;
                                }
                                else {
                                    zzazh4.zzv(12);
                                    v31 = zzazh4.zzi();
                                    if(v31 > 0) {
                                        v32 = zzazh4.zzi() - 1;
                                        goto label_271;
                                    }
                                    else {
                                        zzazh4 = null;
                                        goto label_270;
                                    }
                                    goto label_269;
                                }
                            label_270:
                                v32 = -1;
                            label_271:
                                long v33 = 0L;
                                if(y0.zzc()) {
                                    v24 = v19;
                                    if(!"audio/raw".equals(zzavl0.zzf.zzf) || v27 != 0) {
                                    }
                                    else if(v30 != 0 || v31 != 0) {
                                        v23 = v21;
                                        zzawe1 = zzawe0;
                                        v27 = 0;
                                        goto label_342;
                                    }
                                    else {
                                        int v34 = v26.b;
                                        long[] arr_v = new long[v34];
                                        int[] arr_v1 = new int[v34];
                                        while(v26.a()) {
                                            int v35 = v26.c;
                                            arr_v[v35] = v26.e;
                                            arr_v1[v35] = v26.d;
                                        }
                                        int v36 = y0.zzb();
                                        long v37 = (long)v29;
                                        int v38 = 0x2000 / v36;
                                        int v40 = 0;
                                        for(int v39 = 0; v39 < v34; ++v39) {
                                            v40 += zzazo.zzd(arr_v1[v39], v38);
                                        }
                                        long[] arr_v2 = new long[v40];
                                        arr_v3 = new int[v40];
                                        zzawe1 = zzawe0;
                                        arr_v4 = new long[v40];
                                        arr_v5 = new int[v40];
                                        v23 = v21;
                                        int v41 = 0;
                                        int v42 = 0;
                                        for(int v43 = 0; v41 < v34; v43 = v48) {
                                            int v45 = arr_v1[v41];
                                            long v46 = arr_v[v41];
                                            int v47 = v42;
                                            int v48 = v43;
                                            int v49 = v45;
                                            for(int v44 = 0; v49 > 0; ++v44) {
                                                int v50 = Math.min(v38, v49);
                                                arr_v2[v44] = v46;
                                                int v51 = v36 * v50;
                                                arr_v3[v44] = v51;
                                                v47 = Math.max(v47, v51);
                                                arr_v4[v44] = ((long)v48) * v37;
                                                arr_v5[v44] = 1;
                                                v46 += (long)arr_v3[v44];
                                                v48 += v50;
                                                v49 -= v50;
                                            }
                                            ++v41;
                                            v42 = v47;
                                        }
                                        zzavl2 = zzavl0;
                                        zzaua2 = zzaua0;
                                        v52 = v42;
                                        v53 = 0L;
                                        arr_v6 = arr_v2;
                                        goto label_438;
                                    }
                                    v23 = v21;
                                    zzawe1 = zzawe0;
                                }
                                else {
                                    v23 = v21;
                                    zzawe1 = zzawe0;
                                    v24 = v19;
                                }
                            label_342:
                                long[] arr_v7 = new long[v22];
                                int[] arr_v8 = new int[v22];
                                arr_v4 = new long[v22];
                                int[] arr_v9 = new int[v22];
                                zzaua2 = zzaua0;
                                int v54 = v30;
                                int v55 = v31;
                                int v56 = v32;
                                long v57 = 0L;
                                v53 = 0L;
                                int v58 = 0;
                                int v59 = 0;
                                int v60 = 0;
                                int v61 = 0;
                                int v62 = v28;
                                int v63 = 0;
                                while(v59 < v22) {
                                    while(v60 == 0) {
                                        zzayz.zze(v26.a());
                                        v57 = v26.e;
                                        v60 = v26.d;
                                    }
                                    if(zzazh5 != null) {
                                        while(v63 == 0) {
                                            v63 = 0;
                                            if(v54 > 0) {
                                                v63 = zzazh5.zzi();
                                                v61 = zzazh5.zze();
                                                --v54;
                                            }
                                            else if(true) {
                                                break;
                                            }
                                        }
                                        --v63;
                                    }
                                    arr_v7[v59] = v57;
                                    int v64 = y0.zzb();
                                    arr_v8[v59] = v64;
                                    arr_v4[v59] = v53 + ((long)v61);
                                    arr_v9[v59] = zzazh4 == null ? 1 : 0;
                                    if(v59 == v56) {
                                        arr_v9[v59] = 1;
                                        --v55;
                                        if(v55 > 0) {
                                            v56 = zzazh4.zzi() - 1;
                                        }
                                    }
                                    v53 += (long)v29;
                                    if(v62 - 1 != 0) {
                                        --v62;
                                    }
                                    else if(v27 > 0) {
                                        v62 = zzazh3.zzi();
                                        --v27;
                                        v29 = zzazh3.zzi();
                                    }
                                    else {
                                        v62 = 0;
                                    }
                                    v57 += (long)arr_v8[v59];
                                    --v60;
                                    ++v59;
                                    v58 = v64 <= v58 ? v58 : v64;
                                }
                                zzayz.zzc(v63 == 0);
                                while(v54 > 0) {
                                    zzayz.zzc(zzazh5.zzi() == 0);
                                    zzazh5.zze();
                                    --v54;
                                }
                                if(v55 == 0) {
                                    if(v62 == 0) {
                                        if(v60 == 0) {
                                            if(v27 == 0) {
                                                zzavl2 = zzavl0;
                                                goto label_434;
                                            }
                                            else {
                                                zzavl2 = zzavl0;
                                                v65 = 0;
                                                v66 = 0;
                                                v67 = 0;
                                                goto label_430;
                                            }
                                            goto label_416;
                                        }
                                        else {
                                        label_416:
                                            v67 = v60;
                                            zzavl2 = zzavl0;
                                            v65 = 0;
                                            v66 = 0;
                                            goto label_430;
                                        }
                                        goto label_421;
                                    }
                                    else {
                                    label_421:
                                        v67 = v60;
                                        v66 = v62;
                                        zzavl2 = zzavl0;
                                        v65 = 0;
                                        goto label_430;
                                    }
                                    goto label_426;
                                }
                                else {
                                label_426:
                                    v67 = v60;
                                    v66 = v62;
                                    v65 = v55;
                                    zzavl2 = zzavl0;
                                }
                            label_430:
                                StringBuilder stringBuilder0 = f.n("Inconsistent stbl box for track ", zzavl2.zza, ": remainingSynchronizationSamples ", v65, ", remainingSamplesAtTimestampDelta ");
                                f.q(stringBuilder0, v66, ", remainingSamplesInChunk ", v67, ", remainingTimestampDeltaChanges ");
                                stringBuilder0.append(v27);
                                Log.w("AtomParsers", stringBuilder0.toString());
                            label_434:
                                v52 = v58;
                                arr_v5 = arr_v9;
                                arr_v6 = arr_v7;
                                arr_v3 = arr_v8;
                            label_438:
                                long[] arr_v10 = zzavl2.zzi;
                                if(arr_v10 != null && !zzaua2.zza()) {
                                    if(arr_v10.length != 1 || zzavl2.zzb != 1 || arr_v4.length < 2) {
                                        zzaua3 = zzaua2;
                                    }
                                    else {
                                        long v68 = zzavl2.zzj[0];
                                        long v69 = zzazo.zzj(arr_v10[0], zzavl2.zzc, zzavl2.zzd) + v68;
                                        long v70 = arr_v4[0];
                                        if(v70 <= v68 && v68 < arr_v4[1]) {
                                            if(arr_v4[arr_v4.length - 1] < v69 && v69 <= v53) {
                                                long v71 = zzazo.zzj(v68 - v70, zzavl2.zzf.zzs, zzavl2.zzc);
                                                long v72 = zzazo.zzj(v53 - v69, zzavl2.zzf.zzs, zzavl2.zzc);
                                                if(v71 != 0L) {
                                                label_456:
                                                    if(v71 <= 0x7FFFFFFFL && v72 <= 0x7FFFFFFFL) {
                                                        zzaua3 = zzaua2;
                                                        zzaua3.zzb = (int)v71;
                                                        zzaua3.zzc = (int)v72;
                                                        zzazo.zzn(arr_v4, 1000000L, zzavl2.zzc);
                                                        h11 = new h1(arr_v6, arr_v3, v52, arr_v4, arr_v5);
                                                        goto label_473;
                                                    }
                                                }
                                                else if(v72 != 0L) {
                                                    v71 = 0L;
                                                    goto label_456;
                                                }
                                            }
                                            zzaua3 = zzaua2;
                                        }
                                    }
                                    if(zzavl2.zzi.length != 1 || zzavl2.zzi[0] != 0L) {
                                        boolean z1 = zzavl2.zzb == 1;
                                        int v74 = 0;
                                        int v75 = 0;
                                        int v76 = 0;
                                        int v77 = 0;
                                        while(true) {
                                            long[] arr_v11 = zzavl2.zzi;
                                            if(v74 >= arr_v11.length) {
                                                break;
                                            }
                                            long v78 = zzavl2.zzj[v74];
                                            if(v78 == -1L) {
                                                v79 = v22;
                                                arr_v13 = arr_v3;
                                                zzavl3 = zzavl2;
                                                arr_v12 = arr_v5;
                                            }
                                            else {
                                                v79 = v22;
                                                zzavl3 = zzavl2;
                                                arr_v12 = arr_v5;
                                                arr_v13 = arr_v3;
                                                long v80 = zzazo.zzj(arr_v11[v74], zzavl3.zzc, zzavl3.zzd);
                                                int v81 = zzazo.zzb(arr_v4, v78, true, true);
                                                int v82 = zzazo.zzb(arr_v4, v78 + v80, z1, false);
                                                int v83 = v76 == v81 ? 0 : 1;
                                                v76 = v82;
                                                v77 |= v83;
                                                v75 = v82 - v81 + v75;
                                            }
                                            ++v74;
                                            zzavl2 = zzavl3;
                                            v22 = v79;
                                            arr_v3 = arr_v13;
                                            arr_v5 = arr_v12;
                                        }
                                        zzavl1 = zzavl2;
                                        int[] arr_v14 = arr_v5;
                                        int[] arr_v15 = arr_v3;
                                        int v84 = (v75 == v22 ? 0 : 1) | v77;
                                        long[] arr_v16 = v84 == 0 ? arr_v6 : new long[v75];
                                        int[] arr_v17 = v84 == 0 ? arr_v15 : new int[v75];
                                        if(1 == v84) {
                                            v52 = 0;
                                        }
                                        int[] arr_v18 = v84 == 0 ? arr_v14 : new int[v75];
                                        long[] arr_v19 = new long[v75];
                                        int v85 = v52;
                                        int v86 = 0;
                                        int v87 = 0;
                                        while(true) {
                                            long[] arr_v20 = zzavl1.zzi;
                                            if(v86 >= arr_v20.length) {
                                                break;
                                            }
                                            long v88 = zzavl1.zzj[v86];
                                            long v89 = arr_v20[v86];
                                            if(v88 == -1L) {
                                                zzaua4 = zzaua3;
                                                arr_v25 = arr_v18;
                                                arr_v21 = arr_v15;
                                                arr_v26 = arr_v14;
                                                arr_v23 = arr_v6;
                                                z2 = z1;
                                            }
                                            else {
                                                zzaua4 = zzaua3;
                                                long v90 = zzazo.zzj(v89, zzavl1.zzc, zzavl1.zzd);
                                                int v91 = zzazo.zzb(arr_v4, v88, true, true);
                                                int v92 = zzazo.zzb(arr_v4, v90 + v88, z1, false);
                                                if(v84 == 0) {
                                                    arr_v21 = arr_v15;
                                                    z2 = z1;
                                                    arr_v22 = arr_v14;
                                                    arr_v23 = arr_v6;
                                                    arr_v24 = arr_v18;
                                                }
                                                else {
                                                    int v93 = v92 - v91;
                                                    System.arraycopy(arr_v6, v91, arr_v16, v87, v93);
                                                    arr_v21 = arr_v15;
                                                    System.arraycopy(arr_v21, v91, arr_v17, v87, v93);
                                                    z2 = z1;
                                                    arr_v22 = arr_v14;
                                                    arr_v23 = arr_v6;
                                                    arr_v24 = arr_v18;
                                                    System.arraycopy(arr_v22, v91, arr_v24, v87, v93);
                                                }
                                                int v94 = v85;
                                                while(v91 < v92) {
                                                    arr_v19[v87] = zzazo.zzj(v33, 1000000L, zzavl1.zzd) + zzazo.zzj(arr_v4[v91] - v88, 1000000L, zzavl1.zzc);
                                                    if(v84 != 0 && arr_v17[v87] > v94) {
                                                        v94 = arr_v21[v91];
                                                    }
                                                    ++v87;
                                                    ++v91;
                                                }
                                                arr_v25 = arr_v24;
                                                arr_v26 = arr_v22;
                                                v85 = v94;
                                            }
                                            v33 += v89;
                                            ++v86;
                                            z1 = z2;
                                            arr_v6 = arr_v23;
                                            arr_v14 = arr_v26;
                                            arr_v18 = arr_v25;
                                            zzaua3 = zzaua4;
                                            arr_v15 = arr_v21;
                                        }
                                        zzaua1 = zzaua3;
                                        int v95 = 0;
                                        int v96 = 0;
                                        while(v95 < arr_v18.length) {
                                            if(v96 != 0) {
                                                goto label_582;
                                            }
                                            v96 = arr_v18[v95] & 1;
                                            ++v95;
                                        }
                                        if(v96 == 0) {
                                            throw new zzarw("The edited sample sequence does not contain a sync sample.");
                                        }
                                    label_582:
                                        h10 = new h1(arr_v16, arr_v17, v85, arr_v19, arr_v18);
                                    }
                                    else {
                                        for(int v73 = 0; v73 < arr_v4.length; ++v73) {
                                            arr_v4[v73] = zzazo.zzj(arr_v4[v73] - zzavl2.zzj[0], 1000000L, zzavl2.zzc);
                                        }
                                        h11 = new h1(arr_v6, arr_v3, v52, arr_v4, arr_v5);
                                    label_473:
                                        h10 = h11;
                                        zzavl1 = zzavl2;
                                        zzaua1 = zzaua3;
                                    }
                                }
                                else {
                                    zzavl1 = zzavl2;
                                    zzaua1 = zzaua2;
                                    zzazo.zzn(arr_v4, 1000000L, zzavl1.zzc);
                                    h10 = new h1(arr_v6, arr_v3, v52, arr_v4, arr_v5);
                                }
                            }
                            if(h10.a != 0) {
                                v97 = v23;
                                zzauf zzauf0 = this.l.zzbi(v97, zzavl1.zzb);
                                e1 e10 = new e1(zzavl1, h10, zzauf0);
                                zzart zzart0 = zzavl1.zzf.zze(h10.b + 30);
                                if(zzavl1.zzb == 1) {
                                    if(zzaua1.zza()) {
                                        zzaua5 = zzaua1;
                                        zzart0 = zzart0.zzd(zzaua5.zzb, zzaua5.zzc);
                                    }
                                    else {
                                        zzaua5 = zzaua1;
                                    }
                                    zzawe2 = zzawe1;
                                    if(zzawe1 != null) {
                                        zzart0 = zzart0.zzf(zzawe2);
                                    }
                                }
                                else {
                                    zzawe2 = zzawe1;
                                    zzaua5 = zzaua1;
                                }
                                zzauf0.zza(zzart0);
                                long v98 = Math.max(v24, zzavl1.zze);
                                arrayList4 = arrayList3;
                                arrayList4.add(e10);
                                long v99 = ((long[])h10.c)[0];
                                if(v99 < v25) {
                                    v20 = v99;
                                    v19 = v98;
                                }
                                else {
                                    v19 = v98;
                                    v20 = v25;
                                }
                                goto label_628;
                            }
                        }
                    }
                    else {
                    label_614:
                        v23 = v21;
                        stack1 = stack0;
                        w03 = w00;
                        zzawe1 = zzawe0;
                        arrayList3 = arrayList0;
                        zzaua1 = zzaua0;
                        v24 = v19;
                        v25 = v20;
                    }
                    arrayList4 = arrayList3;
                    v20 = v25;
                    v19 = v24;
                    zzawe2 = zzawe1;
                    v97 = v23;
                    zzaua5 = zzaua1;
                label_628:
                    w00 = w03;
                    stack0 = stack1;
                    v21 = v97 + 1;
                    zzavj0 = this;
                    zzaua0 = zzaua5;
                    zzawe0 = zzawe2;
                    arrayList0 = arrayList4;
                }
                zzavj1 = zzavj0;
                zzavj1.n = v19;
                zzavj1.m = (e1[])arrayList0.toArray(new e1[arrayList0.size()]);
                zzavj1.l.zzb();
                zzavj1.l.zzc(zzavj1);
                stack0.clear();
                zzavj1.e = 2;
            }
            else {
                zzavj1 = zzavj0;
                if(!stack0.isEmpty()) {
                    ((W0)stack0.peek()).R0.add(w00);
                }
            }
            zzavj0 = zzavj1;
        }
        if(zzavj0.e != 2) {
            zzavj0.e = 0;
            zzavj0.h = 0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaud
    public final long zza() {
        return this.n;
    }

    @Override  // com.google.android.gms.internal.ads.zzaud
    public final long zzb(long v) {
        int v4;
        e1[] arr_e1 = this.m;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        int v2 = 0;
        while(v2 < arr_e1.length) {
            h1 h10 = arr_e1[v2].b;
            long[] arr_v = (long[])h10.d;
            int v3 = zzazo.zzc(arr_v, v, true, false);
            while(true) {
                v4 = -1;
                int[] arr_v1 = (int[])h10.f;
                if(v3 >= 0) {
                    if((arr_v1[v3] & 1) == 0) {
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
                for(int v5 = zzazo.zzb(arr_v, v, true, false); v5 < arr_v.length; ++v5) {
                    if((arr_v1[v5] & 1) != 0) {
                        v4 = v5;
                        break;
                    }
                }
                v3 = v4;
            }
            long v6 = ((long[])h10.c)[v3];
            if(v6 < v1) {
                v1 = v6;
            }
            ++v2;
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzaud
    public final boolean zzc() {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final void zzd(zzatx zzatx0) {
        this.l = zzatx0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final void zze(long v, long v1) {
        int v4;
        this.d.clear();
        this.h = 0;
        this.j = 0;
        this.k = 0;
        if(v == 0L) {
            this.e = 0;
            this.h = 0;
            return;
        }
        e1[] arr_e1 = this.m;
        if(arr_e1 != null) {
            int v2 = 0;
            while(v2 < arr_e1.length) {
                e1 e10 = arr_e1[v2];
                h1 h10 = e10.b;
                long[] arr_v = (long[])h10.d;
                int v3 = zzazo.zzc(arr_v, v1, true, false);
                while(true) {
                    v4 = -1;
                    int[] arr_v1 = (int[])h10.f;
                    if(v3 >= 0) {
                        if((arr_v1[v3] & 1) == 0) {
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
                    for(int v5 = zzazo.zzb(arr_v, v1, true, false); v5 < arr_v.length; ++v5) {
                        if((arr_v1[v5] & 1) != 0) {
                            v4 = v5;
                            break;
                        }
                    }
                    v3 = v4;
                }
                e10.d = v3;
                ++v2;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final int zzf(zzatv zzatv0, zzaub zzaub0) throws IOException, InterruptedException {
        e1[] arr_e1;
        boolean z1;
        long v18;
        long v17;
        while(true) {
            Stack stack0 = this.d;
            boolean z = false;
            switch(this.e) {
                case 0: {
                    zzazh zzazh1 = this.c;
                    if(this.h == 0) {
                        if(!zzatv0.zzh(zzazh1.zza, 0, 8, true)) {
                            return -1;
                        }
                        this.h = 8;
                        zzazh1.zzv(0);
                        this.g = zzazh1.zzm();
                        this.f = zzazh1.zze();
                    }
                    if(this.g == 1L) {
                        zzatv0.zzh(zzazh1.zza, 8, 8, false);
                        this.h += 8;
                        this.g = zzazh1.zzn();
                    }
                    int v14 = this.f;
                    if(v14 == Y0.C || v14 == Y0.E || v14 == Y0.F || v14 == Y0.G || v14 == Y0.H || v14 == Y0.Q) {
                        long v15 = zzatv0.zzd() + this.g - ((long)this.h);
                        stack0.add(new W0(this.f, v15));
                        if(this.g == ((long)this.h)) {
                            this.a(v15);
                        }
                        else {
                            this.e = 0;
                            this.h = 0;
                        }
                    }
                    else {
                        if(v14 == Y0.S || v14 == Y0.D || v14 == Y0.T || v14 == Y0.U || v14 == Y0.m0 || v14 == Y0.n0 || v14 == Y0.o0 || v14 == Y0.R || v14 == Y0.p0 || v14 == Y0.q0 || v14 == Y0.r0 || v14 == Y0.s0 || v14 == Y0.t0 || v14 == Y0.P || v14 == Y0.b || v14 == Y0.A0) {
                            zzayz.zze(this.h == 8);
                            zzayz.zze(this.g <= 0x7FFFFFFFL);
                            zzazh zzazh2 = new zzazh(((int)this.g));
                            this.i = zzazh2;
                            System.arraycopy(zzazh1.zza, 0, zzazh2.zza, 0, 8);
                        }
                        else {
                            this.i = null;
                        }
                        this.e = 1;
                    }
                    continue;
                }
                case 1: {
                    int v16 = this.h;
                    v17 = this.g - ((long)v16);
                    v18 = zzatv0.zzd();
                    zzazh zzazh3 = this.i;
                    if(zzazh3 != null) {
                        zzatv0.zzh(zzazh3.zza, v16, ((int)v17), false);
                        if(this.f == Y0.b) {
                            zzazh zzazh4 = this.i;
                            zzazh4.zzv(8);
                            int v19 = zzazh4.zze();
                            int v20 = zzavj.p;
                            if(v19 != v20) {
                                z1 = false;
                                zzazh4.zzw(4);
                                while(true) {
                                    if(zzazh4.zza() <= 0) {
                                        goto label_117;
                                    }
                                    if(zzazh4.zze() == v20) {
                                        break;
                                    }
                                }
                            }
                            z1 = true;
                        label_117:
                            this.o = z1;
                        }
                        else if(!stack0.isEmpty()) {
                            W0 w00 = (W0)stack0.peek();
                            X0 x00 = new X0(this.i, this.f);
                            w00.Q0.add(x00);
                        }
                    }
                    else if(v17 < 0x40000L) {
                        zzatv0.zzi(((int)v17), false);
                    }
                    else {
                        zzaub0.zza = zzatv0.zzd() + v17;
                        z = true;
                    }
                    break;
                }
                default: {
                    long v = 0x7FFFFFFFFFFFFFFFL;
                    int v2 = -1;
                    for(int v1 = 0; true; ++v1) {
                        arr_e1 = this.m;
                        if(v1 >= arr_e1.length) {
                            break;
                        }
                        e1 e10 = arr_e1[v1];
                        int v3 = e10.d;
                        h1 h10 = e10.b;
                        if(v3 != h10.a) {
                            long v4 = ((long[])h10.c)[v3];
                            if(v4 < v) {
                                v2 = v1;
                                v = v4;
                            }
                        }
                    }
                    if(v2 == -1) {
                        return -1;
                    }
                    e1 e11 = arr_e1[v2];
                    zzauf zzauf0 = e11.c;
                    int v5 = e11.d;
                    h1 h11 = e11.b;
                    long v6 = ((long[])h11.c)[v5];
                    int v7 = ((int[])h11.e)[v5];
                    zzavl zzavl0 = e11.a;
                    if(zzavl0.zzg == 1) {
                        v6 += 8L;
                        v7 += -8;
                    }
                    long v8 = v6 - zzatv0.zzd() + ((long)this.j);
                    if(v8 >= 0L && v8 < 0x40000L) {
                        zzatv0.zzi(((int)v8), false);
                        int v9 = zzavl0.zzk;
                        if(v9 == 0) {
                            int v10;
                            while((v10 = this.j) < v7) {
                                int v11 = zzauf0.zzd(zzatv0, v7 - v10, false);
                                this.j += v11;
                                this.k -= v11;
                            }
                        }
                        else {
                            zzazh zzazh0 = this.b;
                            byte[] arr_b = zzazh0.zza;
                            arr_b[0] = 0;
                            arr_b[1] = 0;
                            arr_b[2] = 0;
                            while(this.j < v7) {
                                int v12 = this.k;
                                if(v12 == 0) {
                                    zzatv0.zzh(zzazh0.zza, 4 - v9, v9, false);
                                    zzazh0.zzv(0);
                                    this.k = zzazh0.zzi();
                                    this.a.zzv(0);
                                    zzauf0.zzb(this.a, 4);
                                    this.j += 4;
                                    v7 += 4 - v9;
                                }
                                else {
                                    int v13 = zzauf0.zzd(zzatv0, v12, false);
                                    this.j += v13;
                                    this.k -= v13;
                                }
                            }
                        }
                        zzauf0.zzc(((long[])h11.d)[v5], ((int[])h11.f)[v5], v7, 0, null);
                        ++e11.d;
                        this.j = 0;
                        this.k = 0;
                        return 0;
                    }
                    zzaub0.zza = v6;
                    return 1;
                }
            }
            this.a(v18 + v17);
            if(z && this.e != 2) {
                break;
            }
        }
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final boolean zzg(zzatv zzatv0) throws IOException, InterruptedException {
        return f1.a(zzatv0, false);
    }
}

