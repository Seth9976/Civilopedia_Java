package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzboo implements zzbom {
    public final zzbop a;

    public zzboo(zzbop zzbop0, byte[] arr_b) {
        this.a = zzbop0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        boolean z = "1".equals(map0.get("transparentBackground"));
        boolean z1 = "1".equals(map0.get("blur"));
        float f = 0.0f;
        try {
            if(map0.get("blurRadius") != null) {
                f = Float.parseFloat(((String)map0.get("blurRadius")));
            }
        }
        catch(NumberFormatException numberFormatException0) {
            zzcfi.zzh("Fail to parse float", numberFormatException0);
        }
        this.a.zzc(z);
        this.a.zzb(z1, f);
        ((zzcli)object0).zzav(z);
    }
}

