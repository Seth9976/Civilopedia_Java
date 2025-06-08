package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzeoz implements zzetf {
    public final String a;
    public final int b;

    public zzeoz(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        String s = this.a;
        if(!TextUtils.isEmpty(s)) {
            int v = this.b;
            if(v != -1) {
                Bundle bundle0 = zzfco.zza(((Bundle)object0), "pii");
                ((Bundle)object0).putBundle("pii", bundle0);
                bundle0.putString("pvid", s);
                bundle0.putInt("pvid_s", v);
            }
        }
    }
}

