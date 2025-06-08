package com.google.android.gms.internal.ads;

import A.f;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

public final class zzavf implements zzatw {
    public final SparseArray a;
    public final zzazh b;
    public final zzazh c;
    public final zzazh d;
    public final zzazh e;
    public final byte[] f;
    public final Stack g;
    public final LinkedList h;
    public int i;
    public int j;
    public long k;
    public int l;
    public zzazh m;
    public long n;
    public long o;
    public c1 p;
    public int q;
    public int r;
    public int s;
    public zzatx t;
    public boolean u;
    public static final int v;
    public static final byte[] w;
    public static final zzaty zza;

    static {
        zzavf.zza = new S(3);
        zzavf.v = zzazo.zzg("seig");
        zzavf.w = new byte[]{-94, 57, 0x4F, 82, 90, -101, 0x4F, 20, -94, 68, 108, 66, 0x7C, 100, (byte)0x8D, -12};
    }

    public zzavf() {
        this(0, null, null);
    }

    public zzavf(int v, zzazl zzazl0, zzavl zzavl0) {
        this.e = new zzazh(16);
        this.b = new zzazh(zzazf.zza);
        this.c = new zzazh(5);
        new zzazh();
        this.d = new zzazh(1);
        this.f = new byte[16];
        this.g = new Stack();
        this.h = new LinkedList();
        this.a = new SparseArray();
        this.o = 0x8000000000000001L;
        this.b();
    }

    public static zzats a(ArrayList arrayList0) {
        Pair pair0;
        int v = arrayList0.size();
        List list0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            X0 x00 = (X0)arrayList0.get(v1);
            int v2 = Y0.V;
            if(x00.a == v2) {
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                byte[] arr_b = x00.P0.zza;
                zzazh zzazh0 = new zzazh(arr_b);
                if(zzazh0.zzd() >= 0x20) {
                    zzazh0.zzv(0);
                    if(zzazh0.zze() == zzazh0.zza() + 4 && zzazh0.zze() == v2) {
                        int v3 = Y0.a(zzazh0.zze());
                        if(v3 > 1) {
                            f.p(v3, "Unsupported pssh version: ", "PsshAtomUtil");
                            pair0 = null;
                        }
                        else {
                            UUID uUID0 = new UUID(zzazh0.zzl(), zzazh0.zzl());
                            if(v3 == 1) {
                                zzazh0.zzw(zzazh0.zzi() * 16);
                            }
                            int v4 = zzazh0.zzi();
                            if(v4 == zzazh0.zza()) {
                                byte[] arr_b1 = new byte[v4];
                                zzazh0.zzq(arr_b1, 0, v4);
                                pair0 = Pair.create(uUID0, arr_b1);
                            }
                        }
                    }
                }
                else {
                    pair0 = null;
                }
                UUID uUID1 = pair0 == null ? null : ((UUID)pair0.first);
                if(uUID1 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
                else {
                    ((ArrayList)list0).add(new zzatr(uUID1, "video/mp4", arr_b, false));
                }
            }
        }
        return list0 == null ? null : new zzats(list0);
    }

    public final void b() {
        this.i = 0;
        this.l = 0;
    }

