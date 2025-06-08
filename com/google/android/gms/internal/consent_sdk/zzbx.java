package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings.Secure;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class zzbx {
    public static String a;

    public static String zza(Context context0) {
        String s1;
        synchronized(zzbx.class) {
            if(zzbx.a == null) {
                ContentResolver contentResolver0 = context0.getContentResolver();
                String s = contentResolver0 == null ? null : Settings.Secure.getString(contentResolver0, "android_id");
                if(s == null || zzbx.zzb()) {
                    s = "emulator";
                }
                for(int v1 = 0; true; ++v1) {
                    try {
                        s1 = "";
                        MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                        messageDigest0.update(s.getBytes());
                        s1 = String.format("%032X", new BigInteger(1, messageDigest0.digest()));
                        break;
                    }
                    catch(NoSuchAlgorithmException unused_ex) {
                    }
                    catch(ArithmeticException unused_ex) {
                        break;
                    }
                }
                zzbx.a = s1;
            }
            return zzbx.a;
        }
    }

    // 去混淆评级： 中等(90)
    public static boolean zzb() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || (Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic") || "google_sdk".equals(Build.PRODUCT));
    }
}

