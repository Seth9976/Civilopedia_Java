package com.google.android.gms.internal.ads;

public final class zzcjy extends zzcju {
    public zzcjy(zzchr zzchr0) {
        super(zzchr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final boolean zzq(String s) {
        String s1 = zzcfb.zze(s);
        zzchr zzchr0 = (zzchr)this.k.get();
        if(zzchr0 != null && s1 != null) {
            zzchr0.zzv(s1, this);
        }
        zzcfi.zzj("VideoStreamNoopCache is doing nothing.");
        this.zzc(s, s1, "noop", "Noop cache is a noop.");
        return false;
    }
}

