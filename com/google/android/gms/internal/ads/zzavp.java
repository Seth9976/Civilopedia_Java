package com.google.android.gms.internal.ads;

import A.f;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Log;
import android.util.Pair;
import i3.e;

@TargetApi(16)
public final class zzavp {
    public final String a;
    public final MediaCodecInfo.CodecCapabilities b;
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public zzavp(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0, boolean z, boolean z1) {
        s.getClass();
        this.zza = s;
        this.a = s1;
        this.b = mediaCodecInfo$CodecCapabilities0;
        boolean z2 = true;
        this.zzb = !z && mediaCodecInfo$CodecCapabilities0 != null && mediaCodecInfo$CodecCapabilities0.isFeatureSupported("adaptive-playback");
        this.zzc = mediaCodecInfo$CodecCapabilities0 != null && mediaCodecInfo$CodecCapabilities0.isFeatureSupported("tunneled-playback");
        if(!z1 && (mediaCodecInfo$CodecCapabilities0 == null || !mediaCodecInfo$CodecCapabilities0.isFeatureSupported("secure-playback"))) {
            z2 = false;
        }
        this.zzd = z2;
    }

    public final void a(String s) {
        Log.d("MediaCodecInfo", e.i(e.j("NoSupport [", s, "] [", this.zza, ", "), this.a, "] [", zzazo.zze, "]"));
    }

    public static zzavp zza(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0, boolean z, boolean z1) {
        return new zzavp(s, s1, mediaCodecInfo$CodecCapabilities0, z, z1);
    }

    public static zzavp zzb(String s) {
        return new zzavp("OMX.google.raw.decoder", null, null, false, false);
    }

    @TargetApi(21)
    public final boolean zzc(int v) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.b;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            this.a("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities mediaCodecInfo$AudioCapabilities0 = mediaCodecInfo$CodecCapabilities0.getAudioCapabilities();
        if(mediaCodecInfo$AudioCapabilities0 == null) {
            this.a("channelCount.aCaps");
            return false;
        }
        if(mediaCodecInfo$AudioCapabilities0.getMaxInputChannelCount() < v) {
            this.a("channelCount.support, " + v);
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public final boolean zzd(int v) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.b;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            this.a("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities mediaCodecInfo$AudioCapabilities0 = mediaCodecInfo$CodecCapabilities0.getAudioCapabilities();
        if(mediaCodecInfo$AudioCapabilities0 == null) {
            this.a("sampleRate.aCaps");
            return false;
        }
        if(!mediaCodecInfo$AudioCapabilities0.isSampleRateSupported(v)) {
            this.a("sampleRate.support, " + v);
            return false;
        }
        return true;
    }

    public final boolean zze(String s) {
        String s3;
        if(s != null) {
            String s1 = this.a;
            if(s1 != null) {
                String s2 = s.trim();
                if(s2.startsWith("avc1") || s2.startsWith("avc3")) {
                    s3 = "video/avc";
                }
                else if(s2.startsWith("hev1") || s2.startsWith("hvc1")) {
                    s3 = "video/hevc";
                }
                else if(s2.startsWith("vp9")) {
                    s3 = "video/x-vnd.on2.vp9";
                }
                else if(s2.startsWith("vp8")) {
                    s3 = "video/x-vnd.on2.vp8";
                }
                else if(s2.startsWith("mp4a")) {
                    s3 = "audio/mp4a-latm";
                }
                else if(s2.startsWith("ac-3") || s2.startsWith("dac3")) {
                    s3 = "audio/ac3";
                }
                else if(s2.startsWith("ec-3") || s2.startsWith("dec3")) {
                    s3 = "audio/eac3";
                }
                else if(s2.startsWith("dtsc") || s2.startsWith("dtse")) {
                    s3 = "audio/vnd.dts";
                }
                else if(s2.startsWith("dtsh") || s2.startsWith("dtsl")) {
                    s3 = "audio/vnd.dts.hd";
                }
                else if(s2.startsWith("opus")) {
                    s3 = "audio/opus";
                }
                else if(s2.startsWith("vorbis")) {
                    s3 = "audio/vorbis";
                }
                else {
                    s3 = null;
                }
                if(s3 == null) {
                    return true;
                }
                if(!s1.equals(s3)) {
                    this.a("codec.mime " + s + ", " + s3);
                    return false;
                }
                Pair pair0 = zzawb.zzb(s);
                if(pair0 == null) {
                    return true;
                }
                MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = this.zzg();
                for(int v = 0; v < arr_mediaCodecInfo$CodecProfileLevel.length; ++v) {
                    MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel0 = arr_mediaCodecInfo$CodecProfileLevel[v];
                    if(mediaCodecInfo$CodecProfileLevel0.profile == ((int)(((Integer)pair0.first))) && mediaCodecInfo$CodecProfileLevel0.level >= ((int)(((Integer)pair0.second)))) {
                        return true;
                    }
                }
                this.a("codec.profileLevel, " + s + ", " + s3);
                return false;
            }
        }
        return true;
    }

    @TargetApi(21)
    public final boolean zzf(int v, int v1, double f) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.b;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            this.a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
        if(mediaCodecInfo$VideoCapabilities0 == null) {
            this.a("sizeAndRate.vCaps");
            return false;
        }
        int v2 = Double.compare(f, -1.0);
        if(!(v2 == 0 || f <= 0.0 ? mediaCodecInfo$VideoCapabilities0.isSizeSupported(v, v1) : mediaCodecInfo$VideoCapabilities0.areSizeAndRateSupported(v, v1, f))) {
            if(v < v1 && (v2 == 0 || f <= 0.0 ? mediaCodecInfo$VideoCapabilities0.isSizeSupported(v1, v) : mediaCodecInfo$VideoCapabilities0.areSizeAndRateSupported(v1, v, f))) {
                StringBuilder stringBuilder0 = f.n("sizeAndRate.rotated, ", v, "x", v1, "x");
                stringBuilder0.append(f);
                StringBuilder stringBuilder1 = new StringBuilder("AssumedSupport [");
                stringBuilder1.append(stringBuilder0.toString());
                stringBuilder1.append("] [");
                stringBuilder1.append(this.zza);
                stringBuilder1.append(", ");
                Log.d("MediaCodecInfo", e.i(stringBuilder1, this.a, "] [", zzazo.zze, "]"));
                return true;
            }
            StringBuilder stringBuilder2 = f.n("sizeAndRate.support, ", v, "x", v1, "x");
            stringBuilder2.append(f);
            this.a(stringBuilder2.toString());
            return false;
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.b;
        if(mediaCodecInfo$CodecCapabilities0 != null) {
            return mediaCodecInfo$CodecCapabilities0.profileLevels == null ? new MediaCodecInfo.CodecProfileLevel[0] : mediaCodecInfo$CodecCapabilities0.profileLevels;
        }
        return new MediaCodecInfo.CodecProfileLevel[0];
    }
}

