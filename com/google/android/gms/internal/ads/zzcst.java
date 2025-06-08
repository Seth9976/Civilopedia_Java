package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

public final class zzcst implements zzcsp {
    public final zzg a;

    public zzcst(zzg zzg0) {
        this.a = zzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map0) {
        boolean z = Boolean.parseBoolean(((String)map0.get("content_vertical_opted_out")));
        this.a.zzz(z);
    }
}

