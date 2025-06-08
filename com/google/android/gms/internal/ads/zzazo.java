package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.os.Build;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public final class zzazo {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;

    static {
        int v = Build.VERSION.SDK_INT != 25 || Build.VERSION.CODENAME.charAt(0) != 0x4F ? Build.VERSION.SDK_INT : 26;
        zzazo.zza = v;
        zzazo.zzb = Build.DEVICE;
        zzazo.zzc = Build.MANUFACTURER;
        zzazo.zzd = Build.MODEL;
        zzazo.zze = Build.DEVICE + ", " + Build.MODEL + ", " + Build.MANUFACTURER + ", " + v;
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static float zza(float f, float f1, float f2) [...] // Potential decryptor

    public static int zzb(long[] arr_v, long v, boolean z, boolean z1) {
        int v2;
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 < 0) {
            v2 = ~v1;
            return z1 ? Math.min(arr_v.length - 1, v2) : v2;
        }
        while(v1 + 1 < arr_v.length && arr_v[v1 + 1] == v) {
            ++v1;
        }
        v2 = z ? v1 : v1 + 1;
        return z1 ? Math.min(arr_v.length - 1, v2) : v2;
    }

    public static int zzc(long[] arr_v, long v, boolean z, boolean z1) {
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 < 0) {
            int v2 = -(v1 + 2);
            return z1 ? Math.max(0, v2) : v2;
        }
        while(v1 - 1 >= 0 && arr_v[v1 - 1] == v) {
            --v1;
        }
        return z1 ? Math.max(0, v1) : v1;
    }

    public static int zzd(int v, int v1) {
        return (v + v1 - 1) / v1;
    }

    public static int zze(int v, int v1, int v2) {
        return Math.max(v1, Math.min(v, v2));
    }

    public static int zzf(int v) {
        return v == 1 ? 0x360000 : 0xC80000;
    }

    public static int zzg(String s) {
        int v = s.length();
        zzayz.zzc(v <= 4);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 << 8 | s.charAt(v1);
        }
        return v2;
    }

    public static int zzh(int v) {
        switch(v) {
            case 8: {
                return 3;
            }
            case 16: {
                return 2;
            }
            case 24: {
                return 0x80000000;
            }
            case 0x20: {
                return 0x40000000;
            }
            default: {
                return 0;
            }
        }
    }

    public static int zzi(int v, int v1) {
        switch(v) {
            case 0x80000000: {
                return v1 * 3;
            }
            case 2: {
                return v1 + v1;
            }
            case 3: {
                return v1;
            }
            case 0x40000000: {
                return v1 * 4;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    public static long zzj(long v, long v1, long v2) {
        int v3 = Long.compare(v2, v1);
        if(v3 >= 0 && v2 % v1 == 0L) {
            return v / (v2 / v1);
        }
        return v3 >= 0 || v1 % v2 != 0L ? ((long)(((double)v1) / ((double)v2) * ((double)v))) : v1 / v2 * v;
    }

    public static String zzk(Object[] arr_object) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_object.length; ++v) {
            stringBuilder0.append(arr_object[v].getClass().getSimpleName());
            if(v < arr_object.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        return stringBuilder0.toString();
    }

    public static ExecutorService zzl(String s) {
        return Executors.newSingleThreadExecutor(new t1());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void zzm(zzayj zzayj0) {
        if(zzayj0 != null) {
            try {
                zzayj0.zzd();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    public static void zzn(long[] arr_v, long v, long v1) {
        int v2 = 0;
        int v3 = Long.compare(v1, 1000000L);
        if(v3 >= 0 && v1 % 1000000L == 0L) {
            while(v2 < arr_v.length) {
                arr_v[v2] /= v1 / 1000000L;
                ++v2;
            }
            return;
        }
        if(v3 < 0 && 1000000L % v1 == 0L) {
            while(v2 < arr_v.length) {
                arr_v[v2] *= 1000000L / v1;
                ++v2;
            }
            return;
        }
        while(v2 < arr_v.length) {
            arr_v[v2] = (long)(((double)arr_v[v2]) * (1000000.0 / ((double)v1)));
            ++v2;
        }
    }

    public static boolean zzo(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    public static byte[] zzp(String s) [...] // Potential decryptor

    public static byte[] zzq(String s) {
        return s.getBytes(Charset.defaultCharset());
    }
}

