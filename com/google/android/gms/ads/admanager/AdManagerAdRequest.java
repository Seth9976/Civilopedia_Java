package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

@VisibleForTesting
public final class AdManagerAdRequest extends AdRequest {
    @VisibleForTesting
    public static final class Builder extends com.google.android.gms.ads.AdRequest.Builder {
        public Builder addCategoryExclusion(String s) {
            this.a.zzq(s);
            return this;
        }

        public Builder addCustomTargeting(String s, String s1) {
            this.a.zzs(s, s1);
            return this;
        }

        public Builder addCustomTargeting(String s, List list0) {
            if(list0 != null) {
                String s1 = TextUtils.join(",", list0);
                this.a.zzs(s, s1);
            }
            return this;
        }

        @Override  // com.google.android.gms.ads.AdRequest$Builder
        public final AdRequest build() {
            return this.build();
        }

        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this);  // 初始化器: Lcom/google/android/gms/ads/AdRequest;-><init>(Lcom/google/android/gms/ads/AdRequest$Builder;)V
        }

        @Override  // com.google.android.gms.ads.AdRequest$Builder
        @KeepForSdk
        @Deprecated
        public final com.google.android.gms.ads.AdRequest.Builder setAdInfo(AdInfo adInfo0) {
            this.setAdInfo(adInfo0);
            return this;
        }

        @KeepForSdk
        @Deprecated
        public Builder setAdInfo(AdInfo adInfo0) {
            this.a.zzy(adInfo0);
            return this;
        }

        @Override  // com.google.android.gms.ads.AdRequest$Builder
        @KeepForSdk
        public final com.google.android.gms.ads.AdRequest.Builder setAdString(String s) {
            this.setAdString(s);
            return this;
        }

        @KeepForSdk
        public Builder setAdString(String s) {
            this.a.zzz(s);
            return this;
        }

        public Builder setPublisherProvidedId(String s) {
            this.a.zzG(s);
            return this;
        }
    }

    @Override  // com.google.android.gms.ads.AdRequest
    public Bundle getCustomTargeting() {
        return this.a.zze();
    }

    public String getPublisherProvidedId() {
        return this.a.zzm();
    }

    @Override  // com.google.android.gms.ads.AdRequest
    public final zzdr zza() {
        return this.a;
    }
}

