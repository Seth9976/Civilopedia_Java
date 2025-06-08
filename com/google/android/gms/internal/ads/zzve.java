package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class zzve extends zzvj {
    public final AtomicReference c;
    public final zzud d;
    public static final zzfsr e;
    public static final zzfsr f;
    public static final int zza;

    static {
        zzve.e = zzfsr.zzb(zzun.zza);
        zzve.f = zzfsr.zzb(zzuo.zza);
    }

    @Deprecated
    public zzve() {
        throw null;
    }

    public zzve(Context context0) {
        zzud zzud0 = new zzud();
        zzut zzut0 = zzut.zzc(context0);
        super();
        this.d = zzud0;
        this.c = new AtomicReference(zzut0);
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final Pair a(zzvi zzvi0, int[][][] arr3_v, int[] arr_v) {
        zzvh zzvh0;
        zzvu zzvu1;
        boolean z;
        zzut zzut0 = (zzut)this.c.get();
        zzvf[] arr_zzvf = new zzvf[2];
        Pair pair0 = zzve.e(2, zzvi0, arr3_v, new zzuj(zzut0, arr_v), zzuk.zza);
        if(pair0 != null) {
            arr_zzvf[((int)(((Integer)pair0.second)))] = (zzvf)pair0.first;
        }
        for(int v = 0; true; ++v) {
            z = false;
            if(v >= 2) {
                break;
            }
            if(zzvi0.zzc(v) == 2 && zzvi0.zzd(v).zzc > 0) {
                z = true;
                break;
            }
        }
        Pair pair1 = zzve.e(1, zzvi0, arr3_v, new zzuh(zzut0, z), zzui.zza);
        if(pair1 != null) {
            arr_zzvf[((int)(((Integer)pair1.second)))] = (zzvf)pair1.first;
        }
        Pair pair2 = zzve.e(3, zzvi0, arr3_v, new zzul(zzut0, (pair1 == null ? null : ((zzvf)pair1.first).zza.zzb(((zzvf)pair1.first).zzb[0]).zzd)), zzum.zza);
        if(pair2 != null) {
            arr_zzvf[((int)(((Integer)pair2.second)))] = (zzvf)pair2.first;
        }
        for(int v1 = 0; v1 < 2; ++v1) {
            switch(zzvi0.zzc(v1)) {
                case 1: 
                case 2: 
                case 3: {
                    break;
                }
                default: {
                    zzty zzty0 = zzvi0.zzd(v1);
                    int[][] arr2_v = arr3_v[v1];
                    int v2 = 0;
                    zzck zzck0 = null;
                    int v3 = 0;
                    for(Cb cb0 = null; v2 < zzty0.zzc; cb0 = cb1) {
                        zzck zzck1 = zzty0.zzb(v2);
                        int[] arr_v1 = arr2_v[v2];
                        Cb cb1 = cb0;
                        for(int v4 = 0; v4 <= 0; ++v4) {
                            if(zzve.d(arr_v1[v4], zzut0.zzP)) {
                                Cb cb2 = new Cb(zzck1.zzb(v4), arr_v1[v4]);
                                if(cb1 == null || cb2.a(cb1) > 0) {
                                    cb1 = cb2;
                                    v3 = v4;
                                    zzck0 = zzck1;
                                }
                            }
                        }
                        ++v2;
                    }
                    arr_zzvf[v1] = zzck0 == null ? null : new zzvf(zzck0, new int[]{v3}, 0);
                }
            }
        }
        HashMap hashMap0 = new HashMap();
        for(int v5 = 0; v5 < 2; ++v5) {
            zzty zzty1 = zzvi0.zzd(v5);
            for(int v6 = 0; v6 < zzty1.zzc; ++v6) {
                zzck zzck2 = zzty1.zzb(v6);
                if(((zzcm)zzut0.zzB.get(zzck2)) != null) {
                    throw null;
                }
            }
        }
        zzty zzty2 = zzvi0.zze();
        for(int v7 = 0; v7 < zzty2.zzc; ++v7) {
            zzck zzck3 = zzty2.zzb(v7);
            if(((zzcm)zzut0.zzB.get(zzck3)) != null) {
                throw null;
            }
        }
        for(int v8 = 0; v8 < 2; ++v8) {
            if(((zzcm)hashMap0.get(zzvi0.zzc(v8))) != null) {
                throw null;
            }
        }
        for(int v9 = 0; v9 < 2; ++v9) {
            zzty zzty3 = zzvi0.zzd(v9);
            if(zzut0.zzg(v9, zzty3)) {
                if(zzut0.zze(v9, zzty3) != null) {
                    throw null;
                }
                arr_zzvf[v9] = null;
                continue;
            }
        }
        for(int v10 = 0; v10 < 2; ++v10) {
            int v11 = zzvi0.zzc(v10);
            if(zzut0.zzf(v10) || zzut0.zzC.contains(v11)) {
                arr_zzvf[v10] = null;
            }
        }
        zzvu zzvu0 = this.b;
        zzcw.zzb(zzvu0);
        ArrayList arrayList0 = new ArrayList();
        for(int v12 = 0; v12 < 2; ++v12) {
            zzvf zzvf0 = arr_zzvf[v12];
            if(zzvf0 == null || zzvf0.zzb.length <= 1) {
                arrayList0.add(null);
            }
            else {
                zzfrg zzfrg0 = zzfrj.zzi();
                zzfrg0.zze(new zzuc(0L, 0L));
                arrayList0.add(zzfrg0);
            }
        }
        long[][] arr2_v1 = new long[2][];
        for(int v13 = 0; v13 < 2; ++v13) {
            zzvf zzvf1 = arr_zzvf[v13];
            if(zzvf1 == null) {
                arr2_v1[v13] = new long[0];
            }
            else {
                arr2_v1[v13] = new long[zzvf1.zzb.length];
                for(int v14 = 0; true; ++v14) {
                    int[] arr_v2 = zzvf1.zzb;
                    if(v14 >= arr_v2.length) {
                        break;
                    }
                    arr2_v1[v13][v14] = (long)zzvf1.zza.zzb(arr_v2[v14]).zzi;
                }
                Arrays.sort(arr2_v1[v13]);
            }
        }
        int[] arr_v3 = new int[2];
        long[] arr_v4 = new long[2];
        for(int v15 = 0; v15 < 2; ++v15) {
            long[] arr_v5 = arr2_v1[v15];
            arr_v4[v15] = arr_v5.length == 0 ? 0L : arr_v5[0];
        }
        zzue.a(arrayList0, arr_v4);
        zzfru zzfru0 = zzfsm.zzc(zzfsr.zzc()).zzb(2).zza();
        int v16 = 0;
        while(v16 < 2) {
            int v17 = arr2_v1[v16].length;
            if(v17 <= 1) {
                zzvu1 = zzvu0;
            }
            else {
                double[] arr_f = new double[v17];
                for(int v18 = 0; true; ++v18) {
                    long[] arr_v6 = arr2_v1[v16];
                    double f = 0.0;
                    if(v18 >= arr_v6.length) {
                        break;
                    }
                    long v19 = arr_v6[v18];
                    if(v19 != -1L) {
                        f = Math.log(v19);
                    }
                    arr_f[v18] = f;
                }
                zzvu1 = zzvu0;
                int v20 = v17 - 1;
                double f1 = arr_f[v20] - arr_f[0];
                for(int v21 = 0; v21 < v20; ++v21) {
                    zzfru0.zzs(((double)(f1 == 0.0 ? 1.0 : ((arr_f[v21] + arr_f[v21 + 1]) * 0.5 - arr_f[0]) / f1)), v16);
                }
            }
            ++v16;
            zzvu0 = zzvu1;
        }
        zzfrj zzfrj0 = zzfrj.zzm(zzfru0.zzt());
        for(int v22 = 0; v22 < zzfrj0.size(); ++v22) {
            int v23 = (int)(((Integer)zzfrj0.get(v22)));
            int v24 = arr_v3[v23] + 1;
            arr_v3[v23] = v24;
            arr_v4[v23] = arr2_v1[v23][v24];
            zzue.a(arrayList0, arr_v4);
        }
        for(int v25 = 0; v25 < 2; ++v25) {
            if(arrayList0.get(v25) != null) {
                long v26 = arr_v4[v25];
                arr_v4[v25] = v26 + v26;
            }
        }
        zzue.a(arrayList0, arr_v4);
        zzfrg zzfrg1 = zzfrj.zzi();
        for(int v27 = 0; v27 < arrayList0.size(); ++v27) {
            zzfrg zzfrg2 = (zzfrg)arrayList0.get(v27);
            zzfrg1.zze((zzfrg2 == null ? zzfrj.zzo() : zzfrg2.zzg()));
        }
        zzfrj zzfrj1 = zzfrg1.zzg();
        zzvg[] arr_zzvg = new zzvg[2];
        for(int v28 = 0; v28 < 2; ++v28) {
            zzvf zzvf2 = arr_zzvf[v28];
            if(zzvf2 != null) {
                int[] arr_v7 = zzvf2.zzb;
                int v29 = arr_v7.length;
                if(v29 != 0) {
                    if(v29 == 1) {
                        zzvh0 = new zzvh(zzvf2.zza, arr_v7[0], 0, 0, null);
                    }
                    else {
                        Object object0 = zzfrj1.get(v28);
                        zzvh0 = new zzue(zzvf2.zza, arr_v7, zzvu0, ((zzfrj)object0), this.d.a);
                    }
                    arr_zzvg[v28] = zzvh0;
                }
            }
        }
        zzjv[] arr_zzjv = new zzjv[2];
        for(int v30 = 0; v30 < 2; ++v30) {
            int v31 = zzvi0.zzc(v30);
            arr_zzjv[v30] = zzut0.zzf(v30) || zzut0.zzC.contains(v31) || zzvi0.zzc(v30) != -2 && arr_zzvg[v30] == null ? null : zzjv.zza;
        }
        return Pair.create(arr_zzjv, arr_zzvg);
    }

    public static int b(zzad zzad0, String s, boolean z) {
        if(!TextUtils.isEmpty(s) && s.equals(zzad0.zzd)) {
            return 4;
        }
        String s1 = zzve.c(s);
        String s2 = zzve.c(zzad0.zzd);
        if(s2 != null && s1 != null) {
            if(!s2.startsWith(s1) && !s1.startsWith(s2)) {
                return zzeg.zzag(s2, "-")[0].equals(zzeg.zzag(s1, "-")[0]) ? 2 : 0;
            }
            return 3;
        }
        return !z || s2 != null ? 0 : 1;
    }

    // 去混淆评级： 低(20)
    public static String c(String s) {
        return TextUtils.isEmpty(s) || TextUtils.equals(s, "und") ? null : s;
    }

    public static boolean d(int v, boolean z) {
        return (v & 7) == 4 || z && (v & 7) == 3;
    }

    public static final Pair e(int v, zzvi zzvi0, int[][][] arr3_v, zzuz zzuz0, Comparator comparator0) {
        zzfrj zzfrj0;
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < 2; ++v1) {
            if(v == zzvi0.zzc(v1)) {
                zzty zzty0 = zzvi0.zzd(v1);
                for(int v2 = 0; v2 < zzty0.zzc; ++v2) {
                    List list0 = zzuz0.zza(v1, zzty0.zzb(v2), arr3_v[v1][v2]);
                    boolean[] arr_z = new boolean[1];
                    for(int v3 = 0; v3 <= 0; ++v3) {
                        Eb eb0 = (Eb)list0.get(v3);
                        int v4 = eb0.a();
                        if(!arr_z[v3] && v4 != 0) {
                            if(v4 == 1) {
                                zzfrj0 = zzfrj.zzp(eb0);
                            }
                            else {
                                ArrayList arrayList1 = new ArrayList();
                                arrayList1.add(eb0);
                                for(int v5 = v3 + 1; v5 <= 0; ++v5) {
                                    Eb eb1 = (Eb)list0.get(v5);
                                    if(eb1.a() == 2 && eb0.b(eb1)) {
                                        arrayList1.add(eb1);
                                        arr_z[v5] = true;
                                    }
                                }
                                zzfrj0 = arrayList1;
                            }
                            arrayList0.add(zzfrj0);
                        }
                    }
                }
            }
        }
        if(arrayList0.isEmpty()) {
            return null;
        }
        List list1 = (List)Collections.max(arrayList0, comparator0);
        int[] arr_v = new int[list1.size()];
        for(int v6 = 0; v6 < list1.size(); ++v6) {
            arr_v[v6] = ((Eb)list1.get(v6)).k;
        }
        Eb eb2 = (Eb)list1.get(0);
        return Pair.create(new zzvf(eb2.j, arr_v, 0), eb2.i);
    }

    public final zzut zzc() {
        return (zzut)this.c.get();
    }

    public final void zzg(zzuv zzuv0) {
        zzut zzut0 = new zzut(zzuv0);
        if(!((zzut)this.c.getAndSet(zzut0)).equals(zzut0)) {
            zzvl zzvl0 = this.a;
            if(zzvl0 != null) {
                zzvl0.zzj();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzvm
    public final boolean zzh() {
        return true;
    }
}

