package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbuz extends zzbuc {
    public final MediationExtrasReceiver i;
    public zzbvb j;
    public zzcaw k;
    public IObjectWrapper l;
    public View m;
    public MediationInterstitialAd n;
    public UnifiedNativeAdMapper o;
    public MediationRewardedAd p;
    public MediationInterscrollerAd q;
    public final String r;

    public zzbuz(Adapter adapter0) {
        this.r = "";
        this.i = adapter0;
    }

    public zzbuz(MediationAdapter mediationAdapter0) {
        this.r = "";
        this.i = mediationAdapter0;
    }

    public final Bundle b(zzl zzl0) {
        Bundle bundle0 = zzl0.zzm;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(this.i.getClass().getName());
            return bundle1 == null ? new Bundle() : bundle1;
        }
        return new Bundle();
    }

    public final Bundle c(zzl zzl0, String s, String s1) {
        zzcfi.zze(("Server parameters: " + s));
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
                bundle0 = bundle1;
            }
            if(this.i instanceof AdMobAdapter) {
                bundle0.putString("adJson", s1);
                if(zzl0 != null) {
                    bundle0.putInt("tagForChildDirectedTreatment", zzl0.zzg);
                }
            }
            bundle0.remove("max_ad_content_rating");
            return bundle0;
        }
        catch(Throwable throwable0) {
        }
        zzcfi.zzh("", throwable0);
        throw new RemoteException();
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

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzA(zzl zzl0, String s, String s1) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof Adapter) {
            this.zzz(this.l, zzl0, s, new zzbvc(((Adapter)mediationExtrasReceiver0), this.k));
            return;
        }
        String s2 = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzB(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbug zzbug0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof Adapter) {
            zzcfi.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                c2 c20 = new c2(this, zzbug0, 3);
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.c(zzl0, s, null);
                Bundle bundle1 = this.b(zzl0);
                boolean z = zzbuz.d(zzl0);
                String s1 = zzbuz.e(zzl0, s);
                ((Adapter)mediationExtrasReceiver0).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration(((Context)object0), "", bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s1, ""), c20);
                return;
            }
            catch(Exception exception0) {
                zzcfi.zzh("", exception0);
                throw new RemoteException();
            }
        }
        String s2 = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzC(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof OnContextChangedListener) {
            ((OnContextChangedListener)mediationExtrasReceiver0).onContextChanged(context0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzD() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(!(mediationExtrasReceiver0 instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)mediationExtrasReceiver0).onPause();
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzE() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(!(mediationExtrasReceiver0 instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)mediationExtrasReceiver0).onResume();
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzF(boolean z) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener)mediationExtrasReceiver0).onImmersiveModeUpdated(z);
            }
            catch(Throwable throwable0) {
                zzcfi.zzh("", throwable0);
            }
            return;
        }
        String s = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zze((OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzG() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof MediationInterstitialAdapter) {
            zzcfi.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter)mediationExtrasReceiver0).showInterstitial();
                return;
            }
            catch(Throwable throwable0) {
                zzcfi.zzh("", throwable0);
                throw new RemoteException();
            }
        }
        String s = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zzj((MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzH(IObjectWrapper iObjectWrapper0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(!(mediationExtrasReceiver0 instanceof Adapter) && !(mediationExtrasReceiver0 instanceof MediationInterstitialAdapter)) {
            String s = mediationExtrasReceiver0.getClass().getCanonicalName();
            zzcfi.zzj((MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
            throw new RemoteException();
        }
        if(mediationExtrasReceiver0 instanceof MediationInterstitialAdapter) {
            this.zzG();
            return;
        }
        zzcfi.zze("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd0 = this.n;
        if(mediationInterstitialAd0 != null) {
            mediationInterstitialAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            return;
        }
        zzcfi.zzg("Can not show null mediation interstitial ad.");
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzI(IObjectWrapper iObjectWrapper0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof Adapter) {
            zzcfi.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd0 = this.p;
            if(mediationRewardedAd0 != null) {
                mediationRewardedAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
                return;
            }
            zzcfi.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String s = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzJ() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd0 = this.p;
            if(mediationRewardedAd0 != null) {
                mediationRewardedAd0.showAd(((Context)ObjectWrapper.unwrap(this.l)));
                return;
            }
            zzcfi.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String s = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final boolean zzK() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final boolean zzL() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof Adapter) {
            return this.k != null;
        }
        String s = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbul zzM() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbum zzN() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final Bundle zze() {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(!(mediationExtrasReceiver0 instanceof zzcnd)) {
            String s = mediationExtrasReceiver0.getClass().getCanonicalName();
            zzcfi.zzj((zzcnd.class.getCanonicalName() + " #009 Class mismatch: " + s));
            return new Bundle();
        }
        return ((zzcnd)mediationExtrasReceiver0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final Bundle zzf() {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(!(mediationExtrasReceiver0 instanceof zzcne)) {
            String s = mediationExtrasReceiver0.getClass().getCanonicalName();
            zzcfi.zzj((zzcne.class.getCanonicalName() + " #009 Class mismatch: " + s));
            return new Bundle();
        }
        return ((zzcne)mediationExtrasReceiver0).getInterstitialAdapterInfo();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzdk zzh() {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof zzb) {
            try {
                return ((zzb)mediationExtrasReceiver0).getVideoController();
            }
            catch(Throwable throwable0) {
                zzcfi.zzh("", throwable0);
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzblv zzi() {
        zzbvb zzbvb0 = this.j;
        if(zzbvb0 != null) {
            NativeCustomTemplateAd nativeCustomTemplateAd0 = zzbvb0.zza();
            return nativeCustomTemplateAd0 instanceof zzblw ? ((zzblw)nativeCustomTemplateAd0).zza() : null;
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbuj zzj() {
        MediationInterscrollerAd mediationInterscrollerAd0 = this.q;
        return mediationInterscrollerAd0 != null ? new zzbva(mediationInterscrollerAd0) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbup zzk() {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof MediationNativeAdapter) {
            zzbvb zzbvb0 = this.j;
            if(zzbvb0 != null) {
                UnifiedNativeAdMapper unifiedNativeAdMapper0 = zzbvb0.zzb();
                if(unifiedNativeAdMapper0 != null) {
                    return new zzbve(unifiedNativeAdMapper0);
                }
            }
        }
        else if(mediationExtrasReceiver0 instanceof Adapter) {
            UnifiedNativeAdMapper unifiedNativeAdMapper1 = this.o;
            if(unifiedNativeAdMapper1 != null) {
                return new zzbve(unifiedNativeAdMapper1);
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbwg zzl() {
        return this.i instanceof Adapter ? zzbwg.zza(((Adapter)this.i).getVersionInfo()) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final zzbwg zzm() {
        return this.i instanceof Adapter ? zzbwg.zza(((Adapter)this.i).getSDKVersionInfo()) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final IObjectWrapper zzn() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter)mediationExtrasReceiver0).getBannerView());
            }
            catch(Throwable throwable0) {
                zzcfi.zzh("", throwable0);
                throw new RemoteException();
            }
        }
        if(mediationExtrasReceiver0 instanceof Adapter) {
            return ObjectWrapper.wrap(this.m);
        }
        String s = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zzj((MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzo() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(!(mediationExtrasReceiver0 instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)mediationExtrasReceiver0).onDestroy();
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzp(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzcaw zzcaw0, String s1) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof Adapter) {
            this.l = iObjectWrapper0;
            this.k = zzcaw0;
            zzcaw0.zzl(ObjectWrapper.wrap(mediationExtrasReceiver0));
            return;
        }
        String s2 = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzq(IObjectWrapper iObjectWrapper0, zzbqk zzbqk0, List list0) throws RemoteException {
        AdFormat adFormat0;
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(!(mediationExtrasReceiver0 instanceof Adapter)) {
            throw new RemoteException();
        }
        E9 e90 = new E9(zzbqk0, 9);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            zzbqq zzbqq0 = (zzbqq)object0;
            switch(zzbqq0.zza) {
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
                    adFormat0 = null;
                }
            }
            if(adFormat0 != null) {
                arrayList0.add(new MediationConfiguration(adFormat0, zzbqq0.zzb));
            }
        }
        ((Adapter)mediationExtrasReceiver0).initialize(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), e90, arrayList0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzr(IObjectWrapper iObjectWrapper0, zzcaw zzcaw0, List list0) throws RemoteException {
        zzcfi.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzs(zzl zzl0, String s) throws RemoteException {
        this.zzA(zzl0, s, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzt(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, zzbug zzbug0) throws RemoteException {
        this.zzu(iObjectWrapper0, zzq0, zzl0, s, null, zzbug0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzu(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, String s1, zzbug zzbug0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(!(mediationExtrasReceiver0 instanceof MediationBannerAdapter) && !(mediationExtrasReceiver0 instanceof Adapter)) {
            String s2 = mediationExtrasReceiver0.getClass().getCanonicalName();
            zzcfi.zzj((MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        zzcfi.zze("Requesting banner ad from adapter.");
        AdSize adSize0 = zzq0.zzn ? com.google.android.gms.ads.zzb.zzd(zzq0.zze, zzq0.zzb) : com.google.android.gms.ads.zzb.zzc(zzq0.zze, zzq0.zzb, zzq0.zza);
        if(mediationExtrasReceiver0 instanceof MediationBannerAdapter) {
            try {
                HashSet hashSet0 = zzl0.zze == null ? null : new HashSet(zzl0.zze);
                Date date0 = zzl0.zzb == -1L ? null : new Date(zzl0.zzb);
                boolean z = zzbuz.d(zzl0);
                String s3 = zzbuz.e(zzl0, s);
                zzbus zzbus0 = new zzbus(date0, zzl0.zzd, hashSet0, zzl0.zzk, z, zzl0.zzg, zzl0.zzr, zzl0.zzt, s3);
                Bundle bundle0 = zzl0.zzm == null ? null : zzl0.zzm.getBundle(((MediationBannerAdapter)mediationExtrasReceiver0).getClass().getName());
                ((MediationBannerAdapter)mediationExtrasReceiver0).requestBannerAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), new zzbvb(zzbug0), this.c(zzl0, s, s1), adSize0, zzbus0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
            }
            zzcfi.zzh("", throwable0);
            throw new RemoteException();
        }
        if(mediationExtrasReceiver0 instanceof Adapter) {
            try {
                c2 c20 = new c2(this, zzbug0, 0);
                Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle1 = this.c(zzl0, s, s1);
                Bundle bundle2 = this.b(zzl0);
                boolean z1 = zzbuz.d(zzl0);
                String s4 = zzbuz.e(zzl0, s);
                ((Adapter)mediationExtrasReceiver0).loadBannerAd(new MediationBannerAdConfiguration(context0, "", bundle1, bundle2, z1, zzl0.zzk, zzl0.zzg, zzl0.zzt, s4, adSize0, this.r), c20);
            }
            catch(Throwable throwable1) {
                zzcfi.zzh("", throwable1);
                throw new RemoteException();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzv(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, String s1, zzbug zzbug0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof Adapter) {
            zzcfi.zze("Requesting interscroller ad from adapter.");
            try {
                S8 s80 = new S8(this, zzbug0, ((Adapter)mediationExtrasReceiver0), 2);
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.c(zzl0, s, s1);
                Bundle bundle1 = this.b(zzl0);
                boolean z = zzbuz.d(zzl0);
                String s2 = zzbuz.e(zzl0, s);
                AdSize adSize0 = com.google.android.gms.ads.zzb.zze(zzq0.zze, zzq0.zzb);
                ((Adapter)mediationExtrasReceiver0).loadInterscrollerAd(new MediationBannerAdConfiguration(((Context)object0), "", bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, adSize0, ""), s80);
                return;
            }
            catch(Exception exception0) {
                zzcfi.zzh("", exception0);
                throw new RemoteException();
            }
        }
        String s3 = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s3));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzw(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbug zzbug0) throws RemoteException {
        this.zzx(iObjectWrapper0, zzl0, s, null, zzbug0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzx(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, String s1, zzbug zzbug0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(!(mediationExtrasReceiver0 instanceof MediationInterstitialAdapter) && !(mediationExtrasReceiver0 instanceof Adapter)) {
            String s2 = mediationExtrasReceiver0.getClass().getCanonicalName();
            zzcfi.zzj((MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        zzcfi.zze("Requesting interstitial ad from adapter.");
        if(mediationExtrasReceiver0 instanceof MediationInterstitialAdapter) {
            try {
                HashSet hashSet0 = zzl0.zze == null ? null : new HashSet(zzl0.zze);
                Date date0 = zzl0.zzb == -1L ? null : new Date(zzl0.zzb);
                boolean z = zzbuz.d(zzl0);
                String s3 = zzbuz.e(zzl0, s);
                zzbus zzbus0 = new zzbus(date0, zzl0.zzd, hashSet0, zzl0.zzk, z, zzl0.zzg, zzl0.zzr, zzl0.zzt, s3);
                Bundle bundle0 = zzl0.zzm == null ? null : zzl0.zzm.getBundle(((MediationInterstitialAdapter)mediationExtrasReceiver0).getClass().getName());
                ((MediationInterstitialAdapter)mediationExtrasReceiver0).requestInterstitialAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), new zzbvb(zzbug0), this.c(zzl0, s, s1), zzbus0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
            }
            zzcfi.zzh("", throwable0);
            throw new RemoteException();
        }
        if(mediationExtrasReceiver0 instanceof Adapter) {
            try {
                c2 c20 = new c2(this, zzbug0, 1);
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle1 = this.c(zzl0, s, s1);
                Bundle bundle2 = this.b(zzl0);
                boolean z1 = zzbuz.d(zzl0);
                String s4 = zzbuz.e(zzl0, s);
                ((Adapter)mediationExtrasReceiver0).loadInterstitialAd(new MediationInterstitialAdConfiguration(((Context)object0), "", bundle1, bundle2, z1, zzl0.zzk, zzl0.zzg, zzl0.zzt, s4, this.r), c20);
            }
            catch(Throwable throwable1) {
                zzcfi.zzh("", throwable1);
                throw new RemoteException();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzy(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, String s1, zzbug zzbug0, zzbkp zzbkp0, List list0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(!(mediationExtrasReceiver0 instanceof MediationNativeAdapter) && !(mediationExtrasReceiver0 instanceof Adapter)) {
            String s2 = mediationExtrasReceiver0.getClass().getCanonicalName();
            zzcfi.zzj((MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        zzcfi.zze("Requesting native ad from adapter.");
        if(mediationExtrasReceiver0 instanceof MediationNativeAdapter) {
            try {
                HashSet hashSet0 = zzl0.zze == null ? null : new HashSet(zzl0.zze);
                Date date0 = zzl0.zzb == -1L ? null : new Date(zzl0.zzb);
                boolean z = zzbuz.d(zzl0);
                String s3 = zzbuz.e(zzl0, s);
                zzbvd zzbvd0 = new zzbvd(date0, zzl0.zzd, hashSet0, zzl0.zzk, z, zzl0.zzg, zzbkp0, list0, zzl0.zzr, zzl0.zzt, s3);
                Bundle bundle0 = zzl0.zzm == null ? null : zzl0.zzm.getBundle(((MediationNativeAdapter)mediationExtrasReceiver0).getClass().getName());
                this.j = new zzbvb(zzbug0);
                ((MediationNativeAdapter)mediationExtrasReceiver0).requestNativeAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), this.j, this.c(zzl0, s, s1), zzbvd0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
            }
            zzcfi.zzh("", throwable0);
            throw new RemoteException();
        }
        if(mediationExtrasReceiver0 instanceof Adapter) {
            try {
                c2 c20 = new c2(this, zzbug0, 2);
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle1 = this.c(zzl0, s, s1);
                Bundle bundle2 = this.b(zzl0);
                boolean z1 = zzbuz.d(zzl0);
                String s4 = zzbuz.e(zzl0, s);
                ((Adapter)mediationExtrasReceiver0).loadNativeAd(new MediationNativeAdConfiguration(((Context)object0), "", bundle1, bundle2, z1, zzl0.zzk, zzl0.zzg, zzl0.zzt, s4, this.r, zzbkp0), c20);
            }
            catch(Throwable throwable1) {
                zzcfi.zzh("", throwable1);
                throw new RemoteException();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzz(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbug zzbug0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver0 = this.i;
        if(mediationExtrasReceiver0 instanceof Adapter) {
            zzcfi.zze("Requesting rewarded ad from adapter.");
            try {
                c2 c20 = new c2(this, zzbug0, 3);
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.c(zzl0, s, null);
                Bundle bundle1 = this.b(zzl0);
                boolean z = zzbuz.d(zzl0);
                String s1 = zzbuz.e(zzl0, s);
                ((Adapter)mediationExtrasReceiver0).loadRewardedAd(new MediationRewardedAdConfiguration(((Context)object0), "", bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s1, ""), c20);
                return;
            }
            catch(Exception exception0) {
                zzcfi.zzh("", exception0);
                throw new RemoteException();
            }
        }
        String s2 = mediationExtrasReceiver0.getClass().getCanonicalName();
        zzcfi.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }
}

