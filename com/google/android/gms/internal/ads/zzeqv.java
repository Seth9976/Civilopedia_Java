package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeqv implements zzetf {
    public final String a;
    public final boolean b;
    public final boolean c;

    public zzeqv(String s, boolean z, boolean z1) {
        this.a = s;
        this.b = z;
        this.c = z1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        String s = this.a;
        if(!s.isEmpty()) {
            ((Bundle)object0).putString("inspector_extras", s);
        }
        ((Bundle)object0).putInt("test_mode", ((int)this.b));
        ((Bundle)object0).putInt("linked_device", ((int)this.c));
    }
}

