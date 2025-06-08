package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map.Entry;
import java.util.Map;

public final class zzut extends zzcp {
    public final SparseArray a;
    public final SparseBooleanArray b;
    public static final zzut zzD;
    @Deprecated
    public static final zzut zzE;
    public static final zzl zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;

    static {
        zzut zzut0 = new zzut(new zzuv());
        zzut.zzD = zzut0;
        zzut.zzE = zzut0;
        zzut.zzF = zzur.zza;
    }

    public zzut(zzuv zzuv0) {
        super(zzuv0);
        this.zzG = zzuv0.k;
        this.zzH = false;
        this.zzI = zzuv0.l;
        this.zzJ = false;
        this.zzK = zzuv0.m;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = zzuv0.n;
        this.zzQ = false;
        this.zzR = zzuv0.o;
        this.a = zzuv0.p;
        this.b = zzuv0.q;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzut.class == class0 && super.equals(((zzut)object0)) && this.zzG == ((zzut)object0).zzG && this.zzI == ((zzut)object0).zzI && this.zzK == ((zzut)object0).zzK && this.zzP == ((zzut)object0).zzP && this.zzR == ((zzut)object0).zzR) {
                SparseBooleanArray sparseBooleanArray0 = this.b;
                int v = sparseBooleanArray0.size();
                SparseBooleanArray sparseBooleanArray1 = ((zzut)object0).b;
                if(sparseBooleanArray1.size() == v) {
                    for(int v1 = 0; v1 < v; ++v1) {
                        if(sparseBooleanArray1.indexOfKey(sparseBooleanArray0.keyAt(v1)) < 0) {
                            return false;
                        }
                    }
                    SparseArray sparseArray0 = this.a;
                    int v2 = sparseArray0.size();
                    SparseArray sparseArray1 = ((zzut)object0).a;
                    if(sparseArray1.size() == v2) {
                        for(int v3 = 0; v3 < v2; ++v3) {
                            int v4 = sparseArray1.indexOfKey(sparseArray0.keyAt(v3));
                            if(v4 < 0) {
                                return false;
                            }
                            Map map0 = (Map)sparseArray0.valueAt(v3);
                            Map map1 = (Map)sparseArray1.valueAt(v4);
                            if(map1.size() != map0.size()) {
                                return false;
                            }
                            for(Object object1: map0.entrySet()) {
                                zzty zzty0 = (zzty)((Map.Entry)object1).getKey();
                                if(!map1.containsKey(zzty0) || !zzeg.zzS(((Map.Entry)object1).getValue(), map1.get(zzty0))) {
                                    return false;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcp
    public final int hashCode() {
        return (((((super.hashCode() + 0x1F) * 0x1F + this.zzG) * 961 + this.zzI) * 961 + this.zzK) * 0x1B4D89F + this.zzP) * 961 + this.zzR;
    }

    public static zzut zzc(Context context0) {
        return new zzut(new zzuv(context0));
    }

    public final zzuv zzd() {
        return new zzuv(this);
    }

    @Deprecated
    public final zzux zze(int v, zzty zzty0) {
        Map map0 = (Map)this.a.get(v);
        return map0 == null ? null : ((zzux)map0.get(zzty0));
    }

    public final boolean zzf(int v) {
        return this.b.get(v);
    }

    @Deprecated
    public final boolean zzg(int v, zzty zzty0) {
        Map map0 = (Map)this.a.get(v);
        return map0 != null && map0.containsKey(zzty0);
    }
}

