package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

public final class zzfcm {
    public final zzfbl a;
    public final zzfbo b;
    public final zzees c;
    public final zzfii d;
    public final zzfhs e;

    @VisibleForTesting
    public zzfcm(zzees zzees0, zzfii zzfii0, zzfbl zzfbl0, zzfbo zzfbo0, zzfhs zzfhs0) {
        this.a = zzfbl0;
        this.b = zzfbo0;
        this.c = zzees0;
        this.d = zzfii0;
        this.e = zzfhs0;
    }

    public final void zza(List list0) {
        for(Object object0: list0) {
            this.zzb(((String)object0), 2);
        }
    }

    public final void zzb(String s, int v) {
        if(!this.a.zzak) {
            this.d.zzc(s, this.e);
            return;
        }
        zzeeu zzeeu0 = new zzeeu(zzt.zzA().currentTimeMillis(), this.b.zzb, s, v);
        this.c.zzd(zzeeu0);
    }

    public final void zzc(List list0, int v) {
        for(Object object0: list0) {
            this.zzb(((String)object0), v);
        }
    }
}

