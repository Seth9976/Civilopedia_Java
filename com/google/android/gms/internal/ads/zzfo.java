package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzfo {
    public static final Pattern a;
    public static final Pattern b;

    static {
        zzfo.a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
        zzfo.b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    }

    public static long zza(String s, String s1) {
        long v = -1L;
        if(!TextUtils.isEmpty(s)) {
            try {
                v = Long.parseLong(s);
            }
            catch(NumberFormatException unused_ex) {
                Log.e("HttpUtil", "Unexpected Content-Length [" + s + "]");
            }
        }
        if(!TextUtils.isEmpty(s1)) {
            Matcher matcher0 = zzfo.a.matcher(s1);
            if(matcher0.matches()) {
                try {
                    String s2 = matcher0.group(2);
                    if(s2 == null) {
                        throw null;
                    }
                    long v1 = Long.parseLong(s2);
                    String s3 = matcher0.group(1);
                    if(s3 == null) {
                        throw null;
                    }
                    long v2 = v1 - Long.parseLong(s3) + 1L;
                    if(v < 0L) {
                        return v2;
                    }
                    if(v != v2) {
                        Log.w("HttpUtil", "Inconsistent headers [" + s + "] [" + s1 + "]");
                        return Math.max(v, v2);
                    }
                }
                catch(NumberFormatException unused_ex) {
                    Log.e("HttpUtil", "Unexpected Content-Range [" + s1 + "]");
                }
            }
        }
        return v;
    }

    public static long zzb(String s) {
        if(TextUtils.isEmpty(s)) {
            return -1L;
        }
        Matcher matcher0 = zzfo.b.matcher(s);
        if(matcher0.matches()) {
            String s1 = matcher0.group(1);
            s1.getClass();
            return Long.parseLong(s1);
        }
        return -1L;
    }
}

