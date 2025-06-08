package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzm {
    public Bundle a;
    public List b;
    public boolean c;
    public int d;
    public final Bundle e;
    public final Bundle f;
    public final ArrayList g;
    public int h;
    public String i;
    public final ArrayList j;
    public int k;

    public zzm() {
        this.a = new Bundle();
        this.b = new ArrayList();
        this.c = false;
        this.d = -1;
        this.e = new Bundle();
        this.f = new Bundle();
        this.g = new ArrayList();
        this.h = -1;
        this.i = null;
        this.j = new ArrayList();
        this.k = 60000;
    }

    public final zzl zza() {
        return new zzl(8, -1L, this.a, -1, this.b, this.c, this.d, false, null, null, null, null, this.e, this.f, this.g, null, null, false, null, this.h, this.i, this.j, this.k, null);
    }

    public final zzm zzb(Bundle bundle0) {
        this.a = bundle0;
        return this;
    }

    public final zzm zzc(int v) {
        this.k = v;
        return this;
    }

    public final zzm zzd(boolean z) {
        this.c = z;
        return this;
    }

    public final zzm zze(List list0) {
        this.b = list0;
        return this;
    }

    public final zzm zzf(String s) {
        this.i = s;
        return this;
    }

    public final zzm zzg(int v) {
        this.d = v;
        return this;
    }

    public final zzm zzh(int v) {
        this.h = v;
        return this;
    }
}

