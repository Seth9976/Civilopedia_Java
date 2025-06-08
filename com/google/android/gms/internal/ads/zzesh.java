package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzesh implements zzetf {
    public final String a;

    public zzesh(String s) {
        this.a = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        ((Bundle)object0).putString("rtb", this.a);
    }
}

