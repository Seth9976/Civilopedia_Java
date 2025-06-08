package com.google.android.gms.internal.ads;

import A.f;
import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Log;
import android.util.Pair;
import i3.e;

public final class zzqf {
    public final boolean a;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;

    public zzqf(String s, String s1, String s2, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0, boolean z, boolean z1, boolean z2) {
        s.getClass();
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = mediaCodecInfo$CodecCapabilities0;
        this.zzg = z;
        this.zze = z1;
        this.zzf = z2;
        this.a = zzbo.zzh(s1);
    }

    public final void a(String s) {
        Log.d("MediaCodecInfo", e.i(e.j("NoSupport [", s, "] [", this.zza, ", "), this.zzb, "] [", zzeg.zze, "]"));
    }

    public static boolean b(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1, double f) {
        int v2 = mediaCodecInfo$VideoCapabilities0.getWidthAlignment();
        int v3 = mediaCodecInfo$VideoCapabilities0.getHeightAlignment();
        Point point0 = new Point(zzeg.zze(v, v2) * v2, zzeg.zze(v1, v3) * v3);
        int v4 = point0.x;
        int v5 = point0.y;
        return f == -1.0 || f < 1.0 ? mediaCodecInfo$VideoCapabilities0.isSizeSupported(v4, v5) : mediaCodecInfo$VideoCapabilities0.areSizeAndRateSupported(v4, v5, Math.floor(f));
    }

    @Override
    public final String toString() {
        return this.zza;
    }

