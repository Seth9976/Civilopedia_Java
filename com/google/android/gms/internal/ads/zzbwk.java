package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

public final class zzbwk implements MediationInterstitialAdapter {
    public Activity a;
    public MediationInterstitialListener b;
    public Uri c;

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzcfi.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzcfi.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzcfi.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context0, MediationInterstitialListener mediationInterstitialListener0, Bundle bundle0, MediationAdRequest mediationAdRequest0, Bundle bundle1) {
        this.b = mediationInterstitialListener0;
        if(mediationInterstitialListener0 == null) {
            zzcfi.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if(context0 instanceof Activity) {
            if(!zzbix.zzg(context0)) {
                zzcfi.zzj("Default browser does not support custom tabs. Bailing out.");
                this.b.onAdFailedToLoad(this, 0);
                return;
            }
            String s = bundle0.getString("tab_url");
            if(TextUtils.isEmpty(s)) {
                zzcfi.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.b.onAdFailedToLoad(this, 0);
                return;
            }
            this.a = (Activity)context0;
            this.c = Uri.parse(s);
            this.b.onAdLoaded(this);
            return;
        }
        zzcfi.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
        this.b.onAdFailedToLoad(this, 0);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        if(!intent0.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle0 = new Bundle();
            bundle0.putBinder("android.support.customtabs.extra.SESSION", null);
            intent0.putExtras(bundle0);
        }
        intent0.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent0.putExtras(new Bundle());
        intent0.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent0.setData(this.c);
        m0 m00 = new m0(7, this, new AdOverlayInfoParcel(new zzc(intent0, null), null, new e2(this), null, new zzcfo(0, 0, false, false, false), null, null));
        zzs.zza.post(m00);
        zzt.zzo().zzo();
    }
}

