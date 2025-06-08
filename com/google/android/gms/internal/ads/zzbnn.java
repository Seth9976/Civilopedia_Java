package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzbnn implements zzbom {
    public final zzbno a;

    public zzbnn(zzbno zzbno0) {
        this.a = zzbno0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("name");
        if(s == null) {
            zzcfi.zzj("App event with no name parameter.");
            return;
        }
        String s1 = (String)map0.get("info");
        this.a.zzbD(s, s1);
    }
}

