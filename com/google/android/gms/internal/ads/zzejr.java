package com.google.android.gms.internal.ads;

public final class zzejr implements Runnable {
    public final t5 zza;
    public final zzfbx zzb;
    public final zzfbl zzc;
    public final zzefg zzd;

    public zzejr(t5 t50, zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) {
        this.zza = t50;
        this.zzb = zzfbx0;
        this.zzc = zzfbl0;
        this.zzd = zzefg0;
    }

    @Override
    public final void run() {
        zzeju.a(this.zzb, this.zzc, this.zzd);
    }
}

