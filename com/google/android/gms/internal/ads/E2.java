package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

public final class e2 implements zzo {
    public final zzbwk i;

    public e2(zzbwk zzbwk0) {
        this.i = zzbwk0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzcfi.zze("Opening AdMobCustomTabsAdapter overlay.");
        this.i.b.onAdOpened(this.i);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzcfi.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int v) {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is closed.");
        this.i.b.onAdClosed(this.i);
    }
}

