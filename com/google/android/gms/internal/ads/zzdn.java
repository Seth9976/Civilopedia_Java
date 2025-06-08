package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

public final class zzdn {
    public static String a(String s, Throwable throwable0) {
        if(throwable0 == null) {
            return TextUtils.isEmpty(null) ? s : s + "\n  " + null.replace("\n", "\n  ") + "\n";
        }
        for(Throwable throwable1 = throwable0; throwable1 != null; throwable1 = throwable1.getCause()) {
            if(throwable1 instanceof UnknownHostException) {
                return TextUtils.isEmpty("UnknownHostException (no network)") ? s : s + "\n  " + "UnknownHostException (no network)" + "\n";
            }
        }
        CharSequence charSequence0 = Log.getStackTraceString(throwable0).trim().replace("\t", "    ");
        return TextUtils.isEmpty(charSequence0) ? s : s + "\n  " + ((String)charSequence0).replace("\n", "\n  ") + "\n";
    }

    @Pure
    public static void zza(String s, String s1, Throwable throwable0) {
        Log.e(s, zzdn.a(s1, throwable0));
    }

    @Pure
    public static void zzb(String s, String s1, Throwable throwable0) {
        Log.w(s, zzdn.a(s1, throwable0));
    }
}

