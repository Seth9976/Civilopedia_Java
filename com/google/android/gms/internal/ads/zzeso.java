package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzeso implements zzetf {
    public final String a;

    public zzeso(String s) {
        this.a = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        String s = this.a;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        ((Bundle)object0).putString("query_info", s);
    }
}

