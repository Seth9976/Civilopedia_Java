package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class zzapf {
    public static final char[] a;

    static {
        zzapf.a = "0123456789abcdef".toCharArray();
    }

    public static long zza(double f, int v, DisplayMetrics displayMetrics0) {
        return Math.round(f / ((double)displayMetrics0.density));
    }

    public static Activity zzb(View view0) {
        View view1 = view0.getRootView();
        if(view1 != null) {
            view0 = view1;
        }
        Context context0 = view0.getContext();
        for(int v = 0; context0 instanceof ContextWrapper && v < 10; ++v) {
            if(context0 instanceof Activity) {
                return (Activity)context0;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
        }
        return null;
    }

    public static String zzc(byte[] arr_b) {
        char[] arr_c = new char[arr_b.length + arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            int v2 = v + v;
            arr_c[v2] = zzapf.a[(v1 & 0xFF) >>> 4];
            arr_c[v2 + 1] = zzapf.a[v1 & 15];
        }
        return new String(arr_c);
    }

    public static String zzd(String s) {
        if(s != null && s.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uUID0 = UUID.fromString(s);
            byte[] arr_b = new byte[16];
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            byteBuffer0.putLong(uUID0.getMostSignificantBits());
            byteBuffer0.putLong(uUID0.getLeastSignificantBits());
            return zzamn.zza(arr_b, true);
        }
        return s;
    }

    public static String zze(Throwable throwable0) {
        StringWriter stringWriter0 = new StringWriter();
        throwable0.printStackTrace(new PrintWriter(stringWriter0));
        return stringWriter0.toString();
    }

    public static boolean zzf() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zzg(String s) [...] // Potential decryptor

    public static boolean zzh(DisplayMetrics displayMetrics0) {
        return displayMetrics0 != null && displayMetrics0.density != 0.0f;
    }

    public static byte[] zzi(String s) {
        int v = s.length();
        if(v % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v; v1 += 2) {
            arr_b[v1 / 2] = (byte)(Character.digit(s.charAt(v1 + 1), 16) + (Character.digit(s.charAt(v1), 16) << 4));
        }
        return arr_b;
    }
}

