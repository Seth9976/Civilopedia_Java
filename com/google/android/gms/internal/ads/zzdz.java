package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public final class zzdz implements zzcx {
    @Override  // com.google.android.gms.internal.ads.zzcx
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override  // com.google.android.gms.internal.ads.zzcx
    public final zzdg zzb(Looper looper0, Handler.Callback handler$Callback0) {
        return new b5(new Handler(looper0, handler$Callback0));
    }
}

