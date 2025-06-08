package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class zzgqy extends na {
    public static final zzgqu b;

    static {
        zzgqy.b = zzgqv.zza(Collections.emptyMap());
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zzd();
    }

    public static zzgqx zzc(int v) {
        return new zzgqx(v);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgqp;-><init>(I)V
    }

    public final Map zzd() {
        LinkedHashMap linkedHashMap0 = zzgqr.zzb(this.a.size());
        for(Object object0: this.a.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), ((zzgrh)((Map.Entry)object0).getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMap0);
    }
}

