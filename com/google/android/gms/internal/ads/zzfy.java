package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo;

public final class zzfy {
    public final MediaCodec.CryptoInfo a;
    public final T0 b;
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;

    public zzfy() {
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = new MediaCodec.CryptoInfo();
        this.a = mediaCodec$CryptoInfo0;
        this.b = zzeg.zza < 24 ? null : new T0(mediaCodec$CryptoInfo0, 1);
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.a;
    }

    public final void zzb(int v) {
        if(v == 0) {
            return;
        }
        if(this.zzd == null) {
            int[] arr_v = new int[1];
            this.zzd = arr_v;
            this.a.numBytesOfClearData = arr_v;
        }
        this.zzd[0] += v;
    }

    public final void zzc(int v, int[] arr_v, int[] arr_v1, byte[] arr_b, byte[] arr_b1, int v1, int v2, int v3) {
        this.zzf = v;
        this.zzd = arr_v;
        this.zze = arr_v1;
        this.zzb = arr_b;
        this.zza = arr_b1;
        this.zzc = v1;
        this.zzg = v2;
        this.zzh = v3;
        this.a.numSubSamples = v;
        this.a.numBytesOfClearData = arr_v;
        this.a.numBytesOfEncryptedData = arr_v1;
        this.a.key = arr_b;
        this.a.iv = arr_b1;
        this.a.mode = v1;
        if(zzeg.zza >= 24) {
            this.b.getClass();
            this.b.b.set(v2, v3);
            this.b.a.setPattern(this.b.b);
        }
    }
}

