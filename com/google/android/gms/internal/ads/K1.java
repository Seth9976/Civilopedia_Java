package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

public final class k1 implements ib, j1 {
    public final int i;
    public final int j;
    public MediaCodecInfo[] k;

    public k1(boolean z) {
        this.i = 0;
        super();
        this.j = z;
    }

    public k1(boolean z, boolean z1) {
        this.i = 1;
        super();
        this.j = z || z1 ? 1 : 0;
    }

    @Override  // com.google.android.gms.internal.ads.j1, com.google.android.gms.internal.ads.ib
    public final boolean a(String s, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return this.i == 0 ? mediaCodecInfo$CodecCapabilities0.isFeatureSupported("secure-playback") : mediaCodecInfo$CodecCapabilities0.isFeatureRequired(s);
    }

    @Override  // com.google.android.gms.internal.ads.ib
    public boolean b(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return mediaCodecInfo$CodecCapabilities0.isFeatureSupported(s);
    }

    @Override  // com.google.android.gms.internal.ads.j1, com.google.android.gms.internal.ads.ib
    public final int zza() {
        if(this.i != 0) {
            if(this.k == null) {
                this.k = new MediaCodecList(this.j).getCodecInfos();
            }
            return this.k.length;
        }
        if(this.k == null) {
            this.k = new MediaCodecList(this.j).getCodecInfos();
        }
        return this.k.length;
    }

    @Override  // com.google.android.gms.internal.ads.j1, com.google.android.gms.internal.ads.ib
    public final MediaCodecInfo zzb(int v) {
        if(this.i != 0) {
            if(this.k == null) {
                this.k = new MediaCodecList(this.j).getCodecInfos();
            }
            return this.k[v];
        }
        if(this.k == null) {
            this.k = new MediaCodecList(this.j).getCodecInfos();
        }
        return this.k[v];
    }

    @Override  // com.google.android.gms.internal.ads.j1
    public boolean zzd() {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.ib
    public boolean zze() {
        return true;
    }
}

