package com.google.android.gms.internal.ads;

public final class j4 implements zzfuy {
    public final int i;
    public final zzcza j;

    public j4(zzcza zzcza0, int v) {
        this.i = v;
        this.j = zzcza0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable throwable0) {
        if(this.i != 0) {
            this.j.f.zzh(false);
            return;
        }
        this.j.f.zzk(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object object0) {
        if(this.i != 0) {
            Void void0 = (Void)object0;
            this.j.f.zzh(true);
            return;
        }
        zzbzv zzbzv0 = (zzbzv)object0;
        this.j.f.zzk(true);
    }
}

