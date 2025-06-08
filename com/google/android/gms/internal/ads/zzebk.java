package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

public final class zzebk implements zzebm {
    public final Map a;
    public final zzfvm b;
    public final zzdem c;

    public zzebk(Map map0, zzfvm zzfvm0, zzdem zzdem0) {
        this.a = map0;
        this.b = zzfvm0;
        this.c = zzdem0;
    }

    @Override  // com.google.android.gms.internal.ads.zzebm
    public final zzfvl zzb(zzbzv zzbzv0) {
        this.c.zzbE(zzbzv0);
        zzfvl zzfvl0 = zzfvc.zzh(new zzdzl(3));
        String[] arr_s = ((String)zzay.zzc().zzb(zzbhz.zzgS)).split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            zzgrh zzgrh0 = (zzgrh)this.a.get(arr_s[v].trim());
            if(zzgrh0 != null) {
                zzebi zzebi0 = new zzebi(zzgrh0, zzbzv0);
                zzfvl0 = zzfvc.zzg(zzfvl0, zzdzl.class, zzebi0, this.b);
            }
        }
        zzfvc.zzr(zzfvl0, new E9(this, 22), zzcfv.zzf);
        return zzfvl0;
    }
}

