package com.google.android.gms.internal.ads;

import Y.m;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzbo {
    public static final ArrayList a;
    public static final Pattern b;

    static {
        zzbo.a = new ArrayList();
        zzbo.b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }

    public static m a(String s) {
        Matcher matcher0 = zzbo.b.matcher(s);
        if(!matcher0.matches()) {
            return null;
        }
        String s1 = matcher0.group(1);
        s1.getClass();
        String s2 = matcher0.group(2);
        try {
            Integer.parseInt(s1, 16);
            if(s2 != null) {
                return new m(Integer.parseInt(s2), 3);
            }
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
        return new m(0, 3);
    }

    public static String b(String s) {
        if(s == null) {
            return null;
        }
        int v = s.indexOf(0x2F);
        return v == -1 ? null : s.substring(0, v);
    }

    public static int zza(String s, String s1) {
        switch(s) {
            case "audio/ac3": {
                return 5;
            }
            case "audio/ac4": {
                return 17;
            }
            case "audio/eac3": {
                return 6;
            }
            case "audio/eac3-joc": {
                return 18;
            }
            case "audio/mp4a-latm": {
                if(s1 == null) {
                    return 0;
                }
                m m0 = zzbo.a(s1);
                return m0 == null ? 0 : m0.zza();
            }
            case "audio/mpeg": {
                return 9;
            }
            case "audio/true-hd": {
                return 14;
            }
            case "audio/vnd.dts": {
                return 7;
            }
            case "audio/vnd.dts.hd": {
                return 8;
            }
            default: {
                return 0;
            }
        }
    }

    public static int zzb(String s) {
        if(TextUtils.isEmpty(s)) {
            return -1;
        }
        if(zzbo.zzg(s)) {
            return 1;
        }
        if(!zzbo.zzh(s)) {
            if(!"text".equals(zzbo.b(s)) && !"application/cea-608".equals(s) && !"application/cea-708".equals(s) && !"application/x-mp4-cea-608".equals(s) && !"application/x-subrip".equals(s) && !"application/ttml+xml".equals(s) && !"application/x-quicktime-tx3g".equals(s) && !"application/x-mp4-vtt".equals(s) && !"application/x-rawcc".equals(s) && !"application/vobsub".equals(s) && !"application/pgs".equals(s) && !"application/dvbsubs".equals(s)) {
                if("image".equals(zzbo.b(s))) {
                    return 4;
                }
                if(!"application/id3".equals(s) && !"application/x-emsg".equals(s) && !"application/x-scte35".equals(s)) {
                    if(!"application/x-camera-motion".equals(s)) {
                        ArrayList arrayList0 = zzbo.a;
                        if(arrayList0.size() <= 0) {
                            return -1;
                        }
                        arrayList0.get(0).getClass();
                        throw new ClassCastException();
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }

    public static String zzd(int v) {
        switch(v) {
            case 0x20: {
                return "video/mp4v-es";
            }
            case 33: {
                return "video/avc";
            }
            case 35: {
                return "video/hevc";
            }
            case 0x60: 
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 101: {
                return "video/mpeg2";
            }
            case 0x40: 
            case 102: 
            case 103: 
            case 104: {
                return "audio/mp4a-latm";
            }
            case 106: {
                return "video/mpeg";
            }
            case 105: 
            case 107: {
                return "audio/mpeg";
            }
            case 0xA3: {
                return "video/wvc1";
            }
            case 0xA5: {
                return "audio/ac3";
            }
            case 0xA6: {
                return "audio/eac3";
            }
            case 170: 
            case 0xAB: {
                return "audio/vnd.dts.hd";
            }
            case 0xA9: 
            case 0xAC: {
                return "audio/vnd.dts";
            }
            case 0xAD: {
                return "audio/opus";
            }
            case 0xAE: {
                return "audio/ac4";
            }
            case 0xB1: {
                return "video/x-vnd.on2.vp9";
            }
            default: {
                return null;
            }
        }
    }

    public static String zze(String s) {
        switch(s) {
            case "audio/mp3": {
                return "audio/mpeg";
            }
            case "audio/x-flac": {
                return "audio/flac";
            }
            case "audio/x-wav": {
                return "audio/wav";
            }
            default: {
                return s;
            }
        }
    }

    public static boolean zzf(String s, String s1) {
        if(s == null) {
            return false;
        }
        switch(s) {
            case "audio/ac3": {
                return true;
            }
            case "audio/eac3": {
                return true;
            }
            case "audio/eac3-joc": {
                return true;
            }
            case "audio/flac": {
                return true;
            }
            case "audio/g711-alaw": {
                return true;
            }
            case "audio/g711-mlaw": {
                return true;
            }
            case "audio/mp4a-latm": {
                if(s1 == null) {
                    return false;
                }
                m m0 = zzbo.a(s1);
                if(m0 == null) {
                    return false;
                }
                switch(m0.zza()) {
                    case 0: 
                    case 16: {
                        return false;
                    }
                    default: {
                        return true;
                    }
                }
            }
            case "audio/mpeg": {
                return true;
            }
            case "audio/mpeg-L1": {
                return true;
            }
            case "audio/mpeg-L2": {
                return true;
            }
            case "audio/raw": {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean zzg(String s) {
        return "audio".equals(zzbo.b(s));
    }

    public static boolean zzh(String s) {
        return "video".equals(zzbo.b(s));
    }
}

