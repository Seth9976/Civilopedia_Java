package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbwe extends zzbvs {
    public final RtbAdapter i;
    public MediationInterstitialAd j;
    public MediationRewardedAd k;
    public String l;

    public zzbwe(RtbAdapter rtbAdapter0) {
        this.l = "";
        this.i = rtbAdapter0;
    }

    public final Bundle b(zzl zzl0) {
        Bundle bundle0 = zzl0.zzm;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(this.i.getClass().getName());
            return bundle1 == null ? new Bundle() : bundle1;
        }
        return new Bundle();
    }

    public static final Bundle c(String s) {
        zzcfi.zzj(("Server parameters: " + s));
        try {
            Bundle bundle0 = new Bundle();
            if(s != null) {
                JSONObject jSONObject0 = new JSONObject(s);
                Bundle bundle1 = new Bundle();
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    bundle1.putString(((String)object0), jSONObject0.getString(((String)object0)));
                }
                return bundle1;
            }
            return bundle0;
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("", jSONException0);
            throw new RemoteException();
        }
    }

    // 去混淆评级： 低(40)
    public static final boolean d(zzl zzl0) {
        return zzl0.zzf;
    }

    public static final String e(zzl zzl0, String s) {
        String s1;
        try {
            s1 = zzl0.zzu;
            return new JSONObject(s).getString("max_ad_content_rating");
        }
        catch(JSONException unused_ex) {
            return s1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final zzdk zze() {
        RtbAdapter rtbAdapter0 = this.i;
        if(rtbAdapter0 instanceof zzb) {
            try {
                return ((zzb)rtbAdapter0).getVideoController();
            }
            catch(Throwable throwable0) {
                zzcfi.zzh("", throwable0);
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final zzbwg zzf() throws RemoteException {
        return zzbwg.zza(this.i.getVersionInfo());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final zzbwg zzg() throws RemoteException {
        return zzbwg.zza(this.i.getSDKVersionInfo());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzh(IObjectWrapper iObjectWrapper0, String s, Bundle bundle0, Bundle bundle1, zzq zzq0, zzbvw zzbvw0) throws RemoteException {
        AdFormat adFormat0;
        try {
            E9 e90 = new E9(zzbvw0, 10);
            RtbAdapter rtbAdapter0 = this.i;
            switch(s) {
                case "banner": {
                    adFormat0 = AdFormat.BANNER;
                    break;
                }
                case "interstitial": {
                    adFormat0 = AdFormat.INTERSTITIAL;
                    break;
                }
                case "native": {
                    adFormat0 = AdFormat.NATIVE;
                    break;
                }
                case "rewarded": {
                    adFormat0 = AdFormat.REWARDED;
                    break;
                }
                case "rewarded_interstitial": {
                    adFormat0 = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Internal Error");
                }
            }
            MediationConfiguration mediationConfiguration0 = new MediationConfiguration(adFormat0, bundle1);
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(mediationConfiguration0);
            rtbAdapter0.collectSignals(new RtbSignalData(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), arrayList0, bundle0, com.google.android.gms.ads.zzb.zzc(zzq0.zze, zzq0.zzb, zzq0.zza)), e90);
            return;
        }
        catch(Throwable throwable0) {
        }
        zzcfi.zzh("Error generating signals for RTB", throwable0);
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzi(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvh zzbvh0, zzbug zzbug0, zzq zzq0) throws RemoteException {
        try {
            d2 d20 = new d2(zzbvh0, zzbug0, 0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbwe.c(s1);
            Bundle bundle1 = this.b(zzl0);
            boolean z = zzbwe.d(zzl0);
            String s2 = zzbwe.e(zzl0, s1);
            AdSize adSize0 = com.google.android.gms.ads.zzb.zzc(zzq0.zze, zzq0.zzb, zzq0.zza);
            MediationBannerAdConfiguration mediationBannerAdConfiguration0 = new MediationBannerAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, adSize0, this.l);
            this.i.loadRtbBannerAd(mediationBannerAdConfiguration0, d20);
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("Adapter failed to render banner ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzj(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvh zzbvh0, zzbug zzbug0, zzq zzq0) throws RemoteException {
        try {
            d2 d20 = new d2(zzbvh0, zzbug0, 1);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbwe.c(s1);
            Bundle bundle1 = this.b(zzl0);
            boolean z = zzbwe.d(zzl0);
            String s2 = zzbwe.e(zzl0, s1);
            AdSize adSize0 = com.google.android.gms.ads.zzb.zzc(zzq0.zze, zzq0.zzb, zzq0.zza);
            MediationBannerAdConfiguration mediationBannerAdConfiguration0 = new MediationBannerAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, adSize0, this.l);
            this.i.loadRtbInterscrollerAd(mediationBannerAdConfiguration0, d20);
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("Adapter failed to render interscroller ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzk(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvk zzbvk0, zzbug zzbug0) throws RemoteException {
        try {
            S8 s80 = new S8(this, zzbvk0, zzbug0, 3);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbwe.c(s1);
            Bundle bundle1 = this.b(zzl0);
            boolean z = zzbwe.d(zzl0);
            String s2 = zzbwe.e(zzl0, s1);
            MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration0 = new MediationInterstitialAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, this.l);
            this.i.loadRtbInterstitialAd(mediationInterstitialAdConfiguration0, s80);
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("Adapter failed to render interstitial ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzl(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvn zzbvn0, zzbug zzbug0) throws RemoteException {
        this.zzm(s, s1, zzl0, iObjectWrapper0, zzbvn0, zzbug0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzm(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvn zzbvn0, zzbug zzbug0, zzbkp zzbkp0) throws RemoteException {
        try {
            Q q0 = new Q(7, zzbvn0, zzbug0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbwe.c(s1);
            Bundle bundle1 = this.b(zzl0);
            boolean z = zzbwe.d(zzl0);
            String s2 = zzbwe.e(zzl0, s1);
            MediationNativeAdConfiguration mediationNativeAdConfiguration0 = new MediationNativeAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, this.l, zzbkp0);
            this.i.loadRtbNativeAd(mediationNativeAdConfiguration0, q0);
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("Adapter failed to render native ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzn(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvq zzbvq0, zzbug zzbug0) throws RemoteException {
        try {
            S8 s80 = new S8(this, zzbvq0, zzbug0, 4);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbwe.c(s1);
            Bundle bundle1 = this.b(zzl0);
            boolean z = zzbwe.d(zzl0);
            String s2 = zzbwe.e(zzl0, s1);
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration0 = new MediationRewardedAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, this.l);
            this.i.loadRtbRewardedInterstitialAd(mediationRewardedAdConfiguration0, s80);
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("Adapter failed to render rewarded interstitial ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzo(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvq zzbvq0, zzbug zzbug0) throws RemoteException {
        try {
            S8 s80 = new S8(this, zzbvq0, zzbug0, 4);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbwe.c(s1);
            Bundle bundle1 = this.b(zzl0);
            boolean z = zzbwe.d(zzl0);
            String s2 = zzbwe.e(zzl0, s1);
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration0 = new MediationRewardedAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, this.l);
            this.i.loadRtbRewardedAd(mediationRewardedAdConfiguration0, s80);
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("Adapter failed to render rewarded ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzp(String s) {
        this.l = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final boolean zzq(IObjectWrapper iObjectWrapper0) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd0 = this.j;
        if(mediationInterstitialAd0 != null) {
            try {
                mediationInterstitialAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            }
            catch(Throwable throwable0) {
                zzcfi.zzh("", throwable0);
            }
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final boolean zzr(IObjectWrapper iObjectWrapper0) throws RemoteException {
        MediationRewardedAd mediationRewardedAd0 = this.k;
        if(mediationRewardedAd0 != null) {
            try {
                mediationRewardedAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            }
            catch(Throwable throwable0) {
                zzcfi.zzh("", throwable0);
            }
            return true;
        }
        return false;
    }
}

