package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbys;
import java.util.List;
import java.util.Map;

@KeepForSdk
public final class ReportingInfo {
    @KeepForSdk
    public static final class Builder {
        public final zzbyr a;

        @KeepForSdk
        public Builder(View view0) {
            zzbyr zzbyr0 = new zzbyr();
            this.a = zzbyr0;
            zzbyr0.zzb(view0);
        }

        @KeepForSdk
        public ReportingInfo build() {
            return new ReportingInfo(this);
        }

        @KeepForSdk
        public Builder setAssetViews(Map map0) {
            this.a.zzc(map0);
            return this;
        }
    }

    public final zzbys a;

    public ReportingInfo(Builder reportingInfo$Builder0) {
        this.a = new zzbys(reportingInfo$Builder0.a);
    }

    @KeepForSdk
    public void recordClick(List list0) {
        this.a.zza(list0);
    }

    @KeepForSdk
    public void recordImpression(List list0) {
        this.a.zzb(list0);
    }

    @KeepForSdk
    public void reportTouchEvent(MotionEvent motionEvent0) {
        this.a.zzc(motionEvent0);
    }

    @KeepForSdk
    public void updateClickUrl(Uri uri0, UpdateClickUrlCallback updateClickUrlCallback0) {
        this.a.zzd(uri0, updateClickUrlCallback0);
    }

    @KeepForSdk
    public void updateImpressionUrls(List list0, UpdateImpressionUrlsCallback updateImpressionUrlsCallback0) {
        this.a.zze(list0, updateImpressionUrlsCallback0);
    }
}

