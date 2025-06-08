package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeqn implements zzetf {
    public final boolean a;

    public zzeqn(boolean z) {
        this.a = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        ((Bundle)object0).putBoolean("is_gbid", this.a);
    }
}

