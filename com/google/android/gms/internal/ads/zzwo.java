package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

public final class zzwo {
    public final ArrayList a;
    public final Ib[] b;
    public int c;
    public int d;
    public int e;
    public int f;
    public static final zzwk g;
    public static final zzwl h;

    static {
        zzwo.g = zzwk.zza;
        zzwo.h = zzwl.zza;
    }

    public zzwo(int v) {
        this.b = new Ib[5];
        this.a = new ArrayList();
        this.c = -1;
    }

    public final float zza(float f) {
        ArrayList arrayList0 = this.a;
        if(this.c != 0) {
            Collections.sort(arrayList0, zzwo.h);
            this.c = 0;
        }
        float f1 = ((float)this.e) * 0.5f;
        int v1 = 0;
        for(int v = 0; v < arrayList0.size(); ++v) {
            Ib ib0 = (Ib)arrayList0.get(v);
            v1 += ib0.b;
            if(((float)v1) >= f1) {
                return ib0.c;
            }
        }
        return arrayList0.isEmpty() ? NaNf : ((Ib)arrayList0.get(arrayList0.size() - 1)).c;
    }

    public final void zzb(int v, float f) {
        Ib ib0;
        ArrayList arrayList0 = this.a;
        if(this.c != 1) {
            Collections.sort(arrayList0, zzwo.g);
            this.c = 1;
        }
        int v1 = this.f;
        Ib[] arr_ib = this.b;
        if(v1 > 0) {
            this.f = v1 - 1;
            ib0 = arr_ib[v1 - 1];
        }
        else {
            ib0 = new Ib();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        int v2 = this.d;
        this.d = v2 + 1;
        ib0.a = v2;
        ib0.b = v;
        ib0.c = f;
        arrayList0.add(ib0);
        this.e += v;
        int v3;
        while((v3 = this.e) > 2000) {
            Ib ib1 = (Ib)arrayList0.get(0);
            int v4 = ib1.b;
            if(v4 <= v3 - 2000) {
                this.e -= v4;
                arrayList0.remove(0);
                int v5 = this.f;
                if(v5 >= 5) {
                    continue;
                }
                this.f = v5 + 1;
                arr_ib[v5] = ib1;
            }
            else {
                ib1.b = v4 - (v3 - 2000);
                this.e -= v3 - 2000;
            }
        }
    }

    public final void zzc() {
        this.a.clear();
        this.c = -1;
        this.d = 0;
        this.e = 0;
    }
}

