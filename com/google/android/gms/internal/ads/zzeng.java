package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeng implements zzetf {
    public final boolean a;

    public zzeng(boolean z) {
        this.a = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        ((Bundle)object0).putString("adid_p", (this.a ? "1" : "0"));
    }
}

