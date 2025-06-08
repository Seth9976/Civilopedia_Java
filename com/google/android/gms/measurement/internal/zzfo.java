package com.google.android.gms.measurement.internal;

import i1.D;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class zzfo implements Callable {
    public final zzfv zza;
    public final String zzb;

    public zzfo(zzfv zzfv0, String s) {
        this.zza = zzfv0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        D d0 = this.zza.b.zzi().s(this.zzb);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("platform", "android");
        hashMap0.put("package_name", this.zzb);
        this.zza.a.zzf().zzh();
        hashMap0.put("gmp_version", 68000L);
        if(d0 != null) {
            String s = d0.y();
            if(s != null) {
                hashMap0.put("app_version", s);
            }
            hashMap0.put("app_version_int", d0.t());
            d0.a.zzaz().zzg();
            hashMap0.put("dynamite_version", d0.s);
        }
        return hashMap0;
    }
}

