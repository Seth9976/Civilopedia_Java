package com.google.android.gms.internal.ads;

public final class zzaze {
    public static boolean zza(String s) {
        if(s == null) {
            return "audio".equals(null);
        }
        int v = s.indexOf(0x2F);
        if(v == -1) {
            throw new IllegalArgumentException("Invalid mime type: " + s);
        }
        return "audio".equals(s.substring(0, v));
    }

    public static boolean zzb(String s) {
        if(s == null) {
            return "video".equals(null);
        }
        int v = s.indexOf(0x2F);
        if(v == -1) {
            throw new IllegalArgumentException("Invalid mime type: " + s);
        }
        return "video".equals(s.substring(0, v));
    }
}

