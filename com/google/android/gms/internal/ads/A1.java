package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class a1 {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;

    static {
        a1.a = zzazo.zzg("vide");
        a1.b = zzazo.zzg("soun");
        a1.c = zzazo.zzg("text");
        a1.d = zzazo.zzg("sbtl");
        a1.e = zzazo.zzg("subt");
        a1.f = zzazo.zzg("clcp");
        a1.g = zzazo.zzg("cenc");
        a1.h = zzazo.zzg("meta");
    }

    public static zzavl a(W0 w00, X0 x00, long v, zzats zzats0, boolean z) {
        Pair pair5;
        w w2;
        int v47;
        int v46;
        int v45;
        byte[] arr_b1;
        int v42;
        int v39;
        int v33;
        int v32;
        Pair pair1;
        zzazh zzazh3;
        String s1;
        int v27;
        int v65;
        w w4;
        String s7;
        int v64;
        int v63;
        int v62;
        int v68;
        int v67;
        String s9;
        String s8;
        String s5;
        int v56;
        int v52;
        int v51;
        int v50;
        String s4;
        String s10;
        List list1;
        boolean z1;
        int v25;
        int v13;
        long v8;
        int v2;
        W0 w01 = w00.c(Y0.F);
        X0 x01 = w01.d(Y0.T);
        x01.P0.zzv(16);
        int v1 = x01.P0.zze();
        if(v1 == a1.b) {
            v2 = 1;
        }
        else if(v1 == a1.a) {
            v2 = 2;
        }
        else if(v1 != a1.c && v1 != a1.d && v1 != a1.e && v1 != a1.f) {
            v2 = v1 == a1.h ? 4 : -1;
        }
        else {
            v2 = 3;
        }
        if(v2 == -1) {
            return null;
        }
        zzazh zzazh0 = w00.d(Y0.P).P0;
        zzazh0.zzv(8);
        int v3 = Y0.a(zzazh0.zze());
        zzazh0.zzw((v3 == 0 ? 8 : 16));
        int v4 = zzazh0.zze();
        zzazh0.zzw(4);
        int v5 = zzazh0.zzc();
        int v6 = v3 == 0 ? 4 : 8;
        int v7 = 0;
        while(v7 < v6) {
            if(zzazh0.zza[v5 + v7] != -1) {
                v8 = v3 == 0 ? zzazh0.zzm() : zzazh0.zzn();
                if(v8 != 0L) {
                    goto label_34;
                }
                goto label_33;
            }
            ++v7;
        }
        zzazh0.zzw(v6);
    label_33:
        v8 = 0x8000000000000001L;
    label_34:
        zzazh0.zzw(16);
        int v9 = zzazh0.zze();
        int v10 = zzazh0.zze();
        zzazh0.zzw(4);
        int v11 = zzazh0.zze();
        int v12 = zzazh0.zze();
        if(v9 != 0) {
        label_54:
            if(v9 != 0) {
                v13 = v9 != 0xFFFF0000 || v10 != 0 || v11 != 0 || v12 != 0xFFFF0000 ? 0 : 180;
            }
            else if(v10 != 0xFFFF0000) {
                v13 = 0;
            }
            else if(v11 != 0x10000) {
                v13 = 0;
            }
            else if(v12 == 0) {
                v13 = 270;
            }
            else {
                v13 = 0;
            }
        }
        else if(v10 != 0x10000) {
            v9 = 0;
            goto label_54;
        }
        else if(v11 != 0xFFFF0000) {
            v9 = 0;
            v10 = 0x10000;
            goto label_54;
        }
        else if(v12 == 0) {
            v13 = 90;
        }
        else {
            v9 = 0;
            v10 = 0x10000;
            v11 = 0xFFFF0000;
            goto label_54;
        }
        long v14 = v == 0x8000000000000001L ? v8 : v;
        x00.P0.zzv(8);
        int v15 = Y0.a(x00.P0.zze()) == 0 ? 8 : 16;
        x00.P0.zzw(v15);
        long v16 = x00.P0.zzm();
        long v17 = v14 == 0x8000000000000001L ? 0x8000000000000001L : zzazo.zzj(v14, 1000000L, v16);
        W0 w02 = w01.c(Y0.G).c(Y0.H);
        zzazh zzazh1 = w01.d(Y0.S).P0;
        zzazh1.zzv(8);
        int v18 = Y0.a(zzazh1.zze());
        zzazh1.zzw((v18 == 0 ? 8 : 16));
        long v19 = zzazh1.zzm();
        zzazh1.zzw((v18 == 0 ? 4 : 8));
        int v20 = zzazh1.zzj();
        Pair pair0 = Pair.create(v19, ((char)((v20 >> 10 & 0x1F) + 0x60)) + ((char)((v20 >> 5 & 0x1F) + 0x60)) + ((char)((v20 & 0x1F) + 0x60)));
        zzazh zzazh2 = w02.d(Y0.U).P0;
        String s = (String)pair0.second;
        zzazh2.zzv(12);
        int v21 = zzazh2.zze();
        w w0 = new w(v21, 2);
        int v22 = 0;
        while(v22 < v21) {
            int v23 = zzazh2.zzc();
            int v24 = zzazh2.zze();
            if(v24 > 0) {
                v25 = v2;
                z1 = true;
            }
            else {
                v25 = v2;
                z1 = false;
            }
            zzayz.zzd(z1, "childAtomSize should be positive");
            int v26 = zzazh2.zze();
            if(v26 != Y0.c && v26 != Y0.d && v26 != Y0.a0 && v26 != Y0.l0 && v26 != Y0.e && v26 != Y0.f && v26 != Y0.g && v26 != Y0.K0 && v26 != Y0.L0) {
                if(v26 != Y0.j && v26 != Y0.b0 && v26 != Y0.o && v26 != Y0.q && v26 != Y0.s && v26 != Y0.v && v26 != Y0.t && v26 != Y0.u && v26 != Y0.y0 && v26 != Y0.z0 && v26 != Y0.m && v26 != Y0.n && v26 != Y0.k && v26 != Y0.O0) {
                    int v69 = Y0.k0;
                    if(v26 == v69 || v26 == Y0.u0 || v26 == Y0.v0 || v26 == Y0.w0 || v26 == Y0.x0) {
                        zzazh2.zzv(v23 + 16);
                        long v70 = 0x7FFFFFFFFFFFFFFFL;
                        if(v26 == v69) {
                            list1 = null;
                            s10 = "application/ttml+xml";
                        }
                        else if(v26 == Y0.u0) {
                            byte[] arr_b4 = new byte[v24 - 16];
                            zzazh2.zzq(arr_b4, 0, v24 - 16);
                            s10 = "application/x-quicktime-tx3g";
                            list1 = Collections.singletonList(arr_b4);
                        }
                        else if(v26 == Y0.v0) {
                            s10 = "application/x-mp4-vtt";
                            list1 = null;
                        }
                        else if(v26 == Y0.w0) {
                            list1 = null;
                            s10 = "application/ttml+xml";
                            v70 = 0L;
                        }
                        else {
                            if(v26 != Y0.x0) {
                                throw new IllegalStateException();
                            }
                            w0.b = 1;
                            s10 = "application/x-mp4-cea-608";
                            list1 = null;
                        }
                        v27 = v21;
                        s4 = s;
                        w0.d = zzart.zzk(Integer.toString(v4), s10, null, -1, 0, s, -1, zzats0, v70, list1);
                        w2 = w0;
                        zzazh3 = zzazh2;
                        v45 = v24;
                        pair1 = pair0;
                        v46 = v22;
                        v47 = v23;
                    }
                    else {
                        if(v26 == Y0.N0) {
                            w0.d = zzart.zzj(Integer.toString(v4), "application/x-camera-motion", null, -1, zzats0);
                        }
                        v45 = v24;
                        v47 = v23;
                        v46 = v22;
                        w2 = w0;
                        v27 = v21;
                        s1 = s;
                        zzazh3 = zzazh2;
                        pair1 = pair0;
                        goto label_460;
                    }
                }
                else {
                    int v48 = v24;
                    w w3 = w0;
                    v27 = v21;
                    s4 = s;
                    int v49 = v23;
                    zzazh2.zzv(v49 + 16);
                    if(z) {
                        v50 = zzazh2.zzj();
                        zzazh2.zzw(6);
                    }
                    else {
                        zzazh2.zzw(8);
                        v50 = 0;
                    }
                    if(v50 == 0 || v50 == 1) {
                    label_259:
                        int v53 = zzazh2.zzj();
                        zzazh2.zzw(6);
                        int v54 = zzazh2.zzh();
                        if(v50 == 1) {
                            zzazh2.zzw(16);
                        }
                        v51 = v54;
                        v52 = v53;
                    }
                    else {
                        if(v50 == 2) {
                            zzazh2.zzw(16);
                            v51 = (int)Math.round(Double.longBitsToDouble(zzazh2.zzl()));
                            v52 = zzazh2.zzi();
                            zzazh2.zzw(20);
                            goto label_266;
                        }
                        else {
                            v47 = v49;
                            w2 = w3;
                            zzazh3 = zzazh2;
                            v45 = v48;
                            pair1 = pair0;
                            v46 = v22;
                            goto label_459;
                        }
                        goto label_259;
                    }
                label_266:
                    int v55 = zzazh2.zzc();
                    if(v26 == Y0.b0) {
                        v56 = v22;
                        v26 = a1.c(zzazh2, v49, v48, w3, v56);
                        zzazh2.zzv(v55);
                    }
                    else {
                        v56 = v22;
                    }
                    if(v26 == Y0.o) {
                        s5 = "audio/ac3";
                    }
                    else if(v26 == Y0.q) {
                        s5 = "audio/eac3";
                    }
                    else if(v26 == Y0.s) {
                        s5 = "audio/vnd.dts";
                    }
                    else if(v26 == Y0.t || v26 == Y0.u) {
                        s5 = "audio/vnd.dts.hd";
                    }
                    else if(v26 == Y0.v) {
                        s5 = "audio/vnd.dts.hd;profile=lbr";
                    }
                    else if(v26 == Y0.y0) {
                        s5 = "audio/3gpp";
                    }
                    else if(v26 == Y0.z0) {
                        s5 = "audio/amr-wb";
                    }
                    else if(v26 == Y0.m || v26 == Y0.n) {
                        s5 = "audio/raw";
                    }
                    else if(v26 == Y0.k) {
                        s5 = "audio/mpeg";
                    }
                    else if(v26 == Y0.O0) {
                        s5 = "audio/alac";
                    }
                    else {
                        s5 = null;
                    }
                    String s6 = s5;
                    int v57 = v52;
                    int v58 = v51;
                    byte[] arr_b2 = null;
                    while(v55 - v49 < v48) {
                        zzazh2.zzv(v55);
                        int v59 = zzazh2.zze();
                        zzayz.zzd(v59 > 0, "childAtomSize should be positive");
                        int v60 = zzazh2.zze();
                        int v61 = Y0.K;
                        if(v60 != v61 && (!z || v60 != Y0.l)) {
                            if(v60 == Y0.p) {
                                zzazh2.zzv(v55 + 8);
                                s8 = s4;
                                w3.d = zzasf.zzb(zzazh2, Integer.toString(v4), s8, zzats0);
                                goto label_351;
                            }
                            else {
                                s8 = s4;
                                if(v60 == Y0.r) {
                                    zzazh2.zzv(v55 + 8);
                                    w3.d = zzasf.zzc(zzazh2, Integer.toString(v4), s8, zzats0);
                                label_351:
                                    v62 = v56;
                                    s9 = s6;
                                    s7 = s8;
                                    v63 = v49;
                                    v64 = v48;
                                    w4 = w3;
                                }
                                else {
                                    if(v60 == Y0.w) {
                                        v67 = v59;
                                        v68 = v55;
                                        v62 = v56;
                                        s9 = s6;
                                        s7 = s8;
                                        v63 = v49;
                                        v64 = v48;
                                        w4 = w3;
                                        w4.d = zzart.zzg(Integer.toString(v4), s6, null, -1, -1, v57, v58, null, zzats0, 0, s7);
                                    }
                                    else {
                                        v67 = v59;
                                        v68 = v55;
                                        v62 = v56;
                                        s9 = s6;
                                        s7 = s8;
                                        v63 = v49;
                                        v64 = v48;
                                        w4 = w3;
                                        if(v60 == Y0.O0) {
                                            v59 = v67;
                                            byte[] arr_b3 = new byte[v59];
                                            v55 = v68;
                                            zzazh2.zzv(v55);
                                            zzazh2.zzq(arr_b3, 0, v59);
                                            arr_b2 = arr_b3;
                                            goto label_387;
                                        }
                                    }
                                    v59 = v67;
                                    v55 = v68;
                                }
                            }
                        label_387:
                            s6 = s9;
                        }
                        else {
                            v62 = v56;
                            v63 = v49;
                            v64 = v48;
                            s7 = s4;
                            w4 = w3;
                            if(v60 == v61) {
                                v65 = v55;
                            }
                            else {
                                v65 = zzazh2.zzc();
                                while(true) {
                                    if(v65 - v55 < v59) {
                                        zzazh2.zzv(v65);
                                        int v66 = zzazh2.zze();
                                        zzayz.zzd(v66 > 0, "childAtomSize should be positive");
                                        if(zzazh2.zze() == Y0.K) {
                                            break;
                                        }
                                        else {
                                            v65 += v66;
                                            continue;
                                        }
                                    }
                                    v65 = -1;
                                    break;
                                }
                            }
                            if(v65 != -1) {
                                Pair pair3 = a1.d(zzazh2, v65);
                                s6 = (String)pair3.first;
                                arr_b2 = (byte[])pair3.second;
                                if("audio/mp4a-latm".equals(s6)) {
                                    Pair pair4 = zzaza.zza(arr_b2);
                                    v58 = (int)(((Integer)pair4.first));
                                    v57 = (int)(((Integer)pair4.second));
                                }
                            }
                        }
                        v55 += v59;
                        w3 = w4;
                        s4 = s7;
                        v48 = v64;
                        v56 = v62;
                        v49 = v63;
                    }
                    s1 = s4;
                    if(((zzart)w3.d) != null || s6 == null) {
                        zzazh3 = zzazh2;
                        pair1 = pair0;
                        w2 = w3;
                        v45 = v48;
                        v46 = v56;
                        v47 = v49;
                    }
                    else {
                        zzazh3 = zzazh2;
                        pair1 = pair0;
                        w3.d = zzart.zzh(Integer.toString(v4), s6, null, -1, -1, v57, v58, ("audio/raw".equals(s6) ? 2 : -1), -1, -1, (arr_b2 == null ? null : Collections.singletonList(arr_b2)), zzats0, 0, s1, null);
                        w2 = w3;
                        v46 = v56;
                        v47 = v49;
                        v45 = v48;
                    }
                    goto label_460;
                }
            label_459:
                s1 = s4;
            }
            else {
                v27 = v21;
                s1 = s;
                zzazh3 = zzazh2;
                pair1 = pair0;
                w w1 = w0;
                int v28 = v23;
                zzazh3.zzv(v28 + 16);
                zzazh3.zzw(16);
                int v29 = zzazh3.zzj();
                int v30 = zzazh3.zzj();
                zzazh3.zzw(50);
                int v31 = zzazh3.zzc();
                if(v26 == Y0.a0) {
                    v32 = v22;
                    v33 = v24;
                    v26 = a1.c(zzazh3, v28, v33, w1, v32);
                    zzazh3.zzv(v31);
                }
                else {
                    v32 = v22;
                    v33 = v24;
                }
                String s2 = null;
                int v34 = 0;
                List list0 = null;
                float f = 1.0f;
                byte[] arr_b = null;
                int v35 = -1;
                while(v31 - v28 < v33) {
                    zzazh3.zzv(v31);
                    int v36 = zzazh3.zzc();
                    int v37 = zzazh3.zze();
                    if(v37 == 0) {
                        if(zzazh3.zzc() - v28 == v33) {
                            break;
                        }
                        else {
                            v37 = 0;
                        }
                    }
                    zzayz.zzd(v37 > 0, "childAtomSize should be positive");
                    int v38 = zzazh3.zze();
                    if(v38 == Y0.I) {
                        zzayz.zze(s2 == null);
                        zzazh3.zzv(v36 + 8);
                        zzazp zzazp0 = zzazp.zza(zzazh3);
                        list0 = zzazp0.zza;
                        w1.a = zzazp0.zzb;
                        if(v34 == 0) {
                            f = zzazp0.zzc;
                        }
                        s2 = "video/avc";
                        v39 = v26;
                    }
                    else if(v38 == Y0.J) {
                        zzayz.zze(s2 == null);
                        zzazh3.zzv(v36 + 8);
                        zzazv zzazv0 = zzazv.zza(zzazh3);
                        list0 = zzazv0.zza;
                        w1.a = zzazv0.zzb;
                        s2 = "video/hevc";
                        v39 = v26;
                    }
                    else if(v38 == Y0.M0) {
                        zzayz.zze(s2 == null);
                        s2 = v26 == Y0.K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        v39 = v26;
                    }
                    else if(v38 == Y0.h) {
                        zzayz.zze(s2 == null);
                        s2 = "video/3gpp";
                        v39 = v26;
                    }
                    else if(v38 == Y0.K) {
                        zzayz.zze(s2 == null);
                        Pair pair2 = a1.d(zzazh3, v36);
                        String s3 = (String)pair2.first;
                        list0 = Collections.singletonList(((byte[])pair2.second));
                        v39 = v26;
                        s2 = s3;
                    }
                    else if(v38 == Y0.j0) {
                        zzazh3.zzv(v36 + 8);
                        f = ((float)zzazh3.zzi()) / ((float)zzazh3.zzi());
                        v39 = v26;
                        v34 = 1;
                    }
                    else if(v38 == Y0.I0) {
                        int v40 = v36 + 8;
                        while(true) {
                            if(v40 - v36 < v37) {
                                zzazh3.zzv(v40);
                                int v41 = zzazh3.zze();
                                v39 = v26;
                                v42 = v34;
                                if(zzazh3.zze() == Y0.J0) {
                                    arr_b1 = Arrays.copyOfRange(zzazh3.zza, v40, v41 + v40);
                                    break;
                                }
                                else {
                                    v40 += v41;
                                    v34 = v42;
                                    v26 = v39;
                                    continue;
                                }
                            }
                            v39 = v26;
                            v42 = v34;
                            arr_b1 = null;
                            break;
                        }
                        v34 = v42;
                        arr_b = arr_b1;
                    }
                    else {
                        v39 = v26;
                        if(v38 == Y0.H0) {
                            int v43 = zzazh3.zzg();
                            zzazh3.zzw(3);
                            if(v43 == 0) {
                                int v44 = zzazh3.zzg();
                                if(v44 == 0) {
                                    v35 = 0;
                                }
                                else {
                                    switch(v44) {
                                        case 1: {
                                            v35 = 1;
                                            break;
                                        }
                                        case 2: {
                                            v35 = 2;
                                            break;
                                        }
                                        case 3: {
                                            v35 = 3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    v31 += v37;
                    v26 = v39;
                }
                if(s2 == null) {
                    v46 = v32;
                    v47 = v28;
                    w2 = w1;
                    v45 = v33;
                }
                else {
                    v45 = v33;
                    v46 = v32;
                    v47 = v28;
                    w2 = w1;
                    w2.d = zzart.zzl(Integer.toString(v4), s2, null, -1, -1, v29, v30, -1.0f, list0, v13, f, arr_b, v35, null, zzats0);
                }
            }
        label_460:
            zzazh3.zzv(v47 + v45);
            v22 = v46 + 1;
            zzazh2 = zzazh3;
            w0 = w2;
            v2 = v25;
            v21 = v27;
            s = s1;
            pair0 = pair1;
        }
        W0 w03 = w00.c(Y0.Q);
        if(w03 != null) {
            X0 x02 = w03.d(Y0.R);
            if(x02 != null) {
                zzazh zzazh4 = x02.P0;
                zzazh4.zzv(8);
                int v71 = Y0.a(zzazh4.zze());
                int v72 = zzazh4.zzi();
                long[] arr_v = new long[v72];
                long[] arr_v1 = new long[v72];
                for(int v73 = 0; v73 < v72; ++v73) {
                    arr_v[v73] = v71 == 1 ? zzazh4.zzn() : zzazh4.zzm();
                    arr_v1[v73] = v71 == 1 ? zzazh4.zzl() : ((long)zzazh4.zze());
                    if(zzazh4.zzp() != 1) {
                        throw new IllegalArgumentException("Unsupported media rate.");
                    }
                    zzazh4.zzw(2);
                }
                pair5 = Pair.create(arr_v, arr_v1);
                return ((zzart)w0.d) == null ? null : new zzavl(v4, v2, ((long)(((Long)pair0.first))), v16, v17, ((zzart)w0.d), w0.b, ((zzavm[])w0.c), w0.a, ((long[])pair5.first), ((long[])pair5.second));
            }
        }
        pair5 = Pair.create(null, null);
        return ((zzart)w0.d) == null ? null : new zzavl(v4, v2, ((long)(((Long)pair0.first))), v16, v17, ((zzart)w0.d), w0.b, ((zzavm[])w0.c), w0.a, ((long[])pair5.first), ((long[])pair5.second));
    }

    public static int b(zzazh zzazh0) {
        int v = zzazh0.zzg();
        int v1;
        for(v1 = v & 0x7F; (v & 0x80) == 0x80; v1 = v1 << 7 | v & 0x7F) {
            v = zzazh0.zzg();
        }
        return v1;
    }

    public static int c(zzazh zzazh0, int v, int v1, w w0, int v2) {
        int v3 = zzazh0.zzc();
        while(true) {
            boolean z = false;
            if(v3 - v >= v1) {
                break;
            }
            zzazh0.zzv(v3);
            int v4 = zzazh0.zze();
            zzayz.zzd(v4 > 0, "childAtomSize should be positive");
            if(zzazh0.zze() == Y0.W) {
                int v5 = v3 + 8;
                Pair pair0 = null;
                Integer integer0 = null;
                zzavm zzavm0 = null;
                boolean z1 = false;
                while(v5 - v3 < v4) {
                    zzazh0.zzv(v5);
                    int v6 = zzazh0.zze();
                    int v7 = zzazh0.zze();
                    if(v7 == Y0.c0) {
                        integer0 = zzazh0.zze();
                    }
                    else if(v7 == Y0.X) {
                        zzazh0.zzw(4);
                        z1 = zzazh0.zze() == a1.g;
                    }
                    else if(v7 == Y0.Y) {
                        int v8 = v5 + 8;
                        while(true) {
                            zzavm0 = null;
                            if(v8 - v5 < v6) {
                                zzazh0.zzv(v8);
                                int v9 = zzazh0.zze();
                                if(zzazh0.zze() == Y0.Z) {
                                    zzazh0.zzw(6);
                                    boolean z2 = zzazh0.zzg() == 1;
                                    int v10 = zzazh0.zzg();
                                    byte[] arr_b = new byte[16];
                                    zzazh0.zzq(arr_b, 0, 16);
                                    zzavm0 = new zzavm(z2, v10, arr_b);
                                }
                                else {
                                    v8 += v9;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                    v5 += v6;
                }
                if(z1) {
                    zzayz.zzd(integer0 != null, "frma atom is mandatory");
                    if(zzavm0 != null) {
                        z = true;
                    }
                    zzayz.zzd(z, "schi->tenc atom is mandatory");
                    pair0 = Pair.create(integer0, zzavm0);
                }
                if(pair0 != null) {
                    ((zzavm[])w0.c)[v2] = (zzavm)pair0.second;
                    return (int)(((Integer)pair0.first));
                }
            }
            v3 += v4;
        }
        return 0;
    }

    public static Pair d(zzazh zzazh0, int v) {
        zzazh0.zzv(v + 12);
        zzazh0.zzw(1);
        a1.b(zzazh0);
        zzazh0.zzw(2);
        int v1 = zzazh0.zzg();
        if((v1 & 0x80) != 0) {
            zzazh0.zzw(2);
        }
        if((v1 & 0x40) != 0) {
            zzazh0.zzw(zzazh0.zzj());
        }
        if((v1 & 0x20) != 0) {
            zzazh0.zzw(2);
        }
        String s = null;
        zzazh0.zzw(1);
        a1.b(zzazh0);
        int v2 = zzazh0.zzg();
        switch(v2) {
            case 0x20: {
                s = "video/mp4v-es";
                break;
            }
            case 33: {
                s = "video/avc";
                break;
            }
            case 35: {
                s = "video/hevc";
                break;
            }
            default: {
                if(v2 == 0x40) {
                    s = "audio/mp4a-latm";
                }
                else {
                    switch(v2) {
                        case 107: {
                            return Pair.create("audio/mpeg", null);
                        label_20:
                            if(v2 == 102 || v2 == 103 || v2 == 104) {
                                s = "audio/mp4a-latm";
                            }
                            else {
                                switch(v2) {
                                    case 170: 
                                    case 0xAB: {
                                        return Pair.create("audio/vnd.dts.hd", null);
                                    }
                                    case 0xA9: 
                                    case 0xAC: {
                                        return Pair.create("audio/vnd.dts", null);
                                    }
                                }
                            }
                            break;
                        }
                        case 0xA5: {
                            s = "audio/ac3";
                            break;
                        }
                        case 0xA6: {
                            s = "audio/eac3";
                            break;
                        }
                        default: {
                            goto label_20;
                        }
                    }
                }
            }
        }
        zzazh0.zzw(12);
        zzazh0.zzw(1);
        int v3 = a1.b(zzazh0);
        byte[] arr_b = new byte[v3];
        zzazh0.zzq(arr_b, 0, v3);
        return Pair.create(s, arr_b);
    }
}

