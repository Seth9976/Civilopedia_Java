package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

public final class zzcmi {
    public final zzcmj a;
    public final zzcmh b;

    public zzcmi(zzcmj zzcmj0, zzcmh zzcmh0, byte[] arr_b) {
        this.b = zzcmh0;
        this.a = zzcmj0;
    }

    @JavascriptInterface
    public String getClickSignals(String s) {
        if(TextUtils.isEmpty(s)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzcmj zzcmj0 = this.a;
        zzaoc zzaoc0 = ((zzcmq)zzcmj0).zzK();
        if(zzaoc0 == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzany zzany0 = zzaoc0.zzc();
        if(zzany0 == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if(zzcmj0.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        return zzany0.zzf(zzcmj0.getContext(), s, ((View)zzcmj0), zzcmj0.zzk());
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcmj zzcmj0 = this.a;
        zzaoc zzaoc0 = ((zzcmq)zzcmj0).zzK();
        if(zzaoc0 == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzany zzany0 = zzaoc0.zzc();
        if(zzany0 == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if(zzcmj0.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        return zzany0.zzh(zzcmj0.getContext(), ((View)zzcmj0), zzcmj0.zzk());
    }

    @JavascriptInterface
    public void notify(String s) {
        if(TextUtils.isEmpty(s)) {
            zzcfi.zzj("URL is empty, ignoring message");
            return;
        }
        zzcmg zzcmg0 = new zzcmg(this, s);
        zzs.zza.post(zzcmg0);
    }
}

