package com.google.android.gms.ads.internal.util;

import A.f;
import B1.a;
import F0.g;
import F0.h;
import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzckz;
import com.google.android.gms.internal.ads.zzcmf;
import com.google.android.gms.internal.ads.zzdts;
import com.google.android.gms.internal.ads.zzfbl;
import com.google.android.gms.internal.ads.zzfbo;
import com.google.android.gms.internal.ads.zzfnw;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import com.google.android.gms.internal.ads.zzgri;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import v.j;

public final class zzs {
    public final AtomicReference a;
    public final AtomicReference b;
    public boolean c;
    public final Object d;
    public String e;
    public boolean f;
    public boolean g;
    public final ExecutorService h;
    public static final zzfnw zza;

    static {
        zzs.zza = new zzf(Looper.getMainLooper());
    }

    public zzs() {
        this.a = new AtomicReference(null);
        this.b = new AtomicReference(null);
        this.c = true;
        this.d = new Object();
        this.f = false;
        this.g = false;
        this.h = Executors.newSingleThreadExecutor();
    }

    public static Bundle a(Context context0) {
        try {
            return Wrappers.packageManager(context0).getApplicationInfo("com.spears.civilopedia", 0x80).metaData;
        }
        catch(PackageManager.NameNotFoundException | NullPointerException packageManager$NameNotFoundException0) {
            zze.zzb("Error getting metadata", packageManager$NameNotFoundException0);
            return null;
        }
    }

    public static String b(Bundle bundle0) {
        if(bundle0 == null) {
            return "";
        }
        String s = bundle0.getString("com.google.android.gms.ads.APPLICATION_ID");
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        return s.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || s.matches("^/\\d+~.+$") ? s : "";
    }

