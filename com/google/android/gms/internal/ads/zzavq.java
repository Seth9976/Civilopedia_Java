package com.google.android.gms.internal.ads;

import A.f;
import android.media.MediaCodec.CodecException;

public final class zzavq extends Exception {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzavq(zzart zzart0, Throwable throwable0, boolean z, int v) {
        super("Decoder init failed: [" + v + "], " + zzart0, throwable0);
        this.zza = zzart0.zzf;
        this.zzb = null;
        this.zzc = "com.google.android.exoplayer.MediaCodecTrackRenderer_neg_" + Math.abs(v);
    }

    public zzavq(zzart zzart0, Throwable throwable0, boolean z, String s) {
        super(f.j("Decoder init failed: ", s, ", ", String.valueOf(zzart0)), throwable0);
        this.zza = zzart0.zzf;
        this.zzb = s;
        this.zzc = throwable0 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException)throwable0).getDiagnosticInfo() : null;
    }
}

