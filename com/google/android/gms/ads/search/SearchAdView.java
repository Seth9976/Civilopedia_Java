package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.internal.ads.zzcfi;

public final class SearchAdView extends ViewGroup {
    public final zzdu i;

    public SearchAdView(Context context0) {
        super(context0);
        this.i = new zzdu(this);
    }

    public SearchAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.i = new zzdu(this, attributeSet0, false);
    }

    public SearchAdView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.i = new zzdu(this, attributeSet0, false);
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

    public void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest0) {
        AdSize adSize0 = this.getAdSize();
        if(!AdSize.SEARCH.equals(adSize0)) {
            throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        this.i.zzm(dynamicHeightSearchAdRequest0.a.a);
    }

    public void loadAd(SearchAdRequest searchAdRequest0) {
        this.i.zzm(searchAdRequest0.a);
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
        this.i.zzr(adListener0);
    }

    public void setAdSize(AdSize adSize0) {
        this.i.zzs(new AdSize[]{adSize0});
    }

    public void setAdUnitId(String s) {
        this.i.zzu(s);
    }
}

