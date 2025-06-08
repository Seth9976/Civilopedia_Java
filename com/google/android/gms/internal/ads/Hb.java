package com.google.android.gms.internal.ads;

import A.f;
import android.text.TextUtils;

public final class hb {
    public final String a;
    public final boolean b;
    public final boolean c;

    public hb(String s, boolean z, boolean z1) {
        this.a = s;
        this.b = z;
        this.c = z1;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && object0.getClass() == hb.class && TextUtils.equals(this.a, ((hb)object0).a) && this.b == ((hb)object0).b && this.c == ((hb)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = f.b(0x1F, 0x1F, this.a);
        int v1 = 0x4CF;
        int v2 = this.b ? 0x4CF : 0x4D5;
        if(!this.c) {
            v1 = 0x4D5;
        }
        return (v + v2) * 0x1F + v1;
    }
}

