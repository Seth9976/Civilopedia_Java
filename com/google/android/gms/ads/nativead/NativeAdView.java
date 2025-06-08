package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzcfi;

public final class NativeAdView extends FrameLayout {
    public final FrameLayout i;
    public final zzblf j;

    public NativeAdView(Context context0) {
        super(context0);
        this.i = this.c(context0);
        this.j = this.d();
    }

    public NativeAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.i = this.c(context0);
        this.j = this.d();
    }

    public NativeAdView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.i = this.c(context0);
        this.j = this.d();
    }

    @TargetApi(21)
    public NativeAdView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.i = this.c(context0);
        this.j = this.d();
    }

    public final View a(String s) {
        zzblf zzblf0 = this.j;
        if(zzblf0 != null) {
            try {
                IObjectWrapper iObjectWrapper0 = zzblf0.zzb(s);
                if(iObjectWrapper0 != null) {
                    return (View)ObjectWrapper.unwrap(iObjectWrapper0);
                }
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to call getAssetView on delegate", remoteException0);
            }
        }
        return null;
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        super.bringChildToFront(this.i);
    }

    public final void b(MediaContent mediaContent0) {
        zzblf zzblf0 = this.j;
        if(zzblf0 == null) {
            return;
        }
        try {
            if(mediaContent0 instanceof zzej) {
                zzblf0.zzby(((zzej)mediaContent0).zza());
                return;
            }
            if(mediaContent0 == null) {
                zzblf0.zzby(null);
                return;
            }
            zzcfi.zze("Use MediaContent provided by NativeAd.getMediaContent");
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzh("Unable to call setMediaContent on delegate", remoteException0);
    }

    @Override  // android.view.ViewGroup
    public final void bringChildToFront(View view0) {
        super.bringChildToFront(view0);
        FrameLayout frameLayout0 = this.i;
        if(frameLayout0 != view0) {
            super.bringChildToFront(frameLayout0);
        }
    }

    public final FrameLayout c(Context context0) {
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.addView(frameLayout0);
        return frameLayout0;
    }

    // 去混淆评级： 低(20)
    public final zzblf d() {
        return this.isInEditMode() ? null : zzaw.zza().zzg(this.i.getContext(), this, this.i);
    }

    public void destroy() {
        zzblf zzblf0 = this.j;
        if(zzblf0 != null) {
            try {
                zzblf0.zzc();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to destroy native ad view", remoteException0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzcD)).booleanValue()) {
            zzblf zzblf0 = this.j;
            if(zzblf0 != null) {
                try {
                    zzblf0.zzd(ObjectWrapper.wrap(motionEvent0));
                    return super.dispatchTouchEvent(motionEvent0);
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("Unable to call handleTouchEvent on delegate", remoteException0);
                    return super.dispatchTouchEvent(motionEvent0);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    public final void e(View view0, String s) {
        zzblf zzblf0 = this.j;
        if(zzblf0 != null) {
            try {
                zzblf0.zzbw(s, ObjectWrapper.wrap(view0));
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to call setAssetView on delegate", remoteException0);
            }
        }
    }

    public AdChoicesView getAdChoicesView() {
        View view0 = this.a("3011");
        return view0 instanceof AdChoicesView ? ((AdChoicesView)view0) : null;
    }

    public final View getAdvertiserView() {
        return this.a("3005");
    }

    public final View getBodyView() {
        return this.a("3004");
    }

    public final View getCallToActionView() {
        return this.a("3002");
    }

    public final View getHeadlineView() {
        return this.a("3001");
    }

    public final View getIconView() {
        return this.a("3003");
    }

    public final View getImageView() {
        return this.a("3008");
    }

    public final MediaView getMediaView() {
        View view0 = this.a("3010");
        if(view0 instanceof MediaView) {
            return (MediaView)view0;
        }
        if(view0 != null) {
            zzcfi.zze("View is not an instance of MediaView");
        }
        return null;
    }

    public final View getPriceView() {
        return this.a("3007");
    }

    public final View getStarRatingView() {
        return this.a("3009");
    }

    public final View getStoreView() {
        return this.a("3006");
    }

    @Override  // android.view.View
    public final void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        zzblf zzblf0 = this.j;
        if(zzblf0 != null) {
            try {
                zzblf0.zze(ObjectWrapper.wrap(view0), v);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to call onVisibilityChanged on delegate", remoteException0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        this.addView(this.i);
    }

    @Override  // android.view.ViewGroup
    public final void removeView(View view0) {
        if(this.i == view0) {
            return;
        }
        super.removeView(view0);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView0) {
        this.e(adChoicesView0, "3011");
    }

    public final void setAdvertiserView(View view0) {
        this.e(view0, "3005");
    }

    public final void setBodyView(View view0) {
        this.e(view0, "3004");
    }

    public final void setCallToActionView(View view0) {
        this.e(view0, "3002");
    }

    public final void setClickConfirmingView(View view0) {
        zzblf zzblf0 = this.j;
        if(zzblf0 != null) {
            try {
                zzblf0.zzbx(ObjectWrapper.wrap(view0));
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to call setClickConfirmingView on delegate", remoteException0);
            }
        }
    }

    public final void setHeadlineView(View view0) {
        this.e(view0, "3001");
    }

    public final void setIconView(View view0) {
        this.e(view0, "3003");
    }

    public final void setImageView(View view0) {
        this.e(view0, "3008");
    }

    public final void setMediaView(MediaView mediaView0) {
        this.e(mediaView0, "3010");
        if(mediaView0 == null) {
            return;
        }
        zzb zzb0 = new zzb(this);
        synchronized(mediaView0) {
            mediaView0.m = zzb0;
            if(mediaView0.j) {
                zzb0.zza.b(mediaView0.i);
            }
        }
        mediaView0.a(new zzc(this));
    }

    public void setNativeAd(NativeAd nativeAd0) {
        zzblf zzblf0 = this.j;
        if(zzblf0 != null) {
            try {
                zzblf0.zzbA(nativeAd0.a());
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to call setNativeAd on delegate", remoteException0);
            }
        }
    }

    public final void setPriceView(View view0) {
        this.e(view0, "3007");
    }

    public final void setStarRatingView(View view0) {
        this.e(view0, "3009");
    }

    public final void setStoreView(View view0) {
        this.e(view0, "3006");
    }
}

