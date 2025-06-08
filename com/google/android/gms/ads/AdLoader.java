package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbng;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbxh;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfi;

public class AdLoader {
    public static class Builder {
        public final Context a;
        public final zzbo b;

        public Builder(Context context0, String s) {
            Context context1 = (Context)Preconditions.checkNotNull(context0, "context cannot be null");
            zzbo zzbo0 = zzaw.zza().zzc(context0, s, new zzbtx());
            super();
            this.a = context1;
            this.b = zzbo0;
        }

        public AdLoader build() {
            Context context0;
            try {
                context0 = this.a;
                return new AdLoader(context0, this.b.zze(), zzp.zza);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Failed to build AdLoader.", remoteException0);
                return new AdLoader(context0, new zzeo().zzc(), zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener0, AdSize[] arr_adSize) {
            if(arr_adSize == null || arr_adSize.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                zzq zzq0 = new zzq(this.a, arr_adSize);
                zzbni zzbni0 = new zzbni(onAdManagerAdViewLoadedListener0);
                this.b.zzj(zzbni0, zzq0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Failed to add Google Ad Manager banner ad listener", remoteException0);
            }
            return this;
        }

        public Builder forCustomFormatAd(String s, OnCustomFormatAdLoadedListener nativeCustomFormatAd$OnCustomFormatAdLoadedListener0, OnCustomClickListener nativeCustomFormatAd$OnCustomClickListener0) {
            zzbxf zzbxf0 = new zzbxf(nativeCustomFormatAd$OnCustomFormatAdLoadedListener0, nativeCustomFormatAd$OnCustomClickListener0);
            try {
                zzbmi zzbmi0 = zzbxf0.zzb();
                zzbmf zzbmf0 = zzbxf0.zza();
                this.b.zzh(s, zzbmi0, zzbmf0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Failed to add custom format ad listener", remoteException0);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String s, OnCustomTemplateAdLoadedListener nativeCustomTemplateAd$OnCustomTemplateAdLoadedListener0, com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener nativeCustomTemplateAd$OnCustomClickListener0) {
            zzbng zzbng0 = new zzbng(nativeCustomTemplateAd$OnCustomTemplateAdLoadedListener0, nativeCustomTemplateAd$OnCustomClickListener0);
            try {
                zzbmi zzbmi0 = zzbng0.zze();
                zzbmf zzbmf0 = zzbng0.zzd();
                this.b.zzh(s, zzbmi0, zzbmf0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Failed to add custom template ad listener", remoteException0);
            }
            return this;
        }

        public Builder forNativeAd(OnNativeAdLoadedListener nativeAd$OnNativeAdLoadedListener0) {
            try {
                zzbxh zzbxh0 = new zzbxh(nativeAd$OnNativeAdLoadedListener0);
                this.b.zzk(zzbxh0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Failed to add google native ad listener", remoteException0);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(OnUnifiedNativeAdLoadedListener unifiedNativeAd$OnUnifiedNativeAdLoadedListener0) {
            try {
                zzbnj zzbnj0 = new zzbnj(unifiedNativeAd$OnUnifiedNativeAdLoadedListener0);
                this.b.zzk(zzbnj0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Failed to add google native ad listener", remoteException0);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener0) {
            try {
                zzg zzg0 = new zzg(adListener0);
                this.b.zzl(zzg0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Failed to set AdListener.", remoteException0);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions0) {
            try {
                this.b.zzm(adManagerAdViewOptions0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Failed to specify Ad Manager banner ad options", remoteException0);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions0) {
            try {
                zzbkp zzbkp0 = new zzbkp(nativeAdOptions0);
                this.b.zzo(zzbkp0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Failed to specify native ad options", remoteException0);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions0) {
            try {
                zzff zzff0 = nativeAdOptions0.getVideoOptions() == null ? null : new zzff(nativeAdOptions0.getVideoOptions());
                this.b.zzo(new zzbkp(4, nativeAdOptions0.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions0.shouldRequestMultipleImages(), nativeAdOptions0.getAdChoicesPlacement(), zzff0, nativeAdOptions0.zza(), nativeAdOptions0.getMediaAspectRatio()));
                return this;
            }
            catch(RemoteException remoteException0) {
            }
            zzcfi.zzk("Failed to specify native ad options", remoteException0);
            return this;
        }
    }

    public final zzp a;
    public final Context b;
    public final zzbl c;

    public AdLoader(Context context0, zzbl zzbl0, zzp zzp0) {
        this.b = context0;
        this.c = zzbl0;
        this.a = zzp0;
    }

    public final void a(zzdr zzdr0) {
        Context context0 = this.b;
        zzbhz.zzc(context0);
        if(((Boolean)zzbjn.zzc.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
            zza zza0 = new zza(this, zzdr0);
            zzcex.zzb.execute(zza0);
            return;
        }
        try {
            zzl zzl0 = this.a.zza(context0, zzdr0);
            this.c.zzg(zzl0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Failed to load ad.", remoteException0);
        }
    }

    public boolean isLoading() {
        try {
            return this.c.zzi();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("Failed to check if ad is loading.", remoteException0);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest0) {
        this.a(adRequest0.zza());
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest0) {
        this.a(adManagerAdRequest0.a);
    }

    public void loadAds(AdRequest adRequest0, int v) {
        zzdr zzdr0 = adRequest0.zza();
        try {
            zzl zzl0 = this.a.zza(this.b, zzdr0);
            this.c.zzh(zzl0, v);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Failed to load ads.", remoteException0);
        }
    }
}

