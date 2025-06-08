package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

public final class zzbf {
    public final String[] a;
    public final double[] b;
    public final double[] c;
    public final int[] d;
    public int e;

    public zzbf(zzbd zzbd0) {
        ArrayList arrayList0 = zzbd0.b;
        int v = arrayList0.size();
        this.a = (String[])zzbd0.a.toArray(new String[v]);
        int v1 = arrayList0.size();
        double[] arr_f = new double[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_f[v2] = (double)(((Double)arrayList0.get(v2)));
        }
        this.b = arr_f;
        ArrayList arrayList1 = zzbd0.c;
        int v3 = arrayList1.size();
        double[] arr_f1 = new double[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            arr_f1[v4] = (double)(((Double)arrayList1.get(v4)));
        }
        this.c = arr_f1;
        this.d = new int[v];
        this.e = 0;
    }

    public final List zza() {
        String[] arr_s = this.a;
        List list0 = new ArrayList(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            double f = this.c[v];
            double f1 = this.b[v];
            int v1 = this.d[v];
            ((ArrayList)list0).add(new zzbc(s, f, f1, ((double)v1) / ((double)this.e), v1));
        }
        return list0;
    }

    public final void zzb(double f) {
        ++this.e;
        for(int v = 0; true; ++v) {
            double[] arr_f = this.c;
            if(v >= arr_f.length) {
                break;
            }
            double f1 = arr_f[v];
            if(f1 <= f && f < this.b[v]) {
                ++this.d[v];
            }
            if(f < f1) {
                break;
            }
        }
    }
}

