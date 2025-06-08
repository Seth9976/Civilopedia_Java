package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;
import java.util.Map;

public abstract class UnifiedNativeAdMapper {
    public String a;
    public List b;
    public String c;
    public Image d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public String i;
    public VideoController j;
    public boolean k;
    public View l;
    public View m;
    public Object n;
    public Bundle o;
    public boolean p;
    public boolean q;
    public float r;

    public UnifiedNativeAdMapper() {
        this.o = new Bundle();
    }

    public View getAdChoicesContent() {
        return this.l;
    }

    public final String getAdvertiser() {
        return this.f;
    }

    public final String getBody() {
        return this.c;
    }

    public final String getCallToAction() {
        return this.e;
    }

    public float getCurrentTime() [...] // Inlined contents

    public float getDuration() [...] // Inlined contents

    public final Bundle getExtras() {
        return this.o;
    }

    public final String getHeadline() {
        return this.a;
    }

    public final Image getIcon() {
        return this.d;
    }

    public final List getImages() {
        return this.b;
    }

    public float getMediaContentAspectRatio() {
        return this.r;
    }

    public final boolean getOverrideClickHandling() {
        return this.q;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.p;
    }

    public final String getPrice() {
        return this.i;
    }

    public final Double getStarRating() {
        return this.g;
    }

    public final String getStore() {
        return this.h;
    }

    public void handleClick(View view0) {
    }

    public boolean hasVideoContent() {
        return this.k;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view0) {
        this.l = view0;
    }

    public final void setAdvertiser(String s) {
        this.f = s;
    }

    public final void setBody(String s) {
        this.c = s;
    }

    public final void setCallToAction(String s) {
        this.e = s;
    }

    public final void setExtras(Bundle bundle0) {
        this.o = bundle0;
    }

    public void setHasVideoContent(boolean z) {
        this.k = z;
    }

    public final void setHeadline(String s) {
        this.a = s;
    }

    public final void setIcon(Image nativeAd$Image0) {
        this.d = nativeAd$Image0;
    }

    public final void setImages(List list0) {
        this.b = list0;
    }

    public void setMediaContentAspectRatio(float f) {
        this.r = f;
    }

    public void setMediaView(View view0) {
        this.m = view0;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.q = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.p = z;
    }

    public final void setPrice(String s) {
        this.i = s;
    }

    public final void setStarRating(Double double0) {
        this.g = double0;
    }

    public final void setStore(String s) {
        this.h = s;
    }

    public void trackViews(View view0, Map map0, Map map1) {
    }

    public void untrackView(View view0) {
    }

    public final View zza() {
        return this.m;
    }

    public final VideoController zzb() {
        return this.j;
    }

    public final Object zzc() {
        return this.n;
    }

    public final void zzd(Object object0) {
        this.n = object0;
    }

    public final void zze(VideoController videoController0) {
        this.j = videoController0;
    }
}

