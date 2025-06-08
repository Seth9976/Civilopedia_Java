package com.google.android.gms.ads.internal.client;

import D0.a;
import D0.b;
import D0.c;
import D0.d;
import D0.f;
import D0.h;
import D0.i;
import D0.k;
import D0.l;
import D0.m;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.HashMap;

public final class zzau {
    public final zzk a;
    public final zzi b;
    public final zzek c;
    public final zzbna d;
    public final zzbxs e;
    public final zzbnb f;
    public zzbza g;

    public zzau(zzk zzk0, zzi zzi0, zzek zzek0, zzbna zzbna0, zzcbq zzcbq0, zzbxs zzbxs0, zzbnb zzbnb0) {
        this.a = zzk0;
        this.b = zzi0;
        this.c = zzek0;
        this.d = zzbna0;
        this.e = zzbxs0;
        this.f = zzbnb0;
    }

    public static void a(Context context0, String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("action", "no_ads_fallback");
        bundle0.putString("flow", s);
        zzaw.zzb().zzm(context0, zzaw.zzc().zza, "gmob-apps", bundle0, true);
    }

    public final zzbo zzc(Context context0, String s, zzbua zzbua0) {
        return (zzbo)new i(this, context0, s, zzbua0).d(context0, false);
    }

    public final zzbs zzd(Context context0, zzq zzq0, String s, zzbua zzbua0) {
        return (zzbs)new f(this, context0, zzq0, s, zzbua0).d(context0, false);
    }

    public final zzbs zze(Context context0, zzq zzq0, String s, zzbua zzbua0) {
        return (zzbs)new h(this, context0, zzq0, s, zzbua0).d(context0, false);
    }

    public final zzblf zzg(Context context0, FrameLayout frameLayout0, FrameLayout frameLayout1) {
        return (zzblf)new k(this, frameLayout0, frameLayout1, context0).d(context0, false);
    }

    public final zzbll zzh(View view0, HashMap hashMap0, HashMap hashMap1) {
        return (zzbll)new l(this, view0, hashMap0, hashMap1).d(view0.getContext(), false);
    }

    public final zzbpk zzk(Context context0, zzbua zzbua0, OnH5AdsEventListener onH5AdsEventListener0) {
        return (zzbpk)new d(context0, zzbua0, onH5AdsEventListener0).d(context0, false);
    }

    public final zzbxl zzl(Context context0, zzbua zzbua0) {
        return (zzbxl)new c(context0, zzbua0).d(context0, false);
    }

    public final zzbxv zzn(Activity activity0) {
        a a0 = new a(this, activity0);
        Intent intent0 = activity0.getIntent();
        if(!intent0.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzcfi.zzg("useClientJar flag not found in activity intent extras.");
            return (zzbxv)a0.d(activity0, false);
        }
        return (zzbxv)a0.d(activity0, intent0.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false));
    }

    public final zzcbe zzp(Context context0, String s, zzbua zzbua0) {
        return (zzcbe)new m(context0, s, zzbua0).d(context0, false);
    }

    public final zzcdz zzq(Context context0, zzbua zzbua0) {
        return (zzcdz)new b(context0, zzbua0).d(context0, false);
    }
}

