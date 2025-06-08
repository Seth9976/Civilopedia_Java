package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

public final class zzuv extends zzco {
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final SparseArray p;
    public final SparseBooleanArray q;

    @Deprecated
    public zzuv() {
        this.p = new SparseArray();
        this.q = new SparseBooleanArray();
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
    }

    public zzuv(Context context0) {
        this.zzd(context0);
        Point point0 = zzeg.zzA(context0);
        this.zze(point0.x, point0.y, true);
        this.p = new SparseArray();
        this.q = new SparseBooleanArray();
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
    }

    public zzuv(zzut zzut0) {
        super(zzut0);
        this.k = zzut0.zzG;
        this.l = zzut0.zzI;
        this.m = zzut0.zzK;
        this.n = zzut0.zzP;
        this.o = zzut0.zzR;
        SparseArray sparseArray0 = new SparseArray();
        for(int v = 0; true; ++v) {
            SparseArray sparseArray1 = zzut0.a;
            if(v >= sparseArray1.size()) {
                break;
            }
            sparseArray0.put(sparseArray1.keyAt(v), new HashMap(((Map)sparseArray1.valueAt(v))));
        }
        this.p = sparseArray0;
        this.q = zzut0.b.clone();
    }

    @Override  // com.google.android.gms.internal.ads.zzco
    public final zzco zze(int v, int v1, boolean z) {
        super.zze(v, v1, true);
        return this;
    }

    public final zzuv zzo(int v, boolean z) {
        SparseBooleanArray sparseBooleanArray0 = this.q;
        if(sparseBooleanArray0.get(v) == z) {
            return this;
        }
        if(z) {
            sparseBooleanArray0.put(v, true);
            return this;
        }
        sparseBooleanArray0.delete(v);
        return this;
    }
}

