package com.google.android.gms.internal.ads;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class zzqz implements zzqd {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public zzqz(MediaCodec mediaCodec0) {
        this.a = mediaCodec0;
        if(zzeg.zza < 21) {
            this.b = mediaCodec0.getInputBuffers();
            this.c = mediaCodec0.getOutputBuffers();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final int zza() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final int zzb(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        int v;
        do {
            MediaCodec mediaCodec0 = this.a;
            v = mediaCodec0.dequeueOutputBuffer(mediaCodec$BufferInfo0, 0L);
            if(v == -3) {
                if(zzeg.zza < 21) {
                    this.c = mediaCodec0.getOutputBuffers();
                }
                v = -3;
            }
        }
        while(v == -3);
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final MediaFormat zzc() {
        return this.a.getOutputFormat();
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final ByteBuffer zzf(int v) {
        return zzeg.zza < 21 ? this.b[v] : this.a.getInputBuffer(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final ByteBuffer zzg(int v) {
        return zzeg.zza < 21 ? this.c[v] : this.a.getOutputBuffer(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzi() {
        this.a.flush();
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzj(int v, int v1, int v2, long v3, int v4) {
        this.a.queueInputBuffer(v, 0, v2, v3, v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzk(int v, int v1, zzfy zzfy0, long v2, int v3) {
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = zzfy0.zza();
        this.a.queueSecureInputBuffer(v, 0, mediaCodec$CryptoInfo0, v2, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzl() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzm(int v, long v1) {
        this.a.releaseOutputBuffer(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzn(int v, boolean z) {
        this.a.releaseOutputBuffer(v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzo(Surface surface0) {
        this.a.setOutputSurface(surface0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzp(Bundle bundle0) {
        this.a.setParameters(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzq(int v) {
        this.a.setVideoScalingMode(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final boolean zzr() {
        return false;
    }
}

