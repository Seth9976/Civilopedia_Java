package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzbnv implements zzbom {
    public static final zzbnv zza;

    static {
        zzbnv.zza = new zzbnv();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzcmq zzcmq0 = (zzcmq)object0;
        String s = (String)map0.get("tx");
        String s1 = (String)map0.get("ty");
        String s2 = (String)map0.get("td");
        try {
            int v = Integer.parseInt(s);
            int v1 = Integer.parseInt(s1);
            int v2 = Integer.parseInt(s2);
            zzaoc zzaoc0 = zzcmq0.zzK();
            if(zzaoc0 != null) {
                zzaoc0.zzc().zzl(v, v1, v2);
            }
        }
        catch(NumberFormatException unused_ex) {
            zzcfi.zzj("Could not parse touch parameters from gmsg.");
        }
    }
}

