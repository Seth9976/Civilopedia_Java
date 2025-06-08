package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeqr implements zzetf {
    public final Boolean a;

    public zzeqr(Boolean boolean0) {
        this.a = boolean0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        Boolean boolean0 = this.a;
        if(boolean0 != null) {
            ((Bundle)object0).putBoolean("hw_accel", boolean0.booleanValue());
        }
    }
}

