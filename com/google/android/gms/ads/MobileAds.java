package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfi;

public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    public static void disableMediationAdapterInitialization(Context context0) {
        zzed.zzf().zzl(context0);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzed.zzf().zze();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzed.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzed.zzf();
        String[] arr_s = TextUtils.split("21.1.0", "\\.");
        if(arr_s.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[1]), Integer.parseInt(arr_s[2]));
        }
        catch(NumberFormatException unused_ex) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @Deprecated
    public static String getVersionString() {
        return zzed.zzf().zzh();
    }

    public static void initialize(Context context0) {
        zzed.zzf().zzm(context0, null, null);
    }

    public static void initialize(Context context0, OnInitializationCompleteListener onInitializationCompleteListener0) {
        zzed.zzf().zzm(context0, null, onInitializationCompleteListener0);
    }

    public static void openAdInspector(Context context0, OnAdInspectorClosedListener onAdInspectorClosedListener0) {
        zzed.zzf().zzp(context0, onAdInspectorClosedListener0);
    }

    public static void openDebugMenu(Context context0, String s) {
        zzed.zzf().zzq(context0, s);
    }

    @KeepForSdk
    public static void registerRtbAdapter(Class class0) {
        zzed.zzf().zzr(class0);
    }

    public static void registerWebView(WebView webView0) {
        zzed.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(webView0 == null) {
            zzcfi.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzcdz zzcdz0 = zzbym.zza(webView0.getContext());
        if(zzcdz0 == null) {
            zzcfi.zzj("Internal error, query info generator is null.");
            return;
        }
        try {
            zzcdz0.zzi(ObjectWrapper.wrap(webView0));
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    public static void setAppMuted(boolean z) {
        zzed.zzf().zzs(z);
    }

    public static void setAppVolume(float f) {
        zzed.zzf().zzt(f);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration0) {
        zzed.zzf().zzu(requestConfiguration0);
    }
}

