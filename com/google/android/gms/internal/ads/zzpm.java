package com.google.android.gms.internal.ads;

import android.os.HandlerThread;

public final class zzpm implements zzfpj {
    public final int zza;

    public zzpm(int v) {
        this.zza = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpj
    public final Object zza() {
        return new HandlerThread(ab.b(this.zza, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }
}

