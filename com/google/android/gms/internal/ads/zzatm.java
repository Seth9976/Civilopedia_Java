package com.google.android.gms.internal.ads;

import A.b;
import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;

public final class zzatm {
    public final MediaCodec.CryptoInfo a;
    public final T0 b;
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;

    public zzatm() {
        T0 t00 = null;
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = zzazo.zza < 16 ? null : new MediaCodec.CryptoInfo();
        this.a = mediaCodec$CryptoInfo0;
        if(zzazo.zza >= 24) {
            t00 = new T0(mediaCodec$CryptoInfo0, 0);
        }
        this.b = t00;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo zza() {
        return this.a;
    }

    public final void zzb(int v, int[] arr_v, int[] arr_v1, byte[] arr_b, byte[] arr_b1, int v1) {
        this.zzf = v;
        this.zzd = arr_v;
        this.zze = arr_v1;
        this.zzb = arr_b;
        this.zza = arr_b1;
        this.zzc = 1;
        int v2 = zzazo.zza;
        if(v2 >= 16) {
            this.a.numSubSamples = v;
            this.a.numBytesOfClearData = arr_v;
            this.a.numBytesOfEncryptedData = arr_v1;
            this.a.key = arr_b;
            this.a.iv = arr_b1;
            this.a.mode = 1;
            if(v2 >= 24) {
                b.q(this.b.b);
                this.b.a.setPattern(this.b.b);
            }
        }
    }
}

