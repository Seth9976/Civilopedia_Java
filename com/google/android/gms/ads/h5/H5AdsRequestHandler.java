package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbpo;

public final class H5AdsRequestHandler {
    public final zzbpo a;

    public H5AdsRequestHandler(Context context0, OnH5AdsEventListener onH5AdsEventListener0) {
        this.a = new zzbpo(context0, onH5AdsEventListener0);
    }

    public void clearAdObjects() {
        this.a.zza();
    }

    public boolean handleH5AdsRequest(String s) {
        return this.a.zzb(s);
    }

    public boolean shouldInterceptRequest(String s) {
        return zzbpo.zzc(s);
    }
}

