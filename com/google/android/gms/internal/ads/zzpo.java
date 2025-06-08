package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

public final class zzpo implements zzqc {
    public final zzpm a;
    public final zzpn b;

    public zzpo(int v, boolean z) {
        zzpm zzpm0 = new zzpm(v);
        zzpn zzpn0 = new zzpn(v);
        super();
        this.a = zzpm0;
        this.b = zzpn0;
    }

    public final ab zzc(zzqb zzqb0) throws IOException {
        ab ab1;
        MediaCodec mediaCodec0;
        ab ab0 = null;
        try {
            Trace.beginSection(("createCodec:" + zzqb0.zza.zza));
            mediaCodec0 = null;
            mediaCodec0 = MediaCodec.createByCodecName(zzqb0.zza.zza);
            ab1 = new ab(mediaCodec0, new HandlerThread(ab.b(this.a.zza, "ExoPlayer:MediaCodecAsyncAdapter:")), new HandlerThread(ab.b(this.b.zza, "ExoPlayer:MediaCodecQueueingThread:")));
        }
        catch(Exception exception0) {
            goto label_13;
        }
        try {
            Trace.endSection();
            ab.a(ab1, zzqb0.zzb, zzqb0.zzd);
            return ab1;
        }
        catch(Exception exception0) {
            ab0 = ab1;
        }
    label_13:
        if(ab0 != null) {
            ab0.zzl();
        }
        else if(mediaCodec0 != null) {
            mediaCodec0.release();
        }
        throw exception0;
    }
}

