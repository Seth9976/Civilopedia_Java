package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CodecException;

public class zzqe extends zzfz {
    public final zzqf zza;
    public final String zzb;

    public zzqe(Throwable throwable0, zzqf zzqf0) {
        String s = null;
        super("Decoder failed: " + (zzqf0 == null ? null : zzqf0.zza), throwable0);
        this.zza = zzqf0;
        if(zzeg.zza >= 21 && throwable0 instanceof MediaCodec.CodecException) {
            s = ((MediaCodec.CodecException)throwable0).getDiagnosticInfo();
        }
        this.zzb = s;
    }
}

