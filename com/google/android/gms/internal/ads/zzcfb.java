package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcfb {
    public float a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final Handler zza;

    static {
        zzcfb.zza = new zzfnw(Looper.getMainLooper());
        zzcfb.b = "com.google.android.gms.ads.AdView";
        zzcfb.c = InterstitialAd.class.getName();
        zzcfb.d = "com.google.android.gms.ads.admanager.AdManagerAdView";
        zzcfb.e = "com.google.android.gms.ads.admanager.AdManagerInterstitialAd";
        zzcfb.f = SearchAdView.class.getName();
        zzcfb.g = "com.google.android.gms.ads.AdLoader";
    }

    public zzcfb() {
        this.a = -1.0f;
    }

    public final void a(JSONObject jSONObject0, String s, Object object0) {
        Boolean[] arr_boolean;
        Long[] arr_long;
        Double[] arr_double;
        Integer[] arr_integer;
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzr)).booleanValue()) {
            s = String.valueOf(s);
        }
        int v = 0;
        if(object0 instanceof Bundle) {
            jSONObject0.put(s, this.zzh(((Bundle)object0)));
            return;
        }
        if(object0 instanceof Map) {
            jSONObject0.put(s, this.zzi(((Map)object0)));
            return;
        }
        if(object0 instanceof Collection) {
            jSONObject0.put(String.valueOf(s), this.d(((Collection)object0)));
            return;
        }
        if(object0 instanceof Object[]) {
            jSONObject0.put(s, this.d(Arrays.asList(((Object[])object0))));
            return;
        }
        if(object0 instanceof int[]) {
            if(((int[])object0) == null) {
                arr_integer = new Integer[0];
            }
            else {
                Integer[] arr_integer1 = new Integer[((int[])object0).length];
                while(v < ((int[])object0).length) {
                    arr_integer1[v] = (int)((int[])object0)[v];
                    ++v;
                }
                arr_integer = arr_integer1;
            }
            jSONObject0.put(s, this.c(arr_integer));
            return;
        }
        if(object0 instanceof double[]) {
            if(((double[])object0) == null) {
                arr_double = new Double[0];
            }
            else {
                Double[] arr_double1 = new Double[((double[])object0).length];
                while(v < ((double[])object0).length) {
                    arr_double1[v] = (double)((double[])object0)[v];
                    ++v;
                }
                arr_double = arr_double1;
            }
            jSONObject0.put(s, this.c(arr_double));
            return;
        }
        if(object0 instanceof long[]) {
            if(((long[])object0) == null) {
                arr_long = new Long[0];
            }
            else {
                Long[] arr_long1 = new Long[((long[])object0).length];
                while(v < ((long[])object0).length) {
                    arr_long1[v] = (long)((long[])object0)[v];
                    ++v;
                }
                arr_long = arr_long1;
            }
            jSONObject0.put(s, this.c(arr_long));
            return;
        }
        if(object0 instanceof boolean[]) {
            if(((boolean[])object0) == null) {
                arr_boolean = new Boolean[0];
            }
            else {
                Boolean[] arr_boolean1 = new Boolean[((boolean[])object0).length];
                while(v < ((boolean[])object0).length) {
                    arr_boolean1[v] = Boolean.valueOf(((boolean[])object0)[v]);
                    ++v;
                }
                arr_boolean = arr_boolean1;
            }
            jSONObject0.put(s, this.c(arr_boolean));
            return;
        }
        jSONObject0.put(s, object0);
    }

    public static final void b(ViewGroup viewGroup0, zzq zzq0, String s, int v, int v1) {
        if(viewGroup0.getChildCount() != 0) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        TextView textView0 = new TextView(context0);
        textView0.setGravity(17);
        textView0.setText(s);
        textView0.setTextColor(v);
        textView0.setBackgroundColor(v1);
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.setBackgroundColor(v);
        int v2 = zzcfb.zzw(context0, 3);
        frameLayout0.addView(textView0, new FrameLayout.LayoutParams(zzq0.zzf - v2, zzq0.zzc - v2, 17));
        viewGroup0.addView(frameLayout0, zzq0.zzf, zzq0.zzc);
    }

    public final JSONArray c(Object[] arr_object) {
        JSONArray jSONArray0 = new JSONArray();
        for(int v = 0; v < arr_object.length; ++v) {
            this.e(jSONArray0, arr_object[v]);
        }
        return jSONArray0;
    }

    public final JSONArray d(Collection collection0) {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: collection0) {
            this.e(jSONArray0, object0);
        }
        return jSONArray0;
    }

    public final void e(JSONArray jSONArray0, Object object0) {
        if(object0 instanceof Bundle) {
            jSONArray0.put(this.zzh(((Bundle)object0)));
            return;
        }
        if(object0 instanceof Map) {
            jSONArray0.put(this.zzi(((Map)object0)));
            return;
        }
        if(object0 instanceof Collection) {
            jSONArray0.put(this.d(((Collection)object0)));
            return;
        }
        if(object0 instanceof Object[]) {
            jSONArray0.put(this.c(((Object[])object0)));
            return;
        }
        jSONArray0.put(object0);
    }

    public static int zza(Context context0, int v) {
        if(context0 == null) {
            return -1;
        }
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        Resources resources0 = context0.getResources();
        if(resources0 == null) {
            return -1;
        }
        DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
        if(displayMetrics0 == null) {
            return -1;
        }
        Configuration configuration0 = resources0.getConfiguration();
        if(configuration0 == null) {
            return -1;
        }
        int v1 = configuration0.orientation;
        if(v == 0) {
            v = v1;
        }
        return v == v1 ? Math.round(((float)displayMetrics0.heightPixels) / displayMetrics0.density) : Math.round(((float)displayMetrics0.widthPixels) / displayMetrics0.density);
    }

    public final int zzb(Context context0, int v) {
        if(this.a < 0.0f) {
            synchronized(this) {
                if(this.a < 0.0f) {
                    WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
                    if(windowManager0 == null) {
                        return 0;
                    }
                    Display display0 = windowManager0.getDefaultDisplay();
                    DisplayMetrics displayMetrics0 = new DisplayMetrics();
                    display0.getMetrics(displayMetrics0);
                    this.a = displayMetrics0.density;
                }
            }
        }
        return Math.round(((float)v) / this.a);
    }

    public static AdSize zzc(Context context0, int v, int v1, int v2) {
        int v3 = zzcfb.zza(context0, v2);
        if(v3 == -1) {
            return AdSize.INVALID;
        }
        int v4 = Math.min(90, Math.round(((float)v3) * 0.15f));
        if(v > 0x28F) {
            return new AdSize(v, Math.max(Math.min(Math.round(((float)v) / 728.0f * 90.0f), v4), 50));
        }
        if(v > 632) {
            return new AdSize(v, Math.max(Math.min(81, v4), 50));
        }
        if(v > 0x20E) {
            return new AdSize(v, Math.max(Math.min(Math.round(((float)v) / 468.0f * 60.0f), v4), 50));
        }
        return v <= 0x1B0 ? new AdSize(v, Math.max(Math.min(Math.round(((float)v) / 320.0f * 50.0f), v4), 50)) : new AdSize(v, Math.max(Math.min(68, v4), 50));
    }

    public static String zzd() [...] // Potential decryptor

    public static String zze(String s) {
        for(int v = 0; true; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                messageDigest0.update(s.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest0.digest()));
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
            catch(ArithmeticException unused_ex) {
                break;
            }
        }
        return null;
    }

    public static Throwable zzf(Throwable throwable0) {
        if(((Boolean)zzbjx.zzf.zze()).booleanValue()) {
            return throwable0;
        }
        LinkedList linkedList0 = new LinkedList();
        while(throwable0 != null) {
            linkedList0.push(throwable0);
            throwable0 = throwable0.getCause();
        }
        Throwable throwable1 = null;
        while(!linkedList0.isEmpty()) {
            Throwable throwable2 = (Throwable)linkedList0.pop();
            StackTraceElement[] arr_stackTraceElement = throwable2.getStackTrace();
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(new StackTraceElement(throwable2.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                if(zzcfb.zzn(stackTraceElement0.getClassName())) {
                    arrayList0.add(stackTraceElement0);
                    z = true;
                }
                else {
                    String s = stackTraceElement0.getClassName();
                    if(!TextUtils.isEmpty(s) && (s.startsWith("android.") || s.startsWith("java."))) {
                        arrayList0.add(stackTraceElement0);
                    }
                    else {
                        arrayList0.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if(z) {
                throwable1 = throwable1 == null ? new Throwable(throwable2.getMessage()) : new Throwable(throwable2.getMessage(), throwable1);
                throwable1.setStackTrace(((StackTraceElement[])arrayList0.toArray(new StackTraceElement[0])));
            }
        }
        return throwable1;
    }

    public final JSONObject zzh(Bundle bundle0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        for(Object object0: bundle0.keySet()) {
            this.a(jSONObject0, ((String)object0), bundle0.get(((String)object0)));
        }
        return jSONObject0;
    }

    public final JSONObject zzi(Map map0) throws JSONException {
        try {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: map0.keySet()) {
                this.a(jSONObject0, ((String)object0), map0.get(((String)object0)));
            }
            return jSONObject0;
        }
        catch(ClassCastException classCastException0) {
            throw new JSONException("Could not convert map to JSON: " + classCastException0.getMessage());
        }
    }

    public final JSONObject zzj(Bundle bundle0, JSONObject jSONObject0) {
        if(bundle0 != null) {
            try {
                return this.zzh(bundle0);
            }
            catch(JSONException jSONException0) {
                zzcfi.zzh("Error converting Bundle to JSON", jSONException0);
            }
        }
        return null;
    }

    public final void zzk(ViewGroup viewGroup0, zzq zzq0, String s, String s1) {
        if(s1 != null) {
            zzcfi.zzj(s1);
        }
        zzcfb.b(viewGroup0, zzq0, s, 0xFFFF0000, 0xFF000000);
    }

    public final void zzl(ViewGroup viewGroup0, zzq zzq0, String s) {
        zzcfb.b(viewGroup0, zzq0, "Ads by Google", 0xFF000000, -1);
    }

    public final void zzm(Context context0, String s, String s1, Bundle bundle0, boolean z) {
        zzcfb.zzv(context0, s, "gmob-apps", bundle0, true, new zzcey(this));
    }

    // 去混淆评级： 低(40)
    @VisibleForTesting
    public static boolean zzn(String s) {
        return TextUtils.isEmpty(s) ? false : s.startsWith("com.google.");
    }

    public static final int zzo(DisplayMetrics displayMetrics0, int v) {
        return (int)TypedValue.applyDimension(1, ((float)v), displayMetrics0);
    }

    @VisibleForTesting
    public static final String zzp(StackTraceElement[] arr_stackTraceElement, String s) {
        String s1;
        for(int v = 0; true; ++v) {
            s1 = null;
            if(v + 1 >= arr_stackTraceElement.length) {
                break;
            }
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
            String s2 = stackTraceElement0.getClassName();
            if("loadAd".equalsIgnoreCase(stackTraceElement0.getMethodName()) && (zzcfb.b.equalsIgnoreCase(s2) || zzcfb.c.equalsIgnoreCase(s2) || zzcfb.d.equalsIgnoreCase(s2) || zzcfb.e.equalsIgnoreCase(s2) || zzcfb.f.equalsIgnoreCase(s2) || zzcfb.g.equalsIgnoreCase(s2))) {
                s1 = arr_stackTraceElement[v + 1].getClassName();
                break;
            }
        }
        if(s != null) {
            StringTokenizer stringTokenizer0 = new StringTokenizer(s, ".");
            StringBuilder stringBuilder0 = new StringBuilder();
            if(stringTokenizer0.hasMoreElements()) {
                stringBuilder0.append(stringTokenizer0.nextToken());
                for(int v1 = 2; v1 > 0 && stringTokenizer0.hasMoreElements(); --v1) {
                    stringBuilder0.append(".");
                    stringBuilder0.append(stringTokenizer0.nextToken());
                }
                s = stringBuilder0.toString();
            }
            return s1 == null || s1.contains(s) ? null : s1;
        }
        return null;
    }

    // 去混淆评级： 中等(80)
    public static final boolean zzq() [...] // Potential decryptor

    public static final boolean zzr(Context context0, int v) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context0, v) == 0;
    }

    public static final boolean zzs(Context context0) {
        switch(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context0, 12451000)) {
            case 0: 
            case 2: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static final boolean zzt() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzu(DisplayMetrics displayMetrics0, int v) {
        return Math.round(((float)v) / displayMetrics0.density);
    }

    public static final void zzv(Context context0, String s, String s1, Bundle bundle0, boolean z, zzcfa zzcfa0) {
        boolean z1 = context0.getApplicationContext() != null;
        bundle0.putString("os", Build.VERSION.RELEASE);
        bundle0.putString("api", "33");
        bundle0.putString("appid", "com.spears.civilopedia");
        if(s == null) {
            s = GoogleApiAvailabilityLight.getInstance().getApkVersion(context0) + ".221908000";
        }
        bundle0.putString("js", s);
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for(Object object0: bundle0.keySet()) {
            uri$Builder0.appendQueryParameter(((String)object0), bundle0.getString(((String)object0)));
        }
        zzcfa0.zza(uri$Builder0.toString());
    }

    public static final int zzw(Context context0, int v) {
        return zzcfb.zzo(context0.getResources().getDisplayMetrics(), v);
    }

    public static final String zzx(Context context0) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        String s = contentResolver0 == null ? null : Settings.Secure.getString(contentResolver0, "android_id");
        if(s == null) {
            s = "emulator";
        }
        return zzcfb.zze(s);
    }
}

