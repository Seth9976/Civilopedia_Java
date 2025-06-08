package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeoi implements zzetf {
    public final Bundle a;

    public zzeoi(Bundle bundle0) {
        this.a = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        Bundle bundle0 = this.a;
        if(!bundle0.isEmpty()) {
            ((Bundle)object0).putBundle("installed_adapter_data", bundle0);
        }
    }
}

