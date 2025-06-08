package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import java.util.concurrent.Executor;

public final class zzak implements zzfuj {
    public final Executor a;
    public final zzeaj b;

    public zzak(Executor executor0, zzeaj zzeaj0) {
        this.a = executor0;
        this.b = zzeaj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) throws Exception {
        return zzfvc.zzn(this.b.zzb(((zzbzv)object0)), new zzaj(((zzbzv)object0)), this.a);
    }
}

