package com.google.android.gms.ads.mediation.customevent;

import B.c;
import B1.a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.zzcfi;

@KeepForSdkWithMembers
@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public View a;
    public CustomEventBanner b;
    public CustomEventInterstitial c;
    public CustomEventNative d;
    public static final AdError e;

    static {
        CustomEventAdapter.e = new AdError(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
    }

    public static Object a(String s, Class class0) {
        try {
            if(s == null) {
                throw null;
            }
            return class0.cast(Class.forName(s).getDeclaredConstructor(null).newInstance(null));
        }
        catch(Throwable throwable0) {
        }
        zzcfi.zzj(("Could not instantiate custom event adapter: " + s + ". " + throwable0.getMessage()));
        return null;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.a;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner0 = this.b;
        if(customEventBanner0 != null) {
            customEventBanner0.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial0 = this.c;
        if(customEventInterstitial0 != null) {
            customEventInterstitial0.onDestroy();
        }
        CustomEventNative customEventNative0 = this.d;
        if(customEventNative0 != null) {
            customEventNative0.onDestroy();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        CustomEventBanner customEventBanner0 = this.b;
        if(customEventBanner0 != null) {
            customEventBanner0.onPause();
        }
        CustomEventInterstitial customEventInterstitial0 = this.c;
        if(customEventInterstitial0 != null) {
            customEventInterstitial0.onPause();
        }
        CustomEventNative customEventNative0 = this.d;
        if(customEventNative0 != null) {
            customEventNative0.onPause();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        CustomEventBanner customEventBanner0 = this.b;
        if(customEventBanner0 != null) {
            customEventBanner0.onResume();
        }
        CustomEventInterstitial customEventInterstitial0 = this.c;
        if(customEventInterstitial0 != null) {
            customEventInterstitial0.onResume();
        }
        CustomEventNative customEventNative0 = this.d;
        if(customEventNative0 != null) {
            customEventNative0.onResume();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context0, MediationBannerListener mediationBannerListener0, Bundle bundle0, AdSize adSize0, MediationAdRequest mediationAdRequest0, Bundle bundle1) {
        CustomEventBanner customEventBanner0 = (CustomEventBanner)CustomEventAdapter.a(bundle0.getString("class_name"), CustomEventBanner.class);
        this.b = customEventBanner0;
        if(customEventBanner0 == null) {
            mediationBannerListener0.onAdFailedToLoad(this, CustomEventAdapter.e);
            return;
        }
        Bundle bundle2 = bundle1 == null ? null : bundle1.getBundle(bundle0.getString("class_name"));
        CustomEventBanner customEventBanner1 = this.b;
        customEventBanner1.getClass();
        customEventBanner1.requestBannerAd(context0, new c(3, this, mediationBannerListener0), bundle0.getString("parameter"), adSize0, mediationAdRequest0, bundle2);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context0, MediationInterstitialListener mediationInterstitialListener0, Bundle bundle0, MediationAdRequest mediationAdRequest0, Bundle bundle1) {
        CustomEventInterstitial customEventInterstitial0 = (CustomEventInterstitial)CustomEventAdapter.a(bundle0.getString("class_name"), CustomEventInterstitial.class);
        this.c = customEventInterstitial0;
        if(customEventInterstitial0 == null) {
            mediationInterstitialListener0.onAdFailedToLoad(this, CustomEventAdapter.e);
            return;
        }
        Bundle bundle2 = bundle1 == null ? null : bundle1.getBundle(bundle0.getString("class_name"));
        CustomEventInterstitial customEventInterstitial1 = this.c;
        customEventInterstitial1.getClass();
        customEventInterstitial1.requestInterstitialAd(context0, new a(this, this, mediationInterstitialListener0, 2, false), bundle0.getString("parameter"), mediationAdRequest0, bundle2);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context0, MediationNativeListener mediationNativeListener0, Bundle bundle0, NativeMediationAdRequest nativeMediationAdRequest0, Bundle bundle1) {
        CustomEventNative customEventNative0 = (CustomEventNative)CustomEventAdapter.a(bundle0.getString("class_name"), CustomEventNative.class);
        this.d = customEventNative0;
        if(customEventNative0 == null) {
            mediationNativeListener0.onAdFailedToLoad(this, CustomEventAdapter.e);
            return;
        }
        Bundle bundle2 = bundle1 == null ? null : bundle1.getBundle(bundle0.getString("class_name"));
        CustomEventNative customEventNative1 = this.d;
        customEventNative1.getClass();
        customEventNative1.requestNativeAd(context0, new c(4, this, mediationNativeListener0), bundle0.getString("parameter"), nativeMediationAdRequest0, bundle2);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial0 = this.c;
        if(customEventInterstitial0 != null) {
            customEventInterstitial0.showInterstitial();
        }
    }
}

