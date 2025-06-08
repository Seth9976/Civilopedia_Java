package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public final class zzss extends zzrj {
    public final zzsc[] k;
    public final zzci[] l;
    public final ArrayList m;
    public final zzfru n;
    public int o;
    public long[][] p;
    public zzsr q;
    public static final zzbb r;

    static {
        zzah zzah0 = new zzah();
        zzah0.zza("MergingMediaSource");
        zzss.r = zzah0.zzc();
    }

    public zzss(boolean z, boolean z1, zzsc[] arr_zzsc) {
        this.k = arr_zzsc;
        this.m = new ArrayList(Arrays.asList(arr_zzsc));
        this.o = -1;
        this.l = new zzci[arr_zzsc.length];
        this.p = new long[0][];
        new HashMap();
        this.n = zzfsm.zzb(8).zzb(2).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzrj
    public final zzsa d(Integer integer0, zzsa zzsa0) {
        return ((int)integer0) == 0 ? zzsa0 : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzrj
    public final void e(Object object0, zzsc zzsc0, zzci zzci0) {
        int v;
        if(this.q == null) {
            if(this.o == -1) {
                v = zzci0.zzb();
                this.o = v;
            }
            else {
                int v1 = zzci0.zzb();
                int v2 = this.o;
                if(v1 != v2) {
                    this.q = new zzsr(0);
                    return;
                }
                v = v2;
            }
            zzci[] arr_zzci = this.l;
            if(this.p.length == 0) {
                this.p = new long[v][arr_zzci.length];
            }
            this.m.remove(zzsc0);
            arr_zzci[((int)(((Integer)object0)))] = zzci0;
            if(this.m.isEmpty()) {
                this.c(arr_zzci[0]);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzB(zzry zzry0) {
        for(int v = 0; true; ++v) {
            zzsc[] arr_zzsc = this.k;
            if(v >= arr_zzsc.length) {
                break;
            }
            zzsc zzsc0 = arr_zzsc[v];
            zzry zzry1 = ((tb)zzry0).i[v];
            if(zzry1 instanceof rb) {
                zzry1 = ((rb)zzry1).i;
            }
            zzsc0.zzB(zzry1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final zzry zzD(zzsa zzsa0, zzvv zzvv0, long v) {
        zzsc[] arr_zzsc = this.k;
        zzry[] arr_zzry = new zzry[arr_zzsc.length];
        zzci[] arr_zzci = this.l;
        int v2 = arr_zzci[0].zza(zzsa0.zza);
        for(int v1 = 0; v1 < arr_zzsc.length; ++v1) {
            zzsa zzsa1 = zzsa0.zzc(arr_zzci[v1].zzf(v2));
            arr_zzry[v1] = arr_zzsc[v1].zzD(zzsa1, zzvv0, v - this.p[v2][v1]);
        }
        return new tb(this.p[v2], arr_zzry);
    }

    @Override  // com.google.android.gms.internal.ads.zzrj
    public final void zzn(zzfs zzfs0) {
        super.zzn(zzfs0);
        for(int v = 0; true; ++v) {
            zzsc[] arr_zzsc = this.k;
            if(v >= arr_zzsc.length) {
                break;
            }
            this.f(v, arr_zzsc[v]);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzrj
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.l, null);
        this.o = -1;
        this.q = null;
        this.m.clear();
        Collections.addAll(this.m, this.k);
    }

    @Override  // com.google.android.gms.internal.ads.zzrj
    public final void zzw() throws IOException {
        zzsr zzsr0 = this.q;
        if(zzsr0 != null) {
            throw zzsr0;
        }
        super.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final zzbb zzz() {
        return this.k.length <= 0 ? zzss.r : this.k[0].zzz();
    }
}

