package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

public final class zzbkk extends zzbks {
    public final String i;
    public final ArrayList j;
    public final ArrayList k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public static final int q;
    public static final int r;

    static {
        int v = Color.rgb(12, 0xAE, 206);
        zzbkk.q = Color.rgb(204, 204, 204);
        zzbkk.r = v;
    }

    public zzbkk(String s, List list0, Integer integer0, Integer integer1, Integer integer2, int v, int v1, boolean z) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.i = s;
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            zzbkn zzbkn0 = (zzbkn)list0.get(v2);
            this.j.add(zzbkn0);
            this.k.add(zzbkn0);
        }
        this.l = integer0 == null ? zzbkk.q : ((int)integer0);
        this.m = integer1 == null ? zzbkk.r : ((int)integer1);
        this.n = integer2 == null ? 12 : ((int)integer2);
        this.o = v;
        this.p = v1;
    }

    public final int zzb() {
        return this.o;
    }

    public final int zzc() {
        return this.p;
    }

    public final int zzd() {
        return this.l;
    }

    public final int zze() {
        return this.m;
    }

    public final int zzf() {
        return this.n;
    }

    @Override  // com.google.android.gms.internal.ads.zzbkt
    public final String zzg() {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zzbkt
    public final List zzh() {
        return this.k;
    }

    public final List zzi() {
        return this.j;
    }
}

