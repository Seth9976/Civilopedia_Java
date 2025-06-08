package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class zzbve extends zzbuo {
    public final UnifiedNativeAdMapper i;

    public zzbve(UnifiedNativeAdMapper unifiedNativeAdMapper0) {
        this.i = unifiedNativeAdMapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final boolean zzA() {
        return this.i.getOverrideClickHandling();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final boolean zzB() {
        return this.i.getOverrideImpressionRecording();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final double zze() {
        return this.i.getStarRating() == null ? -1.0 : ((double)this.i.getStarRating());
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final float zzf() {
        return this.i.getMediaContentAspectRatio();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final float zzg() {
        return 0.0f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final float zzh() {
        return 0.0f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final Bundle zzi() {
        return this.i.getExtras();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final zzdk zzj() {
        return this.i.zzb() == null ? null : this.i.zzb().zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final zzbkt zzk() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final zzblb zzl() {
        Image nativeAd$Image0 = this.i.getIcon();
        return nativeAd$Image0 != null ? new zzbkn(nativeAd$Image0.getDrawable(), nativeAd$Image0.getUri(), nativeAd$Image0.getScale(), nativeAd$Image0.zzb(), nativeAd$Image0.zza()) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final IObjectWrapper zzm() {
        View view0 = this.i.getAdChoicesContent();
        return view0 == null ? null : ObjectWrapper.wrap(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final IObjectWrapper zzn() {
        View view0 = this.i.zza();
        return view0 == null ? null : ObjectWrapper.wrap(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final IObjectWrapper zzo() {
        Object object0 = this.i.zzc();
        return object0 == null ? null : ObjectWrapper.wrap(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzp() {
        return this.i.getAdvertiser();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzq() {
        return this.i.getBody();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzr() {
        return this.i.getCallToAction();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzs() {
        return this.i.getHeadline();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzt() {
        return this.i.getPrice();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final String zzu() {
        return this.i.getStore();
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final List zzv() {
        List list0 = this.i.getImages();
        List list1 = new ArrayList();
        if(list0 != null) {
            for(Object object0: list0) {
                ((ArrayList)list1).add(new zzbkn(((Image)object0).getDrawable(), ((Image)object0).getUri(), ((Image)object0).getScale(), ((Image)object0).zzb(), ((Image)object0).zza()));
            }
        }
        return list1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final void zzw(IObjectWrapper iObjectWrapper0) {
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final void zzx() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final void zzy(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        HashMap hashMap0 = (HashMap)ObjectWrapper.unwrap(iObjectWrapper1);
        HashMap hashMap1 = (HashMap)ObjectWrapper.unwrap(iObjectWrapper2);
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        this.i.trackViews(view0, hashMap0, hashMap1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbup
    public final void zzz(IObjectWrapper iObjectWrapper0) {
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
    }
}

