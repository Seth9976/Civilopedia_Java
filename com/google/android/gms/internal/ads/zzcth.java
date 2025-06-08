package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzcth implements zzcsp {
    public final zzdzb a;

    public zzcth(zzdzb zzdzb0) {
        this.a = zzdzb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map0) {
        String s = (String)map0.get("test_mode_enabled");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.a.zzl(s.equals("true"));
    }
}

