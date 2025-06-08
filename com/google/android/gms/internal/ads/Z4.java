package com.google.android.gms.internal.ads;

public final class z4 implements zzfuy {
    public final int i;
    public final String j;
    public final zzbom k;

    public z4(String s, zzbom zzbom0, int v) {
        this.i = v;
        this.j = s;
        this.k = zzbom0;
        super();
    }

    private final void a(Throwable throwable0) {
    }

    private final void b(Throwable throwable0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable throwable0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object object0) {
        if(this.i != 0) {
            ((zzcli)object0).zzaw(this.j, this.k);
            return;
        }
        ((zzcli)object0).zzaf(this.j, this.k);
    }
}

