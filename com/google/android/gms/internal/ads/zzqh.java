package com.google.android.gms.internal.ads;

import A.f;
import android.media.MediaCodec.CodecException;

public final class zzqh extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzqf zzc;
    public final String zzd;
    public final zzqh zze;

    public zzqh(zzad zzad0, Throwable throwable0, boolean z, int v) {
        this("Decoder init failed: [" + v + "], " + zzad0, throwable0, zzad0.zzm, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + Math.abs(v), null);
    }

    public zzqh(zzad zzad0, Throwable throwable0, boolean z, zzqf zzqf0) {
        String s = zzeg.zza < 21 || !(throwable0 instanceof MediaCodec.CodecException) ? null : ((MediaCodec.CodecException)throwable0).getDiagnosticInfo();
        this(f.j("Decoder init failed: ", zzqf0.zza, ", ", String.valueOf(zzad0)), throwable0, zzad0.zzm, zzqf0, s, null);
    }

    public zzqh(String s, Throwable throwable0, String s1, zzqf zzqf0, String s2, zzqh zzqh0) {
        super(s, throwable0);
        this.zza = s1;
        this.zzb = false;
        this.zzc = zzqf0;
        this.zzd = s2;
        this.zze = zzqh0;
    }
}

