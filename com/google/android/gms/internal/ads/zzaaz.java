package com.google.android.gms.internal.ads;

public final class zzaaz implements zzyu {
    public final long i;
    public final zzyu j;

    public zzaaz(long v, zzyu zzyu0) {
        this.i = v;
        this.j = zzyu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyu
    public final void zzB() {
        this.j.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzyu
    public final void zzL(zzzu zzzu0) {
        g g0 = new g(this, zzzu0);
        this.j.zzL(g0);
    }

    @Override  // com.google.android.gms.internal.ads.zzyu
    public final zzzy zzv(int v, int v1) {
        return this.j.zzv(v, v1);
    }
}

