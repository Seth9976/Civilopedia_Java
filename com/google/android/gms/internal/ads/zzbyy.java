package com.google.android.gms.internal.ads;

import A.f;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbyy implements zzbza {
    public final Object a;
    public final Context b;
    public final WeakHashMap c;
    public final ExecutorService d;
    public final zzcfo e;
    public static final Object f;
    public static zzbza g;
    public static zzbza h;

    static {
        zzbyy.f = new Object();
    }

    public zzbyy(Context context0, zzcfo zzcfo0) {
        this.a = new Object();
        this.c = new WeakHashMap();
        this.d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.b = context0;
        this.e = zzcfo0;
    }

    public final void a(Throwable throwable0) {
        if(throwable0 != null) {
            Throwable throwable1 = throwable0;
            boolean z = false;
            boolean z1 = false;
            while(throwable1 != null) {
                StackTraceElement[] arr_stackTraceElement = throwable1.getStackTrace();
                for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                    StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                    z |= zzcfb.zzn(stackTraceElement0.getClassName());
                    String s = stackTraceElement0.getClassName();
                    z1 |= zzbyy.class.getName().equals(s);
                }
                throwable1 = throwable1.getCause();
            }
            if(z && !z1) {
                this.zze(throwable0, "", 1.0f);
            }
        }
    }

    public static zzbza zza(Context context0) {
        synchronized(zzbyy.f) {
            if(zzbyy.g == null) {
                zzbyy.g = !((Boolean)zzbjx.zze.zze()).booleanValue() || ((Boolean)zzay.zzc().zzb(zzbhz.zzgz)).booleanValue() ? new zzbyz() : new zzbyy(context0, zzcfo.zza());
            }
            return zzbyy.g;
        }
    }

    public static zzbza zzb(Context context0, zzcfo zzcfo0) {
        synchronized(zzbyy.f) {
            if(zzbyy.h == null) {
                if(!((Boolean)zzbjx.zze.zze()).booleanValue() || ((Boolean)zzay.zzc().zzb(zzbhz.zzgz)).booleanValue()) {
                    zzbyy.h = new zzbyz();
                }
                else {
                    zzbyy zzbyy0 = new zzbyy(context0, zzcfo0);
                    Thread thread0 = Looper.getMainLooper().getThread();
                    if(thread0 != null) {
                        Object object1 = zzbyy0.a;
                        synchronized(object1) {
                            zzbyy0.c.put(thread0, Boolean.TRUE);
                        }
                        thread0.setUncaughtExceptionHandler(new o2(zzbyy0, thread0.getUncaughtExceptionHandler(), 1));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new o2(zzbyy0, Thread.getDefaultUncaughtExceptionHandler(), 0));
                    zzbyy.h = zzbyy0;
                }
            }
            return zzbyy.h;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbza
    public final void zzd(Throwable throwable0, String s) {
        this.zze(throwable0, s, 1.0f);
    }

    @Override  // com.google.android.gms.internal.ads.zzbza
    public final void zze(Throwable throwable0, String s, float f) {
        boolean z;
        Context context0 = this.b;
        if(zzcfb.zzf(throwable0) == null) {
            return;
        }
        String s1 = throwable0.getClass().getName();
        StringWriter stringWriter0 = new StringWriter();
        throwable0.printStackTrace(new PrintWriter(stringWriter0));
        String s2 = stringWriter0.toString();
        if(Math.random() < ((double)f)) {
            ArrayList arrayList0 = new ArrayList();
            try {
                z = Wrappers.packageManager(context0).isCallerInstantApp();
            }
            catch(Throwable throwable1) {
                zzcfi.zzh("Error fetching instant app info", throwable1);
                z = false;
            }
            arrayList0.add(new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", "33").appendQueryParameter("device", (Build.MODEL.startsWith(Build.MANUFACTURER) ? Build.MODEL : f.i(Build.MANUFACTURER, " ", Build.MODEL))).appendQueryParameter("js", this.e.zza).appendQueryParameter("appid", "com.spears.civilopedia").appendQueryParameter("exceptiontype", s1).appendQueryParameter("stacktrace", s2).appendQueryParameter("eids", TextUtils.join(",", zzbhz.zza())).appendQueryParameter("exceptionkey", s).appendQueryParameter("cl", "458339781").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString((f > 0.0f ? ((int)(1.0f / f)) : 1))).appendQueryParameter("pb_tm", "1.0").appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(context0))).appendQueryParameter("lite", (this.e.zze ? "1" : "0")).toString());
            for(Object object0: arrayList0) {
                zzbyv zzbyv0 = new zzbyv(new zzcfn(null), ((String)object0));
                this.d.execute(zzbyv0);
            }
        }
    }
}

