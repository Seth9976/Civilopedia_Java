package com.google.android.gms.internal.ads;

import A.f;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class zzaej implements zzyr {
    public zzyu A;
    public zzzy[] B;
    public zzzy[] C;
    public boolean D;
    public static final byte[] E;
    public static final zzad F;
    public final List a;
    public final SparseArray b;
    public final zzdy c;
    public final zzdy d;
    public final zzdy e;
    public final byte[] f;
    public final zzdy g;
    public final zzabe h;
    public final zzdy i;
    public final ArrayDeque j;
    public final ArrayDeque k;
    public int l;
    public int m;
    public long n;
    public int o;
    public zzdy p;
    public long q;
    public int r;
    public long s;
    public long t;
    public long u;
    public D v;
    public int w;
    public int x;
    public int y;
    public boolean z;
    public static final zzyy zza;

    static {
        zzaej.zza = zzaef.zza;
        zzaej.E = new byte[]{-94, 57, 0x4F, 82, 90, -101, 0x4F, 20, -94, 68, 108, 66, 0x7C, 100, (byte)0x8D, -12};
        zzab zzab0 = new zzab();
        zzab0.zzS("application/x-emsg");
        zzaej.F = zzab0.zzY();
    }

    public zzaej() {
        this(0, null);
    }

    public zzaej(int v, zzee zzee0) {
        List list0 = Collections.emptyList();
        super();
        this.a = Collections.unmodifiableList(list0);
        this.h = new zzabe();
        this.i = new zzdy(16);
        this.c = new zzdy(zzzo.zza);
        this.d = new zzdy(5);
        this.e = new zzdy();
        byte[] arr_b = new byte[16];
        this.f = arr_b;
        this.g = new zzdy(arr_b);
        this.j = new ArrayDeque();
        this.k = new ArrayDeque();
        this.b = new SparseArray();
        this.t = 0x8000000000000001L;
        this.s = 0x8000000000000001L;
        this.u = 0x8000000000000001L;
        this.A = zzyu.zza;
        this.B = new zzzy[0];
        this.C = new zzzy[0];
    }

    public static zzv a(ArrayList arrayList0) {
        int v = arrayList0.size();
        List list0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            t t0 = (t)arrayList0.get(v1);
            if(t0.a == 0x70737368) {
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                byte[] arr_b = t0.b.zzH();
                UUID uUID0 = zzaeq.zza(arr_b);
                if(uUID0 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
                else {
                    ((ArrayList)list0).add(new zzu(uUID0, null, "video/mp4", arr_b));
                }
            }
        }
        return list0 == null ? null : new zzv(list0);
    }

    public final void b() {
        this.l = 0;
        this.o = 0;
    }

    public static void c(zzdy zzdy0, int v, G g0) {
        zzdy0.zzF(v + 8);
        int v1 = zzdy0.zze();
        if((v1 & 1) != 0) {
            throw zzbp.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        int v2 = zzdy0.zzn();
        if(v2 == 0) {
            Arrays.fill(g0.l, 0, g0.e, false);
            return;
        }
        int v3 = g0.e;
        if(v2 != v3) {
            throw zzbp.zza(("Senc sample count " + v2 + " is different from fragment sample count" + v3), null);
        }
        Arrays.fill(g0.l, 0, v2, (v1 & 2) != 0);
        g0.n.zzC(zzdy0.zza());
        g0.k = true;
        g0.o = true;
        zzdy0.zzB(g0.n.zzH(), 0, g0.n.zzd());
        g0.n.zzF(0);
        g0.o = false;
    }

    public final void d(long v) {
        zzaej zzaej2;
        zzaej zzaej1;
        byte[] arr_b2;
        int v56;
        SparseArray sparseArray4;
        int v51;
        ArrayList arrayList9;
        int v50;
        G g3;
        G g2;
        int v48;
        int v47;
        int v46;
        B b4;
        int v45;
        int v44;
        int v43;
        int v37;
        long v36;
        int v35;
        ArrayList arrayList7;
        s s3;
        ArrayList arrayList6;
        SparseArray sparseArray3;
        int v28;
        int v27;
        int v26;
        ArrayList arrayList5;
        B b1;
        B b0;
        zzaej zzaej0 = this;
        while(true) {
            ArrayDeque arrayDeque0 = zzaej0.j;
            if(arrayDeque0.isEmpty() || ((s)arrayDeque0.peek()).b != v) {
                break;
            }
            s s0 = (s)arrayDeque0.pop();
            int v1 = s0.a;
            SparseArray sparseArray0 = zzaej0.b;
            ArrayList arrayList0 = s0.c;
            if(v1 == 0x6D6F6F76) {
                zzv zzv0 = zzaej.a(arrayList0);
                s s1 = s0.c(0x6D766578);
                s1.getClass();
                SparseArray sparseArray1 = new SparseArray();
                ArrayList arrayList1 = s1.c;
                int v2 = arrayList1.size();
                long v3 = 0x8000000000000001L;
                for(int v4 = 0; v4 < v2; ++v4) {
                    Object object0 = arrayList1.get(v4);
                    int v5 = ((t)object0).a;
                    zzdy zzdy0 = ((t)object0).b;
                    if(v5 == 0x74726578) {
                        zzdy0.zzF(12);
                        Pair pair0 = Pair.create(zzdy0.zze(), new B(zzdy0.zze() - 1, zzdy0.zze(), zzdy0.zze(), zzdy0.zze()));
                        sparseArray1.put(((int)(((Integer)pair0.first))), ((B)pair0.second));
                    }
                    else if(v5 == 1835362404) {
                        zzdy0.zzF(8);
                        v3 = u.a(zzdy0.zze()) == 0 ? zzdy0.zzs() : zzdy0.zzt();
                    }
                }
                SparseArray sparseArray2 = sparseArray1;
                ArrayList arrayList2 = A.a(s0, new zzzg(), v3, zzv0, false, new zzaeg(zzaej0));
                int v6 = arrayList2.size();
                if(sparseArray0.size() == 0) {
                    for(int v7 = 0; v7 < v6; ++v7) {
                        H h0 = (H)arrayList2.get(v7);
                        zzaet zzaet0 = h0.a;
                        zzzy zzzy0 = zzaej0.A.zzv(v7, zzaet0.zzb);
                        int v8 = zzaet0.zza;
                        if(sparseArray2.size() == 1) {
                            b0 = (B)sparseArray2.valueAt(0);
                        }
                        else {
                            b0 = (B)sparseArray2.get(v8);
                            b0.getClass();
                        }
                        D d0 = new D(zzzy0, h0, b0);
                        sparseArray0.put(zzaet0.zza, d0);
                        zzaej0.t = Math.max(zzaej0.t, zzaet0.zze);
                    }
                    zzaej0.A.zzB();
                }
                else {
                    zzcw.zzf(sparseArray0.size() == v6);
                    for(int v9 = 0; v9 < v6; ++v9) {
                        H h1 = (H)arrayList2.get(v9);
                        D d1 = (D)sparseArray0.get(h1.a.zza);
                        int v10 = h1.a.zza;
                        if(sparseArray2.size() == 1) {
                            b1 = (B)sparseArray2.valueAt(0);
                        }
                        else {
                            b1 = (B)sparseArray2.get(v10);
                            b1.getClass();
                        }
                        d1.d = h1;
                        d1.e = b1;
                        d1.a.zzk(h1.a.zzf);
                        d1.c();
                    }
                }
            }
            else {
                if(v1 == 0x6D6F6F66) {
                    ArrayList arrayList3 = s0.d;
                    int v11 = arrayList3.size();
                    int v12 = 0;
                    while(v12 < v11) {
                        s s2 = (s)arrayList3.get(v12);
                        if(s2.a == 1953653094) {
                            t t0 = s2.d(0x74666864);
                            t0.getClass();
                            zzdy zzdy1 = t0.b;
                            zzdy1.zzF(8);
                            int v13 = zzdy1.zze();
                            D d2 = (D)sparseArray0.get(zzdy1.zze());
                            if(d2 == null) {
                                d2 = null;
                            }
                            else {
                                G g0 = d2.b;
                                if((v13 & 1) != 0) {
                                    long v14 = zzdy1.zzt();
                                    g0.b = v14;
                                    g0.c = v14;
                                }
                                B b2 = d2.e;
                                g0.a = new B(((v13 & 2) == 0 ? b2.a : zzdy1.zze() - 1), ((v13 & 8) == 0 ? b2.b : zzdy1.zze()), ((v13 & 16) == 0 ? b2.c : zzdy1.zze()), ((v13 & 0x20) == 0 ? b2.d : zzdy1.zze()));
                            }
                            if(d2 != null) {
                                G g1 = d2.b;
                                long v15 = g1.p;
                                boolean z = g1.q;
                                d2.c();
                                d2.l = true;
                                t t1 = s2.d(0x74666474);
                                if(t1 == null) {
                                    g1.p = v15;
                                    g1.q = z;
                                }
                                else {
                                    t1.b.zzF(8);
                                    g1.p = u.a(t1.b.zze()) == 1 ? t1.b.zzt() : t1.b.zzs();
                                    g1.q = true;
                                }
                                ArrayList arrayList4 = s2.c;
                                int v16 = arrayList4.size();
                                int v18 = 0;
                                int v19 = 0;
                                for(int v17 = 0; v17 < v16; ++v17) {
                                    t t2 = (t)arrayList4.get(v17);
                                    if(t2.a == 0x7472756E) {
                                        t2.b.zzF(12);
                                        int v20 = t2.b.zzn();
                                        if(v20 > 0) {
                                            v19 += v20;
                                            ++v18;
                                        }
                                    }
                                }
                                arrayList5 = arrayList3;
                                d2.h = 0;
                                d2.g = 0;
                                d2.f = 0;
                                g1.d = v18;
                                g1.e = v19;
                                if(g1.g.length < v18) {
                                    g1.f = new long[v18];
                                    g1.g = new int[v18];
                                }
                                if(g1.h.length < v19) {
                                    int v21 = v19 * 0x7D / 100;
                                    g1.h = new int[v21];
                                    g1.i = new long[v21];
                                    g1.j = new boolean[v21];
                                    g1.l = new boolean[v21];
                                }
                                int v22 = 0;
                                int v23 = 0;
                                int v24 = 0;
                                while(v22 < v16) {
                                    t t3 = (t)arrayList4.get(v22);
                                    if(t3.a == 0x7472756E) {
                                        zzdy zzdy2 = t3.b;
                                        zzdy2.zzF(8);
                                        int v25 = zzdy2.zze();
                                        H h2 = d2.d;
                                        v26 = v11;
                                        B b3 = g1.a;
                                        v27 = v16;
                                        int[] arr_v = g1.g;
                                        arr_v[v24] = zzdy2.zzn();
                                        long[] arr_v1 = g1.f;
                                        v28 = v12;
                                        sparseArray3 = sparseArray0;
                                        long v29 = g1.b;
                                        arr_v1[v24] = v29;
                                        if((v25 & 1) == 0) {
                                            s3 = s2;
                                            arrayList7 = arrayList4;
                                            arrayList6 = arrayList0;
                                        }
                                        else {
                                            arrayList6 = arrayList0;
                                            s3 = s2;
                                            arrayList7 = arrayList4;
                                            arr_v1[v24] = v29 + ((long)zzdy2.zze());
                                        }
                                        int v30 = v25 & 4;
                                        int v31 = v30 == 0 ? b3.d : zzdy2.zze();
                                        int v32 = v25 & 0x100;
                                        int v33 = v25 & 0x200;
                                        int v34 = v25 & 0x400;
                                        zzaet zzaet1 = h2.a;
                                        long[] arr_v2 = zzaet1.zzh;
                                        if(arr_v2 == null) {
                                            v35 = v31;
                                        }
                                        else {
                                            v35 = v31;
                                            if(arr_v2.length == 1 && arr_v2[0] == 0L) {
                                                v36 = zzaet1.zzi[0];
                                                goto label_180;
                                            }
                                        }
                                        v36 = 0L;
                                    label_180:
                                        int[] arr_v3 = g1.h;
                                        long[] arr_v4 = g1.i;
                                        boolean[] arr_z = g1.j;
                                        v37 = v22;
                                        int v38 = g1.g[v24] + v23;
                                        int v39 = v25 & 0x800;
                                        long v40 = zzaet1.zzc;
                                        long v41 = g1.p;
                                        while(v23 < v38) {
                                            int v42 = v32 == 0 ? b3.b : zzdy2.zze();
                                            if(v42 < 0) {
                                                throw zzbp.zza(("Unexpected negative value: " + v42), null);
                                            }
                                            if(v33 == 0) {
                                                v43 = v32;
                                                v44 = b3.c;
                                            }
                                            else {
                                                v43 = v32;
                                                v44 = zzdy2.zze();
                                            }
                                            if(v44 < 0) {
                                                throw zzbp.zza(("Unexpected negative value: " + v44), null);
                                            }
                                            if(v34 == 0) {
                                                if(v23 == 0) {
                                                    if(v30 == 0) {
                                                        v23 = 0;
                                                    }
                                                    else {
                                                        v45 = v35;
                                                        v23 = 0;
                                                        goto label_208;
                                                    }
                                                }
                                                v45 = b3.d;
                                            }
                                            else {
                                                v45 = zzdy2.zze();
                                            }
                                        label_208:
                                            if(v39 == 0) {
                                                b4 = b3;
                                                v46 = v33;
                                                v47 = v42;
                                                v48 = 0;
                                            }
                                            else {
                                                b4 = b3;
                                                v46 = v33;
                                                v47 = v42;
                                                v48 = zzdy2.zze();
                                            }
                                            long v49 = zzeg.zzw(((long)v48) + v41 - v36, 1000000L, v40);
                                            arr_v4[v23] = v49;
                                            if(g1.q) {
                                                g2 = g1;
                                            }
                                            else {
                                                g2 = g1;
                                                arr_v4[v23] = v49 + d2.d.h;
                                            }
                                            arr_v3[v23] = v44;
                                            arr_z[v23] = 1 == (v45 >> 16 & 1 ^ 1);
                                            v41 += (long)v47;
                                            ++v23;
                                            g1 = g2;
                                            v32 = v43;
                                            b3 = b4;
                                            v33 = v46;
                                        }
                                        g3 = g1;
                                        g3.p = v41;
                                        ++v24;
                                        v23 = v38;
                                    }
                                    else {
                                        v37 = v22;
                                        v26 = v11;
                                        g3 = g1;
                                        s3 = s2;
                                        arrayList7 = arrayList4;
                                        v27 = v16;
                                        arrayList6 = arrayList0;
                                        v28 = v12;
                                        sparseArray3 = sparseArray0;
                                    }
                                    g1 = g3;
                                    v22 = v37 + 1;
                                    v11 = v26;
                                    v16 = v27;
                                    sparseArray0 = sparseArray3;
                                    v12 = v28;
                                    arrayList0 = arrayList6;
                                    s2 = s3;
                                    arrayList4 = arrayList7;
                                }
                                v50 = v11;
                                G g4 = g1;
                                ArrayList arrayList8 = arrayList4;
                                arrayList9 = arrayList0;
                                v51 = v12;
                                sparseArray4 = sparseArray0;
                                H h3 = d2.d;
                                B b5 = g4.a;
                                b5.getClass();
                                zzaeu zzaeu0 = h3.a.zza(b5.a);
                                t t4 = s2.d(0x7361697A);
                                if(t4 != null) {
                                    zzaeu0.getClass();
                                    int v52 = zzaeu0.zzd;
                                    zzdy zzdy3 = t4.b;
                                    zzdy3.zzF(8);
                                    if((zzdy3.zze() & 1) == 1) {
                                        zzdy3.zzG(8);
                                    }
                                    int v53 = zzdy3.zzk();
                                    int v54 = zzdy3.zzn();
                                    int v55 = g4.e;
                                    if(v54 > v55) {
                                        throw zzbp.zza(("Saiz sample count " + v54 + " is greater than fragment sample count" + v55), null);
                                    }
                                    if(v53 == 0) {
                                        boolean[] arr_z1 = g4.l;
                                        v56 = 0;
                                        for(int v57 = 0; v57 < v54; ++v57) {
                                            int v58 = zzdy3.zzk();
                                            v56 += v58;
                                            arr_z1[v57] = v58 > v52;
                                        }
                                    }
                                    else {
                                        v56 = v53 * v54;
                                        Arrays.fill(g4.l, 0, v54, v53 > v52);
                                    }
                                    Arrays.fill(g4.l, v54, g4.e, false);
                                    if(v56 > 0) {
                                        g4.n.zzC(v56);
                                        g4.k = true;
                                        g4.o = true;
                                    }
                                }
                                t t5 = s2.d(0x7361696F);
                                if(t5 != null) {
                                    zzdy zzdy4 = t5.b;
                                    zzdy4.zzF(8);
                                    int v59 = zzdy4.zze();
                                    if((v59 & 1) == 1) {
                                        zzdy4.zzG(8);
                                    }
                                    int v60 = zzdy4.zzn();
                                    if(v60 != 1) {
                                        throw zzbp.zza(("Unexpected saio entry count: " + v60), null);
                                    }
                                    g4.c += (u.a(v59) == 0 ? zzdy4.zzs() : zzdy4.zzt());
                                }
                                t t6 = s2.d(1936027235);
                                if(t6 != null) {
                                    zzaej.c(t6.b, 0, g4);
                                }
                                String s4 = zzaeu0 == null ? null : zzaeu0.zzb;
                                zzdy zzdy5 = null;
                                zzdy zzdy6 = null;
                                for(int v61 = 0; v61 < arrayList8.size(); ++v61) {
                                    t t7 = (t)arrayList8.get(v61);
                                    zzdy zzdy7 = t7.b;
                                    int v62 = t7.a;
                                    if(v62 == 0x73626770) {
                                        zzdy7.zzF(12);
                                        if(zzdy7.zze() == 1936025959) {
                                            zzdy5 = zzdy7;
                                        }
                                    }
                                    else if(v62 == 0x73677064) {
                                        zzdy7.zzF(12);
                                        if(zzdy7.zze() == 1936025959) {
                                            zzdy6 = zzdy7;
                                        }
                                    }
                                }
                                ArrayList arrayList10 = arrayList8;
                                if(zzdy5 != null && zzdy6 != null) {
                                    zzdy5.zzF(8);
                                    int v63 = zzdy5.zze();
                                    zzdy5.zzG(4);
                                    if(u.a(v63) == 1) {
                                        zzdy5.zzG(4);
                                    }
                                    if(zzdy5.zze() != 1) {
                                        throw zzbp.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzdy6.zzF(8);
                                    int v64 = u.a(zzdy6.zze());
                                    zzdy6.zzG(4);
                                    if(v64 == 1) {
                                        if(zzdy6.zzs() == 0L) {
                                            throw zzbp.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    }
                                    else if(v64 >= 2) {
                                        zzdy6.zzG(4);
                                    }
                                    if(zzdy6.zzs() != 1L) {
                                        throw zzbp.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzdy6.zzG(1);
                                    int v65 = zzdy6.zzk();
                                    int v66 = (v65 & 0xF0) >> 4;
                                    int v67 = v65 & 15;
                                    if(zzdy6.zzk() == 1) {
                                        int v68 = zzdy6.zzk();
                                        byte[] arr_b = new byte[16];
                                        zzdy6.zzB(arr_b, 0, 16);
                                        if(v68 == 0) {
                                            int v69 = zzdy6.zzk();
                                            byte[] arr_b1 = new byte[v69];
                                            zzdy6.zzB(arr_b1, 0, v69);
                                            arr_b2 = arr_b1;
                                        }
                                        else {
                                            arr_b2 = null;
                                        }
                                        g4.k = true;
                                        g4.m = new zzaeu(true, s4, v68, arr_b, v66, v67, arr_b2);
                                    }
                                }
                                int v70 = arrayList10.size();
                                for(int v71 = 0; v71 < v70; ++v71) {
                                    t t8 = (t)arrayList10.get(v71);
                                    if(t8.a == 1970628964) {
                                        zzdy zzdy8 = t8.b;
                                        zzdy8.zzF(8);
                                        zzdy8.zzB(this.f, 0, 16);
                                        if(Arrays.equals(this.f, zzaej.E)) {
                                            zzaej.c(zzdy8, 16, g4);
                                        }
                                    }
                                }
                                zzaej1 = this;
                            }
                        }
                        else {
                            zzaej1 = zzaej0;
                            arrayList5 = arrayList3;
                            v50 = v11;
                            arrayList9 = arrayList0;
                            v51 = v12;
                            sparseArray4 = sparseArray0;
                        }
                        v12 = v51 + 1;
                        zzaej0 = zzaej1;
                        arrayList3 = arrayList5;
                        v11 = v50;
                        sparseArray0 = sparseArray4;
                        arrayList0 = arrayList9;
                    }
                    zzaej2 = zzaej0;
                    SparseArray sparseArray5 = sparseArray0;
                    zzv zzv1 = zzaej.a(arrayList0);
                    if(zzv1 != null) {
                        int v73 = sparseArray5.size();
                        for(int v74 = 0; v74 < v73; ++v74) {
                            D d3 = (D)sparseArray5.valueAt(v74);
                            zzaeu zzaeu1 = d3.d.a.zza(d3.b.a.a);
                            zzv zzv2 = zzv1.zzb((zzaeu1 == null ? null : zzaeu1.zzb));
                            zzab zzab0 = d3.d.a.zzf.zzb();
                            zzab0.zzB(zzv2);
                            zzad zzad0 = zzab0.zzY();
                            d3.a.zzk(zzad0);
                        }
                    }
                    SparseArray sparseArray6 = sparseArray5;
                    if(zzaej2.s != 0x8000000000000001L) {
                        int v75 = sparseArray6.size();
                        for(int v72 = 0; v72 < v75; ++v72) {
                            D d4 = (D)sparseArray6.valueAt(v72);
                            long v76 = zzaej2.s;
                            for(int v77 = d4.f; true; ++v77) {
                                G g5 = d4.b;
                                if(v77 >= g5.e || g5.i[v77] >= v76) {
                                    break;
                                }
                                if(g5.j[v77]) {
                                    d4.i = v77;
                                }
                            }
                        }
                        zzaej2.s = 0x8000000000000001L;
                    }
                }
                else {
                    zzaej2 = zzaej0;
                    if(!arrayDeque0.isEmpty()) {
                        ((s)arrayDeque0.peek()).d.add(s0);
                    }
                }
                zzaej0 = zzaej2;
            }
        }
        this.b();
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        int v23;
        int v21;
        byte[] arr_b1;
        int v20;
        boolean z1;
        zzdy zzdy2;
        int v10;
        long v48;
        long v47;
        String s4;
        String s3;
        long v46;
        long v44;
        long v33;
        long v32;
        while(true) {
            int v = this.l;
            ArrayDeque arrayDeque0 = this.j;
            SparseArray sparseArray0 = this.b;
            if(v != 0) {
                long v1 = 0x7FFFFFFFFFFFFFFFL;
                ArrayDeque arrayDeque1 = this.k;
                switch(v) {
                    case 1: {
                        int v27 = ((int)this.n) - this.o;
                        zzdy zzdy3 = this.p;
                        if(zzdy3 == null) {
                            ((zzyl)zzys0).zzo(v27, false);
                        }
                        else {
                            ((zzyl)zzys0).zzn(zzdy3.zzH(), 8, v27, false);
                            int v28 = this.m;
                            t t0 = new t(v28, zzdy3);
                            long v29 = zzys0.zzf();
                            if(!arrayDeque0.isEmpty()) {
                                ((s)arrayDeque0.peek()).c.add(t0);
                            }
                            else if(v28 == 1936286840) {
                                zzdy3.zzF(8);
                                int v30 = zzdy3.zze();
                                zzdy3.zzG(4);
                                long v31 = zzdy3.zzs();
                                if(u.a(v30) == 0) {
                                    v32 = zzdy3.zzs();
                                    v33 = zzdy3.zzs();
                                }
                                else {
                                    v32 = zzdy3.zzt();
                                    v33 = zzdy3.zzt();
                                }
                                long v34 = v33 + v29;
                                long v35 = zzeg.zzw(v32, 1000000L, v31);
                                zzdy3.zzG(2);
                                int v36 = zzdy3.zzo();
                                int[] arr_v = new int[v36];
                                long[] arr_v1 = new long[v36];
                                long[] arr_v2 = new long[v36];
                                long[] arr_v3 = new long[v36];
                                long v37 = v35;
                                int v38 = 0;
                                while(v38 < v36) {
                                    int v39 = zzdy3.zze();
                                    if((v39 & 0x80000000) != 0) {
                                        throw zzbp.zza("Unhandled indirect reference", null);
                                    }
                                    long v40 = zzdy3.zzs();
                                    arr_v[v38] = v39 & 0x7FFFFFFF;
                                    arr_v1[v38] = v34;
                                    arr_v3[v38] = v37;
                                    long v41 = v32 + v40;
                                    v37 = zzeg.zzw(v41, 1000000L, v31);
                                    arr_v2[v38] = v37 - arr_v3[v38];
                                    zzdy3.zzG(4);
                                    v34 += (long)arr_v[v38];
                                    ++v38;
                                    v32 = v41;
                                }
                                Pair pair0 = Pair.create(v35, new zzyj(arr_v, arr_v1, arr_v2, arr_v3));
                                this.u = (long)(((Long)pair0.first));
                                this.A.zzL(((zzzu)pair0.second));
                                this.D = true;
                            }
                            else if(v28 == 1701671783 && this.B.length != 0) {
                                zzdy3.zzF(8);
                                int v42 = u.a(zzdy3.zze());
                                switch(v42) {
                                    case 0: {
                                        String s1 = zzdy3.zzv('\u0000');
                                        s1.getClass();
                                        String s2 = zzdy3.zzv('\u0000');
                                        s2.getClass();
                                        long v43 = zzdy3.zzs();
                                        v44 = zzeg.zzw(zzdy3.zzs(), 1000000L, v43);
                                        long v45 = this.u == 0x8000000000000001L ? 0x8000000000000001L : this.u + v44;
                                        v46 = zzeg.zzw(zzdy3.zzs(), 1000L, v43);
                                        s3 = s1;
                                        s4 = s2;
                                        v47 = zzdy3.zzs();
                                        v48 = v45;
                                        break;
                                    }
                                    case 1: {
                                        long v49 = zzdy3.zzs();
                                        long v50 = zzeg.zzw(zzdy3.zzt(), 1000000L, v49);
                                        long v51 = zzeg.zzw(zzdy3.zzs(), 1000L, v49);
                                        long v52 = zzdy3.zzs();
                                        String s5 = zzdy3.zzv('\u0000');
                                        s5.getClass();
                                        String s6 = zzdy3.zzv('\u0000');
                                        s6.getClass();
                                        v46 = v51;
                                        v47 = v52;
                                        s3 = s5;
                                        s4 = s6;
                                        v48 = v50;
                                        v44 = 0x8000000000000001L;
                                        break;
                                    }
                                    default: {
                                        f.p(v42, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                                        goto label_277;
                                    }
                                }
                                byte[] arr_b2 = new byte[zzdy3.zza()];
                                zzdy3.zzB(arr_b2, 0, zzdy3.zza());
                                zzabd zzabd0 = new zzabd(s3, s4, v46, v47, arr_b2);
                                zzdy zzdy4 = new zzdy(this.h.zza(zzabd0));
                                int v53 = zzdy4.zza();
                                zzzy[] arr_zzzy1 = this.B;
                                for(int v54 = 0; v54 < arr_zzzy1.length; ++v54) {
                                    zzzy zzzy1 = arr_zzzy1[v54];
                                    zzdy4.zzF(0);
                                    zzzy1.zzq(zzdy4, v53);
                                }
                                if(v48 == 0x8000000000000001L) {
                                    arrayDeque1.addLast(new C(v44, true, v53));
                                    this.r += v53;
                                }
                                else if(arrayDeque1.isEmpty()) {
                                    zzzy[] arr_zzzy2 = this.B;
                                    for(int v55 = 0; v55 < arr_zzzy2.length; ++v55) {
                                        arr_zzzy2[v55].zzs(v48, 1, v53, 0, null);
                                    }
                                }
                                else {
                                    arrayDeque1.addLast(new C(v48, false, v53));
                                    this.r += v53;
                                }
                            }
                        }
                    label_277:
                        this.d(zzys0.zzf());
                        continue;
                    }
                    case 2: {
                        int v56 = sparseArray0.size();
                        D d3 = null;
                        for(int v57 = 0; v57 < v56; ++v57) {
                            G g2 = ((D)sparseArray0.valueAt(v57)).b;
                            if(g2.o) {
                                long v58 = g2.c;
                                if(v58 < v1) {
                                    d3 = (D)sparseArray0.valueAt(v57);
                                    v1 = v58;
                                }
                            }
                        }
                        if(d3 == null) {
                            this.l = 3;
                        }
                        else {
                            int v59 = (int)(v1 - zzys0.zzf());
                            if(v59 < 0) {
                                throw zzbp.zza("Offset to encryption data was negative.", null);
                            }
                            ((zzyl)zzys0).zzo(v59, false);
                            ((zzyl)zzys0).zzn(d3.b.n.zzH(), 0, d3.b.n.zzd(), false);
                            d3.b.n.zzF(0);
                            d3.b.o = false;
                        }
                        continue;
                    }
                    default: {
                        D d0 = this.v;
                        if(d0 == null) {
                            int v2 = sparseArray0.size();
                            long v3 = 0x7FFFFFFFFFFFFFFFL;
                            D d1 = null;
                            for(int v4 = 0; v4 < v2; ++v4) {
                                D d2 = (D)sparseArray0.valueAt(v4);
                                boolean z = d2.l;
                                if(z || d2.f != d2.d.b) {
                                    G g0 = d2.b;
                                    if(!z || d2.h != g0.d) {
                                        long v5 = z ? g0.f[d2.h] : d2.d.c[d2.f];
                                        if(v5 < v3) {
                                            d1 = d2;
                                            v3 = v5;
                                        }
                                    }
                                }
                            }
                            if(d1 == null) {
                                int v6 = (int)(this.q - zzys0.zzf());
                                if(v6 < 0) {
                                    throw zzbp.zza("Offset to end of mdat was negative.", null);
                                }
                                ((zzyl)zzys0).zzo(v6, false);
                                this.b();
                                continue;
                            }
                            else {
                                int v7 = (int)((d1.l ? d1.b.f[d1.h] : d1.d.c[d1.f]) - zzys0.zzf());
                                if(v7 < 0) {
                                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    v7 = 0;
                                }
                                ((zzyl)zzys0).zzo(v7, false);
                                this.v = d1;
                                d0 = d1;
                            }
                        }
                        G g1 = d0.b;
                        if(this.l == 3) {
                            int v8 = d0.l ? g1.h[d0.f] : d0.d.d[d0.f];
                            this.w = v8;
                            if(d0.f < d0.i) {
                                ((zzyl)zzys0).zzo(v8, false);
                                zzaeu zzaeu0 = d0.b();
                                if(zzaeu0 != null) {
                                    zzdy zzdy0 = g1.n;
                                    int v9 = zzaeu0.zzd;
                                    if(v9 != 0) {
                                        zzdy0.zzG(v9);
                                    }
                                    if(g1.k && g1.l[d0.f]) {
                                        zzdy0.zzG(zzdy0.zzo() * 6);
                                    }
                                }
                                if(!d0.d()) {
                                    this.v = null;
                                }
                                this.l = 3;
                                return 0;
                            }
                            if(d0.d.a.zzg == 1) {
                                this.w = v8 - 8;
                                ((zzyl)zzys0).zzo(8, false);
                            }
                            if("audio/ac4".equals(d0.d.a.zzf.zzm)) {
                                this.x = d0.a(this.w, 7);
                                zzxz.zzb(this.w, this.g);
                                zzzw.zzb(d0.a, this.g, 7);
                                v10 = this.x + 7;
                            }
                            else {
                                v10 = d0.a(this.w, 0);
                            }
                            this.x = v10;
                            this.w += v10;
                            this.l = 4;
                            this.y = 0;
                        }
                        H h0 = d0.d;
                        long v11 = d0.l ? g1.i[d0.f] : h0.f[d0.f];
                        zzaet zzaet0 = h0.a;
                        int v12 = zzaet0.zzj;
                        zzzy zzzy0 = d0.a;
                        if(v12 == 0) {
                            while(true) {
                                int v13 = this.x;
                                int v14 = this.w;
                                if(v13 >= v14) {
                                    break;
                                }
                                int v15 = zzzw.zza(zzzy0, zzys0, v14 - v13, false);
                                this.x += v15;
                            }
                        }
                        else {
                            zzdy zzdy1 = this.d;
                            byte[] arr_b = zzdy1.zzH();
                            arr_b[0] = 0;
                            arr_b[1] = 0;
                            arr_b[2] = 0;
                            int v16 = 4 - v12;
                            while(this.x < this.w) {
                                int v17 = this.y;
                                if(v17 == 0) {
                                    ((zzyl)zzys0).zzn(arr_b, v16, v12 + 1, false);
                                    zzdy1.zzF(0);
                                    int v18 = zzdy1.zze();
                                    if(v18 <= 0) {
                                        throw zzbp.zza("Invalid NAL length", null);
                                    }
                                    this.y = v18 - 1;
                                    this.c.zzF(0);
                                    zzzw.zzb(zzzy0, this.c, 4);
                                    zzzw.zzb(zzzy0, zzdy1, 1);
                                    if(this.C.length > 0) {
                                        String s = zzaet0.zzf.zzm;
                                        int v19 = arr_b[4];
                                        if("video/avc".equals(s)) {
                                            zzdy2 = zzdy1;
                                            if((v19 & 0x1F) == 6) {
                                                z1 = true;
                                                goto label_115;
                                            }
                                        }
                                        else {
                                            zzdy2 = zzdy1;
                                        }
                                        if("video/hevc".equals(s) && (v19 & 0x7E) >> 1 == 39) {
                                            z1 = true;
                                            goto label_115;
                                        }
                                    }
                                    else {
                                        zzdy2 = zzdy1;
                                    }
                                    z1 = false;
                                label_115:
                                    this.z = z1;
                                    this.x += 5;
                                    this.w += v16;
                                    zzdy1 = zzdy2;
                                }
                                else {
                                    if(this.z) {
                                        this.e.zzC(v17);
                                        v20 = v16;
                                        arr_b1 = arr_b;
                                        ((zzyl)zzys0).zzn(this.e.zzH(), 0, this.y, false);
                                        zzzw.zzb(zzzy0, this.e, this.y);
                                        v21 = this.y;
                                        int v22 = zzzo.zzb(this.e.zzH(), this.e.zzd());
                                        this.e.zzF(((int)"video/hevc".equals(zzaet0.zzf.zzm)));
                                        this.e.zzE(v22);
                                        zzyi.zza(v11, this.e, this.C);
                                    }
                                    else {
                                        v20 = v16;
                                        arr_b1 = arr_b;
                                        v21 = zzzw.zza(zzzy0, zzys0, v17, false);
                                    }
                                    this.x += v21;
                                    this.y -= v21;
                                    v16 = v20;
                                    arr_b = arr_b1;
                                }
                            }
                        }
                        if(d0.l) {
                            v23 = g1.j[d0.f] ? 1 : 0;
                        }
                        else {
                            v23 = d0.d.g[d0.f];
                        }
                        int v24 = d0.b() == null ? v23 : 0x40000000 | v23;
                        zzaeu zzaeu1 = d0.b();
                        zzzy0.zzs(v11, v24, this.w, 0, (zzaeu1 == null ? null : zzaeu1.zzc));
                        while(!arrayDeque1.isEmpty()) {
                            C c0 = (C)arrayDeque1.removeFirst();
                            this.r -= c0.c;
                            long v25 = c0.b ? c0.a + v11 : c0.a;
                            zzzy[] arr_zzzy = this.B;
                            for(int v26 = 0; v26 < arr_zzzy.length; ++v26) {
                                arr_zzzy[v26].zzs(v25, 1, c0.c, this.r, null);
                            }
                        }
                        if(!d0.d()) {
                            this.v = null;
                        }
                        this.l = 3;
                        return 0;
                    }
                }
            }
            zzdy zzdy5 = this.i;
            if(this.o == 0) {
                if(!zzys0.zzn(zzdy5.zzH(), 0, 8, true)) {
                    return -1;
                }
                this.o = 8;
                zzdy5.zzF(0);
                this.n = zzdy5.zzs();
                this.m = zzdy5.zze();
            }
            long v60 = this.n;
            if(v60 == 1L) {
                ((zzyl)zzys0).zzn(zzdy5.zzH(), 8, 8, false);
                this.o += 8;
                this.n = zzdy5.zzt();
            }
            else if(v60 == 0L) {
                long v61 = zzys0.zzd();
                if(v61 == -1L) {
                    v61 = arrayDeque0.isEmpty() ? -1L : ((s)arrayDeque0.peek()).b;
                }
                if(v61 != -1L) {
                    this.n = v61 - zzys0.zzf() + ((long)this.o);
                }
            }
            long v62 = (long)this.o;
            if(this.n < v62) {
                break;
            }
            long v63 = zzys0.zzf() - v62;
            if((this.m == 1835295092 || this.m == 0x6D6F6F66) && !this.D) {
                this.A.zzL(new zzzt(this.t, v63));
                this.D = true;
            }
            if(this.m == 0x6D6F6F66) {
                int v64 = sparseArray0.size();
                for(int v65 = 0; v65 < v64; ++v65) {
                    G g3 = ((D)sparseArray0.valueAt(v65)).b;
                    g3.c = v63;
                    g3.b = v63;
                }
            }
            int v66 = this.m;
            switch(v66) {
                case 1835295092: {
                    this.v = null;
                    this.q = v63 + this.n;
                    this.l = 2;
                    break;
                }
                case 1701082227: 
                case 0x6D646961: 
                case 1835626086: 
                case 0x6D6F6F66: 
                case 0x6D6F6F76: 
                case 0x6D766578: 
                case 1937007212: 
                case 1953653094: 
                case 1953653099: {
                    long v68 = zzys0.zzf() + this.n - 8L;
                    arrayDeque0.push(new s(v66, v68));
                    if(this.n == ((long)this.o)) {
                        this.d(v68);
                    }
                    else {
                        goto label_364;
                    }
                    break;
                }
                case 0x636F3634: 
                case 0x63747473: 
                case 1701606260: 
                case 1701671783: 
                case 0x68646C72: 
                case 0x6D646864: 
                case 1835362404: 
                case 0x6D766864: 
                case 0x70737368: 
                case 0x7361696F: 
                case 0x7361697A: 
                case 0x73626770: 
                case 1936027235: 
                case 0x73677064: 
                case 1936286840: 
                case 1937007471: 
                case 1937011555: 
                case 1937011556: 
                case 1937011571: 
                case 1937011578: 
                case 1937011827: 
                case 1937013298: 
                case 0x74666474: 
                case 0x74666864: 
                case 0x746B6864: 
                case 0x74726578: 
                case 0x7472756E: 
                case 1970628964: {
                    if(this.o != 8) {
                        throw zzbp.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    long v67 = this.n;
                    if(v67 > 0x7FFFFFFFL) {
                        throw zzbp.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzdy zzdy6 = new zzdy(((int)v67));
                    System.arraycopy(zzdy5.zzH(), 0, zzdy6.zzH(), 0, 8);
                    this.p = zzdy6;
                    this.l = 1;
                    break;
                }
                default: {
                    if(this.n > 0x7FFFFFFFL) {
                        throw zzbp.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.p = null;
                    this.l = 1;
                    break;
                }
            }
            continue;
        label_364:
            this.b();
        }
        throw zzbp.zzc("Atom size less than header length (unsupported).");
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.A = zzyu0;
        this.b();
        zzzy[] arr_zzzy = new zzzy[2];
        this.B = arr_zzzy;
        int v = 0;
        zzzy[] arr_zzzy1 = (zzzy[])zzeg.zzad(arr_zzzy, 0);
        this.B = arr_zzzy1;
        for(int v1 = 0; v1 < arr_zzzy1.length; ++v1) {
            arr_zzzy1[v1].zzk(zzaej.F);
        }
        List list0 = this.a;
        this.C = new zzzy[list0.size()];
        for(int v2 = 100; v < this.C.length; ++v2) {
            zzzy zzzy0 = this.A.zzv(v2, 3);
            zzzy0.zzk(((zzad)list0.get(v)));
            this.C[v] = zzzy0;
            ++v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        SparseArray sparseArray0 = this.b;
        int v2 = sparseArray0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((D)sparseArray0.valueAt(v3)).c();
        }
        this.k.clear();
        this.r = 0;
        this.s = v1;
        this.j.clear();
        this.b();
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        return h.G(zzys0, true);
    }
}