    public final Point zza(int v, int v1) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            return null;
        }
        MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
        if(mediaCodecInfo$VideoCapabilities0 == null) {
            return null;
        }
        int v2 = mediaCodecInfo$VideoCapabilities0.getWidthAlignment();
        int v3 = mediaCodecInfo$VideoCapabilities0.getHeightAlignment();
        return new Point(zzeg.zze(v, v2) * v2, zzeg.zze(v1, v3) * v3);
    }

    public final zzgm zzb(zzad zzad0, zzad zzad1) {
        int v = zzeg.zzS(zzad0.zzm, zzad1.zzm) ? 0 : 8;
        if(this.a) {
            if(zzad0.zzu != zzad1.zzu) {
                v |= 0x400;
            }
            if(!this.zze && (zzad0.zzr != zzad1.zzr || zzad0.zzs != zzad1.zzs)) {
                v |= 0x200;
            }
            if(!zzeg.zzS(zzad0.zzy, zzad1.zzy)) {
                v |= 0x800;
            }
            if(zzeg.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.zza) && !zzad0.zzd(zzad1)) {
                v |= 2;
            }
            if(v == 0) {
                return zzad0.zzd(zzad1) ? new zzgm(this.zza, zzad0, zzad1, 3, 0) : new zzgm(this.zza, zzad0, zzad1, 2, 0);
            }
            return new zzgm(this.zza, zzad0, zzad1, 0, v);
        }
        if(zzad0.zzz != zzad1.zzz) {
            v |= 0x1000;
        }
        if(zzad0.zzA != zzad1.zzA) {
            v |= 0x2000;
        }
        if(zzad0.zzB != zzad1.zzB) {
            v |= 0x4000;
        }
        if(v == 0 && "audio/mp4a-latm".equals(this.zzb)) {
            Pair pair0 = zzqx.zzb(zzad0);
            Pair pair1 = zzqx.zzb(zzad1);
            if(pair0 != null && pair1 != null && (((int)(((Integer)pair0.first))) == 42 && ((int)(((Integer)pair1.first))) == 42)) {
                return new zzgm(this.zza, zzad0, zzad1, 3, 0);
            }
        }
        if(!zzad0.zzd(zzad1)) {
            v |= 0x20;
        }
        if("audio/opus".equals(this.zzb)) {
            v |= 2;
        }
        return v == 0 ? new zzgm(this.zza, zzad0, zzad1, 1, 0) : new zzgm(this.zza, zzad0, zzad1, 0, v);
    }

    public static zzqf zzc(String s, String s1, String s2, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        if(mediaCodecInfo$CodecCapabilities0 == null || !mediaCodecInfo$CodecCapabilities0.isFeatureSupported("adaptive-playback")) {
            z5 = false;
        }
        else if(zzeg.zza > 22 || !"ODROID-XU3".equals(zzeg.zzd) && !"Nexus 10".equals(zzeg.zzd)) {
            z5 = true;
        }
        else if(!"OMX.Exynos.AVC.Decoder".equals(s) && !"OMX.Exynos.AVC.Decoder.secure".equals(s)) {
            z5 = true;
        }
        else {
            z5 = false;
        }
        if(mediaCodecInfo$CodecCapabilities0 != null && zzeg.zza >= 21) {
            mediaCodecInfo$CodecCapabilities0.isFeatureSupported("tunneled-playback");
        }
        return !z4 && (mediaCodecInfo$CodecCapabilities0 == null || zzeg.zza < 21 || !mediaCodecInfo$CodecCapabilities0.isFeatureSupported("secure-playback")) ? new zzqf(s, s1, s2, mediaCodecInfo$CodecCapabilities0, z, z5, false) : new zzqf(s, s1, s2, mediaCodecInfo$CodecCapabilities0, z, z5, true);
    }

    public final boolean zzd(zzad zzad0) throws zzqr {
        int v4;
        if(!this.zzb.equals(zzad0.zzm)) {
            String s = zzqx.zze(zzad0);
            if(!this.zzb.equals(s)) {
                return false;
            }
        }
        int v = 16;
        boolean z = this.a;
        if(zzad0.zzj != null) {
            Pair pair0 = zzqx.zzb(zzad0);
            if(pair0 != null) {
                int v1 = (int)(((Integer)pair0.first));
                int v2 = (int)(((Integer)pair0.second));
                int v3 = 2;
                if("video/dolby-vision".equals(zzad0.zzm)) {
                    if("video/avc".equals(this.zzb)) {
                        v2 = 0;
                        v1 = 8;
                    }
                    else if("video/hevc".equals(this.zzb)) {
                        v2 = 0;
                        v1 = 2;
                    }
                }
                if(z) {
                label_23:
                    MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = this.zzg();
                    if(zzeg.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && arr_mediaCodecInfo$CodecProfileLevel.length == 0) {
                        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
                        if(mediaCodecInfo$CodecCapabilities0 == null) {
                            v4 = 0;
                        }
                        else {
                            MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
                            v4 = mediaCodecInfo$VideoCapabilities0 == null ? 0 : ((int)(((Integer)mediaCodecInfo$VideoCapabilities0.getBitrateRange().getUpper())));
                        }
                        if(v4 >= 180000000) {
                            v3 = 0x400;
                        }
                        else if(v4 >= 120000000) {
                            v3 = 0x200;
                        }
                        else if(v4 >= 60000000) {
                            v3 = 0x100;
                        }
                        else if(v4 >= 30000000) {
                            v3 = 0x80;
                        }
                        else if(v4 >= 18000000) {
                            v3 = 0x40;
                        }
                        else if(v4 >= 12000000) {
                            v3 = 0x20;
                        }
                        else if(v4 >= 7200000) {
                            v3 = 16;
                        }
                        else if(v4 >= 3600000) {
                            v3 = 8;
                        }
                        else if(v4 >= 1800000) {
                            v3 = 4;
                        }
                        else if(v4 < 800000) {
                            v3 = 1;
                        }
                        MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel0 = new MediaCodecInfo.CodecProfileLevel();
                        mediaCodecInfo$CodecProfileLevel0.profile = 1;
                        mediaCodecInfo$CodecProfileLevel0.level = v3;
                        arr_mediaCodecInfo$CodecProfileLevel = new MediaCodecInfo.CodecProfileLevel[]{mediaCodecInfo$CodecProfileLevel0};
                    }
                    int v5 = 0;
                    while(v5 < arr_mediaCodecInfo$CodecProfileLevel.length) {
                        MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel1 = arr_mediaCodecInfo$CodecProfileLevel[v5];
                        if(mediaCodecInfo$CodecProfileLevel1.profile == v1 && mediaCodecInfo$CodecProfileLevel1.level >= v2) {
                            goto label_75;
                        }
                        ++v5;
                    }
                    this.a("codec.profileLevel, " + zzad0.zzj + ", " + this.zzc);
                    return false;
                }
                else if(v1 == 42) {
                    v1 = 42;
                    goto label_23;
                }
            }
        }
    label_75:
        if(z) {
            int v6 = zzad0.zzr;
            if(v6 > 0) {
                int v7 = zzad0.zzs;
                if(v7 > 0) {
                    if(zzeg.zza >= 21) {
                        return this.zzf(v6, v7, ((double)zzad0.zzt));
                    }
                    if(v6 * v7 <= zzqx.zza()) {
                        return true;
                    }
                    this.a("legacyFrameSize, " + zzad0.zzr + "x" + zzad0.zzs);
                    return false;
                }
            }
            return true;
        }
        int v8 = zzeg.zza;
        if(v8 >= 21) {
            int v9 = zzad0.zzA;
            if(v9 != -1) {
                MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities1 = this.zzd;
                if(mediaCodecInfo$CodecCapabilities1 == null) {
                    this.a("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities mediaCodecInfo$AudioCapabilities0 = mediaCodecInfo$CodecCapabilities1.getAudioCapabilities();
                if(mediaCodecInfo$AudioCapabilities0 == null) {
                    this.a("sampleRate.aCaps");
                    return false;
                }
                if(!mediaCodecInfo$AudioCapabilities0.isSampleRateSupported(v9)) {
                    this.a("sampleRate.support, " + v9);
                    return false;
                }
            }
            int v10 = zzad0.zzz;
            if(v10 != -1) {
                MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities2 = this.zzd;
                if(mediaCodecInfo$CodecCapabilities2 == null) {
                    this.a("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities mediaCodecInfo$AudioCapabilities1 = mediaCodecInfo$CodecCapabilities2.getAudioCapabilities();
                if(mediaCodecInfo$AudioCapabilities1 == null) {
                    this.a("channelCount.aCaps");
                    return false;
                }
                String s1 = this.zza;
                String s2 = this.zzb;
                int v11 = mediaCodecInfo$AudioCapabilities1.getMaxInputChannelCount();
                if(v11 <= 1 && (v8 < 26 || v11 <= 0) && !"audio/mpeg".equals(s2) && !"audio/3gpp".equals(s2) && !"audio/amr-wb".equals(s2) && !"audio/mp4a-latm".equals(s2) && !"audio/vorbis".equals(s2) && !"audio/opus".equals(s2) && !"audio/raw".equals(s2) && !"audio/flac".equals(s2) && !"audio/g711-alaw".equals(s2) && !"audio/g711-mlaw".equals(s2) && !"audio/gsm".equals(s2)) {
                    if("audio/ac3".equals(s2)) {
                        v = 6;
                    }
                    else if(!"audio/eac3".equals(s2)) {
                        v = 30;
                    }
                    StringBuilder stringBuilder0 = f.m(v11, "AssumedMaxChannelAdjustment: ", s1, ", [", " to ");
                    stringBuilder0.append(v);
                    stringBuilder0.append("]");
                    Log.w("MediaCodecInfo", stringBuilder0.toString());
                    v11 = v;
                }
                if(v11 < v10) {
                    this.a("channelCount.support, " + v10);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean zze(zzad zzad0) {
        if(this.a) {
            return this.zze;
        }
        Pair pair0 = zzqx.zzb(zzad0);
        return pair0 != null && ((int)(((Integer)pair0.first))) == 42;
    }

    public final boolean zzf(int v, int v1, double f) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            this.a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
        if(mediaCodecInfo$VideoCapabilities0 == null) {
            this.a("sizeAndRate.vCaps");
            return false;
        }
        if(!zzqf.b(mediaCodecInfo$VideoCapabilities0, v, v1, f)) {
            if(v < v1 && (!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzeg.zzb)) && zzqf.b(mediaCodecInfo$VideoCapabilities0, v1, v, f)) {
                StringBuilder stringBuilder0 = f.n("sizeAndRate.rotated, ", v, "x", v1, "x");
                stringBuilder0.append(f);
                StringBuilder stringBuilder1 = new StringBuilder("AssumedSupport [");
                stringBuilder1.append(stringBuilder0.toString());
                stringBuilder1.append("] [");
                stringBuilder1.append(this.zza);
                stringBuilder1.append(", ");
                Log.d("MediaCodecInfo", e.i(stringBuilder1, this.zzb, "] [", zzeg.zze, "]"));
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
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
        if(mediaCodecInfo$CodecCapabilities0 != null) {
            return mediaCodecInfo$CodecCapabilities0.profileLevels == null ? new MediaCodecInfo.CodecProfileLevel[0] : mediaCodecInfo$CodecCapabilities0.profileLevels;
        }
        return new MediaCodecInfo.CodecProfileLevel[0];
    }
}

