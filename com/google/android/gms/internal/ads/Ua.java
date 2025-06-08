package com.google.android.gms.internal.ads;

public final class ua implements zzjs {
    public final xa a;

    public ua(xa xa0) {
        this.a = xa0;
    }

    @Override  // com.google.android.gms.internal.ads.zzjs
    public final void zza(long v) {
        if(v >= 2000L) {
            this.a.L = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzjs
    public final void zzb() {
        this.a.p.zzh(2);
    }
}

