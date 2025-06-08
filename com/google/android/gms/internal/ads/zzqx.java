package com.google.android.gms.internal.ads;

import A.f;
import android.annotation.SuppressLint;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
public final class zzqx {
    public static final Pattern a;
    public static final HashMap b;
    public static int c;
    public static final int zza;

    static {
        zzqx.a = Pattern.compile("^\\D?(\\d+)$");
        zzqx.b = new HashMap();
        zzqx.c = -1;
    }

    public static ArrayList a(hb hb0, ib ib0) {
        int v6;
        String s7;
        StringBuilder stringBuilder0;
        int v5;
        int v4;
        String s6;
        String s5;
        boolean z8;
        boolean z7;
        boolean z6;
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0;
        String s2;
        String s1;
        MediaCodecInfo mediaCodecInfo0;
        int v1;
        int v;
        String s;
        ArrayList arrayList0;
        try {
            arrayList0 = new ArrayList();
            s = hb0.a;
            v = ib0.zza();
            boolean z = ib0.zze();
            v1 = 0;
            while(true) {
            label_5:
                if(v1 >= v) {
                    return arrayList0;
                }
                mediaCodecInfo0 = ib0.zzb(v1);
                int v2 = zzeg.zza;
                if(v2 < 29 || !mediaCodecInfo0.isAlias()) {
                    s1 = mediaCodecInfo0.getName();
                    if(!mediaCodecInfo0.isEncoder() && (z || !s1.endsWith(".secure")) && (v2 >= 21 || !"CIPAACDecoder".equals(s1) && !"CIPMP3Decoder".equals(s1) && !"CIPVorbisDecoder".equals(s1) && !"CIPAMRNBDecoder".equals(s1) && !"AACDecoder".equals(s1) && !"MP3Decoder".equals(s1)) && (v2 >= 24 || (!"OMX.SEC.aac.dec".equals(s1) && !"OMX.Exynos.AAC.Decoder".equals(s1) || !"samsung".equals(zzeg.zzc) || !zzeg.zzb.startsWith("zeroflte") && !zzeg.zzb.startsWith("zerolte") && !zzeg.zzb.startsWith("zenlte") && !"SC-05G".equals(zzeg.zzb) && !"marinelteatt".equals(zzeg.zzb) && !"404SC".equals(zzeg.zzb) && !"SC-04G".equals(zzeg.zzb) && !"SCV31".equals(zzeg.zzb))) && (v2 > 19 || (!"OMX.SEC.vp8.dec".equals(s1) || !"samsung".equals(zzeg.zzc) || !zzeg.zzb.startsWith("d2") && !zzeg.zzb.startsWith("serrano") && !zzeg.zzb.startsWith("jflte") && !zzeg.zzb.startsWith("santos") && !zzeg.zzb.startsWith("t0"))) && ((v2 > 19 || !zzeg.zzb.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(s1)) && (v2 > 23 || !"audio/eac3-joc".equals(s) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(s1)))) {
                        String[] arr_s = mediaCodecInfo0.getSupportedTypes();
                        for(int v3 = 0; true; ++v3) {
                            s2 = null;
                            if(v3 >= arr_s.length) {
                                if(s.equals("video/dolby-vision")) {
                                    if("OMX.MS.HEVCDV.Decoder".equals(s1)) {
                                        s2 = "video/hevcdv";
                                    }
                                    else if("OMX.RTK.video.decoder".equals(s1) || "OMX.realtek.video.decoder.tunneled".equals(s1)) {
                                        s2 = "video/dv_hevc";
                                    }
                                }
                                else if(s.equals("audio/alac") && "OMX.lge.alac.decoder".equals(s1)) {
                                    s2 = "audio/x-lg-alac";
                                }
                                else if(s.equals("audio/flac") && "OMX.lge.flac.decoder".equals(s1)) {
                                    s2 = "audio/x-lg-flac";
                                }
                                else if(s.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(s1)) {
                                    s2 = "audio/lg-ac3";
                                }
                                break;
                            }
                            String s3 = arr_s[v3];
                            if(s3.equalsIgnoreCase(s)) {
                                s2 = s3;
                                break;
                            }
                        }
                        if(s2 != null) {
                            break;
                        }
                    }
                }
                goto label_105;
            }
        }
        catch(Exception exception0) {
            throw new zzqr("Failed to query underlying media codecs", exception0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        try {
            mediaCodecInfo$CodecCapabilities0 = mediaCodecInfo0.getCapabilitiesForType(s2);
            boolean z1 = ib0.b("tunneled-playback", s2, mediaCodecInfo$CodecCapabilities0);
            boolean z2 = ib0.a("tunneled-playback", mediaCodecInfo$CodecCapabilities0);
            if(hb0.c) {
                if(z1) {
                label_46:
                    boolean z3 = ib0.b("secure-playback", s2, mediaCodecInfo$CodecCapabilities0);
                    boolean z4 = ib0.a("secure-playback", mediaCodecInfo$CodecCapabilities0);
                    boolean z5 = hb0.b;
                    if(z5) {
                        if(z3) {
                            z3 = true;
                        label_54:
                            z6 = zzeg.zza < 29 ? !zzqx.b(mediaCodecInfo0, s) : mediaCodecInfo0.isHardwareAccelerated();
                            z7 = zzqx.b(mediaCodecInfo0, s);
                            if(zzeg.zza >= 29) {
                                z8 = mediaCodecInfo0.isVendor();
                            }
                            else {
                                String s4 = zzfoc.zza(mediaCodecInfo0.getName());
                                if(!s4.startsWith("omx.google.") && !s4.startsWith("c2.android.")) {
                                    goto label_68;
                                }
                                goto label_71;
                            }
                            goto label_72;
                        }
                    }
                    else if(!z4) {
                        goto label_54;
                    }
                }
            }
            else if(!z2) {
                goto label_46;
            }
            goto label_105;
        }
        catch(Exception exception1) {
            s5 = s2;
            s6 = s1;
            v4 = v1;
            v5 = v;
            goto label_100;
        }
    label_68:
        if(!s4.startsWith("c2.google.")) {
            z8 = true;
            goto label_72;
        }
    label_71:
        z8 = false;
        try {
        label_72:
            if((!z || z5 != z3) && (z || z5)) {
                s5 = s2;
                s7 = s1;
                v4 = v1;
                v6 = v;
                if(!z && z3) {
                    stringBuilder0 = new StringBuilder();
                    goto label_85;
                }
            }
            else {
                s5 = s2;
                s7 = s1;
                v4 = v1;
                v6 = v;
                arrayList0.add(zzqf.zzc(s1, s, s2, mediaCodecInfo$CodecCapabilities0, z6, z7, z8, false, false));
            }
            v5 = v6;
            v1 = v4 + 1;
            v = v5;
            goto label_5;
        }
        catch(Exception exception1) {
            goto label_98;
        }
        try {
        label_85:
            stringBuilder0.append(s7);
            v5 = v6;
            s6 = s7;
            stringBuilder0.append(".secure");
            s6 = s7;
            v5 = v6;
            arrayList0.add(zzqf.zzc(stringBuilder0.toString(), s, s5, mediaCodecInfo$CodecCapabilities0, z6, z7, z8, false, true));
            return arrayList0;
        }
        catch(Exception exception1) {
            goto label_100;
        }
        try {
            v5 = v6;
            v1 = v4 + 1;
            v = v5;
            goto label_5;
        }
        catch(Exception exception1) {
        label_98:
            v5 = v6;
            s6 = s7;
        }
        try {
        label_100:
            if(zzeg.zza > 23 || arrayList0.isEmpty()) {
                Log.e("MediaCodecUtil", "Failed to query codec " + s6 + " (" + s5 + ")");
                throw exception1;
            }
            Log.e("MediaCodecUtil", "Skipping codec " + s6 + " (failed to query capabilities)");
            v1 = v4 + 1;
            v = v5;
            goto label_5;
        label_105:
            v4 = v1;
            v5 = v;
            v1 = v4 + 1;
            v = v5;
            goto label_5;
        }
        catch(Exception exception0) {
        }
        throw new zzqr("Failed to query underlying media codecs", exception0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }

    // 去混淆评级： 低(20)
    public static boolean b(MediaCodecInfo mediaCodecInfo0, String s) {
        if(zzeg.zza >= 29) {
            return mediaCodecInfo0.isSoftwareOnly();
        }
        if(zzbo.zzg(s)) {
            return true;
        }
        String s1 = zzfoc.zza(mediaCodecInfo0.getName());
        return s1.startsWith("arc.") ? false : s1.startsWith("omx.google.") || s1.startsWith("omx.ffmpeg.") || s1.startsWith("omx.sec.") && s1.contains(".sw.") || s1.equals("omx.qcom.video.decoder.hevcswvdec") || s1.startsWith("c2.android.") || s1.startsWith("c2.google.") || !s1.startsWith("omx.") && !s1.startsWith("c2.");
    }

    public static int zza() throws zzqr {
        int v4;
        int v = zzqx.c;
        if(v == -1) {
            zzqf zzqf0 = zzqx.zzc("video/avc", false, false);
            if(zzqf0 == null) {
                v = 0;
            }
            else {
                MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = zzqf0.zzg();
                int v2 = 0;
                for(int v1 = 0; v1 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v1) {
                    int v3 = arr_mediaCodecInfo$CodecProfileLevel[v1].level;
                    if(v3 == 1 || v3 == 2) {
                        v4 = 0x6300;
                    }
                    else {
                        switch(v3) {
                            case 8: 
                            case 16: 
                            case 0x20: {
                                v4 = 0x18C00;
                                break;
                            }
                            case 0x40: {
                                v4 = 0x31800;
                                break;
                            }
                            case 0x80: 
                            case 0x100: {
                                v4 = 0x65400;
                                break;
                            }
                            case 0x200: {
                                v4 = 0xE1000;
                                break;
                            }
                            case 0x400: {
                                v4 = 0x140000;
                                break;
                            }
                            case 0x800: 
                            case 0x1000: {
                                v4 = 0x200000;
                                break;
                            }
                            case 0x2000: {
                                v4 = 0x220000;
                                break;
                            }
                            case 0x4000: {
                                v4 = 0x564000;
                                break;
                            }
                            case 0x8000: 
                            case 0x10000: {
                                v4 = 0x900000;
                                break;
                            }
                            case 0x20000: 
                            case 0x40000: 
                            case 0x80000: {
                                v4 = 0x2200000;
                                break;
                            }
                            default: {
                                v4 = -1;
                            }
                        }
                    }
                    v2 = Math.max(v4, v2);
                }
                v = Math.max(v2, (zzeg.zza < 21 ? 0x2A300 : 0x54600));
            }
            zzqx.c = v;
        }
        return v;
    }

    public static Pair zzb(zzad zzad0) {
        int v13;
        int v12;
        int v11;
        int v9;
        Integer integer2;
        int v8;
        int v7;
        int v6;
        int v5;
        int v4;
        int v3;
        int v2;
        int v1;
        Integer integer1;
        Integer integer0;
        String s = zzad0.zzj;
        if(s == null) {
            return null;
        }
        String[] arr_s = s.split("\\.");
        int v = 2;
        if("video/dolby-vision".equals(zzad0.zzm)) {
            String s1 = zzad0.zzj;
            if(arr_s.length < 3) {
                Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + s1);
                return null;
            }
            Matcher matcher0 = zzqx.a.matcher(arr_s[1]);
            if(!matcher0.matches()) {
                Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + s1);
                return null;
            }
            String s2 = matcher0.group(1);
            if(s2 == null) {
                integer0 = null;
            label_40:
                if(integer0 == null) {
                    Log.w("MediaCodecUtil", "Unknown Dolby Vision profile string: " + s2);
                    return null;
                }
            }
            else {
                switch(s2) {
                    case "00": {
                        integer0 = 1;
                        goto label_40;
                    }
                    case "01": {
                        integer0 = 2;
                        break;
                    }
                    case "02": {
                        integer0 = 4;
                        break;
                    }
                    case "03": {
                        integer0 = 8;
                        break;
                    }
                    case "04": {
                        integer0 = 16;
                        break;
                    }
                    case "05": {
                        integer0 = 0x20;
                        break;
                    }
                    case "06": {
                        integer0 = 0x40;
                        break;
                    }
                    case "07": {
                        integer0 = 0x80;
                        break;
                    }
                    case "08": {
                        integer0 = 0x100;
                        break;
                    }
                    case "09": {
                        integer0 = 0x200;
                        break;
                    }
                    default: {
                        integer0 = null;
                        goto label_40;
                    }
                }
            }
            String s3 = arr_s[2];
            if(s3 == null) {
                integer1 = null;
            }
            else {
                switch(s3) {
                    case "01": {
                        integer1 = 1;
                        break;
                    }
                    case "02": {
                        return new Pair(integer0, 2);
                    }
                    case "03": {
                        return new Pair(integer0, 4);
                    }
                    case "04": {
                        return new Pair(integer0, 8);
                    }
                    case "05": {
                        return new Pair(integer0, 16);
                    }
                    case "06": {
                        return new Pair(integer0, 0x20);
                    }
                    case "07": {
                        return new Pair(integer0, 0x40);
                    }
                    case "08": {
                        return new Pair(integer0, 0x80);
                    }
                    case "09": {
                        return new Pair(integer0, 0x100);
                    }
                    case "10": {
                        return new Pair(integer0, 0x200);
                    }
                    case "11": {
                        return new Pair(integer0, 0x400);
                    }
                    case "12": {
                        return new Pair(integer0, 0x800);
                    }
                    case "13": {
                        return new Pair(integer0, 0x1000);
                    }
                    default: {
                        integer1 = null;
                        break;
                    }
                }
            }
            if(integer1 == null) {
                Log.w("MediaCodecUtil", "Unknown Dolby Vision level string: " + s3);
                return null;
            }
            return new Pair(integer0, integer1);
        }
        switch(arr_s[0]) {
            case "av01": {
                String s4 = zzad0.zzj;
                zzo zzo0 = zzad0.zzy;
                if(arr_s.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + s4);
                    return null;
                }
                try {
                    v1 = Integer.parseInt(arr_s[1]);
                    v2 = Integer.parseInt(arr_s[2].substring(0, 2));
                    v3 = Integer.parseInt(arr_s[3]);
                }
                catch(NumberFormatException unused_ex) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + s4);
                    return null;
                }
                if(v1 != 0) {
                    f.p(v1, "Unknown AV1 profile: ", "MediaCodecUtil");
                    return null;
                }
                switch(v3) {
                    case 8: {
                        v4 = 1;
                        break;
                    }
                    case 10: {
                        v4 = zzo0 == null || zzo0.zze == null && (zzo0.zzd != 6 && zzo0.zzd != 7) ? 2 : 0x1000;
                        break;
                    }
                    default: {
                        f.p(v3, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                        return null;
                    }
                }
                switch(v2) {
                    case 0: {
                        v = 1;
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        v = 4;
                        break;
                    }
                    case 3: {
                        v = 8;
                        break;
                    }
                    case 4: {
                        v = 16;
                        break;
                    }
                    case 5: {
                        v = 0x20;
                        break;
                    }
                    case 6: {
                        v = 0x40;
                        break;
                    }
                    case 7: {
                        v = 0x80;
                        break;
                    }
                    case 8: {
                        v = 0x100;
                        break;
                    }
                    case 9: {
                        v = 0x200;
                        break;
                    }
                    case 10: {
                        v = 0x400;
                        break;
                    }
                    case 11: {
                        v = 0x800;
                        break;
                    }
                    case 12: {
                        v = 0x1000;
                        break;
                    }
                    case 13: {
                        v = 0x2000;
                        break;
                    }
                    case 14: {
                        v = 0x4000;
                        break;
                    }
                    case 15: {
                        v = 0x8000;
                        break;
                    }
                    case 16: {
                        v = 0x10000;
                        break;
                    }
                    case 17: {
                        v = 0x20000;
                        break;
                    }
                    case 18: {
                        v = 0x40000;
                        break;
                    }
                    case 19: {
                        v = 0x80000;
                        break;
                    }
                    case 20: {
                        v = 0x100000;
                        break;
                    }
                    case 21: {
                        v = 0x200000;
                        break;
                    }
                    case 22: {
                        v = 0x400000;
                        break;
                    }
                    case 23: {
                        v = 0x800000;
                        break;
                    }
                    default: {
                        v = -1;
                    }
                }
                if(v == -1) {
                    f.p(v2, "Unknown AV1 level: ", "MediaCodecUtil");
                    return null;
                }
                return new Pair(v4, v);
            }
            case "avc1": 
            case "avc2": {
                String s5 = zzad0.zzj;
                if(arr_s.length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s5);
                    return null;
                }
                try {
                    if(arr_s[1].length() == 6) {
                        v5 = Integer.parseInt(arr_s[1].substring(0, 2), 16);
                        v6 = Integer.parseInt(arr_s[1].substring(4), 16);
                    }
                    else {
                        if(arr_s.length < 3) {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s5);
                            return null;
                        }
                        v5 = Integer.parseInt(arr_s[1]);
                        v6 = Integer.parseInt(arr_s[2]);
                    }
                }
                catch(NumberFormatException unused_ex) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s5);
                    return null;
                }
                switch(v5) {
                    case 66: {
                        v = 1;
                        break;
                    }
                    case 77: {
                        break;
                    }
                    case 88: {
                        v = 4;
                        break;
                    }
                    case 100: {
                        v = 8;
                        break;
                    }
                    case 110: {
                        v = 16;
                        break;
                    }
                    case 0x7A: {
                        v = 0x20;
                        break;
                    }
                    case 0xF4: {
                        v = 0x40;
                        break;
                    }
                    default: {
                        v = -1;
                    }
                }
                if(v == -1) {
                    f.p(v5, "Unknown AVC profile: ", "MediaCodecUtil");
                    return null;
                }
                switch(v6) {
                    case 10: {
                        v7 = 1;
                        break;
                    }
                    case 11: {
                        v7 = 4;
                        break;
                    }
                    case 12: {
                        v7 = 8;
                        break;
                    }
                    case 13: {
                        v7 = 16;
                        break;
                    }
                    case 20: {
                        v7 = 0x20;
                        break;
                    }
                    case 21: {
                        v7 = 0x40;
                        break;
                    }
                    case 22: {
                        v7 = 0x80;
                        break;
                    }
                    case 30: {
                        v7 = 0x100;
                        break;
                    }
                    case 0x1F: {
                        v7 = 0x200;
                        break;
                    }
                    case 0x20: {
                        v7 = 0x400;
                        break;
                    }
                    case 40: {
                        v7 = 0x800;
                        break;
                    }
                    case 41: {
                        v7 = 0x1000;
                        break;
                    }
                    case 42: {
                        v7 = 0x2000;
                        break;
                    }
                    case 50: {
                        v7 = 0x4000;
                        break;
                    }
                    case 51: {
                        v7 = 0x8000;
                        break;
                    }
                    case 52: {
                        v7 = 0x10000;
                        break;
                    }
                    default: {
                        v7 = -1;
                    }
                }
                if(v7 == -1) {
                    f.p(v6, "Unknown AVC level: ", "MediaCodecUtil");
                    return null;
                }
                return new Pair(v, v7);
            }
            case "hev1": 
            case "hvc1": {
                String s6 = zzad0.zzj;
                if(arr_s.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + s6);
                    return null;
                }
                Matcher matcher1 = zzqx.a.matcher(arr_s[1]);
                if(!matcher1.matches()) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + s6);
                    return null;
                }
                String s7 = matcher1.group(1);
                boolean z = false;
                if("1".equals(s7)) {
                    z = true;
                    v8 = 1;
                }
                else if("2".equals(s7)) {
                    z = true;
                    v8 = 2;
                }
                if(z) {
                    String s8 = arr_s[3];
                    if(s8 == null) {
                        integer2 = null;
                    }
                    else {
                        switch(s8) {
                            case "H120": {
                                return new Pair(v8, 0x800);
                            }
                            case "H123": {
                                return new Pair(v8, 0x2000);
                            }
                            case "H150": {
                                return new Pair(v8, 0x8000);
                            }
                            case "H153": {
                                return new Pair(v8, 0x20000);
                            }
                            case "H156": {
                                return new Pair(v8, 0x80000);
                            }
                            case "H180": {
                                return new Pair(v8, 0x200000);
                            }
                            case "H183": {
                                return new Pair(v8, 0x800000);
                            }
                            case "H186": {
                                return new Pair(v8, 0x2000000);
                            }
                            case "H30": {
                                return new Pair(v8, 2);
                            }
                            case "H60": {
                                return new Pair(v8, 8);
                            }
                            case "H63": {
                                return new Pair(v8, 0x20);
                            }
                            case "H90": {
                                return new Pair(v8, 0x80);
                            }
                            case "H93": {
                                return new Pair(v8, 0x200);
                            }
                            case "L120": {
                                return new Pair(v8, 0x400);
                            }
                            case "L123": {
                                return new Pair(v8, 0x1000);
                            }
                            case "L150": {
                                return new Pair(v8, 0x4000);
                            }
                            case "L153": {
                                return new Pair(v8, 0x10000);
                            }
                            case "L156": {
                                return new Pair(v8, 0x40000);
                            }
                            case "L180": {
                                return new Pair(v8, 0x100000);
                            }
                            case "L183": {
                                return new Pair(v8, 0x400000);
                            }
                            case "L186": {
                                return new Pair(v8, 0x1000000);
                            }
                            case "L30": {
                                integer2 = 1;
                                break;
                            }
                            case "L60": {
                                return new Pair(v8, 4);
                            }
                            case "L63": {
                                return new Pair(v8, 16);
                            }
                            case "L90": {
                                return new Pair(v8, 0x40);
                            }
                            case "L93": {
                                return new Pair(v8, 0x100);
                            }
                            default: {
                                integer2 = null;
                                break;
                            }
                        }
                    }
                    if(integer2 == null) {
                        Log.w("MediaCodecUtil", "Unknown HEVC level string: " + s8);
                        return null;
                    }
                    return new Pair(v8, integer2);
                }
                Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + s7);
                return null;
            }
            case "mp4a": {
                String s9 = zzad0.zzj;
                if(arr_s.length != 3) {
                    Log.w("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + s9);
                    return null;
                }
                try {
                    if("audio/mp4a-latm".equals(zzbo.zzd(Integer.parseInt(arr_s[1], 16)))) {
                        switch(Integer.parseInt(arr_s[2])) {
                            case 1: {
                                v9 = 1;
                                break;
                            }
                            case 2: {
                                v9 = 2;
                                break;
                            }
                            case 3: {
                                v9 = 3;
                                break;
                            }
                            case 4: {
                                v9 = 4;
                                break;
                            }
                            case 5: {
                                v9 = 5;
                                break;
                            }
                            case 6: {
                                v9 = 6;
                                break;
                            }
                            case 17: {
                                v9 = 17;
                                break;
                            }
                            case 20: {
                                v9 = 20;
                                break;
                            }
                            case 23: {
                                v9 = 23;
                                break;
                            }
                            case 29: {
                                v9 = 29;
                                break;
                            }
                            case 39: {
                                v9 = 39;
                                break;
                            }
                            case 42: {
                                v9 = 42;
                                break;
                            }
                            default: {
                                v9 = -1;
                            }
                        }
                        return v9 == -1 ? null : new Pair(v9, 0);
                    }
                }
                catch(NumberFormatException unused_ex) {
                    Log.w("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + s9);
                }
                return null;
            }
            case "vp09": {
                int v10 = 0x800;
                String s10 = zzad0.zzj;
                if(arr_s.length < 3) {
                    Log.w("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + s10);
                    return null;
                }
                try {
                    v11 = Integer.parseInt(arr_s[1]);
                    v12 = Integer.parseInt(arr_s[2]);
                    switch(v11) {
                        case 0: {
                            v13 = 1;
                            goto label_322;
                        }
                        case 1: {
                            v13 = 2;
                            goto label_322;
                        }
                        case 2: {
                            v13 = 4;
                            goto label_322;
                        }
                        case 3: {
                            goto label_321;
                        }
                    }
                }
                catch(NumberFormatException unused_ex) {
                    Log.w("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + s10);
                    return null;
                }
                v13 = -1;
                goto label_322;
            label_321:
                v13 = 8;
            label_322:
                if(v13 == -1) {
                    f.p(v11, "Unknown VP9 profile: ", "MediaCodecUtil");
                    return null;
                }
                if(v12 == 10) {
                    v10 = 1;
                }
                else {
                    switch(v12) {
                        case 11: {
                            v10 = 2;
                            break;
                        }
                        case 20: {
                            v10 = 4;
                            break;
                        }
                        case 21: {
                            v10 = 8;
                            break;
                        }
                        case 30: {
                            v10 = 16;
                            break;
                        }
                        case 0x1F: {
                            v10 = 0x20;
                            break;
                        }
                        case 40: {
                            v10 = 0x40;
                            break;
                        }
                        case 41: {
                            v10 = 0x80;
                            break;
                        }
                        case 50: {
                            v10 = 0x100;
                            break;
                        }
                        case 51: {
                            v10 = 0x200;
                            break;
                        }
                        case 60: {
                            break;
                        }
                        case 61: {
                            v10 = 0x1000;
                            break;
                        }
                        case 62: {
                            v10 = 0x2000;
                            break;
                        }
                        default: {
                            v10 = -1;
                        }
                    }
                }
                if(v10 == -1) {
                    f.p(v12, "Unknown VP9 level: ", "MediaCodecUtil");
                    return null;
                }
                return new Pair(v13, v10);
            }
            default: {
                return null;
            }
        }
    }

    public static zzqf zzc(String s, boolean z, boolean z1) throws zzqr {
        List list0 = zzqx.zzf(s, false, false);
        return list0.isEmpty() ? null : ((zzqf)list0.get(0));
    }

    public static zzqf zzd() throws zzqr {
        return zzqx.zzc("audio/raw", false, false);
    }

    public static String zze(zzad zzad0) {
        if("audio/eac3-joc".equals(zzad0.zzm)) {
            return "audio/eac3";
        }
        if("video/dolby-vision".equals(zzad0.zzm)) {
            Pair pair0 = zzqx.zzb(zzad0);
            if(pair0 != null) {
                switch(((int)(((Integer)pair0.first)))) {
                    case 16: 
                    case 0x100: {
                        return "video/hevc";
                    }
                    case 0x200: {
                        return "video/avc";
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static List zzf(String s, boolean z, boolean z1) throws zzqr {
        synchronized(zzqx.class) {
            hb hb0 = new hb(s, z, z1);
            HashMap hashMap0 = zzqx.b;
            List list0 = (List)hashMap0.get(hb0);
            if(list0 != null) {
                return list0;
            }
            int v1 = zzeg.zza;
            k1 k10 = v1 >= 21 ? new k1(z, z1) : new S(29);
            ArrayList arrayList0 = zzqx.a(hb0, k10);
            if(z && arrayList0.isEmpty() && v1 >= 21 && v1 <= 23) {
                arrayList0 = zzqx.a(hb0, new S(29));
                if(!arrayList0.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn\'t list secure decoder for: " + s + ". Assuming: " + ((zzqf)arrayList0.get(0)).zza);
                }
            }
            if("audio/raw".equals(s)) {
                if(v1 < 26 && zzeg.zzb.equals("R9") && arrayList0.size() == 1 && ((zzqf)arrayList0.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayList0.add(zzqf.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                Collections.sort(arrayList0, new zzqm(zzqn.zza));
            }
            if(v1 < 21 && arrayList0.size() > 1) {
                String s1 = ((zzqf)arrayList0.get(0)).zza;
                if("OMX.SEC.mp3.dec".equals(s1) || "OMX.SEC.MP3.Decoder".equals(s1) || "OMX.brcm.audio.mp3.decoder".equals(s1)) {
                    Collections.sort(arrayList0, new zzqm(zzqo.zza));
                }
            }
            if(v1 < 0x20 && arrayList0.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqf)arrayList0.get(0)).zza)) {
                arrayList0.add(((zzqf)arrayList0.remove(0)));
            }
            List list1 = zzfrj.zzm(arrayList0);
            hashMap0.put(hb0, list1);
            return list1;
        }
    }

    public static List zzg(List list0, zzad zzad0) {
        List list1 = new ArrayList(list0);
        Collections.sort(list1, new zzqm(new zzql(zzad0)));
        return list1;
    }
}

