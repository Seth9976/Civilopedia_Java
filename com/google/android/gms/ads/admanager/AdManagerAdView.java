package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzcex;

public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context0) {
        super(context0);
        Preconditions.checkNotNull(context0, "Context cannot be null");
    }

    public AdManagerAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        Preconditions.checkNotNull(context0, "Context cannot be null");
    }

    public AdManagerAdView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v, null);
        Preconditions.checkNotNull(context0, "Context cannot be null");
    }

    public AdSize[] getAdSizes() {
        return this.i.zzB();
    }

    public AppEventListener getAppEventListener() {
        return this.i.zzh();
    }

    public VideoController getVideoController() {
        return this.i.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.i.zzg();
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(this.getContext());
        if(((Boolean)zzbjn.zze.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
            zzb zzb0 = new zzb(this, adManagerAdRequest0);
            zzcex.zzb.execute(zzb0);
            return;
        }
        this.i.zzm(adManagerAdRequest0.zza());
    }

    public void recordManualImpression() {
        this.i.zzo();
    }

    public void setAdSizes(AdSize[] arr_adSize) {
        if(arr_adSize == null || arr_adSize.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.i.zzt(arr_adSize);
    }

    public void setAppEventListener(AppEventListener appEventListener0) {
        this.i.zzv(appEventListener0);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.i.zzw(z);
    }

    public void setVideoOptions(VideoOptions videoOptions0) {
        this.i.zzy(videoOptions0);
    }

    public final boolean zzb(zzbs zzbs0) {
        return this.i.zzz(zzbs0);
    }
}

