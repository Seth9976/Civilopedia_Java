package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfi;

public abstract class BaseAdView extends ViewGroup {
    public final zzdu i;

    public BaseAdView(Context context0) {
        super(context0);
        this.i = new zzdu(this, 0);
    }

    public BaseAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.i = new zzdu(this, attributeSet0, false, 0);
    }

    public BaseAdView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0);
        this.i = new zzdu(this, attributeSet0, true);
    }

    public BaseAdView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v);
        this.i = new zzdu(this, attributeSet0, false, 0);
    }

    public BaseAdView(Context context0, AttributeSet attributeSet0, int v, Object object0) {
        super(context0, attributeSet0, v);
        this.i = new zzdu(this, attributeSet0, true, 0);
    }

    public void destroy() {
        this.i.zzk();
    }

    public AdListener getAdListener() {
        return this.i.zza();
    }

    public AdSize getAdSize() {
        return this.i.zzb();
    }

    public String getAdUnitId() {
        return this.i.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.i.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.i.zzd();
    }

    public boolean isLoading() {
        return this.i.zzA();
    }

    public void loadAd(AdRequest adRequest0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(this.getContext());
        if(((Boolean)zzbjn.zze.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
            zzc zzc0 = new zzc(this, adRequest0);
            zzcex.zzb.execute(zzc0);
            return;
        }
        zzdr zzdr0 = adRequest0.zza();
        this.i.zzm(zzdr0);
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        View view0 = this.getChildAt(0);
        if(view0 != null && view0.getVisibility() != 8) {
            int v4 = view0.getMeasuredWidth();
            int v5 = view0.getMeasuredHeight();
            int v6 = (v2 - v - v4) / 2;
            int v7 = (v3 - v1 - v5) / 2;
            view0.layout(v6, v7, v4 + v6, v5 + v7);
        }
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        int v3;
        AdSize adSize0;
        int v2 = 0;
        View view0 = this.getChildAt(0);
        if(view0 == null || view0.getVisibility() == 8) {
            try {
                adSize0 = this.getAdSize();
            }
            catch(NullPointerException nullPointerException0) {
                zzcfi.zzh("Unable to retrieve ad size.", nullPointerException0);
                adSize0 = null;
            }
            if(adSize0 == null) {
                v3 = 0;
            }
            else {
                Context context0 = this.getContext();
                int v4 = adSize0.getWidthInPixels(context0);
                v3 = adSize0.getHeightInPixels(context0);
                v2 = v4;
            }
        }
        else {
            this.measureChild(view0, v, v1);
            v2 = view0.getMeasuredWidth();
            v3 = view0.getMeasuredHeight();
        }
        int v5 = Math.max(v2, this.getSuggestedMinimumWidth());
        int v6 = Math.max(v3, this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSize(v5, v), View.resolveSize(v6, v1));
    }

    public void pause() {
        this.i.zzn();
    }

    public void resume() {
        this.i.zzp();
    }

    public void setAdListener(AdListener adListener0) {
        zzdu zzdu0 = this.i;
        zzdu0.zzr(adListener0);
        if(adListener0 == null) {
            zzdu0.zzq(null);
            return;
        }
        if(adListener0 instanceof zza) {
            zzdu0.zzq(((zza)adListener0));
        }
        if(adListener0 instanceof AppEventListener) {
            zzdu0.zzv(((AppEventListener)adListener0));
        }
    }

    public void setAdSize(AdSize adSize0) {
        this.i.zzs(new AdSize[]{adSize0});
    }

    public void setAdUnitId(String s) {
        this.i.zzu(s);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener0) {
        this.i.zzx(onPaidEventListener0);
    }
}

