package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display.Mode;
import android.view.Display;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class zzeg {
    public static final Pattern a;
    public static HashMap b;
    public static final String[] c;
    public static final String[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;

    static {
        zzeg.zza = Build.VERSION.SDK_INT;
        zzeg.zzb = Build.DEVICE;
        zzeg.zzc = Build.MANUFACTURER;
        zzeg.zzd = Build.MODEL;
        zzeg.zze = Build.DEVICE + ", " + Build.MODEL + ", " + Build.MANUFACTURER + ", " + Build.VERSION.SDK_INT;
        zzeg.zzf = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        zzeg.a = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzeg.c = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzeg.d = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzeg.e = new int[]{0, 0x4C11DB7, 0x9823B6E, 222504665, 0x130476DC, 398814059, 445009330, 507990021, 0x2608EDB8, 0x22C9F00F, 0x2F8AD6D6, 0x2B4BCB61, 890018660, 0x31CD86D3, 1015980042, 944750013, 0x4C11DB70, 0x48D0C6C7, 1167319070, 0x4152FDA9, 0x5F15ADAC, 0x5BD4B01B, 1452775106, 1381403509, 1780037320, 0x6ED82B7F, 0x639B0DA6, 0x675A1011, 2031960084, 0x7DDC5DA3, 1889500026, 0x745E66CD, 0x9823B6E0, -1662866601, 0x91A18D8E, 0x95609039, 0x8B27C03C, 0x8FE6DD8B, -2103051438, -2040207643, -1104454824, -1159051537, 0xB7A96036, 0xB3687D81, 0xAD2F2D84, -1444007885, -1532160278, 0xA06C0B5D, 0xD4326D90, 0xD0F37027, 0xDDB056FE, 0xD9714B49, -952755380, 0xC3F706FB, -827056094, 0xCA753D95, 0xF23A8028, 0xF6FB9D9F, 0xFBB8BB46, 0xFF79A6F1, 0xE13EF6F4, 0xE5FFEB43, -390279782, 0xEC7DD02D, 0x34867077, 0x30476DC0, 0x3D044B19, 969234094, 0x278206AB, 591600412, 0x2E003DC5, 0x2AC12072, 0x128E9DCF, 0x164F8078, 0x1B0CA6A1, 0x1FCDBB16, 0x18AEB13, 0x54BF6A4, 0x808D07D, 214552010, 2023205639, 2086057648, 0x71159069, 0x75D48DDE, 1804852699, 0x6F52C06C, 1645340341, 0x66D0FB02, 0x5E9F46BF, 0x5A5E5B08, 1461550545, 0x53DC6066, 1302016099, 1230646740, 0x44190B0D, 1087903418, 0xACA5C697, 0xA864DB20, 0xA527FDF9, 0xA1E6E04E, 0xBFA1B04B, 0xBB60ADFC, -1239184603, 0xB2E29692, -1968362705, -1905510760, 0x832F1041, 0x87EE0DF6, 0x99A95DF3, 0x9D684044, 0x902B669D, 0x94EA7B2A, 0xE0B41DE7, 0xE4750050, 0xE9362689, 0xEDF73B3E, -206542021, -143559028, 0xFA325055, 0xFEF34DE2, 0xC6BCF05F, -1031934488, 0xCF3ECB31, 0xCBFFD686, -709327229, -780559564, -600130067, 0xD8FBA05A, 0x690CE0EE, 0x6DCDFD59, 0x608EDB80, 0x644FC637, 2047383090, 0x7EC98B85, 0x738AAD5C, 2001449195, 0x4F040D56, 0x4BC510E1, 1183200824, 0x42472B8F, 0x5C007B8A, 1489069629, 0x558240E4, 0x51435D53, 0x251D3B9E, 568075817, 0x2C9F00F0, 0x285E1D47, 907627842, 0x32D850F5, 1067152940, 0x3B5A6B9B, 0x315D626, 0x7D4CB91, 177728840, 0xE56F0FF, 0x1011A0FA, 0x14D0BD4D, 429104020, 0x1D528623, 0xF12F560E, 0xF5EE4BB9, -122852000, -60002089, -500490030, -420856475, 0xEBA91BBC, 0xEF68060B, 0xD727BBB6, 0xD3E6A601, 0xDEA580D8, -630940305, -1004286614, 0xC0E2D0DD, 0xCDA1F604, 0xC960EBB3, -1119974018, 0xB9FF90C9, -1262701040, 0xB07DABA7, 0xAE3AFBA2, 0xAAFBE615, 0xA7B8C0CC, 0xA379DD7B, -1690935098, 0x9FF77D71, 0x92B45BA8, -1770699233, -2009983462, 0x8CF30BAD, -2119160460, 0x857130C3, 0x5D8A9099, 0x594B8D2E, 0x5408ABF7, 0x50C9B640, 1317987909, 0x4A4FFBF2, 0x470CDD2B, 0x43CDC09C, 2072149281, 0x7F436096, 0x7200464F, 0x76C15BF8, 0x68860BFD, 1816598090, 0x61043093, 1707420964, 295390185, 0x155A565E, 404320391, 0x1CD86D30, 0x29F3D35, 106832002, 0xB1D065B, 266083308, 0x3793A651, 861060070, 0x3E119D3F, 0x3AD08088, 0x2497D08D, 0x2056CD3A, 0x2D15EBE3, 0x29D4F654, -978770311, -1050133554, 0xCC2B1D17, 0xC8EA00A0, 0xD6AD50A5, 0xD26C4D12, 0xDF2F6BCB, -605129092, 0xE3A1CBC1, -413084042, 0xEA23F0AF, -287118056, 0xF0A5BD1D, 0xF464A0AA, -114850189, 0xFDE69BC4, 0x89B8FD09, 0x8D79E0BE, 0x803AC667, 0x84FBDBD0, 0x9ABC8BD5, -1635936670, -1824608069, 0x97FFAD0C, 0xAFB010B1, 0xAB710D06, -1506661409, 0xA2F33668, -1129027987, -1200260134, 0xB5365D03, 0xB1F740B4};
        zzeg.f = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 0x3F, 54, 49, 36, 35, 42, 45, 0x70, 0x77, 0x7E, 0x79, 108, 107, 98, 101, 72, 0x4F, 70, 65, 84, 83, 90, 93, 0xE0, 0xE7, 0xEE, 0xE9, 0xFC, 0xFB, 0xF2, 0xF5, 0xD8, 0xDF, 0xD6, 209, 0xC4, 0xC3, 202, 205, 0x90, 0x97, 0x9E, 0x99, 140, 0x8B, 130, 0x85, 0xA8, 0xAF, 0xA6, 0xA1, 180, 0xB3, 0xBA, 0xBD, 0xC7, 0xC0, 201, 206, 0xDB, 220, 0xD5, 210, 0xFF, 0xF8, 0xF1, 0xF6, 0xE3, 0xE4, 0xED, 0xEA, 0xB7, 0xB0, 0xB9, 190, 0xAB, 0xAC, 0xA5, 0xA2, 0x8F, 0x88, 0x81, 0x86, 0x93, 0x94, 0x9D, 0x9A, 39, 0x20, 41, 46, 59, 60, 53, 50, 0x1F, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 0x6F, 104, 97, 102, 0x73, 0x74, 0x7D, 0x7A, 0x89, 0x8E, 0x87, 0x80, 0x95, 0x92, 0x9B, 0x9C, 0xB1, 0xB6, 0xBF, 0xB8, 0xAD, 170, 0xA3, 0xA4, 0xF9, 0xFE, 0xF7, 0xF0, 0xE5, 0xE2, 0xEB, 0xEC, 0xC1, 0xC6, 0xCF, 200, 0xDD, 0xDA, 0xD3, 0xD4, 105, 110, 103, 0x60, 0x75, 0x72, 0x7B, 0x7C, 81, 86, 0x5F, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 0x2F, 40, 61, 58, 51, 52, 78, 73, 0x40, 71, 82, 85, 92, 91, 0x76, 0x71, 120, 0x7F, 106, 109, 100, 99, 62, 57, 0x30, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 0xAE, 0xA9, 0xA0, 0xA7, 0xB2, 0xB5, 0xBC, 0xBB, 150, 0x91, 0x98, 0x9F, 0x8A, 0x8D, 0x84, 0x83, 0xDE, 0xD9, 0xD0, 0xD7, 0xC2, 0xC5, 204, 203, 230, 0xE1, 0xE8, 0xEF, 0xFA, 0xFD, 0xF4, 0xF3};
    }

    public static String a(String s) {
        try {
            Class class0 = Class.forName("android.os.SystemProperties");
            return (String)class0.getMethod("get", String.class).invoke(class0, s);
        }
        catch(Exception exception0) {
            zzdn.zza("Util", "Failed to read system property " + s, exception0);
            return null;
        }
    }

    public static Point zzA(Context context0) {
        DisplayManager displayManager0 = (DisplayManager)context0.getSystemService("display");
        Display display0 = displayManager0 == null ? null : displayManager0.getDisplay(0);
        if(display0 == null) {
            WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
            windowManager0.getClass();
            display0 = windowManager0.getDefaultDisplay();
        }
        if(display0.getDisplayId() == 0 && zzeg.zzW(context0)) {
            String s = zzeg.zza >= 28 ? zzeg.a("vendor.display-size") : zzeg.a("sys.display-size");
            if(!TextUtils.isEmpty(s)) {
                try {
                    String[] arr_s = s.trim().split("x", -1);
                    if(arr_s.length == 2) {
                        int v = Integer.parseInt(arr_s[0]);
                        int v1 = Integer.parseInt(arr_s[1]);
                        if(v > 0 && v1 > 0) {
                            return new Point(v, v1);
                        }
                    }
                }
                catch(NumberFormatException unused_ex) {
                }
                Log.e("Util", "Invalid display size: " + s);
            }
            if("Sony".equals(zzeg.zzc) && zzeg.zzd.startsWith("BRAVIA") && context0.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(0xF00, 0x870);
            }
        }
        Point point0 = new Point();
        if(zzeg.zza >= 23) {
            Display.Mode display$Mode0 = display0.getMode();
            point0.x = display$Mode0.getPhysicalWidth();
            point0.y = display$Mode0.getPhysicalHeight();
            return point0;
        }
        display0.getRealSize(point0);
        return point0;
    }

    public static Handler zzB(Looper looper0, Handler.Callback handler$Callback0) {
        return new Handler(looper0, handler$Callback0);
    }

    public static Handler zzC(Handler.Callback handler$Callback0) {
        Looper looper0 = Looper.myLooper();
        zzcw.zzb(looper0);
        return new Handler(looper0, null);
    }

    public static Looper zzD() {
        Looper looper0 = Looper.myLooper();
        return looper0 == null ? Looper.getMainLooper() : looper0;
    }

    public static zzad zzE(int v, int v1, int v2) {
        zzab zzab0 = new zzab();
        zzab0.zzS("audio/raw");
        zzab0.zzw(v1);
        zzab0.zzT(v2);
        zzab0.zzN(v);
        return zzab0.zzY();
    }

    public static zzbx zzF(zzcb zzcb0, zzbx zzbx0) {
        boolean z9;
        boolean z8;
        boolean z4;
        boolean z3;
        boolean z = zzcb0.zzs();
        boolean z1 = zzcb0.zzc();
        zzci zzci0 = ((zzk)zzcb0).zzn();
        boolean z2 = true;
        if(zzci0.zzo()) {
            z3 = false;
        }
        else {
            int v = ((zzk)zzcb0).zzf();
            ((zzk)zzcb0).zzj();
            ((zzk)zzcb0).zzr();
            z3 = zzci0.zzk(v, 0, false) == -1 ? false : true;
        }
        zzci zzci1 = ((zzk)zzcb0).zzn();
        if(zzci1.zzo()) {
            z4 = false;
        }
        else {
            int v1 = ((zzk)zzcb0).zzf();
            ((zzk)zzcb0).zzj();
            ((zzk)zzcb0).zzr();
            z4 = zzci1.zzj(v1, 0, false) == -1 ? false : true;
        }
        boolean z5 = zzcb0.zzb();
        boolean z6 = zzcb0.zza();
        boolean z7 = zzcb0.zzn().zzo();
        zzbv zzbv0 = new zzbv();
        zzbv0.zzb(zzbx0);
        zzbv0.zzd(4, !z);
        zzbv0.zzd(5, z1 && !z);
        zzbv0.zzd(6, z3 && !z);
        if(z7 || !z3 && z5 && !z1) {
            z8 = false;
        }
        else if(!z) {
            z8 = true;
        }
        else {
            z8 = false;
        }
        zzbv0.zzd(7, z8);
        zzbv0.zzd(8, z4 && !z);
        if(z7 || !z4 && (!z5 || !z6)) {
            z9 = false;
        }
        else if(!z) {
            z9 = true;
        }
        else {
            z9 = false;
        }
        zzbv0.zzd(9, z9);
        zzbv0.zzd(10, !z);
        zzbv0.zzd(11, z1 && !z);
        if(!z1 || z) {
            z2 = false;
        }
        zzbv0.zzd(12, z2);
        return zzbv0.zze();
    }

    @EnsuresNonNull({"#1"})
    public static Object zzG(Object object0) [...] // Inlined contents

    public static String zzH(String s, Object[] arr_object) {
        return String.format(Locale.US, s, arr_object);
    }

    public static String zzI(byte[] arr_b, int v, int v1) {
        return new String(arr_b, v, v1, zzfoi.zzc);
    }

    public static String zzJ(Object[] arr_object) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_object.length; ++v) {
            stringBuilder0.append(arr_object[v].getClass().getSimpleName());
            if(v < arr_object.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        return stringBuilder0.toString();
    }

    public static String zzK(Context context0) {
        if(context0 != null) {
            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
            if(telephonyManager0 != null) {
                String s = telephonyManager0.getNetworkCountryIso();
                return TextUtils.isEmpty(s) ? zzfoc.zzb(Locale.getDefault().getCountry()) : zzfoc.zzb(s);
            }
        }
        return zzfoc.zzb(Locale.getDefault().getCountry());
    }

    public static String zzL(int v) {
        switch(v) {
            case 0: {
                return "NO";
            }
            case 1: {
                return "NO_UNSUPPORTED_TYPE";
            }
            case 2: {
                return "NO_UNSUPPORTED_DRM";
            }
            case 3: {
                return "NO_EXCEEDS_CAPABILITIES";
            }
            case 4: {
                return "YES";
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    public static String zzM(Locale locale0) {
        return zzeg.zza < 21 ? locale0.toString() : locale0.toLanguageTag();
    }

    public static String zzN(int v) {
        switch(v) {
            case -1: {
                return "unknown";
            }
            case 0: {
                return "default";
            }
            case 1: {
                return "audio";
            }
            case 2: {
                return "video";
            }
            case 3: {
                return "text";
            }
            case 4: {
                return "image";
            }
            case 5: {
                return "metadata";
            }
            default: {
                return "camera motion";
            }
        }
    }

    public static String zzO(String s) {
        if(s == null) {
            return null;
        }
        String s1 = s.replace('_', '-');
        if(!s1.isEmpty() && !s1.equals("und")) {
            s = s1;
        }
        String s2 = zzfoc.zza(s);
        String s3 = s2.split("-", 2)[0];
        if(zzeg.b == null) {
            String[] arr_s = Locale.getISOLanguages();
            String[] arr_s1 = zzeg.c;
            HashMap hashMap0 = new HashMap(arr_s.length + 86);
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s4 = arr_s[v1];
                try {
                    String s5 = new Locale(s4).getISO3Language();
                    if(!TextUtils.isEmpty(s5)) {
                        hashMap0.put(s5, s4);
                    }
                }
                catch(MissingResourceException unused_ex) {
                }
            }
            for(int v2 = 0; v2 < 86; v2 += 2) {
                hashMap0.put(arr_s1[v2], arr_s1[v2 + 1]);
            }
            zzeg.b = hashMap0;
        }
        String s6 = (String)zzeg.b.get(s3);
        if(s6 != null) {
            s2 = s6 + s2.substring(s3.length());
            s3 = s6;
        }
        if(!"no".equals(s3) && !"i".equals(s3) && !"zh".equals(s3)) {
            return s2;
        }
        for(int v = 0; true; v += 2) {
            String[] arr_s2 = zzeg.d;
            if(v >= 18) {
                break;
            }
            if(s2.startsWith(arr_s2[v])) {
                return arr_s2[v + 1] + s2.substring(arr_s2[v].length());
            }
        }
        return s2;
    }

    public static ExecutorService zzP(String s) {
        return Executors.newSingleThreadExecutor(new zzef("ExoPlayer:Loader:ProgressiveMediaPeriod"));
    }

    public static void zzQ(long[] arr_v, long v, long v1) {
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

    public static void zzR(Parcel parcel0, boolean z) {
        parcel0.writeInt(((int)z));
    }

    public static boolean zzS(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    public static boolean zzT(int v) {
        return v == 4 || v == 0x20000000 || v == 0x30000000;
    }

    public static boolean zzU(int v) {
        switch(v) {
            case 2: 
            case 3: 
            case 4: 
            case 0x10000000: 
            case 0x20000000: 
            case 0x30000000: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean zzV(Uri uri0) {
        String s = uri0.getScheme();
        return TextUtils.isEmpty(s) || "file".equals(s);
    }

    public static boolean zzW(Context context0) {
        UiModeManager uiModeManager0 = (UiModeManager)context0.getApplicationContext().getSystemService("uimode");
        return uiModeManager0 != null && uiModeManager0.getCurrentModeType() == 4;
    }

    public static boolean zzX(Handler handler0, Runnable runnable0) {
        if(!handler0.getLooper().getThread().isAlive()) {
            return false;
        }
        if(handler0.getLooper() == Looper.myLooper()) {
            runnable0.run();
            return true;
        }
        return handler0.post(runnable0);
    }

    public static boolean zzY(Parcel parcel0) {
        return parcel0.readInt() != 0;
    }

    public static byte[] zzZ(String s) [...] // Potential decryptor

    public static float zza(float f, float f1, float f2) {
        return Math.max(f1, Math.min(f, f2));
    }

    public static byte[] zzaa(InputStream inputStream0) throws IOException {
        byte[] arr_b = new byte[0x1000];
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        int v;
        while((v = inputStream0.read(arr_b)) != -1) {
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    @EnsuresNonNull({"#1"})
    public static Object[] zzab(Object[] arr_object) [...] // Inlined contents

    public static Object[] zzac(Object[] arr_object, Object[] arr_object1) {
        Object[] arr_object2 = Arrays.copyOf(arr_object, arr_object.length + arr_object1.length);
        System.arraycopy(arr_object1, 0, arr_object2, arr_object.length, arr_object1.length);
        return arr_object2;
    }

    public static Object[] zzad(Object[] arr_object, int v) {
        zzcw.zzd(v <= arr_object.length);
        return Arrays.copyOf(arr_object, v);
    }

    public static String[] zzae() {
        Configuration configuration0 = Resources.getSystem().getConfiguration();
        String[] arr_s = zzeg.zza < 24 ? new String[]{zzeg.zzM(configuration0.locale)} : configuration0.getLocales().toLanguageTags().split(",", -1);
        for(int v = 0; v < arr_s.length; ++v) {
            arr_s[v] = zzeg.zzO(arr_s[v]);
        }
        return arr_s;
    }

    public static String[] zzaf(String s, String s1) {
        return s.split(s1, -1);
    }

    public static String[] zzag(String s, String s1) {
        return s.split(s1, 2);
    }

    public static int zzb(long[] arr_v, long v, boolean z, boolean z1) {
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 < 0) {
            return ~v1;
        }
        while(v1 + 1 < arr_v.length && arr_v[v1 + 1] == v) {
            ++v1;
        }
        return z ? v1 : v1 + 1;
    }

    public static int zzc(int[] arr_v, int v, boolean z, boolean z1) {
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 < 0) {
            return -(v1 + 2);
        }
        do {
            --v1;
        }
        while(v1 >= 0 && arr_v[v1] == v);
        return v1;
    }

    public static int zzd(long[] arr_v, long v, boolean z, boolean z1) {
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

    public static int zze(int v, int v1) {
        return (v + v1 - 1) / v1;
    }

    public static int zzf(int v, int v1, int v2) {
        return Math.max(v1, Math.min(v, v2));
    }

    public static int zzg(byte[] arr_b, int v, int v1, int v2) {
        int v3 = -1;
        for(int v4 = 0; v4 < v1; ++v4) {
            v3 = zzeg.e[v3 >>> 24 ^ arr_b[v4] & 0xFF] ^ v3 << 8;
        }
        return v3;
    }

    public static int zzh(byte[] arr_b, int v, int v1, int v2) {
        int v3 = 0;
        while(v < v1) {
            v3 = zzeg.f[v3 ^ arr_b[v] & 0xFF];
            ++v;
        }
        return v3;
    }

    public static int zzi(Context context0) {
        AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
        return audioManager0 == null ? -1 : audioManager0.generateAudioSessionId();
    }

    public static int zzj(int v) {
        switch(v) {
            case 1: {
                return 4;
            }
            case 2: {
                return 12;
            }
            case 3: {
                return 28;
            }
            case 4: {
                return 204;
            }
            case 5: {
                return 220;
            }
            case 6: {
                return 0xFC;
            }
            case 7: {
                return 0x4FC;
            }
            case 8: {
                int v1 = zzeg.zza;
                if(v1 >= 23) {
                    return 0x18FC;
                }
                return v1 < 21 ? 0 : 0x18FC;
            }
            default: {
                return 0;
            }
        }
    }

    public static int zzk(ByteBuffer byteBuffer0, int v) {
        int v1 = byteBuffer0.getInt(v);
        return byteBuffer0.order() == ByteOrder.BIG_ENDIAN ? v1 : Integer.reverseBytes(v1);
    }

    public static int zzl(int v) {
        switch(v) {
            case 8: 
            case 15: {
                return 6003;
            }
            case 2: 
            case 4: 
            case 7: 
            case 16: 
            case 18: {
                return 6005;
            }
            case 10: 
            case 17: 
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                return 6004;
            }
            default: {
                return v == 24 || v == 25 || v == 26 || v == 27 || v == 28 ? 6002 : 6006;
            }
        }
    }

    public static int zzm(String s) {
        if(s == null) {
            return 0;
        }
        String[] arr_s = s.split("_", -1);
        if(arr_s.length < 2) {
            return 0;
        }
        String s1 = arr_s[arr_s.length - 1];
        boolean z = arr_s.length >= 3 && "neg".equals(arr_s[arr_s.length - 2]);
        try {
            if(s1 == null) {
                throw null;
            }
            int v = Integer.parseInt(s1);
            return z ? -v : v;
        }
        catch(NumberFormatException unused_ex) {
            return 0;
        }
    }

    public static int zzn(int v) {
        switch(v) {
            case 8: {
                return 3;
            }
            case 16: {
                return 2;
            }
            case 24: {
                return 0x20000000;
            }
            case 0x20: {
                return 0x30000000;
            }
            default: {
                return 0;
            }
        }
    }

    public static int zzo(int v, int v1) {
        switch(v) {
            case 3: {
                return v1;
            }
            case 2: 
            case 0x10000000: {
                return v1 + v1;
            }
            case 0x20000000: {
                return v1 * 3;
            }
            case 4: 
            case 0x30000000: {
                return v1 * 4;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    public static int zzp(Uri uri0) {
        int v1;
        String s = uri0.getScheme();
        if(s != null && zzfoc.zzc("rtsp", s)) {
            return 3;
        }
        String s1 = uri0.getLastPathSegment();
        if(s1 == null) {
            return 4;
        }
        int v = s1.lastIndexOf(46);
        if(v >= 0) {
            switch(zzfoc.zza(s1.substring(v + 1))) {
                case "ism": 
                case "isml": {
                    v1 = 1;
                    break;
                }
                case "m3u8": {
                    v1 = 2;
                    break;
                }
                case "mpd": {
                    v1 = 0;
                    break;
                }
                default: {
                    v1 = 4;
                }
            }
            if(v1 != 4) {
                return v1;
            }
        }
        String s2 = uri0.getPath();
        s2.getClass();
        Matcher matcher0 = zzeg.a.matcher(s2);
        if(matcher0.matches()) {
            String s3 = matcher0.group(2);
            if(s3 != null) {
                if(s3.contains("format=mpd-time-csf")) {
                    return 0;
                }
                return s3.contains("format=m3u8-aapl") ? 2 : 1;
            }
            return 1;
        }
        return 4;
    }

    public static long zzq(long v, long v1, long v2) {
        long v3 = v + v1;
        return ((v ^ v3) & (v1 ^ v3)) >= 0L ? v3 : 0x7FFFFFFFFFFFFFFFL;
    }

    public static long zzr(long v, long v1, long v2) {
        return Math.max(v1, Math.min(v, v2));
    }

    public static long zzs(long v, float f) {
        return f == 1.0f ? v : Math.round(((double)v) * ((double)f));
    }

    public static long zzt(long v) {
        return v == 0x8000000000000001L ? System.currentTimeMillis() : v + SystemClock.elapsedRealtime();
    }

    public static long zzu(long v, float f) {
        return f == 1.0f ? v : Math.round(((double)v) / ((double)f));
    }

    public static long zzv(long v) {
        return v == 0x8000000000000001L || v == 0x8000000000000000L ? v : v * 1000L;
    }

    public static long zzw(long v, long v1, long v2) {
        int v3 = Long.compare(v2, v1);
        if(v3 >= 0 && v2 % v1 == 0L) {
            return v / (v2 / v1);
        }
        return v3 >= 0 || v1 % v2 != 0L ? ((long)(((double)v1) / ((double)v2) * ((double)v))) : v1 / v2 * v;
    }

    public static long zzx(long v, long v1, long v2) {
        long v3 = v - v1;
        return ((v ^ v3) & (v1 ^ v)) >= 0L ? v3 : 0x8000000000000000L;
    }

    public static long zzy(int v, int v1) {
        return ((long)v1) & 0xFFFFFFFFL | (((long)v) & 0xFFFFFFFFL) << 0x20;
    }

    public static long zzz(long v) {
        return v == 0x8000000000000001L || v == 0x8000000000000000L ? v : v / 1000L;
    }
}

