package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class zzawb {
    public static final Pattern a;
    public static final HashMap b;
    public static final SparseIntArray c;
    public static final SparseIntArray d;
    public static final HashMap e;
    public static int f;

    static {
        zzavp.zzb("OMX.google.raw.decoder");
        zzawb.a = Pattern.compile("^\\D?(\\d+)$");
        zzawb.b = new HashMap();
        zzawb.f = -1;
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        zzawb.c = sparseIntArray0;
        sparseIntArray0.put(66, 1);
        sparseIntArray0.put(77, 2);
        sparseIntArray0.put(88, 4);
        sparseIntArray0.put(100, 8);
        SparseIntArray sparseIntArray1 = new SparseIntArray();
        zzawb.d = sparseIntArray1;
        sparseIntArray1.put(10, 1);
        sparseIntArray1.put(11, 4);
        sparseIntArray1.put(12, 8);
        sparseIntArray1.put(13, 16);
        sparseIntArray1.put(20, 0x20);
        sparseIntArray1.put(21, 0x40);
        sparseIntArray1.put(22, 0x80);
        sparseIntArray1.put(30, 0x100);
        sparseIntArray1.put(0x1F, 0x200);
        sparseIntArray1.put(0x20, 0x400);
        sparseIntArray1.put(40, 0x800);
        sparseIntArray1.put(41, 0x1000);
        sparseIntArray1.put(42, 0x2000);
        sparseIntArray1.put(50, 0x4000);
        sparseIntArray1.put(51, 0x8000);
        sparseIntArray1.put(52, 0x10000);
        HashMap hashMap0 = new HashMap();
        zzawb.e = hashMap0;
        hashMap0.put("L30", 1);
        hashMap0.put("L60", 4);
        hashMap0.put("L63", 16);
        hashMap0.put("L90", 0x40);
        hashMap0.put("L93", 0x100);
        hashMap0.put("L120", 0x400);
        hashMap0.put("L123", 0x1000);
        hashMap0.put("L150", 0x4000);
        hashMap0.put("L153", 0x10000);
        hashMap0.put("L156", 0x40000);
        hashMap0.put("L180", 0x100000);
        hashMap0.put("L183", 0x400000);
        hashMap0.put("L186", 0x1000000);
        hashMap0.put("H30", 2);
        hashMap0.put("H60", 8);
        hashMap0.put("H63", 0x20);
        hashMap0.put("H90", 0x80);
        hashMap0.put("H93", 0x200);
        hashMap0.put("H120", 0x800);
        hashMap0.put("H123", 0x2000);
        hashMap0.put("H150", 0x8000);
        hashMap0.put("H153", 0x20000);
        hashMap0.put("H156", 0x80000);
        hashMap0.put("H180", 0x200000);
        hashMap0.put("H183", 0x800000);
        hashMap0.put("H186", 0x2000000);
    }

    public static ArrayList a(i1 i10, j1 j10) {
        MediaCodecInfo mediaCodecInfo1;
        String s2;
        int v2;
        String[] arr_s;
        String s1;
        MediaCodecInfo mediaCodecInfo0;
        String s;
        ArrayList arrayList0;
        try {
            arrayList0 = new ArrayList();
            s = i10.a;
            int v = j10.zza();
            boolean z = j10.zzd();
            int v1 = 0;
            while(true) {
                if(v1 >= v) {
                    return arrayList0;
                }
                mediaCodecInfo0 = j10.zzb(v1);
                s1 = mediaCodecInfo0.getName();
                if(!mediaCodecInfo0.isEncoder()) {
                    if(z) {
                        arr_s = mediaCodecInfo0.getSupportedTypes();
                        v2 = 0;
                    label_17:
                        if(v2 >= arr_s.length) {
                            goto label_18;
                        }
                        break;
                    }
                    else if(!s1.endsWith(".secure")) {
                        arr_s = mediaCodecInfo0.getSupportedTypes();
                        v2 = 0;
                        goto label_17;
                    }
                }
            label_18:
                ++v1;
            }
            s2 = arr_s[v2];
            if(s2.equalsIgnoreCase(s)) {
                goto label_22;
            }
            else {
                mediaCodecInfo1 = mediaCodecInfo0;
                ++v2;
                mediaCodecInfo0 = mediaCodecInfo1;
                goto label_17;
            }
            ++v2;
            mediaCodecInfo0 = mediaCodecInfo1;
            goto label_17;
        }
        catch(Exception exception0) {
            throw new zzavw("Failed to query underlying media codecs", exception0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        try {
        label_22:
            MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = mediaCodecInfo0.getCapabilitiesForType(s2);
            boolean z1 = j10.a(s, mediaCodecInfo$CodecCapabilities0);
            mediaCodecInfo1 = mediaCodecInfo0;
            if(z && i10.b == z1 || !z && !i10.b) {
                arrayList0.add(zzavp.zza(s1, s, mediaCodecInfo$CodecCapabilities0, false, false));
            }
            else if(!z && z1) {
                arrayList0.add(zzavp.zza((s1 + ".secure"), s, mediaCodecInfo$CodecCapabilities0, false, true));
                return arrayList0;
            }
            ++v2;
            mediaCodecInfo0 = mediaCodecInfo1;
            goto label_17;
        }
        catch(Exception exception1) {
            try {
                Log.e("MediaCodecUtil", "Failed to query codec " + s1 + " (" + s2 + ")");
                throw exception1;
            }
            catch(Exception exception0) {
            }
        }
        throw new zzavw("Failed to query underlying media codecs", exception0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }

    public static int zza() throws zzavw {
        int v = zzawb.f;
        if(v == -1) {
            zzavp zzavp0 = zzawb.zzc("video/avc", false);
            if(zzavp0 == null) {
                v = 0;
            }
            else {
                MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = zzavp0.zzg();
                int v2 = 0;
                for(int v1 = 0; v1 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v1) {
                    int v3 = arr_mediaCodecInfo$CodecProfileLevel[v1].level;
                    int v4 = 0x6300;
                    if(v3 != 1 && v3 != 2) {
                        v4 = 0x65400;
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
                            default: {
                                v4 = -1;
                            }
                        }
                    }
                    v2 = Math.max(v4, v2);
                }
                v = Math.max(v2, 0x54600);
            }
            zzawb.f = v;
        }
        return v;
    }

    public static Pair zzb(String s) {
        Integer integer1;
        Integer integer0;
        String[] arr_s = s.split("\\.");
        int v = 2;
        switch(arr_s[0]) {
            case "avc1": 
            case "avc2": {
                if(arr_s.length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s);
                    return null;
                }
                try {
                    if(arr_s[1].length() == 6) {
                        integer0 = Integer.parseInt(arr_s[1].substring(0, 2), 16);
                        integer1 = Integer.parseInt(arr_s[1].substring(4), 16);
                        return new Pair(zzawb.c.get(((int)integer0)), zzawb.d.get(((int)integer1)));
                    }
                    if(arr_s.length < 3) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s);
                        return null;
                    }
                    integer0 = Integer.parseInt(arr_s[1]);
                    integer1 = Integer.parseInt(arr_s[2]);
                    return new Pair(zzawb.c.get(((int)integer0)), zzawb.d.get(((int)integer1)));
                }
                catch(NumberFormatException unused_ex) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s);
                    return null;
                }
            }
            case "hev1": 
            case "hvc1": {
                if(arr_s.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + s);
                    return null;
                }
                Matcher matcher0 = zzawb.a.matcher(arr_s[1]);
                if(!matcher0.matches()) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + s);
                    return null;
                }
                String s1 = matcher0.group(1);
                boolean z = false;
                if("1".equals(s1)) {
                    z = true;
                    v = 1;
                }
                else if("2".equals(s1)) {
                    z = true;
                }
                if(z) {
                    Integer integer2 = (Integer)zzawb.e.get(arr_s[3]);
                    if(integer2 == null) {
                        Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher0.group(1));
                        return null;
                    }
                    return new Pair(v, integer2);
                }
                Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + s1);
                return null;
            }
            default: {
                return null;
            }
        }
    }

    public static zzavp zzc(String s, boolean z) throws zzavw {
        List list0 = zzawb.zzd(s, z);
        return list0.isEmpty() ? null : ((zzavp)list0.get(0));
    }

    public static List zzd(String s, boolean z) throws zzavw {
        synchronized(zzawb.class) {
            i1 i10 = new i1(s, z);
            HashMap hashMap0 = zzawb.b;
            List list0 = (List)hashMap0.get(i10);
            if(list0 != null) {
                return list0;
            }
            ArrayList arrayList0 = zzawb.a(i10, new k1(z));
            if(z) {
                boolean z1 = !arrayList0.isEmpty();
            }
            List list1 = Collections.unmodifiableList(arrayList0);
            hashMap0.put(i10, list1);
            return list1;
        }
    }
}

