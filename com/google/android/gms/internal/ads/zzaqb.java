package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

public final class zzaqb extends zzaqn {
    public zzaqb(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        super(zzapc0, "BRgqZ9Vg4IM5miPoGPKIX+tShrXoisnhV1cWTsEoWNSALbfoi2OgJtSBw3h9+Bqo", "SAUyhp29xMzgJ0ZztJOiGInn+oDyrZ4+r7quECKL/6s=", zzali0, v, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        Boolean boolean0 = (Boolean)zzay.zzc().zzb(zzbhz.zzci);
        boolean0.booleanValue();
        zzaoj zzaoj0 = new zzaoj(((String)this.e.invoke(null, this.a.zzb(), boolean0)));
        synchronized(this.d) {
            this.d.zzi(zzaoj0.zza);
            this.d.zzB(zzaoj0.zzb);
        }
    }
}

