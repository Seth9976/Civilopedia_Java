package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

public final class zzcai extends zzcak {
    public final String i;
    public final int j;

    public zzcai(String s, int v) {
        this.i = s;
        this.j = v;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0 instanceof zzcai && Objects.equal(this.i, ((zzcai)object0).i) && Objects.equal(this.j, ((zzcai)object0).j);
    }

    @Override  // com.google.android.gms.internal.ads.zzcal
    public final int zzb() {
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzcal
    public final String zzc() {
        return this.i;
    }
}