    public static void c(zzazh zzazh0, int v, g1 g10) {
        zzazh0.zzv(v + 8);
        int v1 = zzazh0.zze();
        if((v1 & 1) != 0) {
            throw new zzarw("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        int v2 = zzazh0.zzi();
        int v3 = g10.e;
        if(v2 != v3) {
            throw new zzarw(f.d(v2, v3, "Length mismatch: ", ", "));
        }
        Arrays.fill(g10.m, 0, v2, (v1 & 2) != 0);
        int v4 = zzazh0.zza();
        if(g10.p == null || g10.p.zzd() < v4) {
            g10.p = new zzazh(v4);
        }
        g10.o = v4;
        g10.l = true;
        g10.q = true;
        zzazh0.zzq(g10.p.zza, 0, v4);
        g10.p.zzv(0);
        g10.q = false;
    }

    public final void d(long v) {
        zzavf zzavf2;
        zzavf zzavf1;
        int v57;
        ArrayList arrayList6;
        SparseArray sparseArray4;
        int v51;
        zzazh zzazh4;
        int v50;
        int v49;
        int v48;
        int v47;
        int v46;
        long v44;
        int[] arr_v8;
        int[] arr_v7;
        int v41;
        W0 w04;
        long v40;
        int v39;
        int v38;
        c1 c13;
        ArrayList arrayList5;
        int v31;
        ArrayList arrayList4;
        SparseArray sparseArray3;
        int v29;
        ArrayList arrayList3;
        int v22;
        zzavf zzavf0 = this;
        while(true) {
            Stack stack0 = zzavf0.g;
            if(stack0.isEmpty() || ((W0)stack0.peek()).P0 != v) {
                break;
            }
            W0 w00 = (W0)stack0.pop();
            int v1 = w00.a;
            SparseArray sparseArray0 = zzavf0.a;
            ArrayList arrayList0 = w00.Q0;
            ArrayList arrayList1 = w00.R0;
            if(v1 == Y0.C) {
                zzats zzats0 = zzavf.a(arrayList0);
                W0 w01 = w00.c(Y0.N);
                SparseArray sparseArray1 = new SparseArray();
                int v2 = w01.Q0.size();
                long v3 = 0x8000000000000001L;
                for(int v4 = 0; v4 < v2; ++v4) {
                    X0 x00 = (X0)w01.Q0.get(v4);
                    int v5 = x00.a;
                    zzazh zzazh0 = x00.P0;
                    if(v5 == Y0.z) {
                        zzazh0.zzv(12);
                        Pair pair0 = Pair.create(zzazh0.zze(), new b1(zzazh0.zzi() - 1, zzazh0.zzi(), zzazh0.zzi(), zzazh0.zze()));
                        sparseArray1.put(((int)(((Integer)pair0.first))), ((b1)pair0.second));
                    }
                    else if(v5 == Y0.O) {
                        zzazh0.zzv(8);
                        v3 = Y0.a(zzazh0.zze()) == 0 ? zzazh0.zzm() : zzazh0.zzn();
                    }
                }
                SparseArray sparseArray2 = new SparseArray();
                int v6 = arrayList1.size();
                for(int v7 = 0; v7 < v6; ++v7) {
                    W0 w02 = (W0)arrayList1.get(v7);
                    if(w02.a == Y0.E) {
                        zzavl zzavl0 = a1.a(w02, w00.d(Y0.D), v3, zzats0, false);
                        if(zzavl0 != null) {
                            sparseArray2.put(zzavl0.zza, zzavl0);
                        }
                    }
                }
                int v8 = sparseArray2.size();
                if(sparseArray0.size() == 0) {
                    for(int v9 = 0; v9 < v8; ++v9) {
                        zzavl zzavl1 = (zzavl)sparseArray2.valueAt(v9);
                        zzauf zzauf0 = zzavf0.t.zzbi(v9, zzavl1.zzb);
                        c1 c10 = new c1(zzauf0);
                        b1 b10 = (b1)sparseArray1.get(zzavl1.zza);
                        c10.c = zzavl1;
                        b10.getClass();
                        c10.d = b10;
                        zzauf0.zza(zzavl1.zzf);
                        c10.a();
                        sparseArray0.put(zzavl1.zza, c10);
                        zzavf0.o = Math.max(zzavf0.o, zzavl1.zze);
                    }
                    zzavf0.t.zzb();
                }
                else {
                    zzayz.zze(sparseArray0.size() == v8);
                    for(int v10 = 0; v10 < v8; ++v10) {
                        zzavl zzavl2 = (zzavl)sparseArray2.valueAt(v10);
                        c1 c11 = (c1)sparseArray0.get(zzavl2.zza);
                        b1 b11 = (b1)sparseArray1.get(zzavl2.zza);
                        c11.c = zzavl2;
                        b11.getClass();
                        c11.d = b11;
                        c11.b.zza(zzavl2.zzf);
                        c11.a();
                    }
                }
            }
            else {
                if(v1 == Y0.L) {
                    int v11 = arrayList1.size();
                    int v12 = 0;
                    while(v12 < v11) {
                        W0 w03 = (W0)arrayList1.get(v12);
                        if(w03.a == Y0.M) {
                            zzazh zzazh1 = w03.d(Y0.y).P0;
                            zzazh1.zzv(8);
                            int v13 = zzazh1.zze();
                            c1 c12 = (c1)sparseArray0.get(zzazh1.zze());
                            if(c12 == null) {
                                c12 = null;
                            }
                            else {
                                g1 g10 = c12.a;
                                if((v13 & 1) != 0) {
                                    long v14 = zzazh1.zzn();
                                    g10.b = v14;
                                    g10.c = v14;
                                }
                                b1 b12 = c12.d;
                                g10.a = new b1(((v13 & 2) == 0 ? b12.a : zzazh1.zzi() - 1), ((v13 & 8) == 0 ? b12.b : zzazh1.zzi()), ((v13 & 16) == 0 ? b12.c : zzazh1.zzi()), ((v13 & 0x20) == 0 ? b12.d : zzazh1.zzi()));
                            }
                            if(c12 != null) {
                                g1 g11 = c12.a;
                                long v15 = g11.r;
                                c12.a();
                                int v16 = Y0.x;
                                if(w03.d(v16) != null) {
                                    zzazh zzazh2 = w03.d(v16).P0;
                                    zzazh2.zzv(8);
                                    v15 = Y0.a(zzazh2.zze()) == 1 ? zzazh2.zzn() : zzazh2.zzm();
                                }
                                ArrayList arrayList2 = w03.Q0;
                                int v17 = arrayList2.size();
                                int v18 = 0;
                                int v20 = 0;
                                for(int v19 = 0; v19 < v17; ++v19) {
                                    X0 x01 = (X0)arrayList2.get(v19);
                                    if(x01.a == Y0.A) {
                                        x01.P0.zzv(12);
                                        int v21 = x01.P0.zzi();
                                        if(v21 > 0) {
                                            v18 += v21;
                                            ++v20;
                                        }
                                    }
                                }
                                v22 = v11;
                                arrayList3 = arrayList1;
                                long v23 = v15;
                                c12.g = 0;
                                c12.f = 0;
                                c12.e = 0;
                                g11.d = v20;
                                g11.e = v18;
                                if(g11.g == null || g11.g.length < v20) {
                                    g11.f = new long[v20];
                                    g11.g = new int[v20];
                                }
                                if(g11.h == null || g11.h.length < v18) {
                                    int v24 = v18 * 0x7D / 100;
                                    g11.h = new int[v24];
                                    g11.i = new int[v24];
                                    g11.j = new long[v24];
                                    g11.k = new boolean[v24];
                                    g11.m = new boolean[v24];
                                }
                                int v25 = 0;
                                int v26 = 0;
                                int v27 = 0;
                                while(v25 < v17) {
                                    X0 x02 = (X0)arrayList2.get(v25);
                                    if(x02.a == Y0.A) {
                                        zzazh zzazh3 = x02.P0;
                                        zzazh3.zzv(8);
                                        int v28 = zzazh3.zze();
                                        zzavl zzavl3 = c12.c;
                                        b1 b13 = g11.a;
                                        v29 = v17;
                                        int[] arr_v = g11.g;
                                        arr_v[v27] = zzazh3.zzi();
                                        long[] arr_v1 = g11.f;
                                        sparseArray3 = sparseArray0;
                                        arrayList4 = arrayList0;
                                        long v30 = g11.b;
                                        arr_v1[v27] = v30;
                                        if((v28 & 1) == 0) {
                                            v31 = v12;
                                            arrayList5 = arrayList2;
                                            c13 = c12;
                                        }
                                        else {
                                            v31 = v12;
                                            arrayList5 = arrayList2;
                                            c13 = c12;
                                            arr_v1[v27] = v30 + ((long)zzazh3.zze());
                                        }
                                        int v32 = v28 & 4;
                                        int v33 = v32 == 0 ? b13.d : zzazh3.zzi();
                                        int v34 = v28 & 0x100;
                                        int v35 = v28 & 0x200;
                                        int v36 = v28 & 0x400;
                                        int v37 = v28 & 0x800;
                                        long[] arr_v2 = zzavl3.zzi;
                                        if(arr_v2 == null) {
                                            v38 = v33;
                                        }
                                        else {
                                            v38 = v33;
                                            if(arr_v2.length == 1 && arr_v2[0] == 0L) {
                                                v39 = v25;
                                                v40 = zzazo.zzj(zzavl3.zzj[0], 1000L, zzavl3.zzc);
                                                goto label_179;
                                            }
                                        }
                                        v39 = v25;
                                        v40 = 0L;
                                    label_179:
                                        int[] arr_v3 = g11.h;
                                        int[] arr_v4 = g11.i;
                                        long[] arr_v5 = g11.j;
                                        w04 = w03;
                                        boolean[] arr_z = g11.k;
                                        v41 = v39;
                                        int v42 = g11.g[v27] + v26;
                                        long[] arr_v6 = arr_v5;
                                        long v43 = zzavl3.zzc;
                                        if(v27 > 0) {
                                            arr_v7 = arr_v3;
                                            arr_v8 = arr_v4;
                                            v44 = g11.r;
                                        }
                                        else {
                                            arr_v7 = arr_v3;
                                            arr_v8 = arr_v4;
                                            v44 = v23;
                                        }
                                        while(v26 < v42) {
                                            int v45 = v34 == 0 ? b13.b : zzazh3.zzi();
                                            if(v35 == 0) {
                                                v46 = v42;
                                                v47 = b13.c;
                                            }
                                            else {
                                                v46 = v42;
                                                v47 = zzazh3.zzi();
                                            }
                                            if(v26 == 0) {
                                                if(v32 == 0) {
                                                    v26 = 0;
                                                }
                                                else {
                                                    v48 = v32;
                                                    v49 = v38;
                                                    v26 = 0;
                                                    goto label_217;
                                                }
                                            }
                                            if(v36 == 0) {
                                                v48 = v32;
                                                v49 = b13.d;
                                            }
                                            else {
                                                v48 = v32;
                                                v49 = zzazh3.zze();
                                            }
                                        label_217:
                                            if(v37 == 0) {
                                                v50 = v34;
                                                zzazh4 = zzazh3;
                                                arr_v8[v26] = 0;
                                            }
                                            else {
                                                v50 = v34;
                                                zzazh4 = zzazh3;
                                                arr_v8[v26] = (int)(((long)(zzazh3.zze() * 1000)) / v43);
                                            }
                                            arr_v6[v26] = zzazo.zzj(v44, 1000L, v43) - v40;
                                            arr_v7[v26] = v47;
                                            arr_z[v26] = 1 == (v49 >> 16 & 1 ^ 1);
                                            v44 += (long)v45;
                                            ++v26;
                                            v42 = v46;
                                            v32 = v48;
                                            v34 = v50;
                                            zzazh3 = zzazh4;
                                        }
                                        g11.r = v44;
                                        ++v27;
                                        v26 = v42;
                                    }
                                    else {
                                        v41 = v25;
                                        v31 = v12;
                                        w04 = w03;
                                        sparseArray3 = sparseArray0;
                                        arrayList4 = arrayList0;
                                        arrayList5 = arrayList2;
                                        c13 = c12;
                                        v29 = v17;
                                    }
                                    v25 = v41 + 1;
                                    v17 = v29;
                                    sparseArray0 = sparseArray3;
                                    arrayList0 = arrayList4;
                                    v12 = v31;
                                    c12 = c13;
                                    arrayList2 = arrayList5;
                                    w03 = w04;
                                }
                                v51 = v12;
                                sparseArray4 = sparseArray0;
                                arrayList6 = arrayList0;
                                ArrayList arrayList7 = arrayList2;
                                X0 x03 = w03.d(Y0.d0);
                                if(x03 != null) {
                                    int v52 = c12.c.zzh[g11.a.a].zza;
                                    zzazh zzazh5 = x03.P0;
                                    zzazh5.zzv(8);
                                    if((zzazh5.zze() & 1) == 1) {
                                        zzazh5.zzw(8);
                                    }
                                    int v53 = zzazh5.zzg();
                                    int v54 = zzazh5.zzi();
                                    int v55 = g11.e;
                                    if(v54 != v55) {
                                        throw new zzarw(f.d(v54, v55, "Length mismatch: ", ", "));
                                    }
                                    if(v53 == 0) {
                                        boolean[] arr_z1 = g11.m;
                                        v57 = 0;
                                        for(int v56 = 0; v56 < v54; ++v56) {
                                            int v58 = zzazh5.zzg();
                                            v57 += v58;
                                            arr_z1[v56] = v58 > v52;
                                        }
                                    }
                                    else {
                                        v57 = v53 * v54;
                                        Arrays.fill(g11.m, 0, v54, v53 > v52);
                                    }
                                    if(g11.p == null || g11.p.zzd() < v57) {
                                        g11.p = new zzazh(v57);
                                    }
                                    g11.o = v57;
                                    g11.l = true;
                                    g11.q = true;
                                }
                                X0 x04 = w03.d(Y0.e0);
                                if(x04 != null) {
                                    zzazh zzazh6 = x04.P0;
                                    zzazh6.zzv(8);
                                    int v59 = zzazh6.zze();
                                    if((v59 & 1) == 1) {
                                        zzazh6.zzw(8);
                                    }
                                    int v60 = zzazh6.zzi();
                                    if(v60 != 1) {
                                        throw new zzarw("Unexpected saio entry count: " + v60);
                                    }
                                    g11.c += (Y0.a(v59) == 0 ? zzazh6.zzm() : zzazh6.zzn());
                                }
                                X0 x05 = w03.d(Y0.i0);
                                if(x05 != null) {
                                    zzavf.c(x05.P0, 0, g11);
                                }
                                X0 x06 = w03.d(Y0.f0);
                                X0 x07 = w03.d(Y0.g0);
                                if(x06 != null && x07 != null) {
                                    zzazh zzazh7 = x06.P0;
                                    zzazh7.zzv(8);
                                    int v61 = zzazh7.zze();
                                    int v62 = zzazh7.zze();
                                    int v63 = zzavf.v;
                                    if(v62 == v63) {
                                        if(Y0.a(v61) == 1) {
                                            zzazh7.zzw(4);
                                        }
                                        if(zzazh7.zze() != 1) {
                                            throw new zzarw("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        zzazh zzazh8 = x07.P0;
                                        zzazh8.zzv(8);
                                        int v64 = zzazh8.zze();
                                        if(zzazh8.zze() == v63) {
                                            int v65 = Y0.a(v64);
                                            if(v65 == 1) {
                                                if(zzazh8.zzm() == 0L) {
                                                    throw new zzarw("Variable length decription in sgpd found (unsupported)");
                                                }
                                            }
                                            else if(v65 >= 2) {
                                                zzazh8.zzw(4);
                                            }
                                            if(zzazh8.zzm() != 1L) {
                                                throw new zzarw("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            zzazh8.zzw(2);
                                            if(zzazh8.zzg() == 1) {
                                                int v66 = zzazh8.zzg();
                                                byte[] arr_b = new byte[16];
                                                zzazh8.zzq(arr_b, 0, 16);
                                                g11.l = true;
                                                g11.n = new zzavm(true, v66, arr_b);
                                            }
                                        }
                                    }
                                }
                                int v67 = arrayList7.size();
                                for(int v68 = 0; v68 < v67; ++v68) {
                                    X0 x08 = (X0)arrayList7.get(v68);
                                    if(x08.a == Y0.h0) {
                                        zzazh zzazh9 = x08.P0;
                                        zzazh9.zzv(8);
                                        zzazh9.zzq(this.f, 0, 16);
                                        if(Arrays.equals(this.f, zzavf.w)) {
                                            zzavf.c(zzazh9, 16, g11);
                                        }
                                    }
                                }
                                zzavf1 = this;
                            }
                        }
                        else {
                            v22 = v11;
                            v51 = v12;
                            sparseArray4 = sparseArray0;
                            arrayList6 = arrayList0;
                            arrayList3 = arrayList1;
                            zzavf1 = zzavf0;
                        }
                        v12 = v51 + 1;
                        zzavf0 = zzavf1;
                        arrayList1 = arrayList3;
                        v11 = v22;
                        sparseArray0 = sparseArray4;
                        arrayList0 = arrayList6;
                    }
                    zzavf2 = zzavf0;
                    SparseArray sparseArray5 = sparseArray0;
                    zzats zzats1 = zzavf.a(arrayList0);
                    if(zzats1 != null) {
                        int v69 = sparseArray5.size();
                        for(int v70 = 0; v70 < v69; ++v70) {
                            c1 c14 = (c1)sparseArray5.valueAt(v70);
                            zzart zzart0 = c14.c.zzf.zzc(zzats1);
                            c14.b.zza(zzart0);
                        }
                    }
                }
                else {
                    zzavf2 = zzavf0;
                    if(!stack0.isEmpty()) {
                        ((W0)stack0.peek()).R0.add(w00);
                    }
                }
                zzavf0 = zzavf2;
            }
        }
        this.b();
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final void zzd(zzatx zzatx0) {
        this.t = zzatx0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final void zze(long v, long v1) {
        SparseArray sparseArray0 = this.a;
        int v2 = sparseArray0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((c1)sparseArray0.valueAt(v3)).a();
        }
        this.h.clear();
        this.g.clear();
        this.b();
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final int zzf(zzatv zzatv0, zzaub zzaub0) throws IOException, InterruptedException {
        zzaue zzaue0;
        zzavm zzavm0;
        int v15;
        long v42;
        long v41;
        while(true) {
            int v = this.i;
            Stack stack0 = this.g;
            SparseArray sparseArray0 = this.a;
        alab1:
            switch(v) {
                case 0: {
                    zzazh zzazh2 = this.e;
                    if(this.l == 0) {
                        if(!zzatv0.zzh(zzazh2.zza, 0, 8, true)) {
                            return -1;
                        }
                        this.l = 8;
                        zzazh2.zzv(0);
                        this.k = zzazh2.zzm();
                        this.j = zzazh2.zze();
                    }
                    long v28 = this.k;
                    if(v28 == 1L) {
                        zzatv0.zzh(zzazh2.zza, 8, 8, false);
                        this.l += 8;
                        v28 = zzazh2.zzn();
                        this.k = v28;
                    }
                    long v29 = (long)this.l;
                    if(v28 < v29) {
                        throw new zzarw("Atom size less than header length (unsupported).");
                    }
                    long v30 = zzatv0.zzd() - v29;
                    if(this.j == Y0.L) {
                        int v31 = sparseArray0.size();
                        for(int v32 = 0; v32 < v31; ++v32) {
                            g1 g14 = ((c1)sparseArray0.valueAt(v32)).a;
                            g14.c = v30;
                            g14.b = v30;
                        }
                    }
                    int v33 = this.j;
                    if(v33 == Y0.i) {
                        this.p = null;
                        this.n = v30 + this.k;
                        if(!this.u) {
                            this.t.zzc(new zzauc(this.o));
                            this.u = true;
                        }
                        this.i = 2;
                    }
                    else if(v33 == Y0.C || v33 == Y0.E || v33 == Y0.F || v33 == Y0.G || v33 == Y0.H || v33 == Y0.L || v33 == Y0.M || v33 == Y0.N || v33 == Y0.Q) {
                        long v35 = zzatv0.zzd() + this.k - 8L;
                        stack0.add(new W0(v33, v35));
                        if(this.k == ((long)this.l)) {
                            this.d(v35);
                        }
                        else {
                            this.b();
                        }
                    }
                    else {
                        if(v33 == Y0.T || v33 == Y0.S || v33 == Y0.D || v33 == Y0.B || v33 == Y0.U || v33 == Y0.x || v33 == Y0.y || v33 == Y0.P || v33 == Y0.z || v33 == Y0.A || v33 == Y0.V || v33 == Y0.d0 || v33 == Y0.e0 || v33 == Y0.i0 || v33 == Y0.h0 || v33 == Y0.f0 || v33 == Y0.g0 || v33 == Y0.R || v33 == Y0.O || v33 == Y0.G0) {
                            if(this.l != 8) {
                                throw new zzarw("Leaf atom defines extended atom size (unsupported).");
                            }
                            long v34 = this.k;
                            if(v34 > 0x7FFFFFFFL) {
                                throw new zzarw("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            zzazh zzazh3 = new zzazh(((int)v34));
                            this.m = zzazh3;
                            System.arraycopy(zzazh2.zza, 0, zzazh3.zza, 0, 8);
                        }
                        else {
                            if(this.k > 0x7FFFFFFFL) {
                                throw new zzarw("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            this.m = null;
                        }
                        this.i = 1;
                    }
                    break;
                }
                case 1: {
                    int v36 = ((int)this.k) - this.l;
                    zzazh zzazh4 = this.m;
                    if(zzazh4 == null) {
                        zzatv0.zzi(v36, false);
                    }
                    else {
                        zzatv0.zzh(zzazh4.zza, 8, v36, false);
                        int v37 = this.j;
                        zzazh zzazh5 = this.m;
                        X0 x00 = new X0(zzazh5, v37);
                        long v38 = zzatv0.zzd();
                        if(!stack0.isEmpty()) {
                            ((W0)stack0.peek()).Q0.add(x00);
                        }
                        else if(v37 == Y0.B) {
                            zzazh5.zzv(8);
                            int v39 = zzazh5.zze();
                            zzazh5.zzw(4);
                            long v40 = zzazh5.zzm();
                            if(Y0.a(v39) == 0) {
                                v41 = zzazh5.zzm();
                                v42 = zzazh5.zzm();
                            }
                            else {
                                v41 = zzazh5.zzn();
                                v42 = zzazh5.zzn();
                            }
                            long v43 = zzazo.zzj(v41, 1000000L, v40);
                            zzazh5.zzw(2);
                            int v44 = zzazh5.zzj();
                            int[] arr_v = new int[v44];
                            long[] arr_v1 = new long[v44];
                            long[] arr_v2 = new long[v44];
                            long[] arr_v3 = new long[v44];
                            long v45 = v43;
                            long v46 = v42 + v38;
                            for(int v47 = 0; v47 < v44; ++v47) {
                                int v48 = zzazh5.zze();
                                if((v48 & 0x80000000) != 0) {
                                    throw new zzarw("Unhandled indirect reference");
                                }
                                long v49 = zzazh5.zzm();
                                arr_v[v47] = v48 & 0x7FFFFFFF;
                                arr_v1[v47] = v46;
                                arr_v3[v47] = v45;
                                v41 += v49;
                                v45 = zzazo.zzj(v41, 1000000L, v40);
                                arr_v2[v47] = v45 - arr_v3[v47];
                                zzazh5.zzw(4);
                                v46 += (long)arr_v[v47];
                            }
                            Pair pair0 = Pair.create(v43, new zzatu(arr_v, arr_v1, arr_v2, arr_v3));
                            ((Long)pair0.first).getClass();
                            this.t.zzc(((zzaud)pair0.second));
                            this.u = true;
                        }
                    }
                    this.d(zzatv0.zzd());
                    break;
                }
                default: {
                    long v1 = 0x7FFFFFFFFFFFFFFFL;
                    switch(v) {
                        case 2: {
                            int v2 = sparseArray0.size();
                            c1 c10 = null;
                            for(int v3 = 0; v3 < v2; ++v3) {
                                g1 g10 = ((c1)sparseArray0.valueAt(v3)).a;
                                if(g10.q) {
                                    long v4 = g10.c;
                                    if(v4 < v1) {
                                        v1 = v4;
                                        c10 = (c1)sparseArray0.valueAt(v3);
                                    }
                                }
                            }
                            if(c10 == null) {
                                this.i = 3;
                            }
                            else {
                                int v5 = (int)(v1 - zzatv0.zzd());
                                if(v5 < 0) {
                                    throw new zzarw("Offset to encryption data was negative.");
                                }
                                zzatv0.zzi(v5, false);
                                zzatv0.zzh(c10.a.p.zza, 0, c10.a.o, false);
                                c10.a.p.zzv(0);
                                c10.a.q = false;
                            }
                            break alab1;
                        }
                        case 3: {
                            if(this.p == null) {
                                int v6 = sparseArray0.size();
                                c1 c11 = null;
                                for(int v7 = 0; v7 < v6; ++v7) {
                                    c1 c12 = (c1)sparseArray0.valueAt(v7);
                                    int v8 = c12.g;
                                    g1 g11 = c12.a;
                                    if(v8 != g11.d) {
                                        long v9 = g11.f[v8];
                                        if(v9 < v1) {
                                            c11 = c12;
                                            v1 = v9;
                                        }
                                    }
                                }
                                if(c11 == null) {
                                    int v10 = (int)(this.n - zzatv0.zzd());
                                    if(v10 < 0) {
                                        throw new zzarw("Offset to end of mdat was negative.");
                                    }
                                    zzatv0.zzi(v10, false);
                                    this.b();
                                    break alab1;
                                }
                                else {
                                    int v11 = (int)(c11.a.f[c11.g] - zzatv0.zzd());
                                    if(v11 < 0) {
                                        Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        v11 = 0;
                                    }
                                    zzatv0.zzi(v11, false);
                                    this.p = c11;
                                }
                            }
                            c1 c13 = this.p;
                            g1 g12 = c13.a;
                            int v12 = c13.e;
                            int v13 = g12.h[v12];
                            this.q = v13;
                            if(g12.l) {
                                zzazh zzazh0 = g12.p;
                                int v14 = (g12.n == null ? c13.c.zzh[g12.a.a] : g12.n).zza;
                                boolean z = g12.m[v12];
                                this.d.zza[0] = (byte)((z ? 0x80 : 0) | v14);
                                this.d.zzv(0);
                                zzauf zzauf0 = c13.b;
                                zzauf0.zzb(this.d, 1);
                                zzauf0.zzb(zzazh0, v14);
                                if(z) {
                                    int v16 = zzazh0.zzj();
                                    zzazh0.zzw(-2);
                                    zzauf0.zzb(zzazh0, v16 * 6 + 2);
                                    v15 = v14 + 3 + 6 * v16;
                                }
                                else {
                                    v15 = v14 + 1;
                                }
                                this.r = v15;
                                v13 = this.q + v15;
                                this.q = v13;
                            }
                            else {
                                this.r = 0;
                            }
                            if(this.p.c.zzg == 1) {
                                this.q = v13 - 8;
                                zzatv0.zzi(8, false);
                            }
                            this.i = 4;
                            this.s = 0;
                        }
                    }
                    g1 g13 = this.p.a;
                    zzavl zzavl0 = this.p.c;
                    int v17 = this.p.e;
                    int v18 = zzavl0.zzk;
                    zzauf zzauf1 = this.p.b;
                    if(v18 == 0) {
                        while(true) {
                            int v19 = this.r;
                            int v20 = this.q;
                            if(v19 >= v20) {
                                break;
                            }
                            int v21 = zzauf1.zzd(zzatv0, v20 - v19, false);
                            this.r += v21;
                        }
                    }
                    else {
                        zzazh zzazh1 = this.c;
                        byte[] arr_b = zzazh1.zza;
                        arr_b[0] = 0;
                        arr_b[1] = 0;
                        arr_b[2] = 0;
                        while(this.r < this.q) {
                            int v22 = this.s;
                            if(v22 == 0) {
                                zzatv0.zzh(arr_b, 4 - v18, v18 + 1, false);
                                zzazh1.zzv(0);
                                this.s = zzazh1.zzi() - 1;
                                this.b.zzv(0);
                                zzauf1.zzb(this.b, 4);
                                zzauf1.zzb(zzazh1, 1);
                                this.r += 5;
                                this.q += 4 - v18;
                            }
                            else {
                                int v23 = zzauf1.zzd(zzatv0, v22, false);
                                this.r += v23;
                                this.s -= v23;
                            }
                        }
                    }
                    long v24 = (g13.j[v17] + ((long)g13.i[v17])) * 1000L;
                    boolean z1 = g13.l;
                    int v25 = g13.k[v17];
                    if(z1) {
                        zzavm0 = g13.n == null ? zzavl0.zzh[g13.a.a] : g13.n;
                        c1 c14 = this.p;
                        zzaue0 = zzavm0 == c14.i ? c14.h : new zzaue(1, zzavm0.zzb);
                    }
                    else {
                        zzavm0 = null;
                        zzaue0 = null;
                    }
                    this.p.h = zzaue0;
                    this.p.i = zzavm0;
                    zzauf1.zzc(v24, v25, this.q, 0, zzaue0);
                    LinkedList linkedList0 = this.h;
                    if(linkedList0.isEmpty()) {
                        c1 c15 = this.p;
                        ++c15.e;
                        int v26 = c15.f + 1;
                        c15.f = v26;
                        int v27 = c15.g;
                        if(v26 == g13.g[v27]) {
                            c15.g = v27 + 1;
                            c15.f = 0;
                            this.p = null;
                        }
                        this.i = 3;
                        return 0;
                    }
                    linkedList0.removeFirst().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final boolean zzg(zzatv zzatv0) throws IOException, InterruptedException {
        return f1.a(zzatv0, true);
    }
}

