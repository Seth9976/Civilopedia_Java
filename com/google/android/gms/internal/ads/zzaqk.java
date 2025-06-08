package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzaqk extends zzaqn {
    public final View h;

    public zzaqk(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1, View view0) {
        super(zzapc0, "f7Ni+qJ74MqRBDIn5zt+Qvnt6llN8c82PMULXlCAep3wzIprbOB6YjqpQItX7QwB", "MVJdjUEx+rB88W0UPnVsndOuLU6aovPyFF5b36lJGoA=", zzali0, v, 57);
        this.h = view0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        View view0 = this.h;
        if(view0 != null) {
            Boolean boolean0 = (Boolean)zzay.zzc().zzb(zzbhz.zzcB);
            Boolean boolean1 = (Boolean)zzay.zzc().zzb(zzbhz.zzip);
            Object[] arr_object = {view0, this.a.zzb().getResources().getDisplayMetrics(), boolean0, boolean1};
            zzapg zzapg0 = new zzapg(((String)this.e.invoke(null, arr_object)));
            zzalw zzalw0 = zzalx.zza();
            zzalw0.zzb(((long)zzapg0.zza));
            zzalw0.zzd(((long)zzapg0.zzb));
            zzalw0.zze(((long)zzapg0.zzc));
            if(boolean1.booleanValue()) {
                zzalw0.zzc(((long)zzapg0.zze));
            }
            if(boolean0.booleanValue()) {
                zzalw0.zza(((long)zzapg0.zzd));
            }
            zzalx zzalx0 = (zzalx)zzalw0.zzal();
            this.d.zzX(zzalx0);
        }
    }
}