    public static boolean c(String s, AtomicReference atomicReference0, String s1) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            Pattern pattern0 = (Pattern)atomicReference0.get();
            if(pattern0 == null || !s1.equals(pattern0.pattern())) {
                pattern0 = Pattern.compile(s1);
                atomicReference0.set(pattern0);
            }
            return pattern0.matcher(s).matches();
        }
        catch(PatternSyntaxException unused_ex) {
            return false;
        }
    }

    public static final String d() {
        StringBuilder stringBuilder0 = new StringBuilder(0x100);
        stringBuilder0.append("Mozilla/5.0 (Linux; U; Android");
        String s = Build.VERSION.RELEASE;
        if(s != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(s);
        }
        stringBuilder0.append("; ");
        stringBuilder0.append(Locale.getDefault());
        String s1 = Build.DEVICE;
        if(s1 != null) {
            stringBuilder0.append("; ");
            stringBuilder0.append(s1);
            String s2 = Build.DISPLAY;
            if(s2 != null) {
                stringBuilder0.append(" Build/");
                stringBuilder0.append(s2);
            }
        }
        stringBuilder0.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuilder0.toString();
    }

    public static final boolean zzA(Context context0) {
        try {
            context0.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        }
        catch(ClassNotFoundException unused_ex) {
            return true;
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("Error loading class.", throwable0);
            zzt.zzo().zzt(throwable0, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzB() {
        switch(Process.myUid()) {
            case 0: 
            case 1000: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static final boolean zzC(Context context0) {
        try {
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
            if(activityManager0 != null && keyguardManager0 != null) {
                List list0 = activityManager0.getRunningAppProcesses();
                if(list0 == null) {
                    return false;
                }
                for(Object object0: list0) {
                    ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                    if(Process.myPid() == activityManager$RunningAppProcessInfo0.pid) {
                        if(activityManager$RunningAppProcessInfo0.importance != 100 || keyguardManager0.inKeyguardRestrictedInputMode()) {
                            break;
                        }
                        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
                        return powerManager0 == null || !powerManager0.isScreenOn();
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public static final boolean zzD(Context context0) {
        Bundle bundle0 = zzs.a(context0);
        String s = bundle0.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
        return TextUtils.isEmpty(zzs.b(bundle0)) && !TextUtils.isEmpty(s);
    }

    public static final boolean zzE(Context context0) {
        if(!(context0 instanceof Activity)) {
            return false;
        }
        Window window0 = ((Activity)context0).getWindow();
        if(window0 != null && window0.getDecorView() != null) {
            Rect rect0 = new Rect();
            Rect rect1 = new Rect();
            window0.getDecorView().getGlobalVisibleRect(rect0, null);
            window0.getDecorView().getWindowVisibleDisplayFrame(rect1);
            return rect0.bottom != 0 && rect1.bottom != 0 && rect0.top == rect1.top;
        }
        return false;
    }

    public static final void zzF(View view0, int v, MotionEvent motionEvent0) {
        String s2;
        int v3;
        int v2;
        int v1;
        String s;
        int[] arr_v = new int[2];
        Rect rect0 = new Rect();
        try {
            if(view0 instanceof zzdts) {
                view0 = ((zzdts)view0).getChildAt(0);
            }
            if(view0 instanceof zzg) {
                s = "NATIVE";
                v1 = 1;
            }
            else if(!(view0 instanceof NativeAdView)) {
                s = "UNKNOWN";
                v1 = 0;
            }
            else {
                s = "NATIVE";
                v1 = 1;
            }
            if(view0.getLocalVisibleRect(rect0)) {
                v2 = rect0.width();
                v3 = rect0.height();
            }
            else {
                v3 = 0;
                v2 = 0;
            }
            String s1 = "none";
            long v4 = zzs.zzt(view0);
            view0.getLocationOnScreen(arr_v);
            int v5 = arr_v[0];
            int v6 = arr_v[1];
            if(view0 instanceof zzcmf) {
                zzfbo zzfbo0 = ((zzcmf)view0).zzR();
                if(zzfbo0 == null) {
                    s2 = "none";
                }
                else {
                    s2 = zzfbo0.zzb;
                    view0.setContentDescription(s2 + ":" + view0.hashCode());
                }
            }
            else {
                s2 = "none";
            }
            if(view0 instanceof zzckz) {
                zzfbl zzfbl0 = ((zzckz)view0).zzF();
                if(zzfbl0 != null) {
                    s = zzfbl.zza(zzfbl0.zzb);
                    v1 = zzfbl0.zzf;
                    s1 = zzfbl0.zzF;
                }
            }
            zzcfi.zzi(("<Ad hashCode=" + view0.hashCode() + ", package=" + "com.spears.civilopedia" + ", adNetCls=" + s1 + ", gwsQueryId=" + s2 + ", format=" + s + ", impType=" + v1 + ", class=" + view0.getClass().getName() + ", x=" + v5 + ", y=" + v6 + ", width=" + view0.getWidth() + ", height=" + view0.getHeight() + ", vWidth=" + v2 + ", vHeight=" + v3 + ", alpha=" + v4 + ", state=" + Integer.toString(v, 2) + ">"));
            return;
        }
        catch(Exception exception0) {
        }
        zzcfi.zzh("Failure getting view location.", exception0);
    }

    public static final void zzG(Context context0, String s, String s1) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s1);
        for(Object object0: arrayList0) {
            new zzby(context0, s, ((String)object0)).zzb();
        }
    }

    public static final void zzH(Context context0, Throwable throwable0) {
        if(context0 != null) {
            try {
                if(((Boolean)zzbjx.zzb.zze()).booleanValue()) {
                    goto label_2;
                }
            }
            catch(IllegalStateException unused_ex) {
            }
            return;
        label_2:
            CrashUtils.addDynamiteErrorToDropBox(context0, throwable0);
        }
    }

    public static final void zzI(Context context0, Intent intent0) {
        try {
            context0.startActivity(intent0);
        }
        catch(Throwable unused_ex) {
            intent0.addFlags(0x10000000);
            context0.startActivity(intent0);
        }
    }

    public static final int zzJ(String s) {
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException numberFormatException0) {
            zzcfi.zzj(("Could not parse value:" + numberFormatException0.toString()));
            return 0;
        }
    }

    // 检测为 lambda 实现。
    public static final Map zzK(Uri uri0) {
        if(uri0 == null) {
            return null;
        }
        Map map0 = new HashMap();
        for(Object object0: uri0.getQueryParameterNames()) {
            String s = (String)object0;
            if(!TextUtils.isEmpty(s)) {
                ((HashMap)map0).put(s, uri0.getQueryParameter(s));
            }
        }
        return map0;
    }

    public static final WebResourceResponse zzL(HttpURLConnection httpURLConnection0) throws IOException {
        String s = httpURLConnection0.getContentType();
        String s1 = "";
        String s2 = TextUtils.isEmpty(s) ? "" : s.split(";")[0].trim();
        String s3 = httpURLConnection0.getContentType();
        if(!TextUtils.isEmpty(s3)) {
            String[] arr_s = s3.split(";");
            if(arr_s.length != 1) {
                for(int v = 1; v < arr_s.length; ++v) {
                    if(arr_s[v].trim().startsWith("charset")) {
                        String[] arr_s1 = arr_s[v].trim().split("=");
                        if(arr_s1.length > 1) {
                            s1 = arr_s1[1].trim();
                            break;
                        }
                    }
                }
            }
        }
        Map map0 = httpURLConnection0.getHeaderFields();
        HashMap hashMap0 = new HashMap(map0.size());
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getKey() != null && map$Entry0.getValue() != null && !((List)map$Entry0.getValue()).isEmpty()) {
                hashMap0.put(((String)map$Entry0.getKey()), ((String)((List)map$Entry0.getValue()).get(0)));
            }
        }
        return zzt.zzq().zzc(s2, s1, httpURLConnection0.getResponseCode(), httpURLConnection0.getResponseMessage(), hashMap0, httpURLConnection0.getInputStream());
    }

    public static final int[] zzM(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.findViewById(0x1020002);
            return view0 == null ? new int[]{0, 0} : new int[]{view0.getWidth(), view0.getHeight()};
        }
        return new int[]{0, 0};
    }

    public static final int[] zzN(Activity activity0) {
        int v1;
        int v;
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.findViewById(0x1020002);
            if(view0 != null) {
                new int[]{view0.getTop(), view0.getBottom()};
                v = view0.getTop();
                v1 = view0.getBottom();
            }
        }
        return new int[]{zzaw.zzb().zzb(activity0, v), zzaw.zzb().zzb(activity0, v1)};
    }

    public static final boolean zzO(View view0, PowerManager powerManager0, KeyguardManager keyguardManager0) {
        boolean z;
        if(zzt.zzp().c || keyguardManager0 == null) {
            z = true;
        }
        else if(keyguardManager0.inKeyguardRestrictedInputMode() && !zzs.zzl(view0)) {
            z = false;
        }
        else {
            z = true;
        }
        long v = zzs.zzt(view0);
        return view0.getVisibility() == 0 && view0.isShown() && (powerManager0 == null || powerManager0.isScreenOn()) ? z && (!((Boolean)zzay.zzc().zzb(zzbhz.zzbe)).booleanValue() || view0.getLocalVisibleRect(new Rect()) || view0.getGlobalVisibleRect(new Rect())) && (!((Boolean)zzay.zzc().zzb(zzbhz.zzia)).booleanValue() || v >= ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzic))))))) : false;
    }

    public static final void zzP(Context context0, Uri uri0) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
            Bundle bundle0 = new Bundle();
            intent0.putExtras(bundle0);
            zzs.zzm(context0, intent0);
            bundle0.putString("com.android.browser.application_id", "com.spears.civilopedia");
            context0.startActivity(intent0);
            zzcfi.zze(("Opening " + uri0.toString() + " in a new browser."));
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            zzcfi.zzh("No browser is found.", activityNotFoundException0);
        }
    }

    public static final int[] zzQ(Activity activity0) {
        int[] arr_v = zzs.zzM(activity0);
        return new int[]{zzaw.zzb().zzb(activity0, arr_v[0]), zzaw.zzb().zzb(activity0, arr_v[1])};
    }

    public static final boolean zzR(View view0, Context context0) {
        Context context1 = context0.getApplicationContext();
        KeyguardManager keyguardManager0 = null;
        PowerManager powerManager0 = context1 == null ? null : ((PowerManager)context1.getSystemService("power"));
        Object object0 = context0.getSystemService("keyguard");
        if(object0 != null && object0 instanceof KeyguardManager) {
            keyguardManager0 = (KeyguardManager)object0;
        }
        return zzs.zzO(view0, powerManager0, keyguardManager0);
    }

    public static int zza(int v) {
        if(v >= 5000) {
            return v;
        }
        if(v > 0) {
            zzcfi.zzj(("HTTP timeout too low: " + v + " milliseconds. Reverting to default timeout: 60000 milliseconds."));
        }
        return 60000;
    }

    public final zzfvl zzb(Uri uri0) {
        return zzfvc.zzk(() -> {
            if(uri0 == null) {
                return null;
            }
            Map map0 = new HashMap();
            for(Object object0: uri0.getQueryParameterNames()) {
                String s = (String)object0;
                if(!TextUtils.isEmpty(s)) {
                    ((HashMap)map0).put(s, uri0.getQueryParameter(s));
                }
            }
            return map0;
        }, this.h);
    }

    public final String zzc(Context context0, String s) {
        synchronized(this.d) {
            String s1 = this.e;
            if(s1 != null) {
                return s1;
            }
            if(s == null) {
                return zzs.d();
            }
            try {
                zzce zzce0 = zzce.zza();
                if(TextUtils.isEmpty(zzce0.a)) {
                    zzce0.a = (String)zzcb.zza(context0, new zzcd(GooglePlayServicesUtilLight.getRemoteContext(context0), context0));
                }
                this.e = zzce0.a;
            }
            catch(Exception unused_ex) {
            }
            if(TextUtils.isEmpty(this.e)) {
                this.e = WebSettings.getDefaultUserAgent(context0);
            }
            if(TextUtils.isEmpty(this.e)) {
                this.e = zzs.d();
            }
            try {
                this.e = this.e + " (Mobile; " + s;
                if(Wrappers.packageManager(context0).isCallerInstantApp()) {
                    this.e = this.e + ";aia";
                }
            }
            catch(Exception exception0) {
                zzt.zzo().zzt(exception0, "AdUtil.getUserAgent");
            }
            String s3 = this.e + ")";
            this.e = s3;
            return s3;
        }
    }

    public final void zze(Context context0, String s, boolean z, HttpURLConnection httpURLConnection0, boolean z1, int v) {
        int v1 = zzs.zza(v);
        zzcfi.zzi(("HTTP timeout: " + v1 + " milliseconds."));
        httpURLConnection0.setConnectTimeout(v1);
        httpURLConnection0.setInstanceFollowRedirects(false);
        httpURLConnection0.setReadTimeout(v1);
        httpURLConnection0.setRequestProperty("User-Agent", this.zzc(context0, s));
        httpURLConnection0.setUseCaches(false);
    }

    public static void zzf(Runnable runnable0) {
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable0.run();
            return;
        }
        zzcfv.zza.execute(runnable0);
    }

    public final boolean zzg(String s) {
        String s1 = (String)zzay.zzc().zzb(zzbhz.zzZ);
        return zzs.c(s, this.a, s1);
    }

    public final boolean zzh(String s) {
        String s1 = (String)zzay.zzc().zzb(zzbhz.zzaa);
        return zzs.c(s, this.b, s1);
    }

    public final boolean zzi(Context context0) {
        if(this.g) {
            return false;
        }
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context0.getApplicationContext().registerReceiver(new h(), intentFilter0);  // 初始化器: Landroid/content/BroadcastReceiver;-><init>()V
        this.g = true;
        return true;
    }

    public final boolean zzj(Context context0) {
        if(this.f) {
            return false;
        }
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.USER_PRESENT");
        intentFilter0.addAction("android.intent.action.SCREEN_OFF");
        context0.getApplicationContext().registerReceiver(new g(this, 1), intentFilter0);
        this.f = true;
        return true;
    }

    public final int zzk(Context context0, Uri uri0) {
        int v;
        if(context0 == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if(context0 instanceof Activity) {
            v = 0;
        }
        else {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            v = 2;
        }
        zzbhr zzbhr0 = zzbhz.zzdD;
        Boolean boolean0 = (Boolean)zzay.zzc().zzb(zzbhr0);
        zzbhr zzbhr1 = zzbhz.zzdE;
        if(boolean0.equals(zzay.zzc().zzb(zzbhr1))) {
            v = 9;
        }
        if(v != 0) {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(uri0);
            intent0.addFlags(0x10000000);
            context0.startActivity(intent0);
            return v;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue()) {
            zzbix zzbix0 = new zzbix();
            zzbix0.zze(new a(zzbix0, context0, uri0, 1));
            zzbix0.zzb(((Activity)context0));
        }
        if(((Boolean)zzay.zzc().zzb(zzbhr1)).booleanValue()) {
            Intent intent1 = new Intent("android.intent.action.VIEW");
            if(!intent1.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle0 = new Bundle();
                bundle0.putBinder("android.support.customtabs.extra.SESSION", null);
                intent1.putExtras(bundle0);
            }
            intent1.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent1.putExtras(new Bundle());
            intent1.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            intent1.setPackage(zzgri.zza(context0));
            intent1.setData(uri0);
            j.startActivity(context0, intent1, null);
        }
        return 5;
    }

    public static final boolean zzl(View view0) {
        Activity activity0;
        View view1 = view0.getRootView();
        WindowManager.LayoutParams windowManager$LayoutParams0 = null;
        if(view1 == null) {
            activity0 = null;
        }
        else {
            Context context0 = view1.getContext();
            activity0 = context0 instanceof Activity ? ((Activity)context0) : null;
        }
        if(activity0 == null) {
            return false;
        }
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            windowManager$LayoutParams0 = window0.getAttributes();
        }
        return windowManager$LayoutParams0 != null && (windowManager$LayoutParams0.flags & 0x80000) != 0;
    }

    public static final void zzm(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        Bundle bundle0 = intent0.getExtras() == null ? new Bundle() : intent0.getExtras();
        bundle0.putBinder("android.support.customtabs.extra.SESSION", null);
        bundle0.putString("com.android.browser.application_id", "com.spears.civilopedia");
        intent0.putExtras(bundle0);
    }

    public static final ViewGroup.LayoutParams zzn() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final String zzo(Context context0) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        return zzs.b(zzs.a(context0));
    }

    // 去混淆评级： 低(20)
    public static final String zzq() {
        return Build.MODEL.startsWith(Build.MANUFACTURER) ? Build.MODEL : f.i(Build.MANUFACTURER, " ", Build.MODEL);
    }

    public static final DisplayMetrics zzr(WindowManager windowManager0) {
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
        return displayMetrics0;
    }

    public static final long zzt(View view0) {
        float f1;
        float f = 3.402823E+38f;
        do {
            f1 = 0.0f;
            if(!(view0 instanceof View)) {
                break;
            }
            f = Math.min(f, view0.getAlpha());
            view0 = view0.getParent();
        }
        while(f > 0.0f);
        if(f >= 0.0f) {
            f1 = f;
        }
        return (long)Math.round(f1 * 100.0f);
    }

    public static final WebResourceResponse zzu(Context context0, String s, String s1) {
        try {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("User-Agent", zzt.zzp().zzc(context0, s));
            hashMap0.put("Cache-Control", "max-stale=3600");
            String s2 = (String)new zzbo(context0).zzb(0, s1, hashMap0, null).get(60L, TimeUnit.SECONDS);
            if(s2 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(s2.getBytes("UTF-8")));
            }
        }
        catch(IOException | ExecutionException | InterruptedException | TimeoutException iOException0) {
            zzcfi.zzk("Could not fetch MRAID JS.", iOException0);
        }
        return null;
    }

    public static final String zzv() {
        Resources resources0 = zzt.zzo().zzd();
        return resources0 == null ? "Test Ad" : resources0.getString(string.s7);
    }

    public static final zzbr zzw(Context context0) {
        Object object0;
        try {
            object0 = context0.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception exception0) {
            zzt.zzo().zzt(exception0, "Failed to instantiate WorkManagerUtil");
            return null;
        }
        if(!(object0 instanceof IBinder)) {
            zzcfi.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        }
        if(((IBinder)object0) != null) {
            IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterface0 instanceof zzbr ? ((zzbr)iInterface0) : new zzbp(((IBinder)object0), "com.google.android.gms.ads.internal.util.IWorkManagerUtil");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
        }
        return null;
    }

    public static final boolean zzx(Context context0, String s) {
        return Wrappers.packageManager(zzcaj.zza(context0)).checkPermission(s, "com.spears.civilopedia") == 0;
    }

    public static final boolean zzy(String s) {
        if(!zzcfh.zzl()) {
            return false;
        }
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzdX)).booleanValue()) {
            return false;
        }
        String s1 = (String)zzay.zzc().zzb(zzbhz.zzdZ);
        if(!s1.isEmpty()) {
            String[] arr_s = s1.split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                if(arr_s[v].equals(s)) {
                    return false;
                }
            }
        }
        String s2 = (String)zzay.zzc().zzb(zzbhz.zzdY);
        if(s2.isEmpty()) {
            return true;
        }
        String[] arr_s1 = s2.split(";");
        for(int v1 = 0; v1 < arr_s1.length; ++v1) {
            if(arr_s1[v1].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzz(Context context0) {
        if(context0 == null) {
            return false;
        }
        Object object0 = context0.getSystemService("keyguard");
        KeyguardManager keyguardManager0 = object0 == null || !(object0 instanceof KeyguardManager) ? null : ((KeyguardManager)object0);
        return keyguardManager0 != null && keyguardManager0.isKeyguardLocked();
    }
}

