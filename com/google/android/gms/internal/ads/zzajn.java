package com.google.android.gms.internal.ads;

import A.f;
import android.util.Log;
import i3.e;
import java.util.Locale;

public final class zzajn {
    public static final String a = null;
    public static final String zza = "Volley";
    public static final boolean zzb;

    static {
        zzajn.zzb = Log.isLoggable("Volley", 2);
        zzajn.a = "com.google.android.gms.internal.ads.zzajn";
    }

    public static String a(String s, Object[] arr_object) {
        String s1 = String.format(Locale.US, s, arr_object);
        StackTraceElement[] arr_stackTraceElement = new Throwable().fillInStackTrace().getStackTrace();
        for(int v = 2; v < arr_stackTraceElement.length; ++v) {
            if(!arr_stackTraceElement[v].getClassName().equals(zzajn.a)) {
                String s2 = arr_stackTraceElement[v].getClassName();
                String s3 = s2.substring(s2.lastIndexOf(46) + 1);
                f.i(s3.substring(s3.lastIndexOf(36) + 1), ".", arr_stackTraceElement[v].getMethodName());
                break;
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder("[");
        stringBuilder0.append(Thread.currentThread().getId());
        stringBuilder0.append("] ");
        stringBuilder0.append("DelegatingMethodAccessorImpl.invoke");
        return e.h(stringBuilder0, ": ", s1);
    }

    public static void zza(String s, Object[] arr_object) {
        Log.d("Volley", zzajn.a(s, arr_object));
    }

    public static void zzb(String s, Object[] arr_object) {
        Log.e("Volley", zzajn.a(s, arr_object));
    }

    public static void zzc(Throwable throwable0, String s, Object[] arr_object) {
        Log.e("Volley", zzajn.a(s, arr_object), throwable0);
    }

    public static void zzd(String s, Object[] arr_object) {
        if(zzajn.zzb) {
            Log.v("Volley", zzajn.a(s, arr_object));
        }
    }
}

