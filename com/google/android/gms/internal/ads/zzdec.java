package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzdec extends zzdhc implements zzdcn, zzdds {
    public final zzfbl j;
    public final AtomicBoolean k;

    public zzdec(Set set0, zzfbl zzfbl0) {
        super(set0);
        this.k = new AtomicBoolean();
        this.j = zzfbl0;
    }

    public final void b() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzgA)).booleanValue() && this.k.compareAndSet(false, true)) {
            zzs zzs0 = this.j.zzag;
            if(zzs0 != null && zzs0.zza == 3) {
                this.a(new zzdeb(this));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzh() {
        if(this.j.zzb == 1) {
            this.b();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        if(this.j.zzb != 2 && this.j.zzb != 4 && this.j.zzb != 5 && this.j.zzb != 6 && this.j.zzb != 7) {
            return;
        }
        this.b();
    }
}

