package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzctb implements zzcsp {
    public final zzfbk a;

    public zzctb(zzfbk zzfbk0) {
        this.a = zzfbk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map0) {
        String s = (String)map0.get("render_in_browser");
        if(!TextUtils.isEmpty(s)) {
            try {
                this.a.zzb(Boolean.parseBoolean(s));
            }
            catch(Exception unused_ex) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}

