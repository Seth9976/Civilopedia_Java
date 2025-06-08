package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class i1 {
    public final String a;
    public final boolean b;

    public i1(String s, boolean z) {
        this.a = s;
        this.b = z;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && object0.getClass() == i1.class && TextUtils.equals(this.a, ((i1)object0).a) && this.b == ((i1)object0).b;
    }

    @Override
    public final int hashCode() {
        int v = this.a == null ? 0 : this.a.hashCode();
        return this.b ? (v + 0x1F) * 0x1F + 0x4CF : (v + 0x1F) * 0x1F + 0x4D5;
    }
}

