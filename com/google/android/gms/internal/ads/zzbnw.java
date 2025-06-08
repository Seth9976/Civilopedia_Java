package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzby;
import java.util.Map;

public final class zzbnw implements zzbom {
    public static final zzbnw zza;

    static {
        zzbnw.zza = new zzbnw();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("u");
        if(s == null) {
            zzcfi.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        new zzby(((zzcmj)object0).getContext(), ((zzcmr)(((zzcmj)object0))).zzp().zza, s).zzb();
    }
}

