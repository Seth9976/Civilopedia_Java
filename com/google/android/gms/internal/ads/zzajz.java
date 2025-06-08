package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class zzajz {
    public final int a;
    public final List b;
    public final int c;
    public final InputStream d;

    public zzajz(int v, List list0, int v1, InputStream inputStream0) {
        this.a = v;
        this.b = list0;
        this.c = v1;
        this.d = inputStream0;
    }

    public final int zza() {
        return this.c;
    }

    public final int zzb() {
        return this.a;
    }

    public final InputStream zzc() {
        return this.d == null ? null : this.d;
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.b);
    }
}

