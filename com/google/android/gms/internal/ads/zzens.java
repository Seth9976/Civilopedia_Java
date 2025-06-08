package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzens implements zzetf {
    public final String a;

    public zzens(String s) {
        this.a = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        String s = this.a;
        if(s != null) {
            ((Bundle)object0).putString("arek", s);
        }
    }
}

