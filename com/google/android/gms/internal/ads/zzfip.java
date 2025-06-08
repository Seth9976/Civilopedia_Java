package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzfip {
    public final zzfiw a;
    public final WebView b;
    public final ArrayList c;
    public final HashMap d;
    public final String e;
    public final String f;
    public final zzfiq g;

    public zzfip(zzfiw zzfiw0, WebView webView0, String s, zzfiq zzfiq0) {
        this.c = new ArrayList();
        this.d = new HashMap();
        this.a = zzfiw0;
        this.b = webView0;
        this.g = zzfiq0;
        this.f = s;
        this.e = "";
    }

    public final WebView zza() {
        return this.b;
    }

    public static zzfip zzb(zzfiw zzfiw0, WebView webView0, String s, String s1) {
        return new zzfip(zzfiw0, webView0, s, zzfiq.zza);
    }

    public static zzfip zzc(zzfiw zzfiw0, WebView webView0, String s, String s1) {
        return new zzfip(zzfiw0, webView0, s, zzfiq.zzc);
    }

    public final zzfiq zzd() {
        return this.g;
    }

    public final zzfiw zze() {
        return this.a;
    }

    public final String zzf() {
        return this.f;
    }

    public final String zzg() {
        return this.e;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.c);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.d);
    }
}

