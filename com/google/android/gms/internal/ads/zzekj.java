package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzekj implements zzf {
    public final zzdbr i;
    public final zzdcl j;
    public final zzdji k;
    public final zzdjb l;
    public final zzcud m;
    public final AtomicBoolean n;

    public zzekj(zzdbr zzdbr0, zzdcl zzdcl0, zzdji zzdji0, zzdjb zzdjb0, zzcud zzcud0) {
        this.n = new AtomicBoolean(false);
        this.i = zzdbr0;
        this.j = zzdcl0;
        this.k = zzdji0;
        this.l = zzdjb0;
        this.m = zzcud0;
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zza(View view0) {
        synchronized(this) {
            if(!this.n.compareAndSet(false, true)) {
                return;
            }
            this.m.zzl();
            this.l.zza(view0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if(this.n.get()) {
            this.i.onAdClicked();
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if(this.n.get()) {
            this.j.zza();
            this.k.zza();
        }
    }
}

