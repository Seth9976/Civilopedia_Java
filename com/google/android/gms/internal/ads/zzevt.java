package com.google.android.gms.internal.ads;

public final class zzevt implements zzfok {
    public final zzevu zza;

    public zzevt(zzevu zzevu0) {
        this.zza = zzevu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        this.zza.a.zzt(((Exception)object0), "TrustlessTokenSignal");
        return null;
    }
}

